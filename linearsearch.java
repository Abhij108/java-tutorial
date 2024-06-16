// linear search in array java code ;

import java.util.Scanner;

class linearsearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // declaration of size of array or length of array;
        
System.out.println("size of array:");
        int n = sc.nextInt();   
        
        System.out.println("Enter array values :");
        int[] arr = new int[n];     //input values of array;

        for(int i = 0 ; i<n ; i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Enter key value for search :");
        int key = sc.nextInt();
        int ans = -1; 

        // condition statement for checking the vaslues of array ;
        for(int i = 0 ; i<n ; i++){
            if(key == arr[i]){
                ans = i;
                break;
            }
        }
        System.out.println("Index value for key is =" +ans);
        sc.close();
    }
}