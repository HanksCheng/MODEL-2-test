import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt(),b=scn.nextInt();
        int min=Math.min(a,b);
        int gcd=1;
        for (int i=min;i>=1;i--){
            if (a%i==0&&b%i==0){
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
        System.out.println((a*b)/gcd);
    }
}
