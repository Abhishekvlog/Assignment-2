import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = sc.next();
        System.out.println("Enter a character for removing");
        char ch = sc.next().charAt(0);
        Remove(st,ch);
    }
    public static void Remove(String st , char ch){
        for (int i=0;i<st.length() ;i++){
            if (st.charAt(i) != ch){
                System.out.print(st.charAt(i));
            }
        }
    }
}
