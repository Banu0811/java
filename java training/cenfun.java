import java.util.Scanner;
public class cenfun {
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("date");
        int a=as.nextInt();
        System.out.println("month");
        int b=as.nextInt();
        System.out.println("year");
        int c=as.nextInt();
        mon(b);
        as.close();
        }
        public static void  mon(int y){
          if(y==1) {
                 System.out.println("jan");
            }
          else if(y==2) {
                 System.out.println("feb");
            }
          else if(y==3) {
                 System.out.println("mar");
            }
        } 
      
}
