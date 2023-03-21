
package Vista;

import Registros.RegistroMovimiento;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Movimientos_Frame extends JPanel {
    //Se crean los componentes 
private JLabel lbltitulo;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JButton btncrear, btnlimpiar;
    private JPanel paneltitulo, panelcuerpo;
    
    public Movimientos_Frame(){
        
        lbltitulo = new JLabel("Ingresar datos del movimieto");
        lbltitulo.setFont(new Font("Arial", Font.BOLD, 35));
        lbltitulo.setForeground(Color.BLACK);

        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(243, 243, 243));
        
        //DECLARACION DE TABLA
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Clave");
        modeloTabla.addColumn("Fcha");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Cantidad");
        tabla = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tabla);

        //DECLARACION DE LOS BOTONES
        btncrear = new JButton("Crear movimiento");
        btncrear.setSize(500, 450);
        btncrear.setFont(new Font("Century Gothic", 2, 14));
        btncrear.setBackground(Color.WHITE);
        
        //CREAR MOVIMIENTO
        btncrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroMovimiento Movimiento = new RegistroMovimiento();
                Movimiento.setVisible(true);
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