
package GUI;

import articulos.articulos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import metodos.metodos;

/**
 *
 * @author Ssaid
 */
public class NewJFrame extends javax.swing.JFrame {

    articulos articulos = new articulos();
    metodos metodos = new metodos();
    DefaultTableModel mdlTabla;
    Vector vCabeceras = new Vector();
    
    public NewJFrame() {
        initComponents();
     vCabeceras.addElement("ID");
     vCabeceras.addElement("NOMBRE");
     vCabeceras.addElement("MAX");
     vCabeceras.addElement("MIN");
     vCabeceras.addElement("STOCK");
     mdlTabla = new DefaultTableModel(vCabeceras,0);
     jTable1.setModel(mdlTabla); 
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf1 = new javax.swing.JTextField();
        jtf2 = new javax.swing.JTextField();
        jtf3 = new javax.swing.JTextField();
        jtf4 = new javax.swing.JTextField();
        jtf5 = new javax.swing.JTextField();
        jcb1 = new javax.swing.JComboBox<>();
        jbt1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID del artículo");

        jLabel2.setText("Nombre del artículo");

        jLabel3.setText("Cantidad máxima del artículo");

        jLabel4.setText("Cantidad mínima del artículo");

        jLabel5.setText("Stock del artículo");

        jLabel6.setText("Proveedores");

        jtf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf3ActionPerformed(evt);
            }
        });

        jcb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb1ActionPerformed(evt);
            }
        });

        jbt1.setText("Dar de alta");
        jbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Mostrar artículos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf1)
                            .addComponent(jtf2)
                            .addComponent(jtf3)
                            .addComponent(jtf4)
                            .addComponent(jtf5)
                            .addComponent(jcb1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jbt1)
                        .addGap(93, 93, 93)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbt1)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf3ActionPerformed

    private void jcb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb1ActionPerformed
    
    }//GEN-LAST:event_jcb1ActionPerformed

    private void jbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt1ActionPerformed
       int siono = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres dar de alta el registro?");
       
        if(siono == 0){
        int id = Integer.parseInt(jtf1.getText());
        String nombre = jtf2.getText();
         int max = Integer.parseInt(jtf3.getText());
          int min = Integer.parseInt(jtf4.getText());
           int stock = Integer.parseInt(jtf5.getText());
           
        articulos.setId(id);
        articulos.setNombre(nombre);
        articulos.setMax(max);
        articulos.setMin(min);
        articulos.setStock(stock);
        
        metodos.guardar(articulos);
        metodos.guardarArchivo(articulos);
        
        jtf1.setText("");
        jtf2.setText("");
        jtf3.setText("");
        jtf4.setText("");
        jtf5.setText("");
       jtf1.setEnabled(true);
        jtf2.setEnabled(true);
        jtf3.setEnabled(true);
        jtf4.setEnabled(true);
        jtf5.setEnabled(true);
        }
       
        
    }//GEN-LAST:event_jbt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setModel(metodos.listaArticulos());
    }//GEN-LAST:event_jButton1ActionPerformed
    public int contador1 = 0;
    public int contador2 = 0;
    public int contador3 = 0;
    public int contador4 = 0;
    public int contador5 = 0;
    public int contador6 = 0;

    public static boolean validarDosNumeros(String datos) {
        //CASO NUMEROS
        return datos.matches("[0-9]{1,2}");//para poner mas numero de digitos por ejemplo 111, son 3, entonce pondremos ("[0-9](1,3)")
    }

    public static boolean validarTresNumeros(String datos) {
        //CASO NUMEROS
        return datos.matches("[0-9]{1,3}");//para poner mas numero de digitos por ejemplo 111, son 3, entonce pondremos ("[0-9](1,3)")
    }

    public static boolean validarLetras(String datos) {
        //CASO LETRAS
        return datos.matches("[a-zA-Z]{1,40}");//para poner n numero de digitos poner *
    }

    public void Id_art() {
        if (!validarDosNumeros(jtf1.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL ID NO SON CORRECTOS\nPOR FAVOR INTENTE DE NUEVO");
            jtf1.setText(" ");
        } else {
            while (contador1 < 1) {
                JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL ID SON CORRECTOS");
                contador1++;
            }
        }
    }

    public void Nom_art() {
        if (!validarLetras(jtf2.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL NOMBRE NO SON CORRECTOS\nPOR FAVOR INTENTE DE NUEVO");
            jtf2.setText(" ");
        } else {
            while (contador2 < 1) {
                JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL NOMBRE SON CORRECTOS");
                contador2++;
            }
        }

    }
    
    public void Max_art() {
        if (!validarTresNumeros(jtf3.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL MAXIMO DE ARTICULOS NO SON CORRECTOS\nPOR FAVOR INTENTE DE NUEVO");
            jtf3.setText(" ");
        } else {
            while (contador3 < 1) {
                JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL MAXIMO DE ARTICULOS SON CORRECTOS");
                contador3++;
            }
        }
    }
    
    public void Min_art() {
        if (!validarTresNumeros(jtf4.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL MINIMO DE ARTICULOS NO SON CORRECTOS\nPOR FAVOR INTENTE DE NUEVO");
            jtf4.setText(" ");
        } else {
            while (contador4 < 1) {
                JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL MINIMO DE ARTICULOS SON CORRECTOS");
                contador4++;
            }
        }
    }
    
    public void Stk_art() {
        if (!validarTresNumeros(jtf5.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL STOCK NO SON CORRECTOS\nPOR FAVOR INTENTE DE NUEVO");
            jtf5.setText(" ");
        } else {
            while (contador5 < 1) {
                JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL STOCK SON CORRECTOS");
                contador5++;
            }
        }
    }
    
//    public void Prov_art() {
//        if (!validarDosNumeros(jtf6.getText().trim())) {
//            JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL PROVEDOR NO SON CORRECTOS\nPOR FAVOR INTENTE DE NUEVO");
//            jtf6.setText(" ");
//        } else {
//            while (contador6 < 1) {
//                JOptionPane.showMessageDialog(rootPane, "LOS DATOS DEL PROVEDOR SON CORRECTOS");
//                contador6++;
//            }
//        }
//    }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbt1;
    private javax.swing.JComboBox<String> jcb1;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf3;
    private javax.swing.JTextField jtf4;
    private javax.swing.JTextField jtf5;
    // End of variables declaration//GEN-END:variables
}
