package practise04;

public class C02StringdekiSayılarıToplama {
    /*
    Parametre olarak bir String kabul eden ve verilen Stringde
    bulunan rakamların toplamını yazdıran bir method yazdırın
    input: ad1r4d3
    output: 1+4+3 = 8
     */

    public static void main(String[] args) {

        String kelime="ade1r4d3";
        rakamlarınToplamı(kelime);


    } public static void rakamlarınToplamı(String input){

        int toplam=0;
        for (int i = 0; i <input.length() ; i++) {

            if (Character.isDigit(input.charAt(i))){
                toplam+=Integer.valueOf(""+input.charAt(i));
            }
        }
        System.out.println("Rakamların Toplamı: " + toplam);


    }
}
