import java.util.Scanner;
public class Ads{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char ch=s.next().charAt(0);
        
           
         if (ch>=48 && ch<=57){
             System.out.println("digit");
                    }else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            System.out.println("alphabet");
        }else{
            System.out.println("special character");
        }
    }
}