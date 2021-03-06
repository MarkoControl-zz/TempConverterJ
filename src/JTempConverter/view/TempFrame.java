
package JTempConverter.view;

import javax.swing.*;

public class TempFrame extends JFrame {
    public TempFrame(TempPanel tp) {
        super("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 230);
        add(tp);
        setResizable(false);
        setVisible(true);
    }
}
