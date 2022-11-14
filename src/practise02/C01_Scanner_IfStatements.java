package practise02;

import java.util.Scanner;

public class C01_Scanner_IfStatements {
    /*
    Kullanıcıya
    1-Günde kaç bardak çay tükettiğini
    2-Her bardak için kaç küp şeker kullandığını sorup

    Kullanıcının yıllık ve 40 yıllık şeker tüketimini kg bazında consolda yazdıran bir program yazın.
    Kullanıcı eğer şeker kullanmıyorsa Aferin böyle devam et :) çıktısını görsün.
    (1 küp şeker= 2.77gr)
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Günde kaç bardak çay tüketiyorsun?");
        int cay=scan.nextInt();

        System.out.println("Her bakdak için kaç şeker kullanıyorsun?");
        int seker=scan.nextInt();

        double yıllıkTuketimKG=cay*seker*2.77*365/1000;
        double kırkYıllıkTuketim=yıllıkTuketimKG*40;


        if (seker==0){
            System.out.println("Aferin Böyle Devam Et :)");
        }else {
            System.out.println("Yıllık tükettiğiniz şeker miktarı: " + yıllıkTuketimKG + "KG" + "\n" +
                    "40 Yıllık Tükettiğiniz şeker miktarı: "+ kırkYıllıkTuketim+"KG");
        }

    }
}
