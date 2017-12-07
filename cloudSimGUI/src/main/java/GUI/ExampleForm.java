package GUI;

import example.basic.BasicExample;
import example.basic.CloudSimExample1;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
                String select = basicComboBox.getSelectedItem().toString();
                String configPath = "example/basic/beans.xml";
                ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
                BasicExample basicExample = (BasicExample) context.getBean(select);
                ResultForm.show(basicExample.formatInfo());
            }
        });
    }
}
