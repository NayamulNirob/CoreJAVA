


class Main{

    public static void main(String[] args) {
        
        // Status s= Status.Running;

        // System.out.println(s);


        //  Status st= Status.Success;

        // System.out.println(st.ordinal());


        // Status[] ss = Status.values();

        
        // for (int i = 0; i < ss.length; i++) {
            
        //     System.out.println(ss[i]);

        // }


        
        // for (Status  sta: ss) {
            
        //     System.out.println(sta+" : "+sta.ordinal());
        // }


        // Status s= Status.Running;


        // switch(s)
        // {
        //     case Running -> System.out.println("All Good");
        //     case Pending -> System.out.println(" Wait");
        //     case Faild -> System.out.println("Try Again");
        //     case Success->System.out.println("Done");
        //     default-> System.out.println("Nothing");
        // }


        // switch (s) {
        //     case Running:
        //         System.out.println("All Good to go");
        //         break;
        //     case Pending:
        //         System.out.println("Wait and Tring");
        //         break;
        //     case Faild:
        //         System.out.println("Try Agin and Agin");
        //         break;
        //     default:
        //         System.out.println("Done and Succied");
        //         break;
        // }

           
        // if (s==Status.Running) {
        //     System.out.println("All Good to go");
        // }
        // else if(s== Status.Pending){
        //     System.out.println("Wait and Tring");
        // }
        // else if(s== Status.Faild){
        //     System.out.println("Try Agin and Agin");
        // }
        // else {
        //     System.out.println("Done and Succied");
        // }


            // Laptop l = Laptop.Dell;

            // System.out.println(l+" : "+l.price);


            // Laptop lap[] = Laptop.values();

            for (Laptop l : Laptop.values()) {

                System.out.println(l+" : "+l.getPrice());
                
            }


        
    }
}