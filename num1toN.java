import java.util.*;
public class num1toN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, to upto you want to print");
        int n =sc.nextInt();

        for( int i =1 ; i<=n; i++){
            System.out.println(i);
        }
    }
}
