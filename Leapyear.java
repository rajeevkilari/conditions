import java.util.Scanner;
public class Leapyear{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean isLeap=false;
        int n =s.nextInt();
        if(n%4==0 && n%100!=0 || n%400==0){
            isLeap=true;
            
        }
            System.out.println(isLeap);
    }
}