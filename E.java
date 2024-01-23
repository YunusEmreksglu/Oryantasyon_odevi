
public class E {
    public static void main(String[] args) {
        int X = (int)(Math.random()*10000);
        
        if(X/1000<=X-((X/10)*10)){
            System.out.println("Random Sayı: "+X);
            System.out.println("Birler basamağı Binler basamağından büyük veya eşittir");
        }
        else{
            System.out.println("Random Sayı: "+X);
            System.out.println("Binler basamağı Birler basamağından büyük");
        }

    }
}
