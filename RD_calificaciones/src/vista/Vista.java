package vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;


/**
 *Vista del formulario contactos.
 * @author MPZ
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form ContactosSQLite
     */
    public Vista() {
        initComponents();
       
        lblAviso.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pnlContactos = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        lblAviso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estudiantes Registro");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 58, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContactos.setBackground(new java.awt.Color(35, 39, 47));
        pnlContactos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombres.setBackground(new java.awt.Color(35, 39, 47));
        txtNombres.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setToolTipText("Nombres del contacto");
        txtNombres.setBorder(null);
        pnlContactos.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 390, 30));

        txtCorreo.setBackground(new java.awt.Color(35, 39, 47));
        txtCorreo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setToolTipText("Correo del contacto");
        txtCorreo.setBorder(null);
        txtCorreo.setMaximumSize(new java.awt.Dimension(64, 39));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        pnlContactos.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 390, 30));

        lblAviso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(225, 78, 38));
        lblAviso.setText("Correo no valido! ejem: User@gm.com");
        pnlContactos.add(lblAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 280, 70));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona_Icon.png"))); // NOI18N
        jLabel1.setText("Nombre:");
        pnlContactos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 60));
        pnlContactos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 390, 30));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona_Icon.png"))); // NOI18N
        jLabel2.setText("Apellido:");
        pnlContactos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 60));
        pnlContactos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 390, 20));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/matriculaimg.png"))); // NOI18N
        jLabel3.setText("Matricula:");
        pnlContactos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, 60));
        pnlContactos.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 390, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/correoicon.png"))); // NOI18N
        jLabel4.setText("Correo:");
        pnlContactos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 130, 60));
        pnlContactos.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 390, 30));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/materiaIcon.png"))); // NOI18N
        jLabel5.setText("Materia");
        pnlContactos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, 60));

        txtMateria.setBackground(new java.awt.Color(35, 39, 47));
        txtMateria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtMateria.setForeground(new java.awt.Color(255, 255, 255));
        txtMateria.setToolTipText("Ingresa materia");
        txtMateria.setBorder(null);
        txtMateria.setMaximumSize(new java.awt.Dimension(64, 39));
        txtMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMateriaActionPerformed(evt);
            }
        });
        txtMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMateriaKeyReleased(evt);
            }
        });
        pnlContactos.add(txtMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 390, 30));
        pnlContactos.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 390, 30));

        btnGuardar.setBackground(new java.awt.Color(35, 39, 47));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Registrar");
        btnGuardar.setToolTipText("Registrar estudiante");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGuardarMouseReleased(evt);
            }
        });
        pnlContactos.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 170, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudenIcon_id.png"))); // NOI18N
        pnlContactos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, 90));

        txtApellidos.setBackground(new java.awt.Color(35, 39, 47));
        txtApellidos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setToolTipText("Apellido");
        txtApellidos.setBorder(null);
        pnlContactos.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 390, 30));

        txtMatricula.setBackground(new java.awt.Color(35, 39, 47));
        txtMatricula.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(255, 255, 255));
        txtMatricula.setBorder(null);
        pnlContactos.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 390, 30));

        jPanel1.add(pnlContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 720));

        tblEstudiante.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nombres", "Apellidos", "Matricula", "Correo", "Materia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstudiante.setToolTipText("Listado de contactos");
        tblEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstudianteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstudiante);
        if (tblEstudiante.getColumnModel().getColumnCount() > 0) {
            tblEstudiante.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 670, 340));

        btnEliminar.setBackground(new java.awt.Color(35, 39, 47));
        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar estudiante");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 130, 60));

        btnEditar.setBackground(new java.awt.Color(35, 39, 47));
        btnEditar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("editar usuario");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 130, 60));

        btnActualizar.setBackground(new java.awt.Color(35, 39, 47));
        btnActualizar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 130, 60));

        btnCancelar.setBackground(new java.awt.Color(35, 39, 47));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 200, 130, 60));

        txtBuscar.setBackground(new java.awt.Color(27, 35, 60));
        txtBuscar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setToolTipText("Escribir datos para realizar la busqueda");
        txtBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(62, 33, 133)));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 500, 50));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(204, 204, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconBusquedaM.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar estudiantes");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 300, -1, -1));

        txtID.setBackground(new java.awt.Color(52, 58, 70));
        txtID.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setToolTipText("");
        txtID.setBorder(null);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 40, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//botones habilitador y desabilitados
    private void tblEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstudianteMouseClicked
        this.btnGuardar.setEnabled(false);
        this.btnEditar.setEnabled(true);
        this.btnActualizar.setEnabled(false);
        this.btnCancelar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tblEstudianteMouseClicked
//validacion de correo
    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        this.btnCancelar.setEnabled(true);
        if(verificarEmail(txtCorreo.getText())){
            lblAviso.setVisible(false);
        } else {
            lblAviso.setVisible(true);
        }
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateriaActionPerformed

    private void txtMateriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMateriaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMateriaKeyReleased

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        // TODO add your handling code here:
        btnEliminar.setBackground(new Color(184, 40, 40));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        // TODO add your handling code here:
        btnEliminar.setBackground(new Color(35,39,47));
        
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        // TODO add your handling code here:
        btnActualizar.setBackground(new Color(52, 58, 70));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        // TODO add your handling code here:
        btnActualizar.setBackground(new Color(35,39,47));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        // TODO add your handling code here:
        btnEditar.setBackground(new Color(52, 58, 70));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // TODO add your handling code here:
                btnEditar.setBackground(new Color(35,39,47));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        // TODO add your handling code here:
       btnCancelar.setBackground(new Color(52, 58, 70));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        // TODO add your handling code here:
         btnCancelar.setBackground(new Color(35,39,47));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        // TODO add your handling code here:
        btnGuardar.setBackground(new Color(44, 44, 44 ));
    }//GEN-LAST:event_btnGuardarMousePressed

    private void btnGuardarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseReleased
        // TODO add your handling code here:
         btnGuardar.setBackground(new Color(52, 58, 70));
    }//GEN-LAST:event_btnGuardarMouseReleased

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    public boolean verificarEmail(String correo){
        Pattern patron =  Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Aa-z0-9-]+)*@"
                                            +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        return mat.find();
    } 
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel lblAviso;
    private javax.swing.JPanel pnlContactos;
    public javax.swing.JTable tblEstudiante;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtMateria;
    public javax.swing.JTextField txtMatricula;
    public javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}