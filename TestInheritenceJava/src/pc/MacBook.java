
package pc;


public class MacBook extends Computer{
    
    private boolean airDrop;
    private String camera;
    private boolean wiFiHotspot;
    private String autoUnlock;

    public MacBook() {
    }

    public MacBook(boolean airDrop, String camera, boolean wiFiHotspot, String autoUnlock) {
        this.airDrop = airDrop;
        this.camera = camera;
        this.wiFiHotspot = wiFiHotspot;
        this.autoUnlock = autoUnlock;
    }

    public boolean isAirDrop() {
        return airDrop;
    }

    public void setAirDrop(boolean airDrop) {
        this.airDrop = airDrop;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public boolean isWiFiHotspot() {
        return wiFiHotspot;
    }

    public void setWiFiHotspot(boolean wiFiHotspot) {
        this.wiFiHotspot = wiFiHotspot;
    }

    public String getAutoUnlock() {
        return autoUnlock;
    }

    public void setAutoUnlock(String autoUnlock) {
        this.autoUnlock = autoUnlock;
    }

    @Override
    public String toString() {
        return "MacBook{" + "airDrop=" + airDrop + ", camera=" + camera + ", wiFiHotspot=" + wiFiHotspot + ", autoUnlock=" + autoUnlock + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(""+airDrop+""+camera+""+wiFiHotspot+""+autoUnlock);
    }
    
   
    
}
