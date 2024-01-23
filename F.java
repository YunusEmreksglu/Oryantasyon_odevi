import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        int X=scr.nextInt();
        int Y=1;

        for(int i = X;0<i;i--){

            Y*=i;

        }

        System.out.println(Y);

    }
}
