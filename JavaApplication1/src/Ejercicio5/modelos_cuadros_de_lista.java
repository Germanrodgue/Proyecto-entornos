/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;

/**
 *
 * @author sonfil
 */
public class modelos_cuadros_de_lista extends javax.swing.JFrame {

    /**
     * Creates new form modelos_cuadros_de_lista
     */
    public modelos_cuadros_de_lista() {
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

        etiResultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNombres = new javax.swing.JList<>();
        btnCurso1 = new javax.swing.JButton();
        btnCurso2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiResultadoActionPerformed(evt);
            }
        });

        lstNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstNombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstNombres);

        btnCurso1.setText("Curso 1");
        btnCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso1ActionPerformed(evt);
            }
        });

        btnCurso2.setText("Curso 2");
        btnCurso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCurso1)
                    .addComponent(btnCurso2))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnCurso1)
                .addGap(27, 27, 27)
                .addComponent(btnCurso2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso1ActionPerformed
      DefaultListModel modelo = new DefaultListModel();

        modelo.addElement("Juan");
        modelo.addElement("María");
        modelo.addElement("Luis");

        lstNombres.setModel(modelo);
    }//GEN-LAST:event_btnCurso1ActionPerformed

    private void btnCurso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso2ActionPerformed
       DefaultListModel modelo = new DefaultListModel();

        modelo.addElement("Ana");
        modelo.addElement("Marta");
        modelo.addElement("Jose");

        lstNombres.setModel(modelo);
    }//GEN-LAST:event_btnCurso2ActionPerformed

    private void etiResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiResultadoActionPerformed
    
    }//GEN-LAST:event_etiResultadoActionPerformed

    private void lstNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNombresMouseClicked
           etiResultado.setText(lstNombres.getSelectedValue());
    }//GEN-LAST:event_lstNombresMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modelos_cuadros_de_lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurso1;
    private javax.swing.JButton btnCurso2;
    private javax.swing.JTextField etiResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNombres;
    // End of variables declaration//GEN-END:variables
}
