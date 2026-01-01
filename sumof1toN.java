import java.util.*;
public class sumof1toN {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number upto you want to add");
        int n = sc.nextInt();
        //  int Sum=0;
        // for(int i =1;i<=n;i++){
        //     Sum = Sum+i;
        //     System.out.println("The sum of numbers from 1 to N is"+Sum);

    //     }
       // while loop logic 
         int i=1;
         int sum=0;
         while(i<=n){
         sum=sum+i;
         i++;
         }
         System.out.println("Sum is"+sum);
         sc.close();
     }
}
