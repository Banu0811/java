import java.util.Scanner;

public class att {
    public static void main(String[] args) {
        int n;
        Scanner as = new Scanner(System.in);
        System.out.println("enter mark");
        n = as.nextInt();
        mark(n);
        as.close();
    }
    public static void mark(int x) {
        boolean mark = true;
       
        if(x==45) {

            System.out.println(mark);
        }
        else {
            System.out.println(!mark);
        }    
    }
}
