package GUI;

import example.basic.CloudSimExample1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/***
 * @author ZYP
 */
public class ExampleForm {
    private JRadioButton textRB;
    private JRadioButton graphRB;
    private JComboBox basicComboBox;
    private JComboBox netComboBox;
    private JComboBox powComboBox;
    private JButton powExButton;
    private JButton basicExbutton;
    private JButton netExButton;
    private JPanel titlePanel;
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel labelPanel;
    private JPanel choosePanel;
    private JPanel buttonPanel;
    private JLabel titleLabel;
    private JLabel outPutTypeLabel;
    private JLabel basicExLabel;
    private JLabel netExamLabel;
    private JLabel powExLabel;

    public void showForm() {
        JFrame frame = new JFrame("ExampleForm");
        frame.setContentPane(new ExampleForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ExampleForm() {
        basicExbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CloudSimExample1 cloudSimExample1 = new CloudSimExample1();
                ResultForm rf = new ResultForm(cloudSimExample1.formatInfo());
                rf.show();
            }
        });
    }
}
