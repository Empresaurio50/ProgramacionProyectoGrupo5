/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Entidades.Empleados;
import LogicaNegocio.LogicaEmpleados;
import Servicios.ServicioEmpleado;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.AddressException;
import javax.swing.JOptionPane;

/**
 *
 * @author Empresaurio50
 */
public class VentanaCorreo extends javax.swing.JFrame {

    private Empleados objEmpleados = new Empleados();
    private ServicioEmpleado objServicioEmpleado;

    /**
     * Creates new form VentanaCorreo
     */
    public VentanaCorreo() {
        initComponents();
        try {
            objServicioEmpleado = new LogicaEmpleados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMensaje)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAsunto)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombre)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bttEnviarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensajePDF)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(lblTitulo)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblMensajePDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttEnviarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            objServicioEmpleado = new LogicaEmpleados();
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
        datosCorreo(objEmpleados);

        
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
            objServicioEmpleado.crearPDF(objEmpleados);
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
            objServicioEmpleado.enviarCorreos(objEmpleados);
            JOptionPane.showMessageDialog(null, "El correo se envio de forma existosa");

        } catch (AddressException e) {
            JOptionPane.showMessageDialog(null, "No se pudo enviar el correo, al correo le falta un dominio\n" + "Error: " + e.getMessage());
        } catch (SendFailedException e) {
            JOptionPane.showMessageDialog(null, "Problemas con el servidor SMTP" + "\n Error: " + e.getMessage());
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Error al enviar a " + objEmpleados.getCorreo() + "\n error " + e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error el archivo \n" + "Error: " + e.getMessage());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya no se que paso: " + e.getMessage());

        }
    }//GEN-LAST:event_bttEnviarCorreoActionPerformed

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
    * @param objEmpleados El objeto `Empleados` al que se asignarán los datos del correo.
    */
    
    public void datosCorreo(Empleados objEmpleados) {
        try {
            objEmpleados.setNombre(txtNombre.getText());
            objEmpleados.setAsunto(txtAsunto.getText());
            objEmpleados.setMensaje(txtMensaje.getText());
            objEmpleados.setMensajePDF(txtMensajePDF.getText());
            objEmpleados.setCorreo(txtCorreo.getText());

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMensajePDF;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtMensaje;
    private javax.swing.JTextArea txtMensajePDF;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
