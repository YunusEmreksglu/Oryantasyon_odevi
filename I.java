import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        
        System.out.print("En(X): ");
        int X =scr.nextInt();
        System.out.print("Boy(Y): ");
        int Y =scr.nextInt();

        for(int i = Y;0<i;i--){
            String u="";
            for(int j = X;0<j;j--){
                u+="#";
            }
            System.out.println(u);
        }


    }
}
