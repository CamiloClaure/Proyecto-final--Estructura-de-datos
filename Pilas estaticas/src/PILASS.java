
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jaque
 */
public class PILASS extends javax.swing.JFrame {
 JFileChooser seleccionado=new JFileChooser();
  File archivo;
  Crearr ges=new Crearr();
    int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño"));
    PILALINEAL pilita = new PILALINEAL(tamaño);

    public PILASS() {
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

        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd5 = new javax.swing.JRadioButton();
        rd6 = new javax.swing.JRadioButton();
        rd7 = new javax.swing.JRadioButton();
        rd8 = new javax.swing.JRadioButton();
        rd12 = new javax.swing.JRadioButton();
        txt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        buttonGroup1.add(rd1);
        rd1.setText("Esta llena?");
        rd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd1MouseClicked(evt);
            }
        });
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd2);
        rd2.setText("Esta vacia?");
        rd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd2MouseClicked(evt);
            }
        });
        rd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd3);
        rd3.setText("Tamaño de la pila");
        rd3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd3MouseClicked(evt);
            }
        });
        rd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd5);
        rd5.setText("Pop");
        rd5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd5MouseClicked(evt);
            }
        });
        rd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd6);
        rd6.setText("Limpiar");
        rd6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd6MouseClicked(evt);
            }
        });
        rd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd7);
        rd7.setText("Cima");
        rd7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd7MouseClicked(evt);
            }
        });

        buttonGroup1.add(rd8);
        rd8.setText("Mostrar");
        rd8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd8MouseClicked(evt);
            }
        });
        rd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd12);
        rd12.setText("Buscar elemento");
        rd12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd12MouseClicked(evt);
            }
        });
        rd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rd2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd1)
                            .addComponent(rd3)
                            .addComponent(rd5)
                            .addComponent(rd6)
                            .addComponent(rd7)
                            .addComponent(rd12)
                            .addComponent(rd8))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rd2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rd12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Ingrese los valores para la Pila");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Salir");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aritmeticas");

        jMenuItem5.setText("Ir...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Caracteres");

        jMenuItem7.setText("Palindrome");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txt1.getText().equals("")) {
            try {
                int dato;
                if (!pilita.estaLlena()) {

                    dato = Integer.parseInt(txt1.getText());

                    pilita.empujar(dato);
                } else {

                    JOptionPane.showMessageDialog(null, "Pila llena");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error de datos" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese valores");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd2MouseClicked

        if (pilita.vacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            JOptionPane.showMessageDialog(null, "La lista no esta vacia ");
        }
    }//GEN-LAST:event_rd2MouseClicked

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd1ActionPerformed

    private void rd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd1MouseClicked
        if (!pilita.vacia()) {
            JOptionPane.showMessageDialog(null, "Esta llena");
        } else {
            JOptionPane.showMessageDialog(null, "Esta  vacia");
        }
    }//GEN-LAST:event_rd1MouseClicked

    private void rd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd3ActionPerformed

    }//GEN-LAST:event_rd3ActionPerformed

    private void rd3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd3MouseClicked
        JOptionPane.showMessageDialog(null, "el tamaño de la pila " + pilita.tamaño(), "Obteniendo tamaño", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rd3MouseClicked

    private void rd5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd5MouseClicked

        if (!pilita.vacia()) {

            JOptionPane.showMessageDialog(null, "elemento obtenido es " + pilita.sacar(), "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }

    }//GEN-LAST:event_rd5MouseClicked

    private void rd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd6ActionPerformed

    private void rd6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd6MouseClicked
        while (!pilita.vacia()) {
            pilita.limpiar();
            JOptionPane.showMessageDialog(null, "la pila se ha vaciado",
                    "Vaciando la pila", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }


    }//GEN-LAST:event_rd6MouseClicked
    public void limpiar() {
        txtarea.setText("");

    }
    private void rd8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd8MouseClicked

        if (!pilita.vacia()) {
            for (int a = pilita.vectorPila.length - 1; a >= 0; a--) {
                txtarea.append("=>" + pilita.vectorPila[a] + "\n");
            }
        } else {
            System.out.println("Pila vacia");
        }


    }//GEN-LAST:event_rd8MouseClicked

    private void rd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd5ActionPerformed

    private void rd7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd7MouseClicked
        if (!pilita.vacia()) {
            JOptionPane.showMessageDialog(null, "El elemento se encuetra en la cima es" + pilita.cimaPila(), "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "pila vacia");
        }
    }//GEN-LAST:event_rd7MouseClicked

    private void rd12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd12MouseClicked
        if (!pilita.vacia()) {
            int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato a buscar"));
            if (pilita.Buscar(dato)) {
                JOptionPane.showMessageDialog(null, "Dato encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Dato no encontrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta vacia la pila");
        }

    }//GEN-LAST:event_rd12MouseClicked

    private void rd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       Aritmeticas e=new Aritmeticas();
       e.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       PILACARAC de=new PILACARAC();
       de.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(seleccionado.showDialog(this,"Abrir archivo")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                String contenido=txtarea.getText();
                if(!contenido.equals("")){
                    String respuesta=ges.GuardarA(archivo, contenido);

                    if(respuesta!=null){
                        JOptionPane.showMessageDialog(null, respuesta);
                    }else{
                        JOptionPane.showMessageDialog(null,"Error al guardar archivo texto");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"El texto se debe guardar");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       if(seleccionado.showDialog(this,"Abrir archivo")==JFileChooser.APPROVE_OPTION){
       archivo=seleccionado.getSelectedFile();
       if(archivo.canRead()){
         if(archivo.getName().endsWith("txt")){
         String contenido=ges.AbrirArchivso(archivo);
         txtarea.setText(contenido);
         }
         
        
       }
    
       }else{
       JOptionPane.showMessageDialog(null,"Error 2");
       }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void rd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd12ActionPerformed

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
            java.util.logging.Logger.getLogger(PILASS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PILASS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PILASS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PILASS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PILASS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd12;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JRadioButton rd5;
    private javax.swing.JRadioButton rd6;
    private javax.swing.JRadioButton rd7;
    private javax.swing.JRadioButton rd8;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
