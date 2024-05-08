
package pc;


public class  Windows extends Computer{
    
    private String microsoftStore;
    private boolean fileExplorar;
    private String microSoftEdge;
    private boolean outLook;

    public Windows() {
    }

    public Windows(String microsoftStore, boolean fileExplorar, String microSoftEdge, boolean outLook) {
        this.microsoftStore = microsoftStore;
        this.fileExplorar = fileExplorar;
        this.microSoftEdge = microSoftEdge;
        this.outLook = outLook;
    }

    public String getMicrosoftStore() {
        return microsoftStore;
    }

    public void setMicrosoftStore(String microsoftStore) {
        this.microsoftStore = microsoftStore;
    }

    public boolean isFileExplorar() {
        return fileExplorar;
    }

    public void setFileExplorar(boolean fileExplorar) {
        this.fileExplorar = fileExplorar;
    }

    public String getMicroSoftEdge() {
        return microSoftEdge;
    }

    public void setMicroSoftEdge(String microSoftEdge) {
        this.microSoftEdge = microSoftEdge;
    }

    public boolean isOutLook() {
        return outLook;
    }

    public void setOutLook(boolean outLook) {
        this.outLook = outLook;
    }

    @Override
    public String toString() {
        return "Windows{" + "microsoftStore=" + microsoftStore + ", fileExplorar=" + fileExplorar + ", microSoftEdge=" + microSoftEdge + ", outLook=" + outLook + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(""+microsoftStore+""+fileExplorar+""+microSoftEdge+""+outLook);
    }
   
}
