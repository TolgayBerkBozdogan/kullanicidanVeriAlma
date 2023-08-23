package Giris;
import java.util.Scanner;
public class kullanicidanVeriAlma {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    String ad;
    System.out.println("Adınızı giriniz");
    ad = input.next();
    String soyAd;
    System.out.println("Soyadınızı giriniz");
    soyAd = input.next();
    int yas;
    System.out.println("Yaşınızı Giriniz");
    yas = input.nextInt();
    System.out.print("Adı: " +ad );
    System.out.print(" Soyadı: " +soyAd);
    System.out.print(" Yaşı: " +yas );

    }
}
