
package factorialbigintiger;

import mathFactorial.Factorial;
import java.util.Arrays;

public class FactorialBigintiger {
    public static void main(String[] args) {
       
        mathFactorial.Factorial f =new Factorial(5);
        System.out.println(f.getfactorial());
        
        String name ="Neyamul Islam Nirob";
//        String s ="HTML";
//               s="JAVA";
//        System.out.println(s);
        StringBuilder builder =new StringBuilder();
        builder.append(123456+"\n");
        builder.toString();
        builder.append(" emocleW ot olleH  avaJ");
        builder.reverse();
        builder.append("Hello Java");
        builder.append("\n java is fun");
        builder.append("\n java is OPP");
        
        char [] chars="Java".toCharArray();
        
        
        System.out.println(name.charAt(4));
        System.out.println(name.substring(2,4)); // 2 thake 4 projonto
        System.out.println(name.substring(0));
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.replace("e", "a"));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("Neyamul Islam Nirob".matches("Neyamul.*"));
        System.out.println(Arrays.toString(chars));
        System.out.println(Integer.parseInt("23"));
        System.out.println(builder);
        
        
}
    
}
