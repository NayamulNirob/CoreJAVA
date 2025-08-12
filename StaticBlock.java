public class StaticBlock {

    static String appName;

    static int version;


     static {
        appName = "MyApp";
        version = 1;
        System.out.println("Configuration loaded");
    }

    public static void show(){
        System.out.println(appName+"v"+version);
    }
    
}


