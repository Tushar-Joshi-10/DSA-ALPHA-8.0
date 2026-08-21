import java.util.Scanner;   
public class Input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // sc.next() -> take input till space : like you enter "Joshi Tushar", then only "Joshi" will print.
        System.out.println(str);
        
        String name = sc.nextLine(); // sc.nextLine() -> take input after space also: like you enter "Joshi Tushar", then "Joshi Tushar" will print.
        System.out.println(name);
        
        int num1 = sc.nextInt();
        System.out.println(num1);
        
        float num2 = sc.nextFloat();
        System.out.println(num2);

        //nextByte, nextDouble, nextShort, nextLong and many more... 

        //SUM OF a AND b (INPUT FROM USER)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println(sum);

        //Multiplication OF A AND B (INPUT FROM USER)
        int A = sc.nextInt();
        int B = sc.nextInt();
        int mul = A * B;

        System.out.println(mul);

        //Area of circle
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius; //3.14 -> double, but 3.14f -> float
        
        System.out.println(area);
    }
}
