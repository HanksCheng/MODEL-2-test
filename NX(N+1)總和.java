import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int result=0;
        for (int i=1;i<=n;i++){
            result=result+(i*(i+1));
        }
        System.out.println(result);
    }
}
