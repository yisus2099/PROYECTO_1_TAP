
package Controlador;

import Vista.Cliente_Frame;
import Vista.Menu_Frame;
import Vista.Movimientos_Frame;
import Vista.Tarjeta_Frame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Equipo
 */
public class INTERFAZPROYECTOTAP extends JFrame {


    JPanel panelApp, panelBotones, panelVentana;
    //Falta el boton de movimientos
    JButton btnMenu, btnClientes, btnTarjeta, btnSalida, btnMovimientos;
    
    public INTERFAZPROYECTOTAP(){
       //El boton del menu
        btnMenu = new JButton("Menu");
        btnMenu.setSize(180, 30);
        btnMenu.setFont(new Font("Century Gothic", 2, 14));
        btnMenu.setBackground(Color.WHITE);
        
        //El boton de los clientes
        btnClientes = new JButton("Crear Cliente");
        btnClientes.setSize(180, 30);
        btnClientes.setFont(new Font("Century Gothic", 2, 14));
        btnClientes.setBackground(Color.WHITE); 
        btnClientes.addActionListener(new ActionListener(){
            @Override   public void actionPerformed(ActionEvent e){
                showWindows(new Cliente_Frame());
            }
        });

        //El boton del registro de la tarjeta
        btnTarjeta = new JButton("Registro de tarjeta");
        btnTarjeta.setSize(180, 30);
        btnTarjeta.setFont(new Font("Century Gothic", 2, 14));
        btnTarjeta.setBackground(Color.WHITE);
        btnTarjeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Tarjeta_Frame());
            }
        });
        
        //Botón de movimientos de la tarjeta
        // no jala jeje
        btnMovimientos = new JButton("Movimientos");
        btnMovimientos.setSize(180, 30);
        btnMovimientos.setFont(new Font("Century Gothic", 2, 14));
        btnMovimientos.setBackground(Color.WHITE);
        btnMovimientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Movimientos_Frame());
            }
        });
        
        
        //El boton de la salida
        btnSalida = new JButton ("Salir");
        btnSalida.setSize(180, 30);
        btnSalida.setFont(new Font("Century Gothic", 2, 14));
        btnSalida.setBackground(Color.WHITE);
        btnSalida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
        //Panel de los botones
        panelBotones = new JPanel();
        panelBotones.setBackground(new Color(91, 53, 91));
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBotones.add(btnMenu);
        panelBotones.add(btnClientes);
        panelBotones.add(btnTarjeta); 
        panelBotones.add(btnMovimientos);
        panelBotones.add(btnSalida);
        
        //Panel de las ventanas
        panelVentana = new JPanel();
        panelVentana.setBackground(new Color(243, 243, 243));
        panelVentana.setLayout(new BorderLayout());                        
        
        showWindows(new Menu_Frame()); 
        
          // Contenedor que guarda.
        panelApp = new JPanel();
        panelApp.setBackground(new Color(243, 243, 243));
        panelApp.setLayout(new BorderLayout());
        panelApp.add(panelBotones, BorderLayout.NORTH);
        panelApp.add(panelVentana, BorderLayout.CENTER);
        
           // Iniciamos mostrando la página principal.
        
        // Definimos el tamaño y posición de la ventana principal.
        this.setLayout(new BorderLayout());        
        this.add(panelApp, BorderLayout.CENTER);
        
        this.setBounds(150, 15, 800, 700); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    // Método que nos muestra el panel recibido en el contenedor panelWindow.
    private void showWindows(JPanel window){
        window.setSize(800, 700);
        window.setLocation(0, 0);
        
        panelVentana.removeAll();
        panelVentana.add(window);                             
        panelVentana.revalidate();
        panelVentana.repaint();
    }
    public static void main(String[] args) {
        new INTERFAZPROYECTOTAP().setVisible(true);
    }

   
    
}
