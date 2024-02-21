import java.util.*;

public class Star_Patterns {
    public static void main (String[] args){
        System.out.print("Enter Any no. To get Pattern of that Row And Columns:");
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
//        for(int i=1;i<=p;i++){
//
//            for (int j=1;j<p;j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

        for(int i=1;i<=p;i++){
            for(int j=1;j<=p;j++){
                if(i==1||j==1||i==p||j==p){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
