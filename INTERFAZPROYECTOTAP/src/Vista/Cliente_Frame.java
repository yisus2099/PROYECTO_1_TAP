package Vista;

import Almacenamiento.ListaClientes;
import Modelo.Cliente;
import Registros.RegistroCliente;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Cliente_Frame extends JPanel {

    
    private JLabel lbltitulo;
    public static JTable tabla;
    private DefaultTableModel modeloTabla;
    private JButton btncrear, btnlimpiar;
    private JPanel paneltitulo, panelcuerpo;
    ArrayList<Cliente> listaClientes;
    public Cliente_Frame() {

        lbltitulo = new JLabel("Ingresar datos del cliente");
        lbltitulo.setFont(new Font("Arial", Font.BOLD, 35));
        lbltitulo.setForeground(Color.BLACK);
        lbltitulo.setBackground(new Color(79, 148, 255));

        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(79, 148, 255));       
        
        //DECLARACION DE TABLA
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("CURP");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Paterno");
        modeloTabla.addColumn("Materno");
        modeloTabla.addColumn("Fecha de nacimiento");
        tabla = new JTable(modeloTabla);
       
        //IMPRIMIR CLIENTE EN TABLA
         listaClientes = ListaClientes.getListaClientes();
          //System.out.println(listaClientes.);
        
          
        
        //AGREGAMOS TABLA A SCROLL PANE
         JScrollPane scrollPane = new JScrollPane(tabla);
         llenarTabla();
         
         //DECLARACION DE LOS BOTONES
        btncrear = new JButton("Crear cliente");
        btncrear.setSize(500, 450);
        btncrear.setFont(new Font("Century Gothic", 2, 14));
        btncrear.setBackground(Color.WHITE);

        //CREAR CLIENTES
        btncrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroCliente Cliente = new RegistroCliente();
                Cliente.setVisible(true);
            }
        });

        //PANELES
        paneltitulo = new JPanel();
        panelcuerpo = new JPanel();

        //MEDIDAS PANELES
        paneltitulo.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneltitulo.setBackground(new Color(79, 148, 255));
        paneltitulo.add(lbltitulo);

        panelcuerpo.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelcuerpo.setBackground(new Color(79, 148, 255));
        panelcuerpo.add(scrollPane);
        panelcuerpo.add(btncrear);

        //AGREGAR PANELES
        this.add(paneltitulo);
        this.add(panelcuerpo);
    }
    
public  Cliente clienteSeleccionada(){
    
   Cliente cliente = null;
         
   int fila = tabla.getSelectedRow();
   int columna = tabla.getSelectedColumn();
   
   if(fila>=0 && columna >=0){
       for (Cliente clienteTemp: listaClientes){
           if(clienteTemp.getCurp().equals(modeloTabla.getValueAt(fila,columna))){
               cliente = clienteTemp;
               return cliente;
           }
       }
   }   
   return cliente;
}
    public void llenarTabla(){
        for (Cliente cliente : listaClientes) {
            Object[] fila = {cliente.getCurp(), cliente.getNombre(), cliente.getApellidoPaterno(), cliente.getApellidoMaterno(), cliente.getFechaNacimiento()};
            
            modeloTabla.addRow(fila);
        }
    }
}
