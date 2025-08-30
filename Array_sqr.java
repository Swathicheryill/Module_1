import java.util.*;
class Array_sqr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers");
        for(int i =0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int sq =0;
        for(int j=0;j<10;j++){
            sq+=arr[j]*arr[j];
        }
        System.out.println("The sum = "+sq);
        sc.close();
    }
}