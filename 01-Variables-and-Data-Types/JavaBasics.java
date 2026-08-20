public class JavaBasics{
    public static void main(String args[]){

    //Print Statements    
        System.out.println("Hello World!");
        System.out.print("Hello World!\n"); //print without new line but with new line character '\n'.

    //Print Pattern
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

    //Variables
        int a = 10;
        int b = 20; 
        System.out.println(a);
        System.out.println(b);
        
        a = b;
        System.out.println(a);
        
        String str = "Joshi Tushar";
        System.out.println(str);
        
    /*
        Data Types :
        
        1) Primitive     : byte, short, char, boolean, int, float, long, double
        2) Non-Primitive : String, Array, Class, Object, Interface  
    */   
       
        byte byteVar = 127; //1 byte
        System.out.println(byteVar);

        short shortVar = 32767; //2 bytes   
        System.out.println(shortVar);
        
        char charVar = 'A'; //2 bytes
        System.out.println(charVar);    

        boolean booleanVar = true; //1 bit
        System.out.println(booleanVar);

        int intVar = 2147483647; //4 bytes
        System.out.println(intVar);

        float floatVar = 3.14f; //4 bytes
        System.out.println(floatVar);

        long longVar = 9223372036854775807L; //8 bytes
        System.out.println(longVar);

        double doubleVar = 3.14159; //8 bytes
        System.out.println(doubleVar);

    //Sum of  two numbers
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: " + sum);

    // Single line comment.
    
    /* Multi line comment

       This is a multi-line comment. 

    */

       
        
    }
}
