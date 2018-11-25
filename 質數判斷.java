import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        boolean flag=true;
        for (int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
            }
        }
    if (flag==true){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}
