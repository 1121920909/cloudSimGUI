package GUI;

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

    public ExampleForm() {
        basicExbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
