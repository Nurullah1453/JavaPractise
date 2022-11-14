package practise04;

import java.util.Scanner;

public class C01CumledeKelimeAratma {
    /*
    Kullanıcıdan bir kelime ve cümle alın
    Kelimeyi cümle içinde aratıp yazdırın

    örn==>  "hihihi" String="hi" output: "hihihi"'nin içerisinde 3 tane "hi" var
    örn==>  "Yoldayım" String="yol" output: "Yoldayım"'ın içerisinde 1 tane "yol" var.
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle=scan.nextLine();

        System.out.println("Aratman istediğiniz kelimeyi giriniz");
        String kelime=scan.nextLine();

        int sayac=0;

        for (int i = 0; i <cümle.length()-kelime.length() ; i++) {

            if (cümle.substring(i,i+kelime.length()).equalsIgnoreCase(kelime)){
                sayac++;


            }

        }
         System.out.println("Cümlenin içerisinde "+sayac+" adet "+kelime + " var.");


        if (sayac==0){
            System.out.println("Cümlenin içerisinde aradığınız kelime yok");
        }
    }
}
