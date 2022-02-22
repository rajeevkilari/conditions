import java.util.Scanner;
public class maxnum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        if(a>b && a>c){
            System.out.println("a is max");
        }else if(b>c && b>a){
            System.out.println("b is max");
        }else if(c>a && c>b){
            System.out.println("c is max");
        }else if (a==b && b==c){
            System.out.print("all are equal");
        }
    }
}