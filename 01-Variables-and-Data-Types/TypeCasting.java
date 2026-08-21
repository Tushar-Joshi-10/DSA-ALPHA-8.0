public class TypeCasting {
    public static void main(String[] args) {
        // Conversion rules : 1. type compatible. 2. destination type > source type

        //1. Automatic type conversion or "Implicit conversion" or widening :  byte -> short -> int -> float -> long -> double  
        int a = 25;
        long b = a;
        System.out.println(b);

        //2.Manual or "Explicit" conversion or narrowing:
        int num1 = (int)25.05f;
        System.out.println(num1);
        
        char ch = 'A';
        int num = ch; // a -> 97, A -> 65
        System.out.println(num);

        //Type Promotion in expression: 
        // 1. byte, short or char automatically promotes to int.
        // 2. If one operand is float, long or double, whole expression is promoted to that respectively.

        int w = 10;
        float x = 3.14f;
        double y = 20;
        long z = 50;
        
        double res = w + x + y + z; 
        System.out.println(res);

        
        byte bt = 5;
        bt = (byte)(bt * 2); // here we need to explicitly tell that convert (bt * 2) into "byte" because multiplying bt with 2 convert it into "int".
    }
}
