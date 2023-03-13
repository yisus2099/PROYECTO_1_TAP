
package interfazproyectotap;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Movimientos_Frame extends JPanel {
    //Se crean los componentes 
    JTextField txtClave, txtFecMov, txtTipoMov, txtCantidad;
    JLabel lblTitulo, lblClave, lblFecMov, lblTipoMov, lblCantidad;
    JPanel panelTitulo, panelClave, panelFecMov, panelTipoMov, panelCantidad, panelBotones;
    JButton btnSalir;
    
    public Movimientos_Frame(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
        
        btnSalir = new JButton();
        
        lblTitulo = new JLabel("Ingresar los datos de la tarjeta");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setForeground(Color.BLACK);
        
        lblClave = new JLabel("Clave");
        lblClave.setFont(new Font("Arial", 0, 25));
        lblClave.setForeground(Color.black);

        lblFecMov = new JLabel("Fecha de movimiento");
        lblFecMov.setFont(new Font("Arial", 0, 25));
        lblFecMov.setForeground(Color.black);
        
        lblTipoMov = new JLabel("Tipo de movimiento");
        lblTipoMov.setFont(new Font("Arial", 0, 25));
        lblTipoMov.setForeground(Color.black);

        lblCantidad = new JLabel("Cantidad");
        lblCantidad.setFont(new Font("Arial", 0, 25));
        lblCantidad.setForeground(Color.black);
        
        //Declaración de los txt    
        txtClave = new JTextField(8);
        txtFecMov = new JTextField(8);
        txtTipoMov = new JTextField(8);
        txtCantidad = new JTextField(8);
        
        //Declaracion de los panels
        panelBotones = new JPanel();
        panelTitulo = new JPanel();
        panelClave = new JPanel();
        panelFecMov = new JPanel();
        panelTipoMov = new JPanel();
        panelCantidad = new JPanel();
        
        //Agregarlos al JFrame y ponerles un color 
        
        panelTitulo.setLayout(new FlowLayout(FlowLayout.LEFT) );
        panelTitulo.setBackground(new Color(243, 243, 243));
        panelTitulo.add(lblTitulo);
        
        panelClave.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelClave.setBackground(new Color(243, 243, 243));
        panelClave.add(lblClave);
        panelClave.add(txtClave);

        panelFecMov.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelFecMov.setBackground(new Color(243, 243, 243));
        panelFecMov.add(lblFecMov);
        panelFecMov.add(txtFecMov);
        
        panelTipoMov.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelTipoMov.setBackground(new Color(243, 243, 243));
        panelTipoMov.add(lblTipoMov);
        panelTipoMov.add(txtTipoMov);

        panelCantidad.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelCantidad.setBackground(new Color(243, 243, 243));
        panelCantidad.add(lblCantidad);
        panelCantidad.add(txtCantidad);
        
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 0));
        panelBotones.setBackground(new Color(243, 243, 243));
        panelBotones.add(btnSalir);
        
        //Se añaden todos los panels
        this.add(panelTitulo);
        this.add(panelClave);
        this.add(panelFecMov);
        this.add(panelTipoMov);
        this.add(panelCantidad);
        this.add(panelBotones);
        

    }
    
}
