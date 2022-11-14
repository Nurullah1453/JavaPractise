package practise03;

import java.util.Scanner;

public class C02_DogumGunuKıyaslama {
    /*
    Kullanıcıdan 2 farklı doğum günü tarihi alıp
    kimin daha önce doğduğunu consolda yazdıran bir program yazınız.

    2010/05/23

    2010/12/31
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Karşılaşırmak istediğiniz ilk doğum gününü Yıl/Ay/Gün olarak giriniz");
        int yıl1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gün1 = scan.nextInt();

        System.out.println("Lütfen Karşılaşırmak istediğiniz ikinci doğum gününü Yıl/Ay/Gün olarak giriniz");
        int yıl2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gün2 = scan.nextInt();

        if (yıl1 > yıl2) {
            System.out.println("İkinci Girilen Kişi Daha Büyük");
        } else if (yıl2 > yıl1) {
            System.out.println("İlk Girilen Kişi Daha büyük");
        }
        if (yıl1 == yıl2) {
            if (ay1 > ay2) {
                System.out.println("İkinci Girilen Kişi Daha büyük");
            } else if (ay2 > ay1) {
                System.out.println("İlk Girilen Kişi Daha Büyüktür");
            }
            if (ay1 == ay2) {
                if (gün1>gün2){
                    System.out.println("İkinci Girilen Kişi Daha büyüktür");
                } else if (gün2>gün1){
                    System.out.println("İlk Girilen Kişi Daha büyüktür");
                }else {
                    System.out.println("Siz İkizsiniz");
                }
            }
        }
    }
}
