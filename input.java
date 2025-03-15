import java.util.Scanner;
public class input {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y =scan.nextInt();
        scan.close();
        double c = (x*(float)1.0)/y;
        System.out.println(c);

    }
    
}
