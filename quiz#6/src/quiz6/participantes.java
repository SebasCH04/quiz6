package quiz6;

import java.util.*;

public class participantes {

	public static void main(String[] args) {
 
        int n = 6;
        comparar participante[] = new comparar[n];
 
        participante[0] = new comparar("maria", 11, 23);
        participante[1] = new comparar("ana", 13, 23);
        participante[2] = new comparar("laura", 13, 19);
        participante[3] = new comparar("kristel", 11, 21);
        participante[4] = new comparar("antonella", 13, 23);
        participante[5] = new comparar("lucia", 14, 25);
 
        Arrays.sort(participante);
        print(participante);
    }
 
    public static void print(comparar[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}