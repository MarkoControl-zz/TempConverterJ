package JTempConverter.controller;

import JTempConverter.view.*;
import JTempConverter.model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempController implements ActionListener {

    private TempPanel tp;
    private TempFrame tf;
    private TempModel tm;

    public static void main(String[] args) { new TempController(); }

    public TempController(){
        tp = new TempPanel(this);
        tf = new TempFrame(tp);
        tm = new TempModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getActionCommand();
        if ((o.equals("Convert")) && (tp.getCombo().equals("Celsius -> Fahrenheit"))) {
            double temp = Double.parseDouble(tp.getInput());
            tm.celsiusToFahrenheit(temp);
            String txt = "" + tm.getTemperature();
            tp.setLabelText(txt);
        }

        if ((o.equals("Convert")) && (tp.getCombo().equals("Fahrenheit -> Celsius"))) {
            double temp = Double.parseDouble(tp.getInput());
            tm.fahrenheitToCelsius(temp);
            String txt = "" + tm.getTemperature();
            tp.setLabelText(txt);
        }
    }
}
