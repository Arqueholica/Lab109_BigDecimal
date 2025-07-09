import com.Interfaces.IntArrayList;
import com.Interfaces.IntVector;


public class Main {
    public static void main(String[] args) {

IntArrayList array1 = new IntArrayList();

array1.llenar();
array1.add(10);
array1.add(11);
array1.add(12);

int valorID = array1.get(8);



System.out.println(array1);
        System.out.println("El valor de id es: " + valorID);





IntVector array2 = new IntVector();
        array2.llenar();
        array2.add(86);
        array2.add(97);
        array2.add(0);


        int valorID2 = array2.get(2);

        System.out.println(array2);
        System.out.println("El valor de id es: " + valorID2);


    }
}