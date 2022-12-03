import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class Main extends Answer {

    public static void main(String[] args) {

        JFrame frame = new JFrame("DIVISION");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2, 2, 1, 1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("CLICK TO SEE THE QUOTIENT");


        panelTitle.setBounds(10, 10, 380, 40);
        panelOne.setBounds(10, 60, 380, 80);
        panelTwo.setBounds(10, 200, 380, 40);


        panelTitle.setBackground(Color.blue);
        panelOne.setBackground(Color.lightGray);
        panelTwo.setBackground(Color.blue);

        JLabel labelOne, labelTwo, labelTitle;

        final JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(20);
        tFieldOne.setPreferredSize(new Dimension(80, 20));
        tFieldTwo = new JTextField(20);
        tFieldTwo.setPreferredSize(new Dimension(80, 20));

        labelTitle = new JLabel("Enter a number:", JLabel.CENTER);
        labelOne = new JLabel("DIVIDEND");
        labelTwo = new JLabel("DIVISOR");


        labelTitle.setBounds(10, 10, 90, 20);
        labelOne.setBounds(10, 10, 90, 20);
        tFieldOne.setBounds(5, 5, 100, 100);
        labelTwo.setBounds(10, 10, 90, 20);
        tFieldTwo.setBounds(5, 5, 100, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(tFieldTwo);

        button.setBounds(10, 10, 90, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Button Clicked");
                //System.out.println(tFieldOne.getText());
                //System.out.println(tFieldTwo.getText());
                int result = computeValue(tFieldOne.getText(), tFieldTwo.getText());
                //System.out.println(result);
                displayMessage(String.valueOf(result));
            }

        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;


        frame.setSize(400, 350);
        frame.setResizable(false);
        frame.setLayout(null);


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
abstract class Methods {
    public void displayMessage() {
        System.out.println("Quotient");
    }
}

