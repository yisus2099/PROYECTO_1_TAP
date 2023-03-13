package interfazproyectotap;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Narahi Gonzalez Zavala 21550340
 * Maria Castillo
 * Jesús Torres
 * Andres Saenz
 * Sebatian Lopez
 */
public class Menu_Frame  extends JPanel{
    JLabel lbllogo,lbltitulo,lbltitulo2;
    
    public Menu_Frame (){
        
        //DECLARACION DE LAS VARIABLES DE LA VENTANA MENU
        lbllogo = new JLabel(new ImageIcon("logo.png"));
        lbltitulo = new JLabel ("Bienvenidos a la pantalla principal");
        lbltitulo2 = new JLabel ("Del MichiBanco");
        
        
        //DISE;O DE LOS LABELS
   lbltitulo.setFont(new Font("Britannic Bold", Font.BOLD, 28));
   lbltitulo2.setFont(new Font("Britannic Bold", Font.BOLD, 28));
   lbltitulo.setBounds(300,100, 500, 500);
   lbltitulo2.setBounds(270, 150, 300, 300);
   lbllogo.setBounds(300, 350, 500, 500);
  
     this.setBackground( new Color (243, 243, 243));

   this.add(lbltitulo);
   this.add(lbltitulo2);
   this.add(lbllogo);
   
    }
}
