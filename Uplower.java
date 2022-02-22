import java.util.Scanner;
public class Uplower{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("upper case alphabet");
        }else if(ch>=97 && ch<=122){
            System.out.println("lower case alphabet");
        }
    }
}