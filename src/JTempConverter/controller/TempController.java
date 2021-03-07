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
        try {
            if ((o.equals("Convert")) && (tp.getCombo().equals("Celsius -> Fahrenheit"))) {
                double temp = Double.parseDouble(tp.getInput());
                tm.celsiusToFahrenheit(temp);
                String txt = "" + tm.getTemperature();
                tp.setLabelText(txt + " °F");
            }

            if ((o.equals("Convert")) && (tp.getCombo().equals("Fahrenheit -> Celsius"))) {
                double temp = Double.parseDouble(tp.getInput());
                tm.fahrenheitToCelsius(temp);
                String txt = "" + tm.getTemperature();
                tp.setLabelText(txt + " °C");
            }

            if ((o.equals("Convert") && (tp.getCombo().equals("Celsius -> Kelvin")))) {
                double temp = Double.parseDouble(tp.getInput());
                tm.celsiusToKelvin(temp);
                String txt = "" + tm.getTemperature();
                tp.setLabelText(txt + " K");
            }

            if ((o.equals("Convert") && (tp.getCombo().equals("Kelvin -> Celsius")))) {
                double temp = Double.parseDouble(tp.getInput());
                tm.kelvinToCelsius(temp);
                String txt = "" + tm.getTemperature();
                tp.setLabelText(txt + " °C");
            }

            if ((o.equals("Convert") && (tp.getCombo().equals("Fahrenheit -> Kelvin")))) {
                double temp = Double.parseDouble(tp.getInput());
                tm.fahrenheitToKelvin(temp);
                String txt = "" + tm.getTemperature();
                tp.setLabelText(txt + " K");
            }

            if ((o.equals("Convert") && (tp.getCombo().equals("Kelvin -> Fahrenheit")))) {
                double temp = Double.parseDouble(tp.getInput());
                tm.kelvinToFahrenheit(temp);
                String txt = "" + tm.getTemperature();
                tp.setLabelText(txt + " °F");
            }
        }catch (NumberFormatException ne){
            ;
        }

        if((o.equals("Reset"))){
            tp.resetTextField();
            tp.setLabelText("[ ]");
        }
    }
}
