import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=1, c, d;
        c = sc.nextInt();
        System.out.println("Fibonacci series are:-");
        System.out.print(a+","+b+",");
        for(int i=2; i<c; i++){
            d=a+b;
            System.out.print(d+",");
            a=b;
            b=d;
        }
        sc.close();
    }
}
