package pixelandbean.gui;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    public LoginFrame() {
        setTitle("Pixel & Bean - Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblUsuario = new JLabel("Usuario:");
        JLabel lblPassword = new JLabel("Contraseña:");

        txtUsuario = new JTextField();
        txtPassword = new JPasswordField();

        JButton btnIngresar = new JButton("Ingresar");

        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(new JLabel());
        panel.add(btnIngresar);

        add(panel);

        // Acción del botón
        btnIngresar.addActionListener(e -> verificarLogin());
    }

    private void verificarLogin() {
        String user = txtUsuario.getText();
        String pass = new String(txtPassword.getPassword());

        if (user.equals("admin") && pass.equals("inicio123")) {
            JOptionPane.showMessageDialog(this, "Bienvenido Administrador");
        } else if (user.equals("empleado") && pass.equals("inicio321")) {
            JOptionPane.showMessageDialog(this, "Bienvenido Empleado");
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
        }
    }
}