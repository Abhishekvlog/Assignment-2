import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 ");
        int b = sc.nextInt();
        System.out.println("Enter choice \n 1 : Addition \n 2 : Subtraction \n 3 : Multiply \n 4 : Divide ");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                Add(a ,b);
                break;
            case 2:
                Sub(a,b);
                break;
            case 3:
                Multiply(a ,b);
                break;
            case 4:
                Div(a,b);
                break;
        }
    }
    public static void Add(int a  , int b){
        int sum = a + b;
        System.out.println("The sum is = "+sum);
    }
    public static void Sub(int a  , int b){
        int  sub = a - b;
        System.out.println("The Subtraction is = "+sub);
    }
    public static void Multiply(int a  , int b){
        int mul = a * b;
        System.out.println("The Multiplication is = "+mul);     }
    public static void Div(int a  , int b){
        double div = a/b;
        System.out.println("The Division is = "+div);
    }
}
