package Registros;

import Almacenamiento.ListaClientes;
import Modelo.Cliente;
import Modelo.Tarjeta;
import Vista.Tarjeta_Frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistroTarjeta extends JFrame {

    private JLabel lblNumCuenta, lblNumTarjeta, lblLimCredito, lblFecCreacion,
            lblFecCorte, lblFecPago, lblTAN, lblAnualidad, lblFAA;

    private JTextField txtNumCuenta, txtNumTarjeta, txtLimCredito, txtFecCreacion,
            txtFecCorte, txtFecPago, txtTAN, txtAnualidad, txtFAA;

    private JButton btnRegistrar;
    private JButton btnLimpiar;

    private JPanel panel;

    public Cliente cliente;
    public RegistroTarjeta() {
        super("Registro de Persona");
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(10, 4));

        lblNumCuenta = new JLabel("Num de Cuenta:");
        panel.add(lblNumCuenta);
        txtNumCuenta = new JTextField();
        panel.add(txtNumCuenta);

        lblNumTarjeta = new JLabel("Num de Tarjeta:");
        panel.add(lblNumTarjeta);
        txtNumTarjeta = new JTextField();
        panel.add(txtNumTarjeta);

        lblLimCredito = new JLabel("Limite de Credito:");
        panel.add(lblLimCredito);
        txtLimCredito = new JTextField();
        panel.add(txtLimCredito);

        lblFecCreacion = new JLabel("Fecha de Creación (dd/MM/yyyy):");
        panel.add(lblFecCreacion);
        txtFecCreacion = new JTextField();
        panel.add(txtFecCreacion);

        lblFecCorte = new JLabel("Fecha de Corte (dd/MM/yyyy):");
        panel.add(lblFecCorte);
        txtFecCorte = new JTextField();
        panel.add(txtFecCorte);

        lblFecPago = new JLabel("Fecha de Pago (dd/MM/yyyy):");
        panel.add(lblFecPago);
        txtFecPago = new JTextField();
        panel.add(txtFecPago);

        lblTAN = new JLabel("Tasa de interés anual:");
        panel.add(lblTAN);
        txtTAN = new JTextField();
        panel.add(txtTAN);

        lblAnualidad = new JLabel("Anualidad:");
        panel.add(lblAnualidad);
        txtAnualidad = new JTextField();
        panel.add(txtAnualidad);

        lblFAA = new JLabel("Fecha de aplicación de anualidad (dd/MM/yyyy):");
        panel.add(lblFAA);
        txtFAA = new JTextField();
        panel.add(txtFAA);
       
        //comBoxReg = new JComboBox();
        btnRegistrar = new JButton("Registrar Tarjeta");
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar al hacer clic en el botón Registrar
                registrarTarjeta();
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

    private void registrarTarjeta() {
        //Traemos el ArrayList
        ArrayList<Cliente> listaClientes = ListaClientes.getListaClientes();

        // Obtener los datos de los campos de texto
        String NumCuenta = txtNumCuenta.getText();
        String NumTrajeta = txtNumTarjeta.getText();
        String LimCredito = txtLimCredito.getText();
        String FecCreacionString = txtFecCreacion.getText();
        String FecCorteString = txtFecCorte.getText();
        String FecPagoString = txtFecPago.getText();
        String TAN = txtTAN.getText();
        String Anualidad = txtAnualidad.getText();
        String FAAString = txtFAA.getText();

        // Validar que los campos no estén vacíos
        if (NumCuenta.isEmpty() || NumTrajeta.isEmpty() || LimCredito.isEmpty() || FecCreacionString.isEmpty()
                || FecCorteString.isEmpty() || FecPagoString.isEmpty() || TAN.isEmpty() || Anualidad.isEmpty()
                || FAAString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos obligatorios (*)");
            return;
        }

        // Convertir la fecha a un objeto Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formatter.parse(FecCreacionString);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de creación debe tener el formato dd/MM/yyyy");
            return;
        }

        Date fecha2 = null;
        try {
            fecha2 = formatter.parse(FecCorteString);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de corte debe tener el formato dd/MM/yyyy");
            return;
        }

        Date fecha3 = null;
        try {
            fecha3 = formatter.parse(FecPagoString);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de pago debe tener el formato dd/MM/yyyy");
            return;
        }

        Date fecha4 = null;
        try {
            fecha4 = formatter.parse(FAAString);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de la anualidad debe tener el formato dd/MM/yyyy");
            return;
        }

        //Convertir String a Double
        double limCred = Double.parseDouble(LimCredito);
        double tasaInteres = Double.parseDouble(TAN);
        double anualidad = Double.parseDouble(Anualidad);

        //SeleccionarCliente
        // cliente = listaClientes.get((int)comBoxReg.getSelectedItem());
        // Crear un objeto de la clase Tarjeta con los datos del formulario
        Tarjeta tarjeta = new Tarjeta(NumCuenta, NumTrajeta, limCred, tasaInteres, anualidad, fecha, fecha2, fecha3, fecha4);
        
        cliente.addTarjeta(tarjeta);

        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Tarjeta registrada exitosamente:\n" + tarjeta.toString());

        // Limpiar los campos del formulario
        Controlador.INTERFAZPROYECTOTAP.tarjetaFrame.llenarTabla();
        limpiarFormulario();
    }

    private void limpiarFormulario() {
        txtNumCuenta.setText("");
        txtAnualidad.setText("");
        txtFAA.setText("");
        txtFecCorte.setText("");
        txtFecCreacion.setText("");
        txtFecPago.setText("");
        txtLimCredito.setText("");
        txtNumTarjeta.setText("");
        txtTAN.setText("");
    }

    public void getCombo(JComboBox comboBox) {
        JComboBox comBoxReg = comboBox;
    }
}
