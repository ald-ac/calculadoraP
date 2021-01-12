package calculadora;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;

public class CalculadoraP extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public CalculadoraP() {
        initComponents();
        setLocationRelativeTo(null); //Centrar al arrancar calculadora
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoSW2.png")).getImage()); //Establecer icono del paneñ
    }
    
    //Metodos necesarios personales
    public void agregarTermino(String termino) {
        txtOperaciones.setText(txtOperaciones.getText() + termino);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtResultados = new javax.swing.JLabel();
        txtOperaciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculadoraP");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn0.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn0.setText("0");
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 50));

        btnD.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btnD.setForeground(new java.awt.Color(255, 255, 255));
        btnD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOp.png"))); // NOI18N
        btnD.setText("/");
        btnD.setFocusPainted(false);
        btnD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpFocus.png"))); // NOI18N
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jPanel1.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, 50));

        btnI.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btnI.setForeground(new java.awt.Color(255, 255, 255));
        btnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonIgual.png"))); // NOI18N
        btnI.setText("=");
        btnI.setFocusPainted(false);
        btnI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnI.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonIgualFocus.png"))); // NOI18N
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        jPanel1.add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 70, 50));

        btn1.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn1.setText("1");
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        btn2.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn2.setText("2");
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 50));

        btn3.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn3.setText("3");
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 50));

        btn4.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn4.setText("4");
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 70, 50));

        btn5.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn5.setText("5");
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, 50));

        btn6.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn6.setText("6");
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 70, 50));

        btn7.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn7.setText("7");
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 70, 50));

        btn8.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn8.setText("8");
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 70, 50));

        btn9.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNum.png"))); // NOI18N
        btn9.setText("9");
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNumFocus.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 70, 50));

        btnMul.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btnMul.setForeground(new java.awt.Color(255, 255, 255));
        btnMul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOp.png"))); // NOI18N
        btnMul.setText("*");
        btnMul.setFocusPainted(false);
        btnMul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMul.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpFocus.png"))); // NOI18N
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });
        jPanel1.add(btnMul, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 50));

        btnMenos.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOp.png"))); // NOI18N
        btnMenos.setText("-");
        btnMenos.setFocusPainted(false);
        btnMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpFocus.png"))); // NOI18N
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 70, 50));

        btnS.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btnS.setForeground(new java.awt.Color(255, 255, 255));
        btnS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOp.png"))); // NOI18N
        btnS.setText("+");
        btnS.setFocusPainted(false);
        btnS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpFocus.png"))); // NOI18N
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        jPanel1.add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 50));

        btnC.setFont(new java.awt.Font("RobotoLight", 1, 18)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOp.png"))); // NOI18N
        btnC.setText("C");
        btnC.setFocusPainted(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpFocus.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 280, 200));

        jPanel2.setBackground(new java.awt.Color(22, 26, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultados.setFont(new java.awt.Font("RobotoLight", 1, 36)); // NOI18N
        txtResultados.setForeground(new java.awt.Color(255, 255, 255));
        txtResultados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(txtResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, -1));

        txtOperaciones.setFont(new java.awt.Font("RobotoLight", 1, 24)); // NOI18N
        txtOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        txtOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(txtOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        agregarTermino("/");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        try {
            String res = se.eval(txtOperaciones.getText()).toString(); //Usar moto de JS para evaluar lo contenido en el panel
            txtResultados.setText(res); //Mandarlo al panel resultado
        } catch (ScriptException ex) {
            txtResultados.setText("¡ERROR!");
        }
    }//GEN-LAST:event_btnIActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        agregarTermino("*");
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        agregarTermino("-");
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        agregarTermino("+");
    }//GEN-LAST:event_btnSActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtOperaciones.setText("");
        txtResultados.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        agregarTermino("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        agregarTermino("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        agregarTermino("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        agregarTermino("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        agregarTermino("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        agregarTermino("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        agregarTermino("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        agregarTermino("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        agregarTermino("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        agregarTermino("0");
    }//GEN-LAST:event_btn0ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperaciones;
    private javax.swing.JLabel txtResultados;
    // End of variables declaration//GEN-END:variables
}
