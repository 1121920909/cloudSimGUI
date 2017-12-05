package GUI;

import javax.swing.*;

public class MainForm {
    private JPanel title;
    private JPanel centerPanel;
    private JPanel labelPanel;
    private JPanel buttonPanel;
    private JButton ENTERButton;
    private JButton ENTERButton1;
    private JLabel exampleLabel;
    private JLabel simulationLabel;
    private JPanel mainPanel;
    public  void test() {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
