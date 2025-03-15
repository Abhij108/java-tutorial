
import java.util.Scanner;
public class alpbh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give a alphbet charecter .");  
        char M = sc.next().charAt(0);
        sc.close();
//usi9ng false loop;
        switch(M){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("vowel");
            break;
            default:
            System.out.println("consonent");
        }
    }   
              
}
