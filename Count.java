import java.util.*;
class Count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 no.");
        for(int i=0;i<10;i++)
        {
            arr[i] = sc.nextInt();
        } 
        int c=0;
       for(int j=0;j<10;j++)
       {
          if(arr[j]>50){
            c++;
          }
       }
       System.out.println("No.of numbers greater than 50 in an array = "+c);
       sc.close();
    }
}