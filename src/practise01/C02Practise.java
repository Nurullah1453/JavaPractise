package practise01;

public class C02Practise {

    /*
    76453 sayısının herbir basamagını konsolda alt alta yazdırın

    input:76453
    outpu:7
          6
          4
          5
          3
     */

    public static void main(String[] args) {

        int sayı=76453;
        int birlerBasamagı=sayı%10;
        int onlarBasamagı=(sayı/10)%10;
        int yüzler=(sayı/100)%10;
        int binlerBasamagı=(sayı/1000)%10;
        int onbinlerBasamagı=(sayı/10000)%10;

        System.out.println(onbinlerBasamagı+"\n" +
                binlerBasamagı+"\n" +
                yüzler+"\n" +
                +onlarBasamagı+"\n" +
                birlerBasamagı);

    }
}
