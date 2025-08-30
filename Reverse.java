import java.util.*;
class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 no.");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
     }
     System.out.println("Reversed Array:");
     for(int j=9;j>=0;j--){
        System.out.print(arr[j]+" ");
     }
     sc.close();
    }
}