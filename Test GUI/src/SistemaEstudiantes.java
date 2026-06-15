import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class SistemaEstudiantes extends JFrame {

    // Componentes
    private JTextField txtNombre, txtEdad, txtCarrera;
    private JButton btnAgregar, btnEliminar, btnLimpiar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private ArrayList<Estudiante> estudiantes;

    public SistemaEstudiantes() {
        estudiantes = new ArrayList<>();
        inicializarComponentes();
        configurarVentana();
    }

    private void inicializarComponentes() {
        // Panel superior - Formulario
        JPanel panelFormulario = new JPanel(new GridBagLayout());
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Estudiante"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Nombre
        gbc.gridx = 0; gbc.gridy = 0;
        panelFormulario.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        txtNombre = new JTextField(20);
        panelFormulario.add(txtNombre, gbc);

        // Edad
        gbc.gridx = 0; gbc.gridy = 1;
        panelFormulario.add(new JLabel("Edad:"), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        txtEdad = new JTextField(20);
        panelFormulario.add(txtEdad, gbc);

        // Carrera
        gbc.gridx = 0; gbc.gridy = 2;
        panelFormulario.add(new JLabel("Carrera:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        txtCarrera = new JTextField(20);
        panelFormulario.add(txtCarrera, gbc);

        // Panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar");
        btnLimpiar = new JButton("Limpiar");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnLimpiar);

        // Tabla
        String[] columnas = {"ID", "Nombre", "Edad", "Carrera"};
        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Tabla no editable
            }
        };
        tabla = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Agregar componentes al frame
        setLayout(new BorderLayout(10, 10));

        JPanel panelNorte = new JPanel(new BorderLayout());
        panelNorte.add(panelFormulario, BorderLayout.CENTER);
        panelNorte.add(panelBotones, BorderLayout.SOUTH);

        add(panelNorte, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Eventos
        configurarEventos();
    }

    private void configurarEventos() {
        btnAgregar.addActionListener(e -> agregarEstudiante());
        btnEliminar.addActionListener(e -> eliminarEstudiante());
        btnLimpiar.addActionListener(e -> limpiarCampos());
    }

    private void agregarEstudiante() {
        try {
            String nombre = txtNombre.getText().trim();
            int edad = Integer.parseInt(txtEdad.getText().trim());
            String carrera = txtCarrera.getText().trim();

            if (nombre.isEmpty() || carrera.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Por favor complete todos los campos",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Estudiante estudiante = new Estudiante(nombre, edad, carrera);
            estudiantes.add(estudiante);

            Object[] fila = {
                    estudiantes.size(),
                    estudiante.getNombre(),
                    estudiante.getEdad(),
                    estudiante.getCarrera()
            };
            modeloTabla.addRow(fila);

            limpiarCampos();
            JOptionPane.showMessageDialog(this,
                    "Estudiante agregado exitosamente",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "La edad debe ser un número válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarEstudiante() {
        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de eliminar este estudiante?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                estudiantes.remove(filaSeleccionada);
                modeloTabla.removeRow(filaSeleccionada);
                actualizarIDs();
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione un estudiante",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void actualizarIDs() {
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.setValueAt(i + 1, i, 0);
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtCarrera.setText("");
        txtNombre.requestFocus();
    }

    private void configurarVentana() {
        setTitle("Sistema de Gestión de Estudiantes");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SistemaEstudiantes());
    }
}

// Clase Estudiante
class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCarrera() { return carrera; }
}