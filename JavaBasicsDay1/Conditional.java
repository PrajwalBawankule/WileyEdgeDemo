import java.util.*;
public class Conditional{
    public static int calcCartValue(int[] arr){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total = total + arr[i];

        }
        if(total>10000){
            int disc = 10*total/100;
            System.out.println("Total cart value = "+total);
            System.out.println("Discount = "+disc);
            return total-disc;
        }
        else{
            System.out.println("Total cart value = "+total);
            return total;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of items :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int balance = Conditional.calcCartValue(arr);
        System.out.println(balance);
    }
}