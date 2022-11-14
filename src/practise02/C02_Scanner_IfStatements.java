package practise02;

import java.util.Scanner;

public class C02_Scanner_IfStatements {

    /*
    Bir derste alınan fize final ve devam puanlarını girilip ortalama hesaplandıktan sonra dersten geçilip
    geçilmediğini consola yazdıran bir program yazalım.

    ortalama=vizenin yüzde 10'u + finalin yüzde 80'i + devam puanının yüzde 10'u

    Geçme Notu:70
    Şartlı Geçiş:60-70
    Bunun altı Kaldı
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        double vize;
        double fınal;
        double devam;

        System.out.println("Vize Notunuzu Giriniz:\n" +
                "Final Notunuzu Giriniz:\n" +
                "Devam Puanınızı Giriniz:");
        vize=scan.nextDouble();
        fınal=scan.nextDouble();
        devam= scan.nextDouble();

        double ortalama=(vize*0.1)+(fınal*0.8)+(devam*0.1);

        System.out.println("Ders Ortalamanız: "+ortalama);

        if (ortalama>=70){
            System.out.println("Dersi Geçtiniz Tebrikler");
        } else if (ortalama<70 && ortalama>=60) {
            System.out.println("Dersi Şartlı Geçtiniz");
        }else {
            System.out.println("Üzgünüm Dersten Kaldınız");
        }


    }
}
