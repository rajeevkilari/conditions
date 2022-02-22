import java.util.Scanner;
public class Notes{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int notes=0;
        if(n>=2000){
            notes=n/2000;
            n=n%2000;
        }
        if(n>=500){
            notes=notes + n/500;
            n=n%500;
        }
        if(n>=200){
            notes=notes + n/200;
            n=n%200;
        }
        if(n>=100){
            notes=notes+ n/100;
            n=n%100;
        }
        
        System.out.println(notes);
    }
}
        
        