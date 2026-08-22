public class TypesOfOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Unary Operators
        int z = 10;
        ++z; // Increment z by 1
        System.out.println("Post-increment: " + (z++));
        System.out.println("Value of z after post-increment: " + z);
        --z; // Decrement z by 1
        System.out.println("Post-decrement: " + (z--));
        System.out.println("Value of z after post-decrement: " + z);

        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Bitwise Operators
        int m = 5; // 0101 in binary
        int n = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (m & n)); // 0101 in binary, which is 1
        System.out.println("Bitwise OR: " + (m | n)); // 0111 in binary, which is 7
        System.out.println("Bitwise XOR: " + (m ^ n)); // 0110 in binary, which is 6    

        //left shift operator and right shift operator
        int p = 8; // 1000 in binary
        System.out.println("Left Shift: " + (p << 1)); // 10000 in binary, which is 16
        System.out.println("Right Shift: " + (p >> 1)); // 0100 in binary, which is 4   



        // Assignment Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("After += operator, c: " + c);
        c -= 3; // c = c - 3
        System.out.println("After -= operator, c: " + c);
    }
}
