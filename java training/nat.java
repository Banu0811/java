import java.util.Scanner;

public class nat {
    public static void main(String[] args) {
        int n;
        Scanner as = new Scanner(System.in);
        System.out.println("enter limit");
        n = as.nextInt();
        nature(n);
        as.close();
    }
    public static void nature(int x) {
        if(x==1) {
            System.out.println(x);
        }
        else {
            System.out.println(x);
            nature(x-1);
        }
    }
}
