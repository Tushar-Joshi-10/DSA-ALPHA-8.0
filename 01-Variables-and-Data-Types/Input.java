import java.util.Scanner;   
public class Input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // sc.next() -> take input till space : like you enter "Joshi Tushar", then only "Joshi" will print.
        System.out.println(str);
        
        String name = sc.nextLine(); // sc.nextLine() -> take input after space also: like you enter "Joshi Tushar", then "Joshi Tushar" will print.
        System.out.println(name);
        
        int num1 = sc.nextInt();
        System.out.println(name);
        
        float num2 = sc.nextFloat();
        System.out.println(name);

        //nextByte, nextDouble, nextShort, nextLong and many more... 


    }
}
