/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.PatronoVentana;

import Entidades.Correos;
import Entidades.Empleados;
import LogicaNegocio.LogicaDeducciones;
import LogicaNegocio.LogicaEmpleados;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.AddressException;
import javax.swing.JOptionPane;

import Servicios.ServicioEmpleado;
import java.util.logging.Level;
import java.util.logging.Logger;
import Servicios.ServicioDeducciones;
import Entidades.Deducciones;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Empresaurio50
 */
public class VentanaCorreo extends javax.swing.JFrame {

    private Deducciones objDeducciones = new Deducciones();
    private ServicioDeducciones servicioDeducciones;
    private VentanaPatrono ventanaPatrono;
    private Empleados objEmpleados;
    private ServicioEmpleado servicioEmpleado;
    private DefaultTableModel modeloTablaEmpleados;
    /**
     * Creates new form VentanaCorreo
     */
    public VentanaCorreo() {
        initComponents();
        try {
            servicioDeducciones = new LogicaDeducciones();
            servicioEmpleado = new LogicaEmpleados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        CargarEmpleados();
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
        lblAsunto = new javax.swing.JLabel();
        lblMensajePDF = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensajePDF = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        bttEnviarCorreo = new javax.swing.JButton();
        bttVolverPrincipal = new javax.swing.JButton();
        bttEnviarReportesTodosEmpleados = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCorreo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAsunto.setText("Asunto");

        lblMensajePDF.setText("Mensaje PDF");

        lblMensaje.setText("Mensaje");

        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        jScrollPane1.setViewportView(txtMensaje);

        txtMensajePDF.setColumns(20);
        txtMensajePDF.setRows(5);
        jScrollPane2.setViewportView(txtMensajePDF);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTitulo.setText("Correo");

        lblNombre.setText("Nombre");

        lblCorreo.setText("Correo");

        bttEnviarCorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttEnviarCorreo.setText("Enviar");
        bttEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEnviarCorreoActionPerformed(evt);
            }
        });

        bttVolverPrincipal.setText("Volver Atrás");
        bttVolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverPrincipalActionPerformed(evt);
            }
        });

        bttEnviarReportesTodosEmpleados.setText("Enviar a todos");
        bttEnviarReportesTodosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEnviarReportesTodosEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAsunto)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMensaje)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombre)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(lblTitulo))
                            .addComponent(lblMensajePDF))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bttEnviarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttEnviarReportesTodosEmpleados)
                        .addGap(28, 28, 28))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(bttVolverPrincipal)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(lblAsunto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMensajePDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttEnviarReportesTodosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttEnviarCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(bttVolverPrincipal)
                .addContainerGap())
        );

        tblCorreo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCorreoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCorreo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de clic en el botón "Enviar Correo".
     *
     * Este método se encarga de enviar un correo electrónico con un archivo PDF
     * adjunto. Primero, crea un objeto `LogicaEmpleados` para manejar las
     * operaciones relacionadas con los empleados. Luego, prepara los datos del
     * correo y crea el archivo PDF. Finalmente, envía el correo electrónico con
     * el PDF adjunto.
     *
     * Si ocurre algún error durante el proceso, se muestra un mensaje de error
     * al usuario.
     *
     * @param evt El evento de clic en el botón.
     */

    private void bttEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEnviarCorreoActionPerformed

        
        try {
            servicioDeducciones = new LogicaDeducciones();
        } catch (Exception e) {
        }

        /**
         * Prepara los datos necesarios para enviar el correo electrónico.
         *
         * Este método recopila la información del empleado, como el nombre,
         * correo electrónico, asunto y mensaje, y la almacena en el objeto
         * `objEmpleados`.
         *
         * @param objEmpleados El objeto empleado que contiene los datos del
         * destinatario.
         */
        datosCorreo(objDeducciones);

        
        /**
         * Inicializa el servicio de empleados y crea un PDF para enviar un
         * correo.
         *
         * Este método se encarga de: 
         * 1. Crear una instancia de la clase `LogicaEmpleados` para manejar las operaciones relacionadas con los
         * empleados. 
         * 2. Preparar los datos del correo (a través del método`datosCorreo`). 
         * 3. Crear un archivo PDF utilizando los datos delempleado. 
         * 4. Mostrar un mensaje de éxito o error al usuario según corresponda.
         *
         * **Nota:** Este método captura excepciones generales para evitar que
         * la aplicación se detenga, pero es recomendable manejar excepciones
         * más específicas para proporcionar mensajes de error más detallados.
         *
         * @param evt El evento que desencadena la ejecución de este método
         * (generalmente un evento de clic en un botón).
         */
        
        try {
            servicioDeducciones.crearPDF(objDeducciones);
            JOptionPane.showMessageDialog(null, "Se creo el PDF");

        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el PDF \n" + "Error: " + e.getMessage());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        /**
         * Procesa el envío de un correo electrónico con un archivo PDF adjunto.
         *
         * Este método realiza las siguientes acciones: 
         * 1. Prepara los datos del correo electrónico utilizando el método `datosCorreo`. 
         * 2. Intenta crear un archivo PDF utilizando el método `crearPDF`. 
         * 3. Si lacreación del PDF es exitosa, intenta enviar el correo electrónico con
         * el PDF adjunto utilizando el método `enviarCorreos`. 
         * 4. Maneja diferentes tipos de excepciones que pueden ocurrir durante el proceso
         * y muestra mensajes de error informativos al usuario.
         */
        try {
            servicioDeducciones.enviarCorreos(objDeducciones);
            JOptionPane.showMessageDialog(null, "El correo se envio de forma existosa");

        } catch (AddressException e) {
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo, al correo le falta un dominio\n" + "Error: " + e.getMessage());
        } catch (SendFailedException e) {
            JOptionPane.showMessageDialog(null, "Problemas con el servidor SMTP" + "\n Error: " + e.getMessage());
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Error al enviar a " + objDeducciones.getCorreo() + "\n error " + e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error el archivo \n" + "Error: " + e.getMessage());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya no se que paso: " + e.getMessage());

        }
    }//GEN-LAST:event_bttEnviarCorreoActionPerformed

    private void bttVolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVolverPrincipalActionPerformed
        
        ventanaPatrono = new VentanaPatrono();
        
        ventanaPatrono.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_bttVolverPrincipalActionPerformed

    private void bttEnviarReportesTodosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEnviarReportesTodosEmpleadosActionPerformed

        objDeducciones = new Deducciones();
        objEmpleados = new Empleados();
        servicioDeducciones = new LogicaDeducciones();
        

        try {
            servicioEmpleado.leerEmpleado(objEmpleados);

            for (String[] Datos : objEmpleados.getEmpleadosLista()) {

                objDeducciones.setNombre(Datos[1]);
                objDeducciones.setCorreo(Datos[3]);
                objDeducciones.setMensaje(" Hola Empleado");
                objDeducciones.setMensajePDF("Reducciones ");
                objDeducciones.setAsunto("Reporte de salario");
                
                servicioDeducciones.crearPDF(objDeducciones);
                servicioDeducciones.enviarCorreos(objDeducciones);

            }

            JOptionPane.showMessageDialog(null, "Se enviaron los reportes de forma correcta ");
        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        } catch (SendFailedException ex) {
            Logger.getLogger(VentanaPatrono.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(VentanaPatrono.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(VentanaPatrono.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_bttEnviarReportesTodosEmpleadosActionPerformed

    private void tblCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCorreoMouseClicked
        
        int fila = tblCorreo.getSelectedRow();// Obtiene la fila seleccionada en la tabla.

        // Establece los datos de la fila seleccionada en los campos de texto.
        
        txtNombre.setText(tblCorreo.getValueAt(fila, 1).toString());
        txtCorreo.setText(tblCorreo.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tblCorreoMouseClicked

    public void CargarEmpleados() {

        modeloTablaEmpleados = new DefaultTableModel();

        modeloTablaEmpleados.addColumn("ID");
        modeloTablaEmpleados.addColumn("Nombre");
        modeloTablaEmpleados.addColumn("Correo");
        modeloTablaEmpleados.addColumn("Salario Bruto");

        listarEmpleados();

    }
    
    public void listarEmpleados() {

        objEmpleados = new Empleados();

        try {
            servicioEmpleado.leerEmpleado(objEmpleados);

            for (String[] lista : objEmpleados.getEmpleadosLista()) {
                modeloTablaEmpleados.addRow(new Object[]{lista[0], lista[1], lista[3], lista[4]});
            }

        } catch (Exception e) {
        }
        tblCorreo.setModel(modeloTablaEmpleados);

    }
    
    
    /**
    * Obtiene los datos del correo electrónico a partir de los campos de texto de la interfaz y los asigna al objeto `Empleados`.
    *
    * Este método se encarga de:
    * 1. Obtener los valores de los campos de texto `txtNombre`, `txtAsunto`, `txtMensaje`, `txtMensajePDF` y `txtCorreo`.
    * 2. Asignar los valores obtenidos a las propiedades correspondientes del objeto `Empleados`.
    * 3. Capturar cualquier excepción que pueda ocurrir durante el proceso y mostrarla por consola.
    *
    * **Nota:** Es recomendable manejar las excepciones de forma más específica y proporcionar mensajes de error más informativos al usuario.
    *
    * @param objCorreo El objeto `Empleados` al que se asignarán los datos del correo.
    */
    
    public void datosCorreo(Correos objCorreo) {
        try {
            objCorreo.setNombre(txtNombre.getText());
            objCorreo.setAsunto(txtAsunto.getText());
            objCorreo.setMensaje(txtMensaje.getText());
            objCorreo.setMensajePDF(txtMensajePDF.getText());
            objCorreo.setCorreo(txtCorreo.getText());

        } catch (Exception e) {
            System.out.print(e);
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCorreo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttEnviarCorreo;
    private javax.swing.JButton bttEnviarReportesTodosEmpleados;
    private javax.swing.JButton bttVolverPrincipal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMensajePDF;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCorreo;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtMensaje;
    private javax.swing.JTextArea txtMensajePDF;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
