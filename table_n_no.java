import java.util.*;

public class table_n_no {
    public static void main(String args[]) {
        System.out.println("Enter No. to Get table=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Table");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+i+"="+i*n);

        }

    }
}