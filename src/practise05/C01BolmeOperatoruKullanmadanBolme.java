package practise05;

import java.util.Scanner;

public class C01BolmeOperatoruKullanmadanBolme {

    static int bolum=0;

    /*
    Kullanıcıdan bölünen ve bölen şeklinde 2 sayı alalım ve bölme operatorü
    kullanmadan bölme  işlemi gerçekleşirip bölümü hesaplayan method create ediniz.
     */

    public static void main(String[] args) {

      Scanner scan= new Scanner(System.in);
        System.out.println("Bölünecek sayıyı giriniz");
        int bolunen=scan.nextInt();
        System.out.println("Bölen Sayıyı Giriniz");
        int bolen= scan.nextInt();

        System.out.println(bolunen+"/"+bolen + "="+bol(bolunen,bolen));


    }
    public static int bol(int bolunen,int bolen){

        while (bolunen>=bolen){
            bolunen-=bolen;
            bolum ++;
        }
        return bolum;

    }

}
