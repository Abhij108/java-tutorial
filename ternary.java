import java.util.Scanner;
public class ternary{
    public static void main(String[] arg){
    Scanner scan = new Scanner(System.in);

    int num =  scan.nextInt();
    String str = num % 2==0 ? "Even" : "odd";
scan.close();
    System.out.println(str);
    }
}