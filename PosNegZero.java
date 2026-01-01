import java.util.*;
public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n =sc.nextInt();

        if(n<0){
           System.out.println("Number is negative");
        }
        else if(n==0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is positive");
        }
    }
}
