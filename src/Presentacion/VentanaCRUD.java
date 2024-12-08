package Presentacion;

import Entidades.Empleados;
import LogicaNegocio.LogicaEmpleados;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import Servicios.ServicioEmpleado;
import javax.swing.JOptionPane;

/**
 *
 * @author Empresaurio50
 */
public class VentanaCRUD extends javax.swing.JFrame {

    private Empleados objEmpleados = new Empleados();
    private ServicioEmpleado servicioEmpleado;
    private DefaultTableModel modeloTablaEmpleados;
    private VentanaPrincipal vPrincipal;
    /**
     * Creates new form VentanaLogin
     */
    public VentanaCRUD() throws IOException{
        servicioEmpleado = new LogicaEmpleados();
        initComponents();
        CargarEmpleados();

    }
    /**
     * Carga una lista de empleados en la tabla desde la base de datos.
     *
     * Este método se conecta a la base de datos, ejecuta una consulta SQL para
     * obtener los datos de los empleados y los muestra en la tabla
     * `tblEmpleados`. La tabla tiene las siguientes columnas: - ID:
     * Identificador único del empleado (entero). - Nombre: Nombre completo del
     * empleado (cadena). - Contraseña: Contraseña del empleado (cadena). -
     * Correo: Correo electrónico del empleado (cadena).
     *
     *
     */
    public void CargarEmpleados() {

        modeloTablaEmpleados = new DefaultTableModel();

        modeloTablaEmpleados.addColumn("ID");
        modeloTablaEmpleados.addColumn("Nombre");
        //modeloTablaEmpleados.addColumn("Contraseña");
        modeloTablaEmpleados.addColumn("Correo");
        modeloTablaEmpleados.addColumn("Salario Bruto");

        listarEmpleados();

    }

