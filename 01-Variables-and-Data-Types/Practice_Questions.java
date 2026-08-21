import java.util.Scanner;

public class Practice_Questions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //1.In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        
        float average = ((float)(num1 + num2 + num3) / 3);
        System.out.println(average);
        
        //2.In a program, input the side of a square. You have to output the area of the square.
        
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        
        int area = side * side;
        System.out.println(area);
        
        /*
        3. Enter cost of 3 items from the user(usingfloatdatatype)-a pencil, a pen and an eraser. 
        You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        */
       
       System.out.println("Enter price of pencil: ");
       float pencil = sc.nextFloat();
       System.out.println("Enter price of pen: ");
       float pen = sc.nextFloat();
       System.out.println("Enter price of eraser: ");
       float eraser = sc.nextFloat();

       float total_bill = (float)(pencil + pen + eraser);
       System.out.println("Total bill without gst = "+total_bill);
       
       float total_bill_with_gst = (float)(total_bill + ( total_bill * 18 ) / 100.0f);
       System.out.println("total bill with gst = "+total_bill_with_gst);

       
    }
}
