package Vista;

import Almacenamiento.ListaClientes;
import Modelo.Cliente;

import Registros.RegistroTarjeta;
import Modelo.Tarjeta;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tarjeta_Frame extends JPanel {

    private JLabel lbltitulo;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JButton btncrear, btnlimpiar;
    private JPanel paneltitulo, panelcuerpo;
    public JComboBox comboBox;

    public Tarjeta_Frame() {
        lbltitulo = new JLabel("Ingresar datos de la tarjeta");
        lbltitulo.setFont(new Font("Arial", Font.BOLD, 35));
        lbltitulo.setForeground(Color.BLACK);

        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(243, 243, 243));

        // Instanciamos el combo box
        comboBox = new JComboBox();
        comboBox.setForeground(Color.BLACK);
        comboBox.addItem("Buscar cliente");
        comboBox.setBounds(0, 0, 15, 4);
        llenarCombosCliente();

        //DECLARACION DE TABLA
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Cuenta");
        modeloTabla.addColumn("Tarjeta");
        modeloTabla.addColumn("Credito");
        modeloTabla.addColumn("Creación");
        modeloTabla.addColumn("Corte");
        modeloTabla.addColumn("Pago");
        modeloTabla.addColumn("Tasa de interés");
        modeloTabla.addColumn("Anualidad");
        modeloTabla.addColumn("Fecha");
        tabla = new JTable(modeloTabla);
        
        //Arreglo
        ArrayList<Cliente> listaClientes = ListaClientes.getListaClientes();
      
        /*
            for (Cliente cliente : listaClientes) {
                for(Tarjeta tarjeta : cliente.getRepositorioDeTarjetas()){
                      Object[] fila = {tarjeta.getNumCuenta(), tarjeta.getNumTarjeta(), tarjeta.getLimCredito(), tarjeta.getFechaCreacion(), tarjeta.getFechaCorte(), 
                          tarjeta.getFechaPago(), tarjeta.getTasaInteresAnual(), tarjeta.getAnualidad(), tarjeta.getFechaApliAnua()};
                      modeloTabla.addRow(fila);
                }
        }
        */
        
        //AGREGAMOS TABLA A SCROLL PANE
        JScrollPane scrollPane = new JScrollPane(tabla);

        Dimension nuevoTamaño = new Dimension(600, 400); // establecer el nuevo tamaño del JScrollPane
        scrollPane.setPreferredSize(nuevoTamaño);

        //DECLARACION DE LOS BOTONES
        btncrear = new JButton("Crear tarjeta");
        btncrear.setSize(500, 450);
        btncrear.setFont(new Font("Century Gothic", 2, 14));
        btncrear.setBackground(Color.WHITE);

        //CREAR TARJETA
        btncrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroTarjeta Tarjeta = new RegistroTarjeta();
                Tarjeta.setVisible(true);
            }
        });

   

        //PANELES
        paneltitulo = new JPanel();
        panelcuerpo = new JPanel();

        //MEDIDAS PANELES
        paneltitulo.setLayout(
                new FlowLayout(FlowLayout.CENTER));
        paneltitulo.setBackground(
                new Color(243, 243, 243));
        paneltitulo.add(lbltitulo);

        panelcuerpo.setLayout(
                new FlowLayout(FlowLayout.CENTER));
        panelcuerpo.setBackground(
                new Color(243, 243, 243));
        panelcuerpo.add(scrollPane);
        panelcuerpo.add(btncrear);
        panelcuerpo.add(comboBox);

        //AGREGAR PANELES
        this.add(paneltitulo);
        this.add(panelcuerpo);

        //LLEVAR COMBO BOX
        RegistroTarjeta regTar = new RegistroTarjeta();
        regTar.getCombo(comboBox);

    }

    public void llenarCombosCliente() {
        ArrayList<Cliente> listaClientes = ListaClientes.getListaClientes();
        Object clientes[] = new Object[listaClientes.size()];
        int i = 0;
        for (Cliente c : listaClientes) {
            clientes[i] = c.getNombre();
            i++;
        }
        comboBox.setModel(new DefaultComboBoxModel(clientes));
    }

}
