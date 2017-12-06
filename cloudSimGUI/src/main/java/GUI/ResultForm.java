package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultForm {
    private JPanel panel1;
    private JTextArea resultTextArea;
    private JButton button1;
    private String text;
    private JFrame frame;

    public ResultForm(final String text) {
        this.text = text;
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultTextArea.setText(text);
            }
        });
    }

    public void show(){
        frame = new JFrame("ResultForm");
        frame.setContentPane((new ResultForm(text)).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
