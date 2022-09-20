
package Vista;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.Conexion;

public class frm_estudiante extends javax.swing.JFrame {
Estudiante estudiante;
   

    public frm_estudiante() {
    
        initComponents();
        estudiante = new Estudiante();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_update = new javax.swing.JButton();
        txt_gen = new javax.swing.JTextField();
        lbl_nit = new javax.swing.JLabel();
        lbl_em = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_em = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_ape = new javax.swing.JLabel();
        txt_ape = new javax.swing.JTextField();
        lbl_direc = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        lbl_fn = new javax.swing.JLabel();
        txt_fn = new javax.swing.JTextField();
        btb_agregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Estudiante = new javax.swing.JTable();
        txt_dir = new javax.swing.JTextField();
        txt_nit = new javax.swing.JTextField();
        lbl_gen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_update.setText("actualizar");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

        lbl_nit.setText("Nit");

        lbl_em.setText("Email");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        lbl_name.setText("nombre");

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        lbl_ape.setText("apellidos");

        txt_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apeActionPerformed(evt);
            }
        });

        lbl_direc.setText("Direccion");

        lbl_id.setText("id");

        lbl_tel.setText("telefono");

        txt_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telActionPerformed(evt);
            }
        });

        lbl_fn.setText("fecha de nacimiento");

        txt_fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnActionPerformed(evt);
            }
        });

        btb_agregar.setText("agregar");
        btb_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_agregarActionPerformed(evt);
            }
        });

        jButton1.setText("Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbl_Estudiante.setBackground(new java.awt.Color(102, 102, 102));
        tbl_Estudiante.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_Estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_EstudianteMouseClicked(evt);
            }
        });
        tbl_Estudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_EstudianteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Estudiante);

        txt_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dirActionPerformed(evt);
            }
        });

        txt_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nitActionPerformed(evt);
            }
        });

        lbl_gen.setText("Genero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_name)
                                    .addComponent(lbl_ape)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_nit)
                                            .addComponent(lbl_id))
                                        .addGap(6, 6, 6))
                                    .addComponent(lbl_direc))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lbl_em, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_gen)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_tel)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txt_em, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_gen, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btb_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_fn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_update)
                            .addComponent(btb_agregar)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nit)
                            .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_ape)
                            .addComponent(txt_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_direc))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_gen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_em))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        // TODO add your handling code here
        estudiante = new Estudiante(Integer.parseInt(lbl_id.getText()),txt_nit.getText(),txt_name.getText(),txt_ape.getText(),txt_dir.getText(),txt_tel.getText(),txt_gen.getText(),txt_em.getText(),txt_fn.getText());
        estudiante.modificar();
        tbl_Estudiante.setModel(estudiante.leer());
    }//GEN-LAST:event_bt_updateActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apeActionPerformed

    private void txt_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telActionPerformed

    private void txt_fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnActionPerformed

    private void btb_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_agregarActionPerformed

        estudiante = new Estudiante(0,txt_id.getText(),txt_name.getText(),txt_ape.getText(),txt_dir.getText(),txt_tel.getText(),txt_gen.getText(),txt_em.getText(),txt_fn.getText());
        estudiante.agregar();
        tbl_Estudiante.setModel(estudiante.leer());
    }//GEN-LAST:event_btb_agregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Conexion cn = new Conexion();
        cn.Conectar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_EstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_EstudianteMouseClicked
        // cuando se de click en la celda se igualen los campos de la tabla
        selec_datos();
    }//GEN-LAST:event_tbl_EstudianteMouseClicked

    private void tbl_EstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_EstudianteKeyReleased
        // lo mismo que el click pero con el teclado xdxdxd
        selec_datos();
    }//GEN-LAST:event_tbl_EstudianteKeyReleased

    private void txt_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dirActionPerformed

    private void txt_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nitActionPerformed

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
            java.util.logging.Logger.getLogger(frm_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_update;
    private javax.swing.JButton btb_agregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ape;
    private javax.swing.JLabel lbl_direc;
    private javax.swing.JLabel lbl_em;
    private javax.swing.JLabel lbl_fn;
    private javax.swing.JLabel lbl_gen;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JTable tbl_Estudiante;
    private javax.swing.JTextField txt_ape;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_em;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_gen;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables

    private void selec_datos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
