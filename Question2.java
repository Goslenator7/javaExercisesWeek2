import javax.swing.JOptionPane;

public class Question2 {
    public static void main(String[] args) {
        String userNumberInput;
        String resultMessage;
        int userNumber;

        userNumberInput = JOptionPane.showInputDialog("Please enter a whole number: ");

        userNumber = Integer.parseInt(userNumberInput);

        if (userNumber % 2 == 0) {
            resultMessage = ("The number " + userNumber + " is even.");
        } else {
            resultMessage = ("The number " + userNumber + " is odd.");
        }

        JOptionPane.showMessageDialog(null, resultMessage, "Odd or Even", JOptionPane.PLAIN_MESSAGE);
    }
}
