package pixelandbean;

import javax.swing.SwingUtilities;
import pixelandbean.gui.LoginFrame;

public class PixelandBeanApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame login = new LoginFrame();
            login.setVisible(true);
        });
    }
}