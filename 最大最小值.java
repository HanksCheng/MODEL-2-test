import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float n;
        float minval=Float.MAX_VALUE;
        float maxval=Float.MIN_VALUE;
        for (int i=1;i<11;i++){
            n=scn.nextFloat();
            if(n<minval){
                minval=n;
            }
            if (n>maxval){
                maxval=n;
            }
        }
        System.out.printf("max:%.2f\n",maxval);
        System.out.printf("min:%.2f\n",minval);
    }
}
