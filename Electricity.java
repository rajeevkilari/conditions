import java.util.Scanner;
public class Electricity{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int units =s.nextInt();
        double bill=0;
        double totalBill=0;
        if(units<=50){
            bill= 0.5*units;
            totalBill=bill+(0.2*bill);
        }
        else if(units>50 && units<=150){
            bill= 0.75*units;
            totalBill=bill+(0.2*bill);
        }else if(units>150 && units<=250){
            bill= 1.20*units;
            totalBill=bill+(0.2*bill);
        }else if(units>250){
            bill= 1.50*units;
            totalBill=bill+(0.2*bill);
        }
    }
}
    