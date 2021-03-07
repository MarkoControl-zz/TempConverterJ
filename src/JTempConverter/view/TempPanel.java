package JTempConverter.view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import JTempConverter.controller.TempController;

public class TempPanel extends JPanel {
    private TempController control;

    private JButton bConvert;
    private JButton bReset;

    private JComboBox dConversionMenu;
    private JTextField tInput;
    private JLabel lOutput;

    private JPanel pIpane;
    private JPanel pOpane;
    private JPanel buttonPane;

    private Border grayBorder;

    public TempPanel(TempController control){
        this.control = control;
        this.setLayout(new GridLayout(3, 1));
        this.setBackground(Color.DARK_GRAY);

        /*
        ---------------------------------------------------------------
                               OBJECT FACTORY
        ---------------------------------------------------------------
         */

        String[] combos = { "Celsius -> Fahrenheit",
                "Fahrenheit -> Celsius",
                "Celsius -> Kelvin",
                "Kelvin -> Celsius",
                "Fahrenheit -> Kelvin",
                "Kelvin -> Fahrenheit" };

        pIpane = new JPanel(new FlowLayout(FlowLayout.CENTER, 50,25));
        pOpane = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 20));
        buttonPane = new JPanel(new FlowLayout(FlowLayout.CENTER, 50,15));

        lOutput = new JLabel("[ ]");
        tInput = new JTextField();

        bConvert = new JButton("Convert");
        bReset = new JButton("Reset");

        dConversionMenu = new JComboBox(combos);

        /*
        ---------------------------------------------------------------
                               MODIFYING
        ---------------------------------------------------------------
         */

        grayBorder = BorderFactory.createLineBorder(Color.GRAY);

        JPanel[] panels = {pIpane, pOpane, buttonPane};
        JButton[] buttons = {bConvert, bReset};

        for (JButton b : buttons){
            b.setBackground(Color.GRAY);
            b.setFocusPainted(false);
        }

        for (JPanel p : panels){
            p.setBackground(Color.DARK_GRAY);
        }

        dConversionMenu.setBorder(null);
        dConversionMenu.setBackground(Color.gray);
        dConversionMenu.setBorder(grayBorder);
        dConversionMenu.setFocusable(false);

        tInput.setBorder(null);
        tInput.setPreferredSize(new Dimension(150, 25));

        lOutput.setFont(new Font("Arial", Font.PLAIN, 18));
        lOutput.setForeground(Color.white);

        /*
        ---------------------------------------------------------------
                               ADDING
        ---------------------------------------------------------------
         */

        pIpane.add(tInput);
        pIpane.add(dConversionMenu);

        pOpane.add(lOutput);

        buttonPane.add(bConvert);
        buttonPane.add(bReset);

        this.add(pIpane);
        this.add(pOpane);
        this.add(buttonPane);

        for(JButton b : buttons){
            b.addActionListener(this.control);
        }
    }

    public String getInput() { return this.tInput.getText(); }

    public String getCombo() { return (String) this.dConversionMenu.getSelectedItem(); }

    public void setLabelText(String str) { this.lOutput.setText(str); }

    public void resetTextField() { this.tInput.setText(""); }
}
