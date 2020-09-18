import javax.swing.JOptionPane;

public class Question1 {
    public static void main(String[] args) {
        String userInput1;
        String userInput2;
        String outputMessage;
        String biggerNumberMessage;
        int userNumber1;
        int userNumber2;
        int numbersAdded;
        int numbersMultiplied;

        // Get user's input
        userInput1 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userInput2 = JOptionPane.showInputDialog("Please enter a whole second number: ");

        // Convert user's input from string to an integer
        userNumber1 = Integer.parseInt(userInput1);
        userNumber2 = Integer.parseInt(userInput2);

        // Add the numbers from user input and then multiply the numbers from user input
        numbersAdded = userNumber1 + userNumber2;
        numbersMultiplied = userNumber1 * userNumber2;

        // Decide which message to display depending on numbers
        // if number1 is bigger
        if (userNumber1 > userNumber2) {
            biggerNumberMessage = userNumber1 + " is bigger than " + userNumber2;
        }
        // if number2 is bigger
        else if (userNumber1 < userNumber2) {
            biggerNumberMessage = userNumber2 + " is bigger than " + userNumber1;
        }
        // if the numbers are the same size
        else {
            biggerNumberMessage = userNumber1 + " and " + userNumber2 + " are the same size.";
        }

        // Create message for output
        outputMessage = "Your two numbers " + userNumber1 + " " + userNumber2 + " added together equals: " + numbersAdded + ". Your two numbers multiplied equals: " + numbersMultiplied;

        // Display result messages
        JOptionPane.showMessageDialog(null, outputMessage,"Message 1", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, biggerNumberMessage, "Which is bigger?", JOptionPane.PLAIN_MESSAGE);
    }
}
