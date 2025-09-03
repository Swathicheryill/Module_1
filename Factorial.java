import java.util.*;
class Factorial
{
    static int Fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else {
            return n*Fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int num = sc.nextInt();
        System.out.println("The factorial of"+ num +"is "+Fact(num));
        sc.close();
    }
}