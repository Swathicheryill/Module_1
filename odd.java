import java.util.*;
class odd{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] n = new int[10];
    int[] arr = new int[10];
    int j =0;
    System.out.println("Enter 10 numbers");
    for(int i=0;i<10;i++)
    {
        n[i] = sc.nextInt();
        if(n[i]%2!=0){
        arr[j] = n[i];
        j++;
         }

    }
    System.out.println("Even elements in the array is ");
    System.out.print("{");
    for(int i=0;i<j;i++){
        System.out.print( arr[i]+"\t" );
    }
    System.out.print("}");
    sc.close();
}
}