import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0,b=0,c=0;
        int fcount=0,sum=0;
        for (int i=0;i<n;i++){
            a=scn.nextInt();
            b=scn.nextInt();
            c=scn.nextInt();
            fcount=0;
            sum=0;
            if(a<60){
                fcount++;
            }
            if(b<60){
                fcount++;
            }
            if(c<60){
                fcount++;
            }
            sum=a+b+c;
            if (fcount==0){
                System.out.println("P");
            } else if (fcount==1){
                if (sum>=220){
                    System.out.println("P");
                }else{
                    System.out.println("M");
                }
            } else if (fcount==2){
                if (Math.max(Math.max(a,b),c)>=80){
                    System.out.println("M");
                }else{
                    System.out.println("F");
                }
            }
        }
    }
}
