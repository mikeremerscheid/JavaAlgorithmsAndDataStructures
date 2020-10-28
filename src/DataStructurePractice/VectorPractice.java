package DataStructurePractice;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector vector = new Vector(8);
            vector.add(1);
            vector.add(2);
            vector.add(3);
        System.out.println(vector);
        //prints out [1, 2, 3]
        System.out.println(vector.contains(3));
        //prints out true
    }


}
