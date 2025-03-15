import java.util.Scanner;
public class loop  
{  
public static void main(String[] args)   
{  
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
int i,  sum = 0;  
//executes until the condition returns true  
for(i = 1; i <= num; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
sc.close();
//prints the sum   
System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
}  
}  
