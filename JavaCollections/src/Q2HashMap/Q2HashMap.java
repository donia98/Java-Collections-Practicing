/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2HashMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author nadoo
 */
public class Q2HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HashMap<String, Integer> map = new HashMap<>();

        try {
            File input = new File("input.txt");
            Scanner read = new Scanner(new FileInputStream(input));
            ArrayList<String> list = new ArrayList<>();

            while (read.hasNext()) {
                list.add(read.next());
            }

            for (String word : list) {
                Integer i = map.get(word);
                if (i == null) {
                    map.put(word, 1);
                } else {
                    map.put(word, i + 1);
                }
            }
            System.out.println(map.toString());
            File inputC = new File("input.txt");
            Scanner readC = new Scanner(new FileInputStream(inputC));

            HashMap<Character, Integer> charCountMap = new HashMap<>();
            char[] ch = {};
            while (readC.hasNext()) {
                String str = readC.next();
                ch = str.toCharArray();
            }

            for (char charr : ch) {
                Integer i = charCountMap.get(charr);
                if (i == null) {
                    charCountMap.put(charr, 1);
                } else {
                    charCountMap.put(charr, i + 1);
                }
            }

            System.out.println(charCountMap.toString());

        } catch (FileNotFoundException e) {
        }
    }

}
