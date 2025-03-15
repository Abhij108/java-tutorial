import java.util.Scanner;
public class whileSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a ;
        int sum = 0;
        do{
            a = sc.nextInt();
            sum += a;
        }while(a >= 0);
        sc.close();
        
        System.out.println(sum);
    }
}