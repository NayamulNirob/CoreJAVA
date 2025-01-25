
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;


// import java.io.IOException;

class Main{


    public static void main(String[] args) {

        // System.out.println("Enter a Charater");
        // try {
        //     int input= System.in.read();
        //     System.out.println(input-48);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        System.out.println("Enter a Charater");
        InputStreamReader in =new InputStreamReader(System.in);

        BufferedReader bf = new BufferedReader(in);

        try {
            int num= Integer.parseInt(bf.readLine());
            System.out.println(num);
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        


    }
}