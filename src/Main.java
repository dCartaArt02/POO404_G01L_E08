import ventana.login.*;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame Frame = new ventanaLogin();
                Frame.setSize(500,300);
                Frame.setVisible(true);
            }
        });
    }
}