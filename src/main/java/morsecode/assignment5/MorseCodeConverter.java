package morsecode.assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * MorseCodeConverter class
 * @author Ricardo Abuabara

 */
public class MorseCodeConverter {
    private static MorseCodeTree tree = new MorseCodeTree(); //tree to manipulate

    /**
     * Converts a morse code into English Each letter is delimited by a space (‘ ‘). Each word is delimited by a ‘/’.
     * @param s String of morse code
     * @return an English translation of the morse code
     */
    public static String convertToEnglish(String s) {
        String[] words;
        String[] letters;

        String result = "";
        words = s.split("/");

        for(int i = 0;i < words.length;i++) {

            words[i] = words[i].trim();
            letters = words[i].split(" ");

            for(int j = 0;j<letters.length;j++) {

                result += tree.fetch(letters[j]);

            }
            result += " ";
        }
        result = result.trim();
        return result;
    }
    /**
     * Returns string of with all the data in LNR order with a space in between them
     * @return the data in the tree in LNR order separated by a space.
     */
    public static String printTree() {
        String data = "";

        ArrayList<String>list;
        list = tree.toArrayList();

        for(int i = 0; i < list.size();i++) {

            data += list.get(i);

        }
        return data;
    }
    /**
     * Converts a file of morse code into English each letter is delimited by a space (‘ ‘). Each word is delimited by a ‘/’.
     * @param file name of the File that contains Morse Code
     * @return the English translation of the file
     * @throws FileNotFoundException
     */
    public static String convertToEnglish(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        String result = "";

        while(in.hasNext()) {
            result += convertToEnglish(in.nextLine());
        }
        return result;
    }
}
