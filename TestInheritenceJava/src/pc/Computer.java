package pc;

public class Computer {

    private String keybord;
    private boolean matherbord;
    private String monitor;
    private String spiker;
    private boolean prossesor;
    private boolean inputOutputDevices;

    public Computer() {
    }

    public Computer(String keybord, boolean matherbord, String monitor, String spiker, boolean prossesor, boolean inputOutputDevices) {
        this.keybord = keybord;
        this.matherbord = matherbord;
        this.monitor = monitor;
        this.spiker = spiker;
        this.prossesor = prossesor;
        this.inputOutputDevices = inputOutputDevices;
    }

    public String getKeybord() {
        return keybord;
    }

    public void setKeybord(String keybord) {
        this.keybord = keybord;
    }

    public boolean isMatherbord() {
        return matherbord;
    }

    public void setMatherbord(boolean matherbord) {
        this.matherbord = matherbord;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getSpiker() {
        return spiker;
    }

    public void setSpiker(String spiker) {
        this.spiker = spiker;
    }

    public boolean isProssesor() {
        return prossesor;
    }

    public void setProssesor(boolean prossesor) {
        this.prossesor = prossesor;
    }

    public boolean isInputOutputDevices() {
        return inputOutputDevices;
    }

    public void setInputOutputDevices(boolean inputOutputDevices) {
        this.inputOutputDevices = inputOutputDevices;
    }

    @Override
    public String toString() {
        return "Computer{" + "keybord=" + keybord + ", matherbord=" + matherbord + ", monitor=" + monitor + ", spiker=" + spiker + ", prossesor=" + prossesor + ", inputOutputDevices=" + inputOutputDevices + '}';
    }

    public void printDetails(){
    
        System.out.println(""+keybord+""+matherbord+""+monitor+""+spiker+""+prossesor+""+inputOutputDevices);
    }
    
   
}