    /**
     * Carga una lista de empleados en la tabla desde la base de datos.
     *
     * Este método obtiene una lista de empleados desde la base de datos y
     * muestra los resultados en la tabla `tblEmpleados`. La lista de empleados
     * se devuelve como una lista de arreglos de cadenas, donde cada arreglo
     * contiene los siguientes datos: - Índice 0: ID del empleado - Índice 1:
     * Nombre del empleado - Índice 2: Password del empleado - Indice 3: Correo
     * del empleado
     *
     * 
     */
    public void listarEmpleados() {

        objEmpleados = new Empleados();

        try {
            servicioEmpleado.leerEmpleado(objEmpleados);

            for (String[] lista : objEmpleados.getEmpleadosLista()) {
                modeloTablaEmpleados.addRow(new Object[]{lista[0], lista[1], lista[3], lista[4]});
            }

        } catch (Exception e) {
        }
        tblEmpleados.setModel(modeloTablaEmpleados);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblAgregarTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombreAgregar = new javax.swing.JTextField();
        lbl2Correo = new javax.swing.JLabel();
        lbl2Contra = new javax.swing.JLabel();
        txtCorreoAgregar = new javax.swing.JTextField();
        bttAgregar = new javax.swing.JButton();
        bttListar = new javax.swing.JButton();
        bttActualizar = new javax.swing.JButton();
        bttEliminar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        lblSalarioBruto = new javax.swing.JLabel();
        txtSalarioBruto = new javax.swing.JTextField();
        txtPasswordAgregar = new javax.swing.JPasswordField();
        bttVolverPrincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgregarTitulo.setText("Agregar Empleado");

        lblNombre.setText("Nombre");

        lbl2Correo.setText("Correo");

        lbl2Contra.setText("Contraseña");

        bttAgregar.setText("Agregar");
        bttAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAgregarActionPerformed(evt);
            }
        });

        bttListar.setText("Listar");
        bttListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttListarActionPerformed(evt);
            }
        });

        bttActualizar.setText("Actualizar");
        bttActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttActualizarActionPerformed(evt);
            }
        });

        bttEliminar.setText("Eliminar");
        bttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarActionPerformed(evt);
            }
        });

        lblId.setText("ID");

        txtId.setText("0");

        lblSalarioBruto.setText("Salario Bruto");

        bttVolverPrincipal.setText("Volver Atrás");
        bttVolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl2Correo)
                .addGap(43, 43, 43))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblAgregarTitulo)
                                                .addGap(36, 36, 36)
                                                .addComponent(lblId))
                                            .addComponent(txtNombreAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtPasswordAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtId)
                                        .addComponent(txtCorreoAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(txtSalarioBruto)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bttEliminar)
                                        .addComponent(bttActualizar)))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl2Contra)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSalarioBruto)
                                    .addGap(15, 15, 15))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bttAgregar)
                                        .addComponent(bttListar))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(bttVolverPrincipal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgregarTitulo)
                    .addComponent(lblId)
                    .addComponent(txtId))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lbl2Correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2Contra)
                    .addComponent(lblSalarioBruto))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtPasswordAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAgregar)
                    .addComponent(bttActualizar))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttListar)
                    .addComponent(bttEliminar))
                .addGap(18, 18, 18)
                .addComponent(bttVolverPrincipal)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de clic en el botón de agregar un nuevo empleado.
     *
     * Este método se encarga de: 1. Crear un nuevo objeto `Empleados` para
     * representar al nuevo empleado. 2. Obtener los datos del nuevo empleado
     * desde los campos de texto de la interfaz. 3. Intentar agregar al nuevo
     * empleado a la base de datos utilizando el método `agregarEmpleado` del
     * servicio de empleados. 4. Recargar la tabla de empleados para mostrar el
     * nuevo empleado agregado.
     *
     * @param evt El evento de clic en el botón.
     */

    private void bttAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAgregarActionPerformed

        try {
            objEmpleados = new Empleados();
            servicioEmpleado = new LogicaEmpleados();

            objEmpleados.setNombre(txtNombreAgregar.getText());
            objEmpleados.setCorreo(txtCorreoAgregar.getText());
            objEmpleados.setPassword(txtPasswordAgregar.getText());
            objEmpleados.setSalarioBruto(Double.parseDouble(txtSalarioBruto.getText()));
            

            servicioEmpleado.agregarEmpleado(objEmpleados);
            
            
           
            
            
            
        }catch (IOException e) {
        }
        CargarEmpleados();
    }//GEN-LAST:event_bttAgregarActionPerformed

    private void bttListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttListarActionPerformed

        CargarEmpleados();

    }//GEN-LAST:event_bttListarActionPerformed

    /**
     * Maneja el evento de clic en el botón de actualizar un empleado.
     *
     * Este método se encarga de: 1. Crear un nuevo objeto `Empleados` para
     * representar al empleado a actualizar. 2. Obtener los nuevos datos del
     * empleado desde los campos de texto de la interfaz. 3. Intentar actualizar
     * al empleado en la base de datos utilizando el método `actualizarEmpleado`
     * del servicio de empleados. 4. Recargar la tabla de empleados para
     * reflejar los cambios.
     *
     * @param evt El evento de clic en el botón.
     * @autor Samuel Zamora
     */

    private void bttActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttActualizarActionPerformed

        objEmpleados = new Empleados();

        objEmpleados.setId(Integer.parseInt(txtId.getText()));
        objEmpleados.setNombre(txtNombreAgregar.getText());
        objEmpleados.setCorreo(txtCorreoAgregar.getText());
        objEmpleados.setSalarioBruto(Double.parseDouble(txtSalarioBruto.getText()));
        

        if (!txtPasswordAgregar.getText().isEmpty()) {
            objEmpleados.setPassword(txtPasswordAgregar.getText());
        } else {
            try {
                servicioEmpleado.leerEmpleado(objEmpleados);
                String contrasena = null;
                for (String[] fila : objEmpleados.getEmpleadosLista()) {
                    if (fila[0].equals(String.valueOf(objEmpleados.getId()))) {
                        contrasena = fila[2];
                        break;
                    }
                }
                objEmpleados.setPassword(contrasena == null ? "" : contrasena);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        try {
            servicioEmpleado.actualizarEmpleado(objEmpleados);
        } catch (Exception e) {
        }

        CargarEmpleados();

    }//GEN-LAST:event_bttActualizarActionPerformed

    /**
     * Maneja el evento de clic en el botón de eliminar un empleado.
     *
     * Este método se encarga de: 1. Crear un nuevo objeto `Empleados` para
     * representar al empleado a eliminar. 2. Obtener el ID del empleado a
     * eliminar desde el campo de texto `txtId`. 3. Intentar eliminar al
     * empleado utilizando el método `eliminarEmpleado` del servicio de
     * empleados. 4. Mostrar un mensaje de error si ocurre alguna excepción
     * durante el proceso de eliminación. 5. Recargar la tabla de empleados para
     * reflejar los cambios.
     *
     * @param evt El evento de clic en el botón.
     */
    private void bttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarActionPerformed

        objEmpleados = new Empleados();

        objEmpleados.setId(Integer.parseInt(txtId.getText()));

        try {
            servicioEmpleado.eliminarEmpleado(objEmpleados);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        CargarEmpleados();

    }//GEN-LAST:event_bttEliminarActionPerformed

    /**
     * Maneja el evento de clic en una fila de la tabla de empleados.
     *
     * Cuando se hace clic en una fila de la tabla `tblEmpleados`, este método
     * obtiene los datos de la fila seleccionada y los muestra en los campos de
     * texto correspondientes para su edición. La tabla `tblEmpleados` tiene la
     * siguiente estructura: - Columna 0: ID del empleado - Columna 1: Nombre
     * del empleado - Columna 2: Contraseña del empleado - Columna 3: Correo
     * electrónico del empleado
     *
     * @param evt El evento de clic en la tabla.
     */

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked

        int fila = tblEmpleados.getSelectedRow();

        txtId.setText(tblEmpleados.getValueAt(fila, 0).toString());
        txtNombreAgregar.setText(tblEmpleados.getValueAt(fila, 1).toString());
        //txtPasswordAgregar.setText(tblEmpleados.getValueAt(fila, 2).toString());
        txtCorreoAgregar.setText(tblEmpleados.getValueAt(fila, 2).toString());
        txtSalarioBruto.setText(tblEmpleados.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void bttVolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVolverPrincipalActionPerformed
        
        vPrincipal = new VentanaPrincipal();
        
        vPrincipal.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_bttVolverPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaCRUD().setVisible(true);

                } catch (Exception e) {
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttActualizar;
    private javax.swing.JButton bttAgregar;
    private javax.swing.JButton bttEliminar;
    private javax.swing.JButton bttListar;
    private javax.swing.JButton bttVolverPrincipal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2Contra;
    private javax.swing.JLabel lbl2Correo;
    private javax.swing.JLabel lblAgregarTitulo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalarioBruto;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtCorreoAgregar;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNombreAgregar;
    private javax.swing.JPasswordField txtPasswordAgregar;
    private javax.swing.JTextField txtSalarioBruto;
    // End of variables declaration//GEN-END:variables
}
