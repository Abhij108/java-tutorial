import java.util.Scanner;
public class and{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.next();

        String str = sc.nextLine();
        sc.close();
        if( age >= 18 && str == " indian"){
            System.out.println("person can vote");
        }
        else{
            System.out.println("person cant vote");
        }
    }
}