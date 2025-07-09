import com.Interfaces.IntArrayList;
import com.Interfaces.IntVector;

public class Main {
    public static void main(String[] args) {

IntArrayList array1 = new IntArrayList();

//array1.llenar();
array1.add(5);
array1.add(6);
array1.add(9);
array1.add(5);
array1.add(6);
array1.add(9);
array1.add(9);

System.out.println(array1);





IntVector array2 = new IntVector();
        array2.llenar();
        array2.add(86);

        System.out.println(array2);



    }
}