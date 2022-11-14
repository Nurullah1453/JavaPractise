package practise03;

import java.util.Scanner;

public class C01_HesapMakinesi {
    /*
    Kullanıcıdan aldıgınız 2 sayıyı yine kullanıcıya seçtireceğiniz
    Dört işlemden biri ile isleme koyup sonucu yazdırınız
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("2 Sayı Giriniz");
        double sayı1= scan.nextDouble();
        double sayı2=scan.nextDouble();

        System.out.println("Yapmak istediğiniz İşlemi Seçin\n" +
                ""+"1:Toplama\n" +
                "2:Çıkarma\n" +
                "3:Çarpma:\n" +
                "4:Bölme");
        int ıslem=scan.nextInt();

        switch (ıslem){
            case 1:
                System.out.println(sayı1+sayı2);
                break;
            case 2:
                System.out.println(sayı1-sayı2);
                break;
            case 3:
                System.out.println(sayı1*sayı2);
                break;
            case 4:
                System.out.println(sayı1/sayı2);
                break;
            default:
                System.out.println("Geçersiz İşlem Seçimi");
        }




    }
}
