import java.util.Scanner;
public class count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long digits = 0;
        sc.close();
        while(i>0){
            i/=10;
            digits++;
        }
        System.out.println(digits);
    }
}