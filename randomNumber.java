public class randomNumber{
    public static void main(String[] args){
        while(true){                                    //conmdition of always ture for infinite loop;
            int i = (int) (Math.random()*(10+1));
            if(i==5)
                break;                                  // break Statement is used to berak loop;

               else if (i%4==0){
                    System.out.println("hello");            // this ststement is uesd to remove multiples of 4 and continue loop;  
                          continue; 
                }
            
            System.out.println( i + " ");
        }
    }
}