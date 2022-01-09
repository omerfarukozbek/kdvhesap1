import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir tutar giriniz=");
        float tutar=input.nextInt();
        float kdvlitutar=tutar*1.18f;
        float kdv=tutar*0.18f;
        System.out.println("KDV'siz tutar="+tutar);
        System.out.println("KDV'li tutar ="+kdvlitutar);
        System.out.println("KDV ="+kdv);

    }