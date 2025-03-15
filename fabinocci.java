import java.util.Scanner;
public class fabinocci{
public static void fabinocci(int n){
    int fab1=0;
    int fab2 =1;
    int fab3; 
    System.out.print(fab1+" "+ fab2 +" ");
    for(int i=2; i<=n; i++){
        fab3 = fab1+fab2;
        System.out.print(fab3 +" ");
        fab1 = fab2;
        fab2 = fab3;

        }
    }

public static void main(String args[]){
    int n= 10;
    fabinocci(n);
} 
}