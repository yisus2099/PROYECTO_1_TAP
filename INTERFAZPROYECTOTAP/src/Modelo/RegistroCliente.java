package Modelo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.*;

public class RegistroCliente extends JFrame{
    
    private JLabel labelCURP;
    private JLabel labelNombre;
    private JLabel labelApellidoPaterno;
    private JLabel labelApellidoMaterno;
    private JLabel labelFechaNacimiento;

    private JTextField txtCURP;
    private JTextField txtNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;
    private JTextField txtFechaNacimiento;

    private JButton btnRegistrar;
    private JButton btnLimpiar;

    private JPanel panel;

    
    public RegistroCliente() {
        super("Registro de Cliente");

        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 4));

        labelCURP = new JLabel("CURP:");
        panel.add(labelCURP);
        txtCURP = new JTextField();
        panel.add(txtCURP);

        labelNombre = new JLabel("Nombre:");
        panel.add(labelNombre);
        txtNombre = new JTextField();
        panel.add(txtNombre);

        labelApellidoPaterno = new JLabel("Apellido Paterno:");
        panel.add(labelApellidoPaterno);
        txtApellidoPaterno = new JTextField();
        panel.add(txtApellidoPaterno);

        labelApellidoMaterno = new JLabel("Apellido Materno:");
        panel.add(labelApellidoMaterno);
        txtApellidoMaterno = new JTextField();
        panel.add(txtApellidoMaterno);

        labelFechaNacimiento = new JLabel("Fecha de Nacimiento (dd/MM/yyyy):");
        panel.add(labelFechaNacimiento);
        txtFechaNacimiento = new JTextField();
        panel.add(txtFechaNacimiento);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar al hacer clic en el botón Registrar
                registrarCliente();
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

    private void registrarCliente() {
        // Obtener los datos de los campos de texto
        String curp = txtCURP.getText();
        String nombre = txtNombre.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String apellidoMaterno = txtApellidoMaterno.getText();
        String fechaNacimientoString = txtFechaNacimiento.getText();

        // Validar que los campos no estén vacíos
        if (curp.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty() || fechaNacimientoString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos obligatorios (*)");
            return;
        }

        // Convertir la fecha de nacimiento a un objeto Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = formatter.parse(fechaNacimientoString);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento debe tener el formato dd/MM/yyyy");
            return;
        }

        // Crear un objeto de la clase Cliente con los datos del formulario
        
        Cliente cliente = new Cliente(curp, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
                // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Cliente registrado exitosamente:\n" + cliente.toString());

        // Limpiar los campos del formulario
        limpiarFormulario();
    }

    private void limpiarFormulario() {
        txtCURP.setText("");
        txtNombre.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtFechaNacimiento.setText("");
    }
}
