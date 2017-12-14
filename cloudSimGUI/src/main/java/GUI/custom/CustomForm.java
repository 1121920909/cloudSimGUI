package GUI.custom;

import custom.CustomSimulation;

import javax.swing.*;

public class CustomForm {
    private JPanel panel;
    private JPanel titlePanel;
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JPanel datacenterPanel;
    private JPanel vmPanel;
    private JPanel cloudletPanel;
    private JTextField datacenterNumText;
    private JButton customDatacentButton;
    private JLabel datacenterNumLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel mipsLabel;
    private JLabel peNumLabel;
    private JLabel ramLabel;
    private JLabel bwLabel;
    private JLabel sizeLabel;
    private JLabel vmNumLabel;
    private JTextField lengthText;
    private JTextField cloPeNumText;
    private JTextField fileSizeText;
    private JTextField outputSizeText;
    private JTextField cloNumText;
    private JLabel lengthLabel;
    private JLabel cluPeNumLabel;
    private JLabel fileSizeLabel;
    private JLabel outputSizeLabel;
    private JLabel cloNumLabel;
    private JButton simulationButton;
    private JPanel buttonPanel;
    private JTextField vmNumText;
    private CustomSimulation simulation;

    public CustomForm() {
        simulation = new CustomSimulation();
    }
}
