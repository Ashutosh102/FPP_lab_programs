import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
    
    try (Scanner sc = new Scanner(System.in)) {
        int a, b , c=0;
        a = sc.nextInt();
        for(b=2;b<a;b++)
        {
           if(a%b==0){
            //   System.out.println(a+" is Not prime");
            c++;
           }
          
        }
        
        if(c>0){
            System.out.println(a+" is Not prime");
        }
        else{
            System.out.println(a+" is prime");
        }
        sc.close();
    }
    }
}
