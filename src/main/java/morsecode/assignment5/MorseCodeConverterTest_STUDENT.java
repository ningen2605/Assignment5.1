package morsecode.assignment5;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MorseCodeConverterTest_STUDENT {
    @Test
    public void testConvertToEnglishString() {
        String converter1 = MorseCodeConverter.convertToEnglish("... --- -- . -... --- -.. -.-- / - --- / .-.. --- ...- .");
        String converter2 = MorseCodeConverter.convertToEnglish("-... --- -.-. -.-. .... .. / - .... . / .-. --- -.-. -.-");
        assertEquals("somebody to love",converter1);
        assertEquals("bocchi the rock",converter2);
    }

    /**
     * Testing for correct implementation of tree and traversal
     */

    @Test
    public void testPrintTree() {

        assertEquals("h s v i f u e l r a p w j  b d x n c k y t z g q m o", MorseCodeConverter.printTree());
    }

    /**
     * Testing for correct conversion of all characters using key phrase to hit all letters
     */

    @Test
    public void testConvertMorseStringToEnglishString() {

        String converter1 = MorseCodeConverter.convertToEnglish(".... .- ...- . / -.-- --- ..- / .--. .-. .- -.-. - .. -.-. . -.. / - --- -.. .- -.--");
        String converter2 = MorseCodeConverter.convertToEnglish("--. .-.. --- .-. .. ..-. -.-- .. -. --. / -- ..- ... .. -.-. / .- ... / .- / .-- .... --- .-.. . / .. -. / --- .-. -.. . .-. / - --- / ... . .-.. .-..");
        assertEquals("have you practiced today", converter1);
        assertEquals("glorifying music as a whole in order to sell", converter2);

    }
    @Test
    public void testConvertMorseFileToEnglishString() {

		/*Make sure howDoILoveThee.txt is in the src directory for this
		  test to pass
		*/
        File file = new File("src/Youngboylikeacruelangel.txt");
        try {
            assertEquals("young boy like a cruel angel", MorseCodeConverter.convertToEnglish(file));
        } catch (FileNotFoundException e) {
            assertTrue("An unwanted exception was caught", false);
        }
    }
}
