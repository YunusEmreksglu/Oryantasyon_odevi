import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.print("Sayı gireniz(X): ");
        int X =scr.nextInt();
        System.out.print("Sayı gireniz(Y): ");
        int Y =scr.nextInt();
        
        System.out.println("Toplama: "+(X+Y));

        System.out.println("Çıkarma: "+(X-Y));
    
        
    }
}
