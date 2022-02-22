import java.util.Scanner;
public class Percent{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int total=0;
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
            total=total+arr[i];
        }
        double max=500;
        double Percentage=(total*100)/500;
        if( Percentage >= 90){
            System.out.println("grade : A");
        }if( Percentage >= 80 && Percentage<90){
            System.out.println("grade : B");
        }if( Percentage >= 70 && Percentage<80){
            System.out.println("grade : C");
        }if( Percentage >= 60 && Percentage<70){
            System.out.println("grade : D");
        }if( Percentage >= 40 && Percentage<60){
            System.out.println("grade : E");
        }if(Percentage<40){
            System.out.println("grade : F");
        }
    }
}