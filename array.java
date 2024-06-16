import java.util.Scanner;

class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // inputs of array using loop
        for(int i = 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        
        }
        sc.close();
        //output of arrays using loop
        for(int i = 0; i<arr.length; i++){
            System.out.println("At index = "+i+" value =" +arr[i]);
        }
    }
}