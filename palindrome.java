import java.util.*;
public class palindrome {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int rev = 0;
        int original_num = n;
        while(n>0){
            int lastdigit= n%10;
            rev = rev*10+lastdigit;
            n = n/10;
        }
        if(original_num==rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
