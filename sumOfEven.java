import java.util.Scanner;
public class sumOfEven {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of integers");
        int b=inp.nextInt();
        int sum=0;
        while(b>=0)
        {
            if(b%2==0)
            {
                sum=sum+b;
            }
            b--;
        }
        System.out.println("Sum is "+ sum);
        System.out.println(b);

    }
}
