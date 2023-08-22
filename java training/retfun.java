import java.util.Scanner;
public class retfun {
    public static void main(String[] args) {
        System.out.println("main");
        int a,b;
        Scanner tb= new Scanner(System.in);
        System.out.println("eter the value of a");
        a=tb.nextInt();
        System.out.println("eter the value of b");
        b=tb.nextInt();
        tb.close();
        myaddfun(a,b);
    }
    public static void myaddfun(int x, int y){
        int sum = x*y;
        System.out.println("value="+sum);
    }
    
}
    

