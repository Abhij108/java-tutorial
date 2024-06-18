/* FOr each loop is a enhanced form of for loop
 * As name suggest for each is used to iterate over each of the iterable element
 */
public class foreachloop {
    public static void main(String[] args){
        int[] arr =         { 5,4,2,3,1};
        /* declaration foreach : 
        inside the parenthesise left hand side variable name declared with datatype 
         right hand side name of iterable */   
             for(int num : arr){
            System.out.println(num);
        }
        // for print the squares of iterable;
        for(int num : arr){
            System.out.println(num*num);
        }

        }
    }


 