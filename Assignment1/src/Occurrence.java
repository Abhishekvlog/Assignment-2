import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String st = sc.next();
            System.out.println("Enter a character");
            char ch = sc.next().charAt(0);
            Occurr(st,ch);
        }
        public static void Occurr(String st , char ch){
        int count =0;
            for (int i=0;i<st.length() ;i++){
                if (st.charAt(i) == ch){
                    count++;
                }
            }
            System.out.print("The Character "+ch+" Occurrence "+count+" Times");
        }
    }
