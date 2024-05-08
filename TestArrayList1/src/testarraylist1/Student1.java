
package testarraylist1;


public class Student1 extends TestArrayList1{
    
    private String name,email,phone;

    public Student1() {
    }

    public Student1(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student1{" + "name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }

   
    
    
}
