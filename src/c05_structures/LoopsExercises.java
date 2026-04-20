package c05_structures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {

    public static void main (String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.

        int index = 1;
        while (index < 11) {
            System.out.println(index);
            index ++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        int[] exercise2 = {52, 34, 56, 78};

        index = 0;
        do {
            System.out.println(exercise2[index]);
            index++;
        } while (index < exercise2.length);

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int index2 = 0; index2 <= 50; index2+=5) {
            System.out.println(index2);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        int[] exercise3 = {1, 2, 3, 4, 5};
        int sum3 = 0;

        for (int index4 = 0; index4 < exercise3.length; index4++) {
            sum3 += exercise3[index4]; // Acumular la suma
        }
        System.out.println("La suma total es: " + sum3);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        String[] exercise5 = {"v1","v2","v3","v4"};

        for (int index5 = 0; index5 < exercise5.length; index5++) {
            System.out.println("Indice "+ index5 + " : " + exercise5[index5]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var exercise6 = new HashSet<Integer>();
        var exercise6_1 = new HashMap<Integer, Integer>();

        exercise6.add(1);
        exercise6.add(2);
        exercise6.add(3);

        exercise6_1.put(1, 1);
        exercise6_1.put(2, 2);
        exercise6_1.put(3, 3);

        for(Integer exercise6_2: exercise6){
            System.out.println(exercise6_2);
        }

        for(Map.Entry<Integer, Integer> exercise6_3: exercise6_1.entrySet()){
            System.out.println("ID: " + exercise6_3.getKey() + " Value: " + exercise6_3.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.


        for (int index7 = 10; index7 >= 1; index7--) {
            System.out.println(index7);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int index8 = 0; index8 <= 20; index8++) {
            if (index8 % 3 == 0) {
                continue;
            }
            System.out.println(index8);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        Integer[] exercise9 = {1, 2, 3, -4, 5};

        for (int index9:  exercise9) {
            if (index9 < 0) {
                break;
            }
            System.out.println(index9);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.

        int num10 = 3;
        long facto = 1;

        for (int index10 = 1; index10 <= num10; index10++) {
            facto *= index10;
        }
        System.out.println(facto);



    }
}
