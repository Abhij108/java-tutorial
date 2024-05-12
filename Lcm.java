import java.util.Scanner; //scanner class is use for taking user input;
public class Lcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m,gcd = 1;
        n = sc.nextInt();       // user input;
        m = sc.nextInt();        // user input;

         //here use for loop for fiding gcd of two numbers; 

        for(int i =1; i<=n && i<=m ; i++){

          //now condition for to find  the common divisior for n & m;
             if(n%i==0 && m%i==0){
                gcd = i;
            }
        }
        sc.close();         // is use to close scanner class;
        
        System.out.println("lcm is:" +(n*m)/gcd);
        


    }
}