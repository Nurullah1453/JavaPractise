package practise05;

public class C03_ReverseNumber {

    /*
    Write a return method to reverse number

    Input:12345  Output:54321
     */

    public static void main(String[] args) {

        int input=12345;
        System.out.println("Girilen Sayının Ters çevrilmiş hali: "+ reverseNumber(input));


    }public static int reverseNumber(int input){

        int reversNumber = 0;

        while (input>0){


            reversNumber=input%10 +reversNumber*10;
            input=input/10;
        }

        return reversNumber;
    }
}
