/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author nicolle
 */
public class frm_calculadora extends javax.swing.JFrame {
    private float a = 0, b = 0;
    private char operando;
    private Historial historial;
    private Manual_de_usuario manual_usuario;
    /**
     * Creates new form frm_calculadora
     */
    public frm_calculadora() {
        initComponents();
        historial = new Historial();
        manual_usuario = new Manual_de_usuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_uno = new javax.swing.JButton();
        txt_cuatro = new javax.swing.JButton();
        txt_cinco = new javax.swing.JButton();
        txt_siete = new javax.swing.JButton();
        txt_cero = new javax.swing.JButton();
        txt_ocho = new javax.swing.JButton();
        txt_punto = new javax.swing.JButton();
        txt_igual = new javax.swing.JButton();
        txt_nueve = new javax.swing.JButton();
        txt_seis = new javax.swing.JButton();
        txt_mas = new javax.swing.JButton();
        txt_tres = new javax.swing.JButton();
        txt_dos = new javax.swing.JButton();
        txt_mult = new javax.swing.JButton();
        txt_div = new javax.swing.JButton();
        txt_menos = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        txt_archivos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        txt_ayuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txt_uno.setText("1");
        txt_uno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unoActionPerformed(evt);
            }
        });

        txt_cuatro.setText("4");
        txt_cuatro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cuatroActionPerformed(evt);
            }
        });

        txt_cinco.setText("5");
        txt_cinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cincoActionPerformed(evt);
            }
        });

        txt_siete.setText("7");
        txt_siete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sieteActionPerformed(evt);
            }
        });

        txt_cero.setText("0");
        txt_cero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ceroActionPerformed(evt);
            }
        });

        txt_ocho.setText("8");
        txt_ocho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ochoActionPerformed(evt);
            }
        });

        txt_punto.setText(".");
        txt_punto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_puntoActionPerformed(evt);
            }
        });

        txt_igual.setText("=");
        txt_igual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_igualActionPerformed(evt);
            }
        });

        txt_nueve.setText("9");
        txt_nueve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nueveActionPerformed(evt);
            }
        });

        txt_seis.setText("6");
        txt_seis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_seisActionPerformed(evt);
            }
        });

        txt_mas.setText("+");
        txt_mas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_masActionPerformed(evt);
            }
        });

        txt_tres.setText("3");
        txt_tres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tresActionPerformed(evt);
            }
        });

        txt_dos.setText("2");
        txt_dos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dosActionPerformed(evt);
            }
        });

        txt_mult.setText("*");
        txt_mult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_multActionPerformed(evt);
            }
        });

        txt_div.setText("/");
        txt_div.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_divActionPerformed(evt);
            }
        });

        txt_menos.setText("-");
        txt_menos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_menosActionPerformed(evt);
            }
        });

        txtPantalla.setEnabled(false);
        txtPantalla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPantallaFocusLost(evt);
            }
        });
        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });
        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPantallaKeyReleased(evt);
            }
        });

        txt_archivos.setText("Archivos y editar");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        txt_archivos.add(jMenuItem1);

        jMenuItem2.setText("Historial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        txt_archivos.add(jMenuItem2);

        jMenuBar1.add(txt_archivos);

        txt_ayuda.setText("Ayuda");
        txt_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ayudaActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Manual de Usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        txt_ayuda.add(jMenuItem3);

        jMenuBar1.add(txt_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txt_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(txt_div, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_div, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unoActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"1");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unoActionPerformed

    private void txt_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cuatroActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"4");
// TODO add your handling code here:
    }//GEN-LAST:event_txt_cuatroActionPerformed

    private void txt_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cincoActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"5");
