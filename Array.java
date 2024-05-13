/* Arrays are the primitive datatype in which we store same type of data like int ,long ,float etc*/
public class Array {
    public static void main(String[] args){
        float []marks = new float[10];      //here we only  store float type value ;

        int []rollno = new int[10];             //here we only store integer type value;

        String[] names = {"luffy","zoro","sun"};    //in string variable we only stores string types of value; 

        marks[0] = 19;                      //in array indexing is start from 0;
        marks[1] = 18;
        marks[2] = 19;
        marks[3] = 16;

        
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);

    System.out.println(names[0]);
    System.out.println(names[1]);           
    System.out.println(names[2]);

    System.out.println(names.length);

    System.out.println(rollno.length);   //.length is used to print size or length of array;
    
    }
    
}

/*OUTPUT:

19.0
18.0
19.0
luffy
zoro
sun
3
10

*/
