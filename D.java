import java.util.Scanner;

public class D {
    public static void main(String[] args) {

        Scanner scr=new Scanner(System.in);

        String X = scr.nextLine();

        if(Character.isLetter(X.charAt(0))==true){
            
            System.out.println("Girilen yazının ilk değeri Sayı değildir");

        }
        else{

            System.out.println("Girilen yazının ilk değeri Sayıdır");


        }

    }
    
}
