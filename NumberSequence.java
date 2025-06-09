import java.util.Scanner;
public class NumberSequence{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the first number");
        int a=snr.nextInt();
	System.out.println("Enter the second number");
        int b=snr.nextInt();
	System.out.println("Enter the number of rows to print");
        int n=snr.nextInt();
	System.out.println("The sequence is: ");
        for(int i=1;i<=n;i++){
            int c=a+b;
            System.out.println(a+" "+b+" "+c);
            a=c;
            b=b+1;
        }
    }
}