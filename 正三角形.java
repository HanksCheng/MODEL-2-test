import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n-i;j>=1;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
