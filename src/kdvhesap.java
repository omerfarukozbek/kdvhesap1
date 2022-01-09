import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("bir tutar giriniz=");
        float tutar=input.nextInt();
        if (tutar<=1000) {
            float kdvlitutar = tutar * 1.18f;
            float kdv = tutar * 0.18f;
            System.out.println("KDV'siz tutar=" + tutar);
            System.out.println("KDV'li tutar =" + kdvlitutar);
            System.out.println("KDV =" + kdv);
        }else {float kdvlitutar = tutar * 1.08f;
            float kdv = tutar * 0.08f;
            System.out.println("KDV'siz tutar=" + tutar);
            System.out.println("KDV'li tutar =" + kdvlitutar);
            System.out.println("KDV =" + kdv);


        }

    }
}
