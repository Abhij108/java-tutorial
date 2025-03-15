import java.util.Scanner;
public class month {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Month NO .");  
        int M = sc.nextInt();
        sc.close();

        switch(M){
            case 1:
            System.out.println("january ");
            System.out.println("31 days");
            break;
            
            case 2:
            System.out.println("feb ");
            System.out.println("28 days");
            break;
                          
            
            case 3:
            System.out.println("march ");
            System.out.println("31 days");
            break;
            
            case 4:
            System.out.println("april ");
            System.out.println("30 days");
            break;
            
            case 5:
            System.out.println("may ");
            System.out.println("31 days");
            break;
            
            case 6:
            System.out.println("jun ");
            System.out.println("30 days");
            break;
            
            case 7:
            System.out.println("july ");
            System.out.println("31 days");
            break;
            
            case 8:
            System.out.println("aug ");
            System.out.println("31 days");
            break;
            
            case 9:
            System.out.println("sep ");
            System.out.println(" 30 days");
            break;
            
            case 10:
            System.out.println("oct ");
            System.out.println("31 days");
            break;
            
            case 11:
            System.out.println("nov ");
            System.out.println("30 days");
            break;
            
            case 12:
            System.out.println("dec ");
            System.out.println("31 days");
            break;
            

        }
    }
    
}
