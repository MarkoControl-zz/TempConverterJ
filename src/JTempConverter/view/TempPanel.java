package JTempConverter.view;

import javax.swing.*;
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
        this.setLayout(new BorderLayout());

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

        pIpane = new JPanel(new GridLayout(1, 2, 10, 10));
        pOpane = new JPanel(new GridLayout(1, 1, 10, 10));


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

        // VOID 

        /*
        ---------------------------------------------------------------
                               ADDING
        ---------------------------------------------------------------
         */

        pIpane.add(tInput);
        pIpane.add(dConversionMenu);


        pOpane.add(lOutput);
        pOpane.add(bConvert);
        pOpane.add(bReset);

        this.add(pIpane, BorderLayout.NORTH);
        this.add(lOutput, BorderLayout.CENTER);
    }

    public String getInput() { return this.tInput.getText(); }

    public String getCombo() { return this.dConversionMenu.getActionCommand(); }

    public void setLabelText(String str) { this.lOutput.setText(str); }
}
