import java.util.Scanner;
public class calender {
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("date");
        int a=as.nextInt();
        System.out.println("month");
        int b=as.nextInt();
        System.out.println("year");
        int c=as.nextInt();
        mon(b);
        date(a);
        year(i);
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
            else if(y==4) {
                 System.out.println("apr");
            }
            else if(y==5) {
                 System.out.println("may");
            }
            else if(y==6) {
                 System.out.println("jun");
            }
            else if(y==7) {
                 System.out.println("july");
            }
            else if(y==8) {
                 System.out.println("aug");
            }
            else if(y==9) {
                 System.out.println("sep");
            }
            else if(y==10) {
                 System.out.println("oct");
            }
            else if(y==11) {
                 System.out.println("nov");
            }
            else if(y==12) {
                 System.out.println("dec");
            }
        } 
        public static void date(int z) {
            if(z%2==0) {
                System.out.println("even");
            }
            else if(z%2!=0) {
                 System.out.println("odd");
            }
        }
        public static void year(int i) {
             
                                        
        }
}
