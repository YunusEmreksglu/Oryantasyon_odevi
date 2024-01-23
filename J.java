import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        
        System.out.print("Boy(X): ");
        int X =scr.nextInt();
        int Y=-1+(X*2);
        String u="";
        for(int i=1; i<=Y;i++){
            u+="+";
        }

        for(int i = 1;i<=X;i++){
            StringBuilder uu = new StringBuilder(u);
            for(int j = 1;j<=-1+(i*2);j+=2){
                uu.setCharAt(((Y-j)/2),'^');
                uu.setCharAt((-1+(Y+j)/2),'^');
                
            }
            System.out.println(uu);
        }
    }
}
