import java.util.Scanner;
public class Alphabet{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean isAlphabet=false;
        char ch=s.next().charAt(0);
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            isAlphabet=true;
        }
        System.out.println(isAlphabet);
    }
}