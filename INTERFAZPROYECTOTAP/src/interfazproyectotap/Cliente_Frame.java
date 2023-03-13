
package interfazproyectotap;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Narahi Gonzalez
 */

 public class Cliente_Frame extends JPanel {

    JTextField txtnombre, txtapellidoP, txtapellidoM, txtcurp, txtfecha;
    JLabel lbltitulo, lblnombre, lblapellidoP, lblapellidoM, lblfecha, lblcurp;
    JPanel paneltitulo, panelnombre, panelapellidop, panelapellidom, panelcurp, panelfecha, panelBotones;
    JButton btncrear, btnlimpiar;
    //Lista de clientes
    ArrayList <Cliente> repositorioDeClientes = new ArrayList<Cliente>();

    public Cliente_Frame() {
        //CREACION DE LOS LABELS
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        lbltitulo = new JLabel("Ingresar datos del cliente");
        lbltitulo.setFont(new Font("Arial", Font.BOLD, 35));
        lbltitulo.setForeground(Color.white);

        this.add(lbltitulo);
        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(243, 243, 243));

        lblnombre = new JLabel("Nombre del cliente");
        lblnombre.setFont(new Font("Calibri", 2, 30));
        lblnombre.setForeground(Color.black);

        lblapellidoP = new JLabel("Apellido paterno del cliente");
        lblapellidoP.setFont(new Font("Calibri", 2, 30));
        lblapellidoP.setForeground(Color.black);

        lblapellidoM = new JLabel("Apellido materno del cliente");
        lblapellidoM.setFont(new Font("Calibri", 2, 30));
        lblapellidoM.setForeground(Color.black);

        lblcurp = new JLabel("Curp del cliente");
        lblcurp.setFont(new Font("Calibri", 2, 30));
        lblcurp.setForeground(Color.black);

        lblfecha = new JLabel("Fecha de nacimiento");
        lblfecha.setFont(new Font("Calibri", 2, 30));
        lblfecha.setForeground(Color.black);

        //DECLARACION DE LOS TXT
        txtnombre = new JTextField(8);
        txtapellidoP = new JTextField(8);
        txtapellidoM = new JTextField(8);
        txtcurp = new JTextField(8);
        txtfecha = new JTextField(8);
        
        //DECLARACION DE LOS BOTONES
        btncrear = new JButton("Crear cliente");
        btncrear.setSize(180, 30);
        btncrear.setFont(new Font("Century Gothic", 2, 14));
        btncrear.setBackground(Color.WHITE); 
        //CREAR CLIENTES
        btncrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cli = new Cliente();
                cli.setNombre(txtnombre.getText());
                cli.setApPaterno(txtapellidoP.getText());
                cli.setApMaterno(txtapellidoM.getText());
                cli.setCurp(txtcurp.getText());
                cli.setFechaNacimiento(null);
                repositorioDeClientes.add(cli);
            }
        });
        
        btnlimpiar = new JButton("Limpiar campos");
        btnlimpiar.setSize(180, 30);
        btnlimpiar.setFont(new Font("Century Gothic", 2, 14));
        btnlimpiar.setBackground(Color.WHITE); 
        btnlimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             txtnombre.setText("");
             txtapellidoP.setText("");
             txtapellidoM.setText("");
             txtcurp.setText("");
             txtfecha.setText("");
            }
        });

        //DECLARACION DE LOS PANELES
        paneltitulo = new JPanel();
        panelapellidop = new JPanel();
        panelapellidom = new JPanel();
        panelcurp = new JPanel();
        panelfecha = new JPanel();
        panelBotones = new JPanel();
        panelnombre = new JPanel();

        ///MODIFICAR TXT
        txtnombre.setBackground(Color.white);
        txtapellidoP.setBackground(Color.white);
        txtapellidoM.setForeground(Color.white);
        txtcurp.setForeground(Color.white);
        txtfecha.setForeground(Color.white);
        txtnombre.setForeground(Color.BLACK);
        txtapellidoP.setForeground(Color.BLACK);
        txtapellidoM.setForeground(Color.BLACK);
        txtcurp.setForeground(Color.black);
        txtfecha.setForeground(Color.black);
        panelnombre.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 0));
        panelnombre.setBackground(new Color(243, 243, 243));

        paneltitulo.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneltitulo.setBackground(new Color(243, 243, 243));
        paneltitulo.add(lbltitulo);

        panelnombre.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelnombre.setBackground(new Color(243, 243, 243));
        panelnombre.add(lblnombre);
        panelnombre.add(txtnombre);

        panelapellidop.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelapellidop.setBackground(new Color(243, 243, 243));
        panelapellidop.add(lblapellidoP);
        panelapellidop.add(txtapellidoP);

        panelapellidom.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelapellidom.setBackground(new Color(243, 243, 243));
        panelapellidom.add(lblapellidoM);
        panelapellidom.add(txtapellidoM);

        panelcurp.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelcurp.setBackground(new Color(243, 243, 243));
        panelcurp.add(lblcurp);
        panelcurp.add(txtcurp);

        panelfecha.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelfecha.setBackground(new Color(243, 243, 243));
        panelfecha.add(lblfecha);
        panelfecha.add(txtfecha);

        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 0));
        panelBotones.setBackground(new Color(243, 243, 243));
        panelBotones.add(btncrear);
        panelBotones.add(btnlimpiar);

        this.add(panelnombre);
        this.add(panelapellidop);
        this.add(panelapellidom);
        this.add(panelcurp);
        this.add(panelfecha);
        this.add(panelBotones);

    }
}
