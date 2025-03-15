

import java.util.Scanner;
public class caci{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    float r = sc.nextFloat();
    int t = sc.nextInt();
    sc.close();
    double si = (p*r*t)/100;
    System.out.println("simple interest is = " +si);
    }
}