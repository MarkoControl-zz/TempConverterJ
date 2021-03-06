package JTempConverter.view;

import javax.swing.*;
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

    public TempPanel(TempController control){
        this.control = control;
        this.setLayout(new GridLayout(3, 1));

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

        lOutput = new JLabel("output");
        tInput = new JTextField();

        bConvert = new JButton("Convert");
        bReset = new JButton("Reset");

        dConversionMenu = new JComboBox(combos);

        /*
        ---------------------------------------------------------------
                               MODIFYING
        ---------------------------------------------------------------
         */

        tInput.setPreferredSize(new Dimension(150, 25));
        lOutput.setFont(new Font("Arial", Font.PLAIN, 18));

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
    }

    public String getInput() { return this.tInput.getText(); }

    public String getCombo() { return this.dConversionMenu.getActionCommand(); }

    public void setLabelText(String str) { this.lOutput.setText(str); }
}
