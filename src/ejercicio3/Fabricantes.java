/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mikel
 * @version 1.0 beta
 * 
 */
public class Fabricantes extends javax.swing.JFrame {

     /**
      * Variable que guarda la consulta
      */
    
    static public ResultSet r;

    /**
     * método constructor de la sección Fabricantes
     * @throws SQLException excepción que proporciona información sobre los errores en la conexión a la BD
     */
    
    public Fabricantes() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        cancelar.setVisible(false);
        guardar.setVisible(false);
         String url = "jdbc:mysql://localhost:3306/entornos";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url,user,pass);
        
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String query = "select * from fabricantes";
        r = s.executeQuery(query);
        r.first();
        cod_fabricante.setText(r.getString("cod_fabricante"));
        name.setText(r.getString("nombre"));
        country.setText(r.getString("pais"));
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cod_fab = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        cod_fabricante = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        first = new javax.swing.JButton();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        last = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cod_fab.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cod_fab.setText("Cod_Fabricante");

        nombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nombre.setText("Nombre");

        pais.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pais.setText("Pais");

        cod_fabricante.setEditable(false);
        cod_fabricante.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cod_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_fabricanteActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        country.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        first.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        first.setText("Primero");
        first.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        next.setText("Siguiente");
        next.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        previous.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        previous.setText("Anterior");
        previous.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        last.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        last.setText("Último");
        last.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        nuevo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        editar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        editar.setText("Editar");
        editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 0)));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        inicio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        inicio.setText("Inicio");
        inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        delete.setText("Eliminar");
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel9.setText("FABRICANTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(cod_fab))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre)
                                    .addComponent(pais))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(country)
                                    .addComponent(cod_fabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cod_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cod_fab))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre)
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cod_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_fabricanteActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        try {
            r.first();
            cod_fabricante.setText(r.getString("cod_fabricante"));
            name.setText(r.getString("nombre"));
            country.setText(r.getString("pais"));
            
            
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_firstActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        try {
            r.last();
            cod_fabricante.setText(r.getString("cod_fabricante"));
            name.setText(r.getString("nombre"));
            country.setText(r.getString("pais"));
            
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lastActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try {
            if(r.next()){
                cod_fabricante.setText(r.getString("cod_fabricante"));
                name.setText(r.getString("nombre"));
                country.setText(r.getString("pais"));
            }
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        try {
            if(r.previous()){
                cod_fabricante.setText(r.getString("cod_fabricante"));
                name.setText(r.getString("nombre"));
                country.setText(r.getString("pais"));
            }
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_previousActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

       try {
        String Vcodfabri, Vnamefabri, Vpais;
        Vcodfabri= cod_fabricante.getText();
        Vnamefabri = name.getText();
        Vpais = country.getText();
        String url = "jdbc:mysql://localhost:3306/entornos";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url,user,pass);
        Statement s = connection.createStatement();
        String query = "update fabricantes set NOMBRE='" + Vnamefabri + "',  PAIS='" + Vpais + "' WHERE COD_FABRICANTE='" + Vcodfabri + "'";
        int resultado = s.executeUpdate(query);
        r.refreshRow();
    }
    catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_editarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        
        first.setVisible(false);
        next.setVisible(false);
        previous.setVisible(false);
        last.setVisible(false);
        editar.setVisible(false);
        nuevo.setVisible(false);
        cancelar.setVisible(true);
        guardar.setVisible(true);
        cod_fabricante.setEditable(true);
        cod_fabricante.setText("");
        name.setText("");
        country.setText("");
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        
        try {
        String Vcodfabri, Vnamefabri, Vpais;
        Vcodfabri= cod_fabricante.getText();
        Vnamefabri = name.getText();
        Vpais = country.getText();
        String url = "jdbc:mysql://localhost:3306/entornos";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url,user,pass);
        
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String query = "insert fabricantes values ('" + Vcodfabri + "','" + Vnamefabri + "','" + Vpais + "')";
        int resultado = s.executeUpdate(query);
    
        String query2 = "select * from fabricantes";
        r = s.executeQuery(query2);
        r.first();
        cod_fabricante.setText(r.getString("cod_fabricante"));
        name.setText(r.getString("nombre"));
        country.setText(r.getString("pais"));
        first.setVisible(true);
        next.setVisible(true);
        previous.setVisible(true);
        last.setVisible(true);
        editar.setVisible(true);
        nuevo.setVisible(true);
        cancelar.setVisible(false);
        guardar.setVisible(false);
        }
        catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        first.setVisible(true);
        next.setVisible(true);
        previous.setVisible(true);
        last.setVisible(true);
        editar.setVisible(true);
        nuevo.setVisible(true);
        cancelar.setVisible(false);
        guardar.setVisible(false);
        try {
            r.first();
            cod_fabricante.setText(r.getString("cod_fabricante"));
            name.setText(r.getString("nombre"));
            country.setText(r.getString("pais"));
            cod_fabricante.setEditable(false);
         } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);}
        
        
    }//GEN-LAST:event_cancelarActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
        
        menu fabri = new menu();
        fabri.setLocationRelativeTo (null);
        this.setVisible(false);
        fabri.setVisible(true);
        
    }//GEN-LAST:event_inicioActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
         try {
        String Vcodfabri;
         Vcodfabri= cod_fabricante.getText();

        String url = "jdbc:mysql://localhost:3306/entornos";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url,user,pass);
        
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String query = "delete from fabricantes where cod_fabricante=" +Vcodfabri;
        int resultado = s.executeUpdate(query);
    
        String query2 = "select * from fabricantes";
        r = s.executeQuery(query2);
        r.first();
        cod_fabricante.setText(r.getString("cod_fabricante"));
        name.setText(r.getString("nombre"));
        country.setText(r.getString("pais"));
        
        first.setVisible(true);
        next.setVisible(true);
        previous.setVisible(true);
        last.setVisible(true);
        editar.setVisible(true);
        nuevo.setVisible(true);
        cancelar.setVisible(false);
        guardar.setVisible(false);

     
     }catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Fabricantes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel cod_fab;
    private javax.swing.JTextField cod_fabricante;
    private javax.swing.JTextField country;
    private javax.swing.JButton delete;
    private javax.swing.JButton editar;
    private javax.swing.JButton first;
    private javax.swing.JButton guardar;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton last;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JLabel pais;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
