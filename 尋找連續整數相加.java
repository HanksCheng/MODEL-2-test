import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        int check=0;
        for (int i=1;i<=n/2;i++){
            for (int k=1;k<=n/2;k++){
                sum=(2*i+k)*(k+1)/2;
                if (sum>n){
                    break;
                }
                if (sum==n){
                    for (int j=i;j<i+k;j++){
                        System.out.print(j+"+");
                    }
                    System.out.println(i+k);
                    check=1;
                }
            }
        }
        if (check==0){
            System.out.println("NO");
        }
    }
}
