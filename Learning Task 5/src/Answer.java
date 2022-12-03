import javax.swing.*;

class Answer extends Methods {
    public static int computeValue(String value1, String value2) {
        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int answer = num1 / num2;
        return answer;

    }

    public static void displayMessage(String answer){
        JOptionPane.showMessageDialog( null, "The quotient is: " + answer, "QUOTIENT" , JOptionPane.INFORMATION_MESSAGE );
    }
}