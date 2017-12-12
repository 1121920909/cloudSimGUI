package GUI.custom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomDataCenter {
    private JLabel titleLabel;
    private JTextField peMips;
    private JPanel pePanel;
    private JLabel peLabel;
    private JTextField ramText;
    private JTextField storageText;
    private JTextField bwText;
    private JTextField peNumText;
    private JLabel ramLabel;
    private JLabel storageLabel;
    private JLabel bwLabel;
    private JLabel peNumLabel;
    private JTextField costMemText;
    private JTextField costStorageText;
    private JTextField costBwText;
    private JTextField costSecText;
    private JPanel DatacenterCharactersiticsPanel;
    private JLabel costPerSecLabel;
    private JLabel costPerMemLabel;
    private JLabel costPerStorageLabel;
    private JLabel costPerBwLabel;
    private JButton confirmButton;
    private JTextField hostNumText;
    private JLabel timeZoneLabel;
    private JLabel hostNumLabel;
    private JComboBox timeZoneBox;
    private JPanel hostPanel;
    private JPanel titlePanel;
    private JPanel mainPanel;
    private JPanel confirmPanel;

    public CustomDataCenter() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
