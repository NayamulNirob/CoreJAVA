class DemoMain{

    public static void main(String[] args) {
        
        A a=new A(){

           @Override
           public void show(){
                System.out.println("Anonomus Inner calss");
           }; 

            @Override
            public void config() {
                System.out.println("Config");
            }
        };

        a.show();
        a.config();
        
    }
}