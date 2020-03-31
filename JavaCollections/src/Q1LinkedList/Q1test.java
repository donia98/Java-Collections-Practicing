/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nadoo
 */
public class Q1test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random objGenerator = new Random();

        List<Integer> listNames = new LinkedList<>();
        System.out.println("LikedList with 30 random integers from 0 to 100 in order: ");
        for (int i = 0; i < 30; i++) {
            listNames.add(objGenerator.nextInt(100));
            System.out.print(listNames.get(i) + " ");
        }
        System.out.println("\nLikedList  Sorted");
        Collections.sort(listNames);

        for (int s = 0; s < listNames.size(); s++) {
            System.out.print(listNames.get(s) + " ");
        }

        int sum = 0;
        for (Integer sumItem : listNames) {
            sum += sumItem;
        }
        
        System.out.println("\nThe sum of the list items = "+ sum);
        
        double avg = sum/listNames.size();
        
        System.out.println("Thefloating-point average of the elements= "+ avg);
    }

}
