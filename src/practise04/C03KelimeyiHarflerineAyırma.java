package practise04;

import java.util.Arrays;

public class C03KelimeyiHarflerineAyırma {
    /*
    Parametre olarak String bir isim girdiğiniz size o ismin harflerini bir
    char Array olarak yazdıran bir method oluşturunuz

    toCharArray() methodunu kullanmayınız.

    *input: John
    *Output: [J,o,h,n]

     */

    public static void main(String[] args) {

        String name="NurullahDemir";
        kelimeHarfleriArrayi(name);



    }
    public static void kelimeHarfleriArrayi(String input){

        char[] output= new char[input.length()];

        for (int i = 0; i < input.length() ; i++) {

            output[i]= input.charAt(i);
        }
        System.out.println("Kelimenin harfleri Array'i: "+ Arrays.toString(output));

    }


}

