import javax.swing.JOptionPane;

public class Question3 {
    public static void main(String[] args) {
        String output;
        String charAsString;
        char theChar;

        charAsString = JOptionPane.showInputDialog("Please enter one letter: ");
        theChar = charAsString.charAt(0);

        if (theChar == 'a') {
            output = "Your character " + theChar + " is a vowel";
        }
        else if (theChar == 'e') {
            output = "Your character " + theChar + "  is a vowel";
        }
        else if (theChar == 'i') {
            output = "Your character " + theChar + "  is a vowel";
        }
        else if (theChar == 'o') {
            output = "Your character " + theChar + "  is a vowel";
        }
        else if (theChar == 'u') {
            output = "Your character " + theChar + "  is a vowel";
        } else {
            output = "Your character " + theChar + "  is not a vowel";
        }

        JOptionPane.showMessageDialog(null, output, "Vowel or Not", JOptionPane.PLAIN_MESSAGE);
    }
}
