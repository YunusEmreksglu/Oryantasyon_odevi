import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.print("Sayı gireniz(X): ");
        int X =scr.nextInt();
        System.out.print("Sayı gireniz(Y): ");
        int Y =scr.nextInt();
        
        System.out.println("Çarpma: "+(X*Y));

        System.out.println("Bölme: "+(X/Y));
    }
}
