import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Check(st);
    }
    public static void Check(String st){
        boolean isPalindrome = true;
        for (int i=0 ,j = st.length()-1 ;i<st.length()/2;i++ , j--){
            if (st.charAt(i) != st.charAt(j)){
                isPalindrome = false;
            }
        }
        if (isPalindrome == false){
            System.out.println("Not Palindrome");
        }
        else {
            System.out.println("Palindrome");
        }
    }
}
