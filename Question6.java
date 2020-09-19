import javax.swing.JOptionPane;

public class Question6 {
    public static void main(String[] args) {
        String userNum1,userNum2,userNum3,userNum4,userNum5,userNum6,userNum7,userNum8,userNum9,userNum10, output;
        int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;

        // Ask user for a number 10 times (Can refactor - make this less repetitive by adding user input to an array from a loop but I can't do that yet.
        userNum1 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum2 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum3 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum4 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum5 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum6 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum7 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum8 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum9 = JOptionPane.showInputDialog("Please enter a whole number: ");
        userNum10 = JOptionPane.showInputDialog("Please enter a whole number: ");

        // Convert the user input to a number (Again, could make this less repetitive with a loop in the created array)
        num1 = Integer.parseInt(userNum1);
        num2 = Integer.parseInt(userNum2);
        num3 = Integer.parseInt(userNum3);
        num4 = Integer.parseInt(userNum4);
        num5 = Integer.parseInt(userNum5);
        num6 = Integer.parseInt(userNum6);
        num7 = Integer.parseInt(userNum7);
        num8 = Integer.parseInt(userNum8);
        num9 = Integer.parseInt(userNum9);
        num10 = Integer.parseInt(userNum10);

        // If the user numbers were stored in an array, you could loop over them and set the largest to that number if it's larger than current largest
        // Right now I have to do it manually since I haven't figured out arrays in Java yet.
        int i = 0;
        int largest = num1;
        if (num1 > largest) {
            largest = num1;
        }

        if (num2 > num1) {
            largest = num2;
        }

        if (num3 > num2) {
            largest = num3;
        }

        if (num4 > num3) {
            largest = num4;
        }

        if (num5 > num4) {
            largest = num5;
        }

        if (num6 > num5) {
            largest = num6;
        }

        if (num7 > num6) {
            largest = num7;
        }

        if (num8 > num7) {
            largest = num8;
        }

        if (num9 > num8) {
            largest = num9;
        }

        if (num10 > num9) {
            largest = num10;
        }

        output = "The largest number from the numbers you provided was: " + largest;

        JOptionPane.showMessageDialog(null, output);

    }
}
