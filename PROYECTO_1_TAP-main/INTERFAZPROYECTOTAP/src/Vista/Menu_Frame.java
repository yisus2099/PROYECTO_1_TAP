package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class Menu_Frame extends JPanel {

    JLabel lblLogo, lbltitulo, lbltitulo2;

    public Menu_Frame() {

        //DECLARACION DE LAS VARIABLES DE LA VENTANA MENU
        lblLogo = new JLabel();
        lbltitulo = new JLabel("Bienvenidos a la pantalla principal");
        lbltitulo2 = new JLabel("Del MichiBanco");

        //DISENIO DE LOS LABELS
        lbltitulo.setFont(new Font("Britannic Bold", Font.BOLD, 28));
        lbltitulo.setForeground(Color.WHITE);
        lbltitulo2.setFont(new Font("Britannic Bold", Font.BOLD, 28));
        lbltitulo2.setForeground(Color.WHITE);
        lbltitulo.setBounds(300, 100, 500, 500);
        lbltitulo2.setBounds(270, 150, 300, 300);           
        lblLogo.setBounds(300, 350, 500, 500);
        
        ImageIcon image = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));           
        lblLogo.setIcon(icon);

        this.setBackground(new Color(165, 165 , 165));

        this.add(lbltitulo);
        this.add(lbltitulo2);
        this.add(lblLogo);
    }
}
