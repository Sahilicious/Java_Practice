import java.util.*;

public class sum_of_natural_no {
    public static void main(String args[]) {
        System.out.println("enter any no. n (To get sum of natural no. till n)");
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i<= n; i++) {
            sum=sum+i;
        }
        System.out.println("Sum =" +sum );
    }

}