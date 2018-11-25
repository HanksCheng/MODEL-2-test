import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        int sum=0;
        while (n>=1){
            sum+=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
