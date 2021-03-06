package JTempConverter.controller;

import JTempConverter.view.*;
import JTempConverter.model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempController implements ActionListener {

    private TempPanel tp;
    private TempFrame tf;
    private Model model;

    public static void main(String[] args) { new TempController(); }

    public TempController(){
        tp = new TempPanel(this);
        tf = new TempFrame(tp);
        model = new Model();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
