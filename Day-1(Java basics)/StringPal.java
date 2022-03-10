import java.util.Scanner;

public class StringPal {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        str = str.toLowerCase();
        if (isPalindrome(str))
            System.out.println("Yes pallindrome");
        else
            System.out.println("No not a pallindrome");
        sc.close();
    }
}
