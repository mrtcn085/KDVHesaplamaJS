import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {

        double fiyat,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyatı Giriniz : " );
        fiyat = input.nextDouble();

         double kdvfiyat = fiyat * kdvOran;
         double kdvliFiyat = fiyat + kdvfiyat;

        System.out.println("KDV Oranı  : " + kdvOran);
        System.out.println("KDV Fiyatı : " + kdvfiyat);
        System.out.println("KDV'li Fiyatı : " + kdvliFiyat);



    }
}