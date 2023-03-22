
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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class INTERFAZPROYECTOTAP extends JFrame {


    JPanel panelApp, panelBotones, panelVentana;
    //Falta el boton de movimientos
    JButton btnMenu, btnClientes, btnTarjeta, btnSalida, btnMovimientos;
    //FRAMES
  public Menu_Frame menuFrame ;
   public static Cliente_Frame clienteFrame ;
   public static Tarjeta_Frame tarjetaFrame;
   public static Movimientos_Frame movimientoFrame ;
     
    public INTERFAZPROYECTOTAP(){
        super("MICHI BANCO");
        menuFrame = new Menu_Frame();
        clienteFrame = new Cliente_Frame();
        tarjetaFrame = new Tarjeta_Frame();
        movimientoFrame = new Movimientos_Frame();
        
       //El boton del menu
        btnMenu = new JButton("Inicio");
        btnMenu.setSize(180, 30);
        btnMenu.setFont(new Font("Century Gothic", 2, 14));
        btnMenu.setForeground(Color.WHITE);
        btnMenu.setBackground(Color.BLACK);
        btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(menuFrame);
            }
        });
        
        //El boton de los clientes
        btnClientes = new JButton("Crear Cliente");
        btnClientes.setSize(180, 30);
        btnClientes.setFont(new Font("Century Gothic", 2, 14));
        btnClientes.setForeground(Color.WHITE); 
        btnClientes.setBackground(Color.BLACK); 
        btnClientes.addActionListener(new ActionListener(){
            @Override   public void actionPerformed(ActionEvent e){
                showWindows(clienteFrame);
            }
        });

        //El boton del registro de la tarjeta
        btnTarjeta = new JButton("Registro de tarjeta");
        btnTarjeta.setSize(180, 30);
        btnTarjeta.setFont(new Font("Century Gothic", 2, 14));
        btnTarjeta.setForeground(Color.WHITE);
        btnTarjeta.setBackground(Color.BLACK);
        btnTarjeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tarjetaFrame.cliente = clienteFrame.clienteSeleccionada();
                try{
                    System.out.println(tarjetaFrame.cliente);
                }catch(Exception ex){
                    
                }
                showWindows(tarjetaFrame);
                
            }
        });
        
        //Botón de movimientos de la tarjeta
        btnMovimientos = new JButton("Movimientos");
        btnMovimientos.setSize(180, 30);
        btnMovimientos.setFont(new Font("Century Gothic", 2, 14));
        btnMovimientos.setForeground(Color.WHITE);
        btnMovimientos.setBackground(Color.BLACK);
        btnMovimientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movimientoFrame.tarjeta = tarjetaFrame.tarjetaSelc();
                showWindows(movimientoFrame);
            }
        });
        
        
        //El boton de la salida
        btnSalida = new JButton ("Salir");
        btnSalida.setSize(180, 30);
        btnSalida.setFont(new Font("Century Gothic", 2, 14));
        btnSalida.setForeground(Color.WHITE);
        btnSalida.setBackground(Color.BLACK);
        btnSalida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        //Panel de los botones
        panelBotones = new JPanel();
        panelBotones.setBackground(new Color(90, 53, 242));
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
        
        this.setBounds(150, 15, 1000, 700); 
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
