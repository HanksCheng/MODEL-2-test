import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String str="";
        while(n>=2){
            str=Integer.toString(n%2)+str;
            n=n/2;
        }
        str="1"+str;
        int length=str.length();
        for (int i=0;i<8-length;i++){
            str="0"+str;
        }
        System.out.println(str);
    }
}
