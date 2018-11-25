import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int result=0;
        while(n>=1){
            result=result*10+n%10;
            n=n/10;
        }
        System.out.println(result);
    }
}
