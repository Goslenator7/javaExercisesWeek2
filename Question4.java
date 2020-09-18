import javax.swing.JOptionPane;

public class Question4 {
    public static void main(String[] args) {
    String userNumOfPapers;
    String output = new String();
    double grade1Pay;
    double grade2Pay;
    double grade3Pay;
    double grandTotalPay;
    int numOfPapers;

    // Ask users how many papers they delivered
    userNumOfPapers = JOptionPane.showInputDialog("How many papers did you deliver? Eg. 10 ");

    // Change user input into an integer
    numOfPapers = Integer.parseInt(userNumOfPapers);

    // If the number of papers is less than 101, pay 10 pence for every paper
    if (numOfPapers > 0 && numOfPapers < 101) {
        grade1Pay = numOfPapers * 0.10;
        // Define output message
        output = "You delivered " +numOfPapers + " papers. You earned £" + grade1Pay;

    /* If the number of papers delivered is over 100, calculate the pay for first one hundred at 10 pence
       Take away 100 from number of papers and assign remainder to subPay, calculate this at 15 pence per paper.
       Calculate first 100 at 10 pence per paper
     */
    }
    else if (numOfPapers > 100 && numOfPapers < 151) {
        grade2Pay = (numOfPapers - 100) * 0.15;
        grade1Pay = 100 * 0.10;
        grandTotalPay = grade2Pay + grade1Pay;

        // Define output message
        output = "You delivered " + numOfPapers + " papers. You earned £" + grandTotalPay;
    }
    else if (numOfPapers >= 151) {
        grade3Pay = (numOfPapers - 151) * 0.20;
        grade2Pay = 50 * 0.15;
        grade1Pay = 100 * 0.10;
        grandTotalPay = grade1Pay + grade2Pay + grade3Pay;

        // Define output message
        output = "You delivered " + numOfPapers + " papers. You earned £" + grandTotalPay;
    }

    // Display output message
    JOptionPane.showMessageDialog(null, output, "Your Pay", JOptionPane.PLAIN_MESSAGE );
    }
}
