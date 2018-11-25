import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        long factorial=1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        int count=0;
        while(factorial%10==0){
            factorial=factorial/10;
            count++;
        }
        System.out.println(count);
        System.out.println(factorial);
    }
}
