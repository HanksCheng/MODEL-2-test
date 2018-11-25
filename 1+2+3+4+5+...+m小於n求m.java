import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=0,sum=0;
        while(sum<=n){
            i++;
            sum=sum+i;
        }
        System.out.println(i-1);
    }
}
