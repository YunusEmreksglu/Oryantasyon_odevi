import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
    
        int X =scr.nextInt();
        int Y=0;

        for(int i = X;0<=i;i--) {

            if(i%2!=0){
                Y+=i;
            }

        }

        System.out.println(Y);
    }
}