// TODO add your handling code here:
    }//GEN-LAST:event_txt_cincoActionPerformed

    private void txt_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sieteActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"7"); 
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sieteActionPerformed

    private void txt_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ceroActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"0");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ceroActionPerformed

    private void txt_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ochoActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"8"); 
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ochoActionPerformed

    private void txt_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_puntoActionPerformed
    Toolkit.getDefaultToolkit().beep();
        if(txtPantalla.getText().contains(".")){
            return;
        
        }
        txtPantalla.setText(txtPantalla.getText()+".");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_puntoActionPerformed

    private void txt_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_igualActionPerformed
    Toolkit.getDefaultToolkit().beep();
        if(evt !=null){
         b = Float.parseFloat(txtPantalla.getText());
        }
         switch(operando){
             case '+':
                 txtPantalla.setText(a+b+"");
                 Historial.txt_historial.append("Suma: "+a+" + "+b+" = "+ txtPantalla.getText()+"\n");
             break;
              case '-': 
                   txtPantalla.setText(a-b+"");
                   Historial.txt_historial.append("Resta: "+a+" - "+b+" = "+ txtPantalla.getText()+"\n");
             break;
              case '*': 
                   txtPantalla.setText(a*b+"");
                   Historial.txt_historial.append("Multiplicacion: "+a+" * "+b+" = "+ txtPantalla.getText()+"\n");
             break;
              case '/':     
                   txtPantalla.setText(a/b+"");
                   Historial.txt_historial.append("Division: "+a+" / "+b+" = "+ txtPantalla.getText()+"\n");
             break;
              default: 
                  JOptionPane.showMessageDialog(this, "Debe presionar una operacion, +, -, *, /");
         }
         operando = ' ';  
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_igualActionPerformed

    private void txt_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nueveActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"9");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nueveActionPerformed

    private void txt_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_seisActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"6");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_seisActionPerformed

    private void txt_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_masActionPerformed
    Toolkit.getDefaultToolkit().beep();
       operacion('+');
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_masActionPerformed

    private void txt_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tresActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"3");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tresActionPerformed

    private void txt_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dosActionPerformed
    Toolkit.getDefaultToolkit().beep();
       cero();
          txtPantalla.setText(txtPantalla.getText()+"2");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dosActionPerformed

    private void txt_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_multActionPerformed
    Toolkit.getDefaultToolkit().beep();
       
       operacion('*');
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_multActionPerformed

    private void txt_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_divActionPerformed
    Toolkit.getDefaultToolkit().beep();
         
        operacion('/');
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_divActionPerformed

    private void txt_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_menosActionPerformed
    Toolkit.getDefaultToolkit().beep();
       operacion('-');
       // TODO add your handling code here:
    }//GEN-LAST:event_txt_menosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Toolkit.getDefaultToolkit().beep();
        historial.setVisible(true);
        historial.setLocation(this.getX()+400,this.getY());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txt_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ayudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ayudaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Toolkit.getDefaultToolkit().beep();
   
        manual_usuario.setVisible(true);
        manual_usuario.setLocation(this.getX()+510,this.getY());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        nuevo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaActionPerformed

    private void txtPantallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyReleased
        System.out.print("tecla presionada: "+evt.getKeyChar());
        switch (evt.getKeyChar()){
            case '0':
                txt_cero.doClick();
                break;
            case '1':
                txt_uno.doClick();
                break;
            case '2':
                txt_dos.doClick();
                break;
            case '3':
                txt_tres.doClick();
                break;
            case '4':
                txt_cuatro.doClick();
                break;
            case '5':
                txt_cinco.doClick();
                break;
            case '6':
                txt_seis.doClick();
                break;
            case '7':
                txt_siete.doClick();
                break;
            case '8':
                txt_ocho.doClick();
                break;
            case '9':
                txt_nueve.doClick();
                break;
            case '+':
                txt_mas.doClick();
                break;
            case '-':
                txt_menos.doClick();
                break;
            case '*':
                txt_mult.doClick();
                break;
            case '/':
                txt_div.doClick();
                break;
            case '.':
                txt_punto.doClick();
                break;
            case '=':
                txt_igual.doClick();
                break;
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaKeyReleased

    private void txtPantallaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPantallaFocusLost
        txtPantalla.requestFocusInWindow();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtPantalla.requestFocusInWindow();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void nuevo(){
                     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        // TODO code application logic here
        frm_calculadora calculadora = new frm_calculadora();
        calculadora.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        calculadora.setLocationRelativeTo(null);
        calculadora.setVisible(true);
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
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frm_calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JMenu txt_archivos;
    private javax.swing.JMenu txt_ayuda;
    private javax.swing.JButton txt_cero;
    private javax.swing.JButton txt_cinco;
    private javax.swing.JButton txt_cuatro;
    private javax.swing.JButton txt_div;
    private javax.swing.JButton txt_dos;
    private javax.swing.JButton txt_igual;
    private javax.swing.JButton txt_mas;
    private javax.swing.JButton txt_menos;
    private javax.swing.JButton txt_mult;
    private javax.swing.JButton txt_nueve;
    private javax.swing.JButton txt_ocho;
    private javax.swing.JButton txt_punto;
    private javax.swing.JButton txt_seis;
    private javax.swing.JButton txt_siete;
    private javax.swing.JButton txt_tres;
    private javax.swing.JButton txt_uno;
    // End of variables declaration//GEN-END:variables


private void cero() {
        if(txtPantalla.getText().startsWith("0.")){
        return;
        }
        if(txtPantalla.getText().startsWith("0")){
            txtPantalla.setText("");
        }
    }

    private void operacion(char op) {
         a = Float.parseFloat(txtPantalla.getText());
         txtPantalla.setText("");
         operando = op;
    }
    

}
