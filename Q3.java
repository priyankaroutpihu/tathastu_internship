import java.util.Scanner;
public class Q3 {

//factorial of a number

    public class main {
        public static void main(String[] arg) {
            int n,fact=1;
            System.out.print("Enter  any number:");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("factorial"+fact);
        }
    }

























}
