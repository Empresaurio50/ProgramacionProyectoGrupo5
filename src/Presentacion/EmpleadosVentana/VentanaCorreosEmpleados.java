/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.EmpleadosVentana;

import LogicaNegocio.LogicaDeducciones;
import Servicios.ServicioDeducciones;
import Entidades.Correos;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.AddressException;
import javax.swing.JOptionPane;
import Entidades.Deducciones;
import Exepciones.CustomException;

/**
 *
 * @author Empresaurio50
 */
public class VentanaCorreosEmpleados extends javax.swing.JFrame {

    private ServicioDeducciones servicioDeducciones;
    private Deducciones objDeducciones = new Deducciones();
    private VentanaEmpleado ventanaEmpleado;

     /**
     * Creates new form VentanaCorreosEmpleados
     */
    public VentanaCorreosEmpleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensajePDF = new javax.swing.JTextArea();
        lblAsunto = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMensajePDF = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblSalarioBruto = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        txtSalarioBruto = new javax.swing.JTextField();
        bttEnviarCorreo = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        bttVolverPrincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 91, 120, -1));

        txtMensajePDF.setColumns(20);
        txtMensajePDF.setRows(5);
        jScrollPane2.setViewportView(txtMensajePDF);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 215, 268, -1));

        lblAsunto.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblAsunto.setText("Asunto");
        jPanel1.add(lblAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 131, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblCorreo.setText("Correo");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 131, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lblTitulo.setText("Correo");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        lblMensajePDF.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblMensajePDF.setText("Mensaje PDF");
        jPanel1.add(lblMensajePDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 193, -1, -1));

        lblNombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 69, -1, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 153, 120, -1));

        lblSalarioBruto.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblSalarioBruto.setText("Salario Bruto");
        jPanel1.add(lblSalarioBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 69, -1, -1));
        jPanel1.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 153, 130, -1));
        jPanel1.add(txtSalarioBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 91, 130, -1));

        bttEnviarCorreo.setBackground(new java.awt.Color(252, 252, 252));
        bttEnviarCorreo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttEnviarCorreo.setText("Enviar");
        bttEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEnviarCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(bttEnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 101, -1));

        lblMensaje.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblMensaje.setText("Mensaje");
        jPanel1.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 319, -1, -1));

        bttVolverPrincipal.setBackground(new java.awt.Color(252, 252, 252));
        bttVolverPrincipal.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        bttVolverPrincipal.setText("Volver Atrás");
        bttVolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(bttVolverPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 126, 36));

        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        jScrollPane1.setViewportView(txtMensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 341, 268, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prueba 2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /** 
     * Establece los datos del objeto Correo. *
     * Este método toma los datos ingresados en los campos de texto y los establece 
     * en el objeto Correo proporcionado. 
     * @param objCorreo El objeto Correo que se va a actualizar con los datos ingresados. 
     */
    public void datosCorreo(Correos objCorreo) {
        try {
            // Establece el nombre del remitente.
            objCorreo.setNombre(txtNombre.getText());
            // Establece el asunto del correo.
            objCorreo.setAsunto(txtAsunto.getText());
            // Establece el mensaje del correo.
            objCorreo.setMensaje(txtMensaje.getText());
            // Establece el mensaje en formato PDF del correo.
            objCorreo.setMensajePDF(txtMensajePDF.getText());
            // Establece el correo electrónico del destinatario.
            objCorreo.setCorreo(txtCorreo.getText());
            
            objCorreo.setSalarioBruto(Double.parseDouble(txtSalarioBruto.getText()));

        } catch (Exception e) {
            System.out.print(e);
        }
    }

    /** 
     * Acción a realizar cuando se pulsa el botón de enviar correo. 
     * Este método se encarga de preparar y enviar un correo electrónico con un archivo PDF adjunto. 
     * @param evt El evento de acción que disparó este método. 
     */
    private void bttEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEnviarCorreoActionPerformed

        try {
            servicioDeducciones = new LogicaDeducciones();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
         * Este método se encarga de: 1. Crear una instancia de la clase
         * `LogicaEmpleados` para manejar las operaciones relacionadas con los
         * empleados. 2. Preparar los datos del correo (a través del
         * método`datosCorreo`). 3. Crear un archivo PDF utilizando los datos
         * delempleado. 4. Mostrar un mensaje de éxito o error al usuario según
         * corresponda.
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

        }catch(CustomException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            
            
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"No ingresó un número válido. Solo se permiten números en el apartado salario bruto.");
        }
        catch (DocumentException | FileNotFoundException e) {
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
         * 3. Si lacreación del PDF es exitosa, intenta enviar el correo electrónico
         * con el PDF adjunto utilizando el método `enviarCorreos`. 
         * 4. Maneja diferentes tipos de excepciones que pueden ocurrir durante el proceso
         * y muestra mensajes de error informativos al usuario.
         */
        try {
            servicioDeducciones.enviarCorreos(objDeducciones);
            JOptionPane.showMessageDialog(null, "El correo se envio de forma existosa");

        }catch(CustomException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        catch (AddressException e) {
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

    /** 
     * Acción a realizar cuando se pulsa el botón de volver al principal. 
     * Este método se encarga de crear y mostrar la ventana de empleado, 
     * y ocultar la ventana actual. *
     * @param evt El evento de acción que disparó este método. 
     */
    private void bttVolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVolverPrincipalActionPerformed

        ventanaEmpleado = new VentanaEmpleado();// Crea una nueva instancia de la ventana de empleado.
        ventanaEmpleado.setVisible(true);// Hace visible la ventana de empleado.
        ventanaEmpleado.setLocationRelativeTo(null);// Centra la ventana de empleado en la pantalla.
        
        this.setVisible(false);// Oculta la ventana actual.

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
            java.util.logging.Logger.getLogger(VentanaCorreosEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCorreosEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCorreosEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCorreosEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCorreosEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttEnviarCorreo;
    private javax.swing.JButton bttVolverPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMensajePDF;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalarioBruto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtMensaje;
    private javax.swing.JTextArea txtMensajePDF;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalarioBruto;
    // End of variables declaration//GEN-END:variables
}
