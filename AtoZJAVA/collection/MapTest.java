
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class MapTest{

    public static void main(String[] args) {
        
        // Map <String, Integer> student = new HashMap<>();

        Map <String, Integer> student = new Hashtable<>();

        student.put("Abdul", 56);
        student.put("Rohim", 76);
        student.put("Jobbar", 32);
        student.put("Sattar",69);
        student.put("Jobbar", 47);

        // System.out.println(student);

        // System.out.println(student.keySet());


        for (String key : student.keySet()) {
            
            System.out.println(key+ " : " +student.get(key));
        }

    

        // System.out.println(student.get("Abdul"));

    }
}