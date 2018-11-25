import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
         for (int a=1;a<n/2;a++){
             for (int b=1;b<n/2;b++){
                 for (int c=1;c<n/2;c++){
                     if (a<b && b<c){
                         if (a+b+c<=n){
                             if (a+b>c||a+c>b||b+c>a){
                                 if (a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b){
                                     System.out.printf("%d\t%d\t%d\n",a,b,c);
                                 }
                             }
                         }
                     }
                 }
             }
         }
    }
}
