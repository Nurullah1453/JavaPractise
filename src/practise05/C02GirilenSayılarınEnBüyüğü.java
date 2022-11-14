package practise05;

import java.util.Scanner;

public class C02GirilenSayılarınEnBüyüğü {

    //Kullanıcıdan 5 tane sayı isteyiniz bu sayıların en büyüğünü bularak yazdırın

    public static void main(String[] args) {

        int enBüyüksayı=0;
        int sayac=0;

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 5 adet sayı giriniz");

        while (sayac<5){
            int sayı=scan.nextInt();
            if (sayı>enBüyüksayı){
                enBüyüksayı=sayı;
            }
            sayac++;
        }
        System.out.println("Girdiğiniz Sayıların En Büyüğü: "+ enBüyüksayı);
    }
}
