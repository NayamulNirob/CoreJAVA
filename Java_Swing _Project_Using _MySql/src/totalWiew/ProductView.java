/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package totalWiew;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utill.DbUtill;

/**
 *
 * @author nayam
 */
public class ProductView extends javax.swing.JFrame {

    DbUtill db = new DbUtill();

    /**
     * Creates new form StoreView
     */
    public ProductView() {
        initComponents();
        showProductOnTable();
        showProductCombo();
        
        comProductName.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                getProductSalesPrice(e);
                
            }
      
        });
        
    }

    public void addProduct() {

        String sql = "insert into product(name,unitPrice,Quantity,TotalPrice,SalesPrice)values(?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, txtPrductName.getText().trim());
            ps.setFloat(2, Float.parseFloat(txtPrductUnitPrice.getText().trim()));
            ps.setFloat(3, Float.parseFloat(txtProductQuantity.getText().trim()));
            ps.setFloat(4, Float.parseFloat(txtPrductTotalPrice.getText().trim()));
            ps.setFloat(5, Float.parseFloat(txtPrductSalesPrice.getText().trim()));
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            JOptionPane.showMessageDialog(this, "Add product Successfully");
            clear();
            showProductOnTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Add product Unsuccessful");
            Logger.getLogger(ProductView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getTotalPrice() {

        float unitPrice = Float.parseFloat(txtPrductUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtProductQuantity.getText().trim());
        float totalPrice = unitPrice * quantity;
        txtPrductTotalPrice.setText(totalPrice + "");
    }

    public void clear() {
        txtProductId.setText("");
        txtPrductName.setText("");
        txtPrductUnitPrice.setText("");
        txtProductQuantity.setText("");
        txtPrductTotalPrice.setText("");
        txtPrductSalesPrice.setText("");

    }

    String[] productViewTableCloumn = {"Id", "Name", "Unit Price", "Quantity", "Total Price", "Sales Price"};

    public void showProductOnTable() {
        String sql = "select* from product";
        PreparedStatement ps;
        ResultSet rs;

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(productViewTableCloumn);
        tblProductView.setModel(model);

        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float unitPrice = rs.getFloat("unitPrice");
                float quantity = rs.getFloat("quantity");
                float totalPrice = rs.getFloat("totalprice");
                float salesPrice = rs.getFloat("salesPrice");
                model.addRow(new Object[]{id, name, unitPrice, quantity, totalPrice, salesPrice});
            }
            rs.close();
            ps.close();
            db.getCon();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delectProduct() {

        String sql = "delete from product where id=?";
        PreparedStatement ps;

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtProductId.getText()));
            ps.executeUpdate();
            ps.close();
            db.getCon();
            JOptionPane.showMessageDialog(this, "Delete product Successfully");
            clear();
            showProductOnTable();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Delete product Unsuccessfull");
        }

    }
    public void editProduct(){
    
    String sql = "update  product set name=?,unitPrice=?,quantity=?,totalprice=?,salesprice=? where id=?";
        PreparedStatement ps;
        try {
          
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, txtPrductName.getText().trim());
            ps.setFloat(2, Float.parseFloat(txtPrductUnitPrice.getText().trim()));
            ps.setFloat(3, Float.parseFloat(txtProductQuantity.getText().trim()));
            ps.setFloat(4, Float.parseFloat(txtPrductTotalPrice.getText().trim()));
            ps.setFloat(5, Float.parseFloat(txtPrductSalesPrice.getText().trim()));
            ps.setInt(6, Integer.parseInt(txtProductId.getText()));
            ps.executeUpdate();
            ps.close();
            db.getCon();
            JOptionPane.showMessageDialog(this, "Update product Successfully");
            clear();
            showProductOnTable();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Update product UnSuccessfull");
        } catch (SQLException ex) {
            Logger.getLogger(ProductView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Update product Unsuccessfull");
        }
    
    }
    public void showProductCombo(){
     String sql = "select name from product";
        PreparedStatement ps;
        ResultSet rs;
        comProductName.removeAllItems();
        try {
            ps =db.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
              String productName = rs.getString("name");
              comProductName.addItem(productName);
                
            }
            ps.close();
            db.getCon().close();
            rs.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    
    public void getProductSalesPrice(ItemEvent e){
    String selectedProductName ="";
    if(e.getStateChange()==ItemEvent.SELECTED){
    
    selectedProductName =(String) e.getItem();
    }
   
        System.out.println(selectedProductName);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAddProduct = new javax.swing.JButton();
        btnSalesProduct = new javax.swing.JButton();
        btnStockProdct = new javax.swing.JButton();
        btnProductrReport = new javax.swing.JButton();
        productView = new javax.swing.JTabbedPane();
        add = new javax.swing.JPanel();
        add1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrductName = new javax.swing.JTextField();
        txtPrductUnitPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProductQuantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrductTotalPrice = new javax.swing.JTextField();
        btnProductAdd = new javax.swing.JButton();
        btnProductDelete = new javax.swing.JButton();
        btnProductEdit = new javax.swing.JButton();
        btnProductReset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPrductSalesPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductView = new javax.swing.JTable();
        sales = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comProductName = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        stock = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        report = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Store(JEE59)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 130));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        btnAddProduct.setText("Add Prodoct");
        btnAddProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProductMouseClicked(evt);
            }
        });

        btnSalesProduct.setText("Sales Product");
        btnSalesProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesProductMouseClicked(evt);
            }
        });

        btnStockProdct.setText("Stock Product");
        btnStockProdct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStockProdctMouseClicked(evt);
            }
        });
        btnStockProdct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockProdctActionPerformed(evt);
            }
        });

        btnProductrReport.setText("Product Report");
        btnProductrReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductrReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductrReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStockProdct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalesProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnAddProduct)
                .addGap(35, 35, 35)
                .addComponent(btnSalesProduct)
                .addGap(32, 32, 32)
                .addComponent(btnStockProdct)
                .addGap(30, 30, 30)
                .addComponent(btnProductrReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 520));

        productView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productViewMouseClicked(evt);
            }
        });

        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add1.setPreferredSize(new java.awt.Dimension(1000, 650));
        add1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Product");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        add1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 20));

        txtProductId.setEditable(false);
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });
        add1.add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name");
        add1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 20));
        add1.add(txtPrductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, -1));
        add1.add(txtPrductUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Unit Price");
        add1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Quantity");
        add1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 90, 20));

        txtProductQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductQuantityFocusLost(evt);
            }
        });
        add1.add(txtProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 180, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total Price");
        add1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 90, 20));

        txtPrductTotalPrice.setEditable(false);
        txtPrductTotalPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrductTotalPriceFocusLost(evt);
            }
        });
        txtPrductTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrductTotalPriceActionPerformed(evt);
            }
        });
        add1.add(txtPrductTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 180, -1));

        btnProductAdd.setText("Add");
        btnProductAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductAddMouseClicked(evt);
            }
        });
        add1.add(btnProductAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        btnProductDelete.setText("Delete");
        btnProductDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductDeleteMouseClicked(evt);
            }
        });
        add1.add(btnProductDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        btnProductEdit.setText("Edit");
        btnProductEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductEditMouseClicked(evt);
            }
        });
        add1.add(btnProductEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        btnProductReset.setText("Reset");
        btnProductReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductResetMouseClicked(evt);
            }
        });
        add1.add(btnProductReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sales Price");
        add1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 90, 20));
        add1.add(txtPrductSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 180, -1));

        tblProductView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProductView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductView);

        add1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 780, 210));

        add.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        productView.addTab("Add", add);

        sales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 0, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product Sales");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        sales.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Name");
        sales.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 30));

        comProductName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comProductName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comProductNameMouseClicked(evt);
            }
        });
        sales.add(comProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 210, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Quantity");
        sales.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 60, 30));
        sales.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 140, 30));

        jLabel15.setText("Date :");
        sales.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 40, 30));
        sales.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 82, 170, 30));

        jLabel14.setText("Unit Price");
        sales.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 30));
        sales.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 210, 30));

        jLabel16.setText("Total Price");
        sales.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 60, 30));
        sales.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 140, 30));

        jButton1.setText("Save");
        sales.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jButton2.setText("Edit");
        sales.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jButton3.setText("Reset");
        sales.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jButton4.setText("Delete");
        sales.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        productView.addTab("Sales", sales);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("Stock");

        javax.swing.GroupLayout stockLayout = new javax.swing.GroupLayout(stock);
        stock.setLayout(stockLayout);
        stockLayout.setHorizontalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        stockLayout.setVerticalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productView.addTab("Stock", stock);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Report");

        javax.swing.GroupLayout reportLayout = new javax.swing.GroupLayout(report);
        report.setLayout(reportLayout);
        reportLayout.setHorizontalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportLayout.setVerticalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        productView.addTab("Report", report);

        getContentPane().add(productView, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 780, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStockProdctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockProdctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStockProdctActionPerformed

    private void btnAddProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProductMouseClicked
        productView.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddProductMouseClicked

    private void btnSalesProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesProductMouseClicked
        productView.setSelectedIndex(1);
        showProductCombo();
    }//GEN-LAST:event_btnSalesProductMouseClicked

    private void btnStockProdctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockProdctMouseClicked
        productView.setSelectedIndex(2);
    }//GEN-LAST:event_btnStockProdctMouseClicked

    private void btnProductrReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductrReportMouseClicked
        productView.setSelectedIndex(3);
    }//GEN-LAST:event_btnProductrReportMouseClicked

    private void btnProductAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductAddMouseClicked
        // TODO add your handling code here:
        addProduct();
    }//GEN-LAST:event_btnProductAddMouseClicked

    private void txtPrductTotalPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrductTotalPriceFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrductTotalPriceFocusLost

    private void txtProductQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductQuantityFocusLost
        // TODO add your handling code here:
        getTotalPrice();
    }//GEN-LAST:event_txtProductQuantityFocusLost

    private void btnProductResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductResetMouseClicked
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnProductResetMouseClicked

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void txtPrductTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrductTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrductTotalPriceActionPerformed

    private void tblProductViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductViewMouseClicked
        // TODO add your handling code here:
        int rowindex = tblProductView.getSelectedRow();
        String id = tblProductView.getModel().getValueAt(rowindex, 0).toString();
        String name = tblProductView.getModel().getValueAt(rowindex, 1).toString();
        String unitPrice = tblProductView.getModel().getValueAt(rowindex, 2).toString();
        String quantity = tblProductView.getModel().getValueAt(rowindex, 3).toString();
        String totalPrice = tblProductView.getModel().getValueAt(rowindex, 4).toString();
        String salesPrice = tblProductView.getModel().getValueAt(rowindex, 5).toString();

        txtProductId.setText(id);
        txtPrductName.setText(name);
        txtPrductUnitPrice.setText(unitPrice);
        txtProductQuantity.setText(quantity);
        txtPrductTotalPrice.setText(totalPrice);
        txtPrductSalesPrice.setText(salesPrice);

    }//GEN-LAST:event_tblProductViewMouseClicked

    private void btnProductDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductDeleteMouseClicked
        // TODO add your handling code here:
        delectProduct();

    }//GEN-LAST:event_btnProductDeleteMouseClicked

    private void btnProductEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductEditMouseClicked
        // TODO add your handling code here:
        editProduct();
    }//GEN-LAST:event_btnProductEditMouseClicked

    private void productViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productViewMouseClicked
        // TODO add your handling code here:
        showProductCombo();
        
    }//GEN-LAST:event_productViewMouseClicked

    private void comProductNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comProductNameMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_comProductNameMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel add1;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnProductAdd;
    private javax.swing.JButton btnProductDelete;
    private javax.swing.JButton btnProductEdit;
    private javax.swing.JButton btnProductReset;
    private javax.swing.JButton btnProductrReport;
    private javax.swing.JButton btnSalesProduct;
    private javax.swing.JButton btnStockProdct;
    private javax.swing.JComboBox<String> comProductName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTabbedPane productView;
    private javax.swing.JPanel report;
    private javax.swing.JPanel sales;
    private javax.swing.JPanel stock;
    private javax.swing.JTable tblProductView;
    private javax.swing.JTextField txtPrductName;
    private javax.swing.JTextField txtPrductSalesPrice;
    private javax.swing.JTextField txtPrductTotalPrice;
    private javax.swing.JTextField txtPrductUnitPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductQuantity;
    // End of variables declaration//GEN-END:variables
}
