package Registros;

import Modelo.Movimiento;
import Modelo.Tarjeta;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistroMovimiento extends JFrame {

    private JTextField txtClave, txtFecMov, txtTipoMov, txtCantidad;
    private JLabel lblClave, lblFecMov, lblTipoMov, lblCantidad;
    private JButton btnRegistrar;
    private JButton btnLimpiar;
    public Tarjeta tarjeta;
    private JPanel panel;

    public RegistroMovimiento() {
         super("Registro de Movimiento");
         
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));
        
        lblClave = new JLabel("Clave:");
        panel.add(lblClave);
        txtClave = new JTextField();
        panel.add(txtClave);

        lblFecMov = new JLabel("Fecha de movimiento (dd/MM/yyyy):");
        panel.add(lblFecMov);
        txtFecMov = new JTextField();
        panel.add(txtFecMov);

        lblTipoMov = new JLabel("Tipo de movimiento:");
        panel.add(lblTipoMov);
        txtTipoMov = new JTextField();
        panel.add(txtTipoMov);

        lblCantidad = new JLabel("Cantidad:");
        panel.add(lblCantidad);
        txtCantidad = new JTextField();
        panel.add(txtCantidad);
        
         btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar al hacer clic en el botón Registrar
                registrarMovimiento();
            }
        });
        panel.add(btnRegistrar);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar al hacer clic en el botón Limpiar
                limpiarFormulario();
            }
        });
        panel.add(btnLimpiar);

        add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void registrarMovimiento() {
        // Obtener los datos de los campos de texto
        String clave = txtClave.getText();
        String fecha = txtFecMov.getText();
        String tipo = txtTipoMov.getText();
        String cantidad = txtCantidad.getText();
     

        // Validar que los campos no estén vacíos
        if (clave.isEmpty() || fecha.isEmpty() || tipo.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos obligatorios (*)");
            return;
        }

        // Convertir la fecha de nacimiento a un objeto Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaMov = null;
        try {
            fechaMov = formatter.parse(fecha);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de movimiento debe tener el formato dd/MM/yyyy");
            return;
        }
        
        //String a int
       int clav = Integer.parseInt(clave);
       //String a Byte
       byte tipoM = Byte.parseByte(tipo);
       //String a Double
       double cant= Double.parseDouble(cantidad);

        // Crear un objeto de la clase Persona con los datos del formulario
        Movimiento mov = new Movimiento(clav, fechaMov, tipoM, cant);
        tarjeta.addMovimiento(mov);
        Controlador.INTERFAZPROYECTOTAP.movimientoFrame.llenarTabla();
        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Movimiento registrado exitosamente:\n" + mov.toString());

        // Limpiar los campos del formulario
       
        limpiarFormulario();
    }

    private void limpiarFormulario() {
        txtCantidad.setText("");
        txtClave.setText("");
        txtFecMov.setText("");
        txtTipoMov.setText("");
    }
    }


