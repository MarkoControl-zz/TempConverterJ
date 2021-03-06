package JTempConverter.controller;

import JTempConverter.view.*;

public class TempController {
    public static void main (String [] args) {
        new TempController();
    }

    private TempFrame tf;
    private TempPanel tp;

    public TempController() {
        tp = new TempPanel(this);
        tf = new TempFrame(tp);
    }
}
