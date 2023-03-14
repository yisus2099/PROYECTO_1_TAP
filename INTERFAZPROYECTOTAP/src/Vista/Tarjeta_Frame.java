
package Vista;

import Modelo.Tarjeta;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tarjeta_Frame extends JPanel {
    //Se crean los componentes 
    JTextField txtNumcuenta, txtNumTarjeta, txtLimCredito, txtFecCreacion, 
    txtFecPago, txtFecCorte, txtTAN, txtAnualidad, txtFAA;
    JLabel lblTitulo, lblNumCuenta, lblNumTarjeta, lblLimCredito, lblFecCreacion, 
    lblFecPago, lblFecCorte, lblTAN, lblAnualidad, lblFAA;
    //para q se usan tantos panels?
    JPanel panelTitulo, panelNumCuenta, panelNumTarjeta, panelLimCredito, panelFecCreacion, 
    panelFecPago, panelFecCorte, panelTAN, panelAnualidad, panelFAA, panelBotones;
    JButton btnRegistrar, btnLimpiar;
    //Array Tarjeta
    ArrayList <Tarjeta> repositorioDeTarjetas = new ArrayList<Tarjeta>();
    
    public Tarjeta_Frame(){
        //Creacion de los labels
       this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); /*
        lblTitulo = new JLabel("Ingresar datos de la tarjeta");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lblTitulo.setForeground(Color.BLACK);
        
        this.add(lblTitulo);
        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(243, 243, 243)); 
        this.setForeground(Color.black); */
     
        lblTitulo = new JLabel("Ingresar los datos de la tarjeta");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setForeground(Color.BLACK);
        
        lblNumCuenta = new JLabel("Número de Cuenta");
        lblNumCuenta.setFont(new Font("Arial", 0, 30));
        lblNumCuenta.setForeground(Color.black);

        lblNumTarjeta = new JLabel("Número de tarjeta");
        lblNumTarjeta.setFont(new Font("Arial", 0, 30));
        lblNumTarjeta.setForeground(Color.black);

        lblLimCredito = new JLabel("Límite de crédito");
        lblLimCredito.setFont(new Font("Arial", 0, 30));
        lblLimCredito.setForeground(Color.black);

        lblFecCreacion = new JLabel("Fecha de creación");
        lblFecCreacion.setFont(new Font("Arial", 0, 30));
        lblFecCreacion.setForeground(Color.black);

        lblFecPago = new JLabel("Fecha de pago");
        lblFecPago.setFont(new Font("Arial", 0, 30));
        lblFecPago.setForeground(Color.black);
        
        lblFecCorte = new JLabel("Fecha de corte");
        lblFecCorte.setFont(new Font("Arial", 0, 30));
        lblFecCorte.setForeground(Color.black);
        
        lblTAN = new JLabel("Tasa de interés anual");
        lblTAN.setFont(new Font("Arial", 0, 30));
        lblTAN.setForeground(Color.black);
        
        lblAnualidad = new JLabel("Anualidad");
        lblAnualidad.setFont(new Font("Arial", 0, 30));
        lblAnualidad.setForeground(Color.black);
        
        lblFAA = new JLabel("Fecha de aplicación de anualidad");
        lblFAA.setFont(new Font("Arial", 0, 30));
        lblFAA.setForeground(Color.black);
        
        //Declaración de los txt    
        txtNumcuenta = new JTextField(8);
        txtNumTarjeta = new JTextField(8);
        txtLimCredito = new JTextField(8);
        txtFecCreacion = new JTextField(8);
        txtFecPago = new JTextField(8);
        txtFecCorte = new JTextField(8);
        txtTAN = new JTextField(8);
        txtAnualidad = new JTextField(8);
        txtFAA = new JTextField(8);
        
        //Declaracion de los botones
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setSize(180, 30);
        btnRegistrar.setFont(new Font("Century Gothic", 2, 14));
        btnRegistrar.setBackground(Color.WHITE); 
        btnRegistrar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                             Tarjeta tar = new Tarjeta();
               tar.setNumCuenta(txtNumcuenta.getText());
               tar.setNumTarjeta(txtNumTarjeta.getText());
               tar.setLimCredito(Double.parseDouble(txtLimCredito.getText()));
               tar.setFechaCreacion(null);
               tar.setFechaPago(null);
               tar.setFechaCorte(null);
               tar.setTasaInteresAnual(Double.parseDouble(txtTAN.getText()));
               tar.setAnualidad(Double.parseDouble(txtAnualidad.getText()));
               tar.setFechaApliAnua(null);
           }
        });
        
        btnLimpiar = new JButton("Limpiar campos");
        btnLimpiar.setSize(180, 30);
        btnLimpiar.setFont(new Font("Century Gothic", 2, 14));
        btnLimpiar.setBackground(Color.WHITE); 
        btnLimpiar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtNumcuenta.setText("");
               txtNumTarjeta.setText("");
               txtLimCredito.setText("");
               txtFecCreacion.setText("");
               txtFecPago.setText("");
               txtFecCorte.setText("");
               txtTAN.setText("");
               txtAnualidad.setText("");
               txtFAA.setText("");
           }
        });
        
        //Declaracion de los panels
        panelBotones = new JPanel();
        panelTitulo = new JPanel();
        panelNumCuenta = new JPanel();
        panelNumTarjeta = new JPanel();
        panelLimCredito = new JPanel();
        panelFecCreacion = new JPanel();
        panelFecPago = new JPanel();
        panelFecCorte = new JPanel();
        panelTAN = new JPanel();
        panelAnualidad = new JPanel();
        panelFAA = new JPanel();
        
        
        //Agregarlos al JFrame y ponerles un color 
        
        panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER) );
        panelTitulo.setBackground(new Color(243, 243, 243));
        panelTitulo.add(lblTitulo);
        
        panelNumCuenta.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelNumCuenta.setBackground(new Color(243, 243, 243));
        panelNumCuenta.add(lblNumCuenta);
        panelNumCuenta.add(txtNumcuenta);

        panelNumTarjeta.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelNumTarjeta.setBackground(new Color(243, 243, 243));
        panelNumTarjeta.add(lblNumTarjeta);
        panelNumTarjeta.add(txtNumTarjeta);

        panelLimCredito.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelLimCredito.setBackground(new Color(243, 243, 243));
        panelLimCredito.add(lblLimCredito);
        panelLimCredito.add(txtLimCredito);

        panelFecCreacion.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelFecCreacion.setBackground(new Color(243, 243, 243));
        panelFecCreacion.add(lblFecCreacion);
        panelFecCreacion.add(txtFecCreacion);

        panelFecPago.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelFecPago.setBackground(new Color(243, 243, 243));
        panelFecPago.add(lblFecPago);
        panelFecPago.add(txtFecPago);

        panelFecCorte.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 0));
        panelFecCorte.setBackground(new Color(243, 243, 243));
        panelFecCorte.add(lblFecCorte);
        panelFecCorte.add(txtFecCorte);
        
        panelTAN.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 0));
        panelTAN.setBackground(new Color(243, 243, 243));
        panelTAN.add(lblTAN);
        panelTAN.add(txtTAN);
        
        panelAnualidad.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 0));
        panelAnualidad.setBackground(new Color(243, 243, 243));
        panelAnualidad.add(lblAnualidad);
        panelAnualidad.add(txtAnualidad);
        
        panelFAA.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 0));
        panelFAA.setBackground(new Color(243, 243, 243));
        panelFAA.add(lblFAA);
        panelFAA.add(txtFAA);
        
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 0));
        panelBotones.setBackground(new Color(243, 243, 243));
        panelBotones.add(btnRegistrar);
        panelBotones.add(btnLimpiar);

        this.add(panelTitulo);
        this.add(panelNumCuenta);
        this.add(panelNumTarjeta);
        this.add(panelLimCredito);
        this.add(panelFecCreacion);
        this.add(panelFecPago);
        this.add(panelFecCorte);
        this.add(panelTAN);
        this.add(panelAnualidad);
        this.add(panelFAA);
        this.add(panelBotones);
        
    }
}
