package Presentacion.EmpleadosVentana;

import Entidades.Empleados;
import LogicaNegocio.LogicaEmpleados;
import javax.swing.table.DefaultTableModel;
import Servicios.ServicioEmpleado;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Empresaurio50
 */
public class VentanaMirarPlantilla extends javax.swing.JFrame {
    
    private ServicioEmpleado servicioEmpleado;
    private DefaultTableModel modeloTablaEmpleados = new DefaultTableModel();
    private Empleados objEmpleados = new Empleados();
    private VentanaEmpleado ventanaEmpleado;

    /**
     * Creates new form VentanaMirarPlantilla
     */
    public VentanaMirarPlantilla() {
        try {
            servicioEmpleado = new LogicaEmpleados();
            
        } catch (IOException ex) {
            Logger.getLogger(VentanaMirarPlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleadosTabla = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        bttAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmpleadosTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpleadosTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleadosTabla);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Hola Empleado");

        bttAtras.setText("Atrás");
        bttAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(bttAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(bttAtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmpleadosTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosTablaMouseClicked
        

    }//GEN-LAST:event_tblEmpleadosTablaMouseClicked

    private void bttAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAtrasActionPerformed
        
        ventanaEmpleado = new VentanaEmpleado();
        ventanaEmpleado.setVisible(true);
        ventanaEmpleado.setLocationRelativeTo(null);
        
        this.setVisible(false);
        

    }//GEN-LAST:event_bttAtrasActionPerformed
    /**
     * Carga los empleados en el modelo de la tabla. 
     * Este método inicializa el modelo de la tabla de empleados, añade las columnas necesarias 
     * (ID, Nombre, Correo) y luego llama al método `listarEmpleados` para llenar la tabla con los datos. 
     */
    public void CargarEmpleados() {
        
        modeloTablaEmpleados = new DefaultTableModel();// Inicializa el modelo de la tabla.
        
        modeloTablaEmpleados.addColumn("ID"); // Añade la columna "ID".
        modeloTablaEmpleados.addColumn("Nombre"); // Añade la columna "Nombre".
        modeloTablaEmpleados.addColumn("Correo"); // Añade la columna "Correo".
        
        listarEmpleados(); // Llama al método para listar los empleados en la tabla.
        
    }

    
    /** 
     * Lista los empleados y los carga en el modelo de la tabla.
     * Este método crea una instancia de `Empleados`, lee los datos de los empleados 
     * usando el servicio de empleados y los añade al modelo de la tabla.
     * @throws IOException Si ocurre un error durante la lectura de los empleados.
     */
    public void listarEmpleados() {
        
        objEmpleados = new Empleados(); // Crea una nueva instancia de Empleados.
        
        try {
            servicioEmpleado.leerEmpleado(objEmpleados); // Lee los datos de los empleados.
            
            // Añade cada empleado al modelo de la tabla.
            for (String[] lista : objEmpleados.getEmpleadosLista()) {
                modeloTablaEmpleados.addRow(new Object[]{lista[0], lista[1], lista[3]});
            }
            
        } catch (IOException e) {
            // Maneja cualquier excepción de E/S que ocurra durante la lectura.
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tblEmpleadosTabla.setModel(modeloTablaEmpleados);
        
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
            java.util.logging.Logger.getLogger(VentanaMirarPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMirarPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMirarPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMirarPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMirarPlantilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAtras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblEmpleadosTabla;
    // End of variables declaration//GEN-END:variables

}
