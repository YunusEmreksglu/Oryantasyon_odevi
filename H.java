import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.print("Kelime yazın(X): ");
        String X =scr.nextLine();
        System.out.print("Kelime yazın(Y): ");
        String Y =scr.nextLine();

        if(X.charAt(0)==Y.charAt(Y.length()-1)){
            
            System.out.println("("+Y+") kelimesinin son harfi ile ("+X+") kelimesinin ilk harfi aynıdır");

        }
        else{

            System.out.println("("+Y+") kelimesinin son harfi ile ("+X+") kelimesinin ilk harfi farklıdır");


        }
    }
}
