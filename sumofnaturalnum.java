import java.util.*;
public class sumofnaturalnum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] numbers=new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=i+1;
        }
        int sum=0;
        for (int number:numbers){
            sum+=number;
        }
        System.out.println("Sum of first" + n + "natural numbers is:"+sum);
    }
}