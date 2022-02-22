import java.util.Scanner;
public class equal{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
         char a=s.next().charAt(0);
        char b=s.next().charAt(0);
         char c=s.next().charAt(0);
         if(a==b && b==c){
             System.out.println(" all variables are equal ");
         }else{
             System.out.println(" all variables are not equal ");
         }
    }
}