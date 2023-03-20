package Vista;

import Modelo.Cliente;
import Modelo.RegistroCliente;
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
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JButton btncrear, btnlimpiar;
    private JPanel paneltitulo, panelcuerpo;
    public ArrayList<Cliente> repositorioDeClientes = new ArrayList<Cliente>();

    public Cliente_Frame() {

        lbltitulo = new JLabel("Ingresar datos del cliente");
        lbltitulo.setFont(new Font("Arial", Font.BOLD, 35));
        lbltitulo.setForeground(Color.BLACK);

        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(243, 243, 243));

        //DECLARACION DE TABLA
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Teléfono");;
        tabla = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tabla);

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
        paneltitulo.setBackground(new Color(243, 243, 243));
        paneltitulo.add(lbltitulo);

        panelcuerpo.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelcuerpo.setBackground(new Color(243, 243, 243));
        panelcuerpo.add(scrollPane);
        panelcuerpo.add(btncrear);

        //AGREGAR PANELES
        this.add(paneltitulo);
        this.add(panelcuerpo);

    }
}
