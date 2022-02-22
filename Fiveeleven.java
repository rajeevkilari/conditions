import java.util.Scanner;
public class Fiveeleven{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("divisible");
        }else{
            System.out.println("not divisible");
        }
    }
}