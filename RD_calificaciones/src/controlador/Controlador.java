package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;
import modelo.EstudiantesDTS;
import vista.Vista;

/**
 * Controlador
 *
 * @author MPZ
 */
public class Controlador implements ActionListener {

    EstudiantesDTS dao = new EstudiantesDTS();
    Estudiante c = new Estudiante();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Constructor de la clase Controlador, se encarga de inicializar los
     * componentes del formulario
     *
     * @param v
     */
    public Controlador(Vista v) {
        this.vista = v;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);

        this.vista.btnGuardar.setEnabled(true);
        this.vista.btnEditar.setEnabled(false);
        this.vista.btnActualizar.setEnabled(false);
        this.vista.btnCancelar.setEnabled(false);
        this.vista.btnEliminar.setEnabled(false);

        //Limpiar formulario y Listar contactos
        limpiarCampos(v);
        listar(vista.tblEstudiante);
    }

    /**
     * Este metodo se encarga de registrar un nuevo estudiantes.
     */
    public void agregar() {

        int n;

        String Nombres = vista.txtNombres.getText();
        String Apellidos = vista.txtApellidos.getText();
        String Matricula = vista.txtMatricula.getText();
        String Correo = vista.txtCorreo.getText();
        String Materia = vista.txtMateria.getText();

        c.setNombres(Nombres);
        c.setApellidos(Apellidos);
        c.setMatricula(Matricula);
        c.setCorreo(Correo);
        c.setMateria(Materia);

        if (validarCampos(vista) > 0) {
            n = dao.agregar(c);
            if (n == 1) {
                JOptionPane.showMessageDialog(vista, "estudiante agregado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
                listar(vista.tblEstudiante);
                limpiarCampos(vista);
            } else {
                JOptionPane.showMessageDialog(vista, "Error: tratando de agregar estudiantes.", "Error!", JOptionPane.ERROR_MESSAGE);
                limpiarTabla();
                listar(vista.tblEstudiante);
                limpiarCampos(vista);
            }
        }
    }

    /**
     * Este metodo se encarga de cargar los registros dentro de la tabla de
     * Estudiante.
     *
     * @param tabla
     */
    public void listarEstudiante(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        List<Estudiante> lista = (List<Estudiante>) dao.listarRegistro(vista.txtBuscar.getText());
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombres();
            object[2] = lista.get(i).getApellidos();
            object[3] = lista.get(i).getMatricula();
            object[4] = lista.get(i).getCorreo();
            object[5] = lista.get(i).getMateria();
            modelo.addRow(object);
        }
        vista.tblEstudiante.setModel(modelo);
    }

    /**
     * Este metodo se encarga de cargar los registros dentro de la tabla de
     * estudiante.
     *
     * @param tabla
     */
    public final void listar(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        List<Estudiante> lista = (List<Estudiante>) dao.listar();
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombres();
            object[2] = lista.get(i).getApellidos();
            object[3] = lista.get(i).getMatricula();
            object[4] = lista.get(i).getCorreo();
            object[5] = lista.get(i).getMateria();
            modelo.addRow(object);
        }
        vista.tblEstudiante.setModel(modelo);
    }

    /**
     * Este metodo pone en modo edicion el formulario y carga los datos del
     * contacto a ser modificado.
     */
    public void editar() {

        int fila = vista.tblEstudiante.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila para la edicion.", "Error!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblEstudiante);
            limpiarCampos(vista);
        } else {
            int id = Integer.parseInt((String) vista.tblEstudiante.getValueAt(fila, 0).toString());
            String Nombres = (String) vista.tblEstudiante.getValueAt(fila, 1);
            String Apellidos = (String) vista.tblEstudiante.getValueAt(fila, 2);
            String Matricula = (String) vista.tblEstudiante.getValueAt(fila, 3);
            String Correo = (String) vista.tblEstudiante.getValueAt(fila, 4);
            String Materia = (String) vista.tblEstudiante.getValueAt(fila, 5);

            vista.txtID.setText("" + id);
            vista.txtNombres.setText(Nombres);
            vista.txtApellidos.setText(Apellidos);
            vista.txtMatricula.setText(Matricula);
            vista.txtCorreo.setText(Correo);
            vista.txtMateria.setText(Materia);
            vista.txtNombres.requestFocus();
        }
    }

    /**
     * metodo que se encarga de actualizar el contacto selecionado
     */
    public void actualizar() {
        int r;

        int fila = vista.tblEstudiante.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila para la actualizacion.", "Error!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblEstudiante);
            limpiarCampos(vista);
        } else {
            if (validarCampos(vista) > 0) {
                int id = Integer.parseInt(vista.txtID.getText());
                String Nombres = vista.txtNombres.getText();
                String Apellidos = vista.txtApellidos.getText();
                String Matricula = vista.txtMatricula.getText();
                String Correo = vista.txtCorreo.getText();
                String Materia = vista.txtMateria.getText();

                c.setId(id);
                c.setNombres(Nombres);
                c.setApellidos(Apellidos);
                c.setMatricula(Matricula);
                c.setCorreo(Correo);
                c.setMateria(Materia);

                r = dao.actualizar(c);
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Estudiante actualizado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla();
                    listar(vista.tblEstudiante);
                    limpiarCampos(vista);
                } else {
                    JOptionPane.showMessageDialog(vista, "Error: tratando de actualizar estudiante.", "Error!", JOptionPane.ERROR_MESSAGE);
                    limpiarTabla();
                    listar(vista.tblEstudiante);
                    limpiarCampos(vista);
                }
            }
        }
    }

    /**
     * Este metodo procede a eliminar el registro seleccionado dentro de la
     * tabla.
     */
    public void eliminar() {

        int fila = vista.tblEstudiante.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila a borrar.", "Error!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblEstudiante);
            limpiarCampos(vista);
        } else if (JOptionPane.showConfirmDialog(vista, "Esta seguro de eliminar este Estudiante?", "Borrar", JOptionPane.YES_NO_OPTION) == 0) {
            int id = Integer.parseInt((String) vista.tblEstudiante.getValueAt(fila, 0).toString());

            dao.eliminar(id);
            JOptionPane.showMessageDialog(vista, "Estudiante eliminado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            limpiarTabla();
            listar(vista.tblEstudiante);
            limpiarCampos(vista);
        }
    }

    /**
     * Este metodo se encarga de limpiar los datos
     */
    public void limpiarTabla() {
        for (int i = 0; i < vista.tblEstudiante.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    /**
     * Este metodo limpia los campos del formulario antes de ser utilizado.
     *
     * @param v
     */
    public final void limpiarCampos(Vista v) {
        v.txtID.setText("");
        v.txtNombres.setText("");
        v.txtApellidos.setText("");
        v.txtMatricula.setText("");
        v.txtCorreo.setText("");
        v.txtMateria.setText("");
        v.txtNombres.requestFocus();
    }

    /**
     * Este metodo valida los campos del formulario
     *
     * @param v
     * @return validacion
     */
    public int validarCampos(Vista v) {

        int validacion = 1;

        if (v.txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo nombres, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtNombres.requestFocus();
            validacion = 0;
        } else if (v.txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo apellidos, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtApellidos.requestFocus();
            validacion = 0;
        } else if (v.txtMatricula.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, " verificar campo matriucla, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtMatricula.requestFocus();
            validacion = 0;
        } else if (v.txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo correo, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtCorreo.requestFocus();
            validacion = 0;
        } else if (v.txtMateria.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo materia, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtMateria.requestFocus();
            validacion = 0;
        }

//        } else {
//            validacion = 1;
//        }
        return validacion;
    }

    /**
     * Este metodo verifica si se ha producido algun evento dentro del fomulario
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            agregar();
            listar(vista.tblEstudiante);
        }
        if (e.getSource() == vista.btnEditar) {
            editar();
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(true);
        }
        if (e.getSource() == vista.btnActualizar) {
            actualizar();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            limpiarTabla();
            listar(vista.tblEstudiante);
            vista.txtNombres.requestFocus();
        }
        if (e.getSource() == vista.btnEliminar) {
            eliminar();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            limpiarCampos(vista);
            limpiarTabla();
            listar(vista.tblEstudiante);
        }
        if (e.getSource() == vista.btnCancelar) {
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            this.vista.lblAviso.setVisible(false);
            vista.txtBuscar.setText("");
            limpiarCampos(vista);
            limpiarTabla();
            listar(vista.tblEstudiante);
        }
        if (e.getSource() == vista.btnBuscar) {
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(true);
            this.vista.btnEliminar.setEnabled(false);
            limpiarCampos(vista);
            limpiarTabla();
            listarEstudiante(vista.tblEstudiante);
        }

    }

}
