import java.util.*;

// i=col & j=row

public class Star_Patterns {
    public static void main(String[] args) {
        System.out.print("Enter Any no. To get Pattern of that Row And Columns:");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
//        for(int i=1;i<=p;i++){
//
//            for (int j=1;j<p;j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

//        for(int i=1;i<=p;i++){
//            for(int j=1;j<=p;j++){
//                if(i==1||j==1||i==p||j==p){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//        for(int i=1;i<=p;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//           for (int i = p; i >= 1; i--) {
//               for (int j = 1; j <= i; j++) {
//                   System.out.print("*");
//            }
//               System.out.println();
//        }
//        for (int i = 1; i <= p; i++) {
//            for (int j = 1; j <= p - i; j++) {
//                System.out.print(" ");}
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        for (int i = 1; i <= p; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);         // To get row print i else for columns print j
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= p; i++) {
//            for (int j = 1; j <=p-i+1; j++) {
//                System.out.print(j);         // To get row print i else for columns print j
//            }
//            System.out.println();
//        }
//        int no=1;
//        for (int i = 1; i <=p; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(no);
//                no++;
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)% 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }
    }
}



