package vista;

import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import java.io.File;
import java.awt.Toolkit;  

public class frm_calc extends javax.swing.JFrame {

    
    public float num1,num2,resultado;
    public String operador;
    
     public frm_calc() {
        initComponents();
        this.setLocationRelativeTo(null);
        // Añadir KeyListener al JFrame para capturar eventos de teclado
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }
        });
        // Hacer que el JFrame sea el foco de entrada para capturar eventos de teclado
        this.setFocusable(true);
        this.setTitle("Calculadora");
        this.setSize(365, 440);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casilla = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_casilla = new javax.swing.JLabel();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        Opcion_1 = new javax.swing.JMenu();
        opcion_nuevo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        opcion_historial = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Opcion_2 = new javax.swing.JMenu();
        Manual = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        casilla.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        casilla.setForeground(new java.awt.Color(255, 255, 255));
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        casilla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        label_casilla.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        label_casilla.setForeground(new java.awt.Color(255, 255, 255));
        label_casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_casilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        btn_1.setBackground(new java.awt.Color(36, 35, 35));
        btn_1.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(36, 35, 35));
        btn_3.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(36, 35, 35));
        btn_2.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_suma.setBackground(new java.awt.Color(36, 35, 35));
        btn_suma.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_suma.setText("+");
        btn_suma.setBorder(null);
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(36, 35, 35));
        btn_4.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(36, 35, 35));
        btn_7.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(36, 35, 35));
        btn_0.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(36, 35, 35));
        btn_5.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(36, 35, 35));
        btn_8.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_punto.setBackground(new java.awt.Color(36, 35, 35));
        btn_punto.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(255, 255, 255));
        btn_punto.setText(".");
        btn_punto.setBorder(null);
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(36, 35, 35));
        btn_6.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(36, 35, 35));
        btn_9.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_igual.setBackground(new java.awt.Color(36, 35, 35));
        btn_igual.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_resta.setBackground(new java.awt.Color(36, 35, 35));
        btn_resta.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(255, 255, 255));
        btn_resta.setText("-");
        btn_resta.setBorder(null);
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_multiplicacion.setBackground(new java.awt.Color(36, 35, 35));
        btn_multiplicacion.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_multiplicacion.setText("*");
        btn_multiplicacion.setBorder(null);
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_division.setBackground(new java.awt.Color(36, 35, 35));
        btn_division.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        btn_division.setForeground(new java.awt.Color(255, 255, 255));
        btn_division.setText("/");
        btn_division.setBorder(null);
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_casilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_suma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Menu.setBackground(new java.awt.Color(102, 102, 102));

        Opcion_1.setBackground(new java.awt.Color(0, 0, 0));
        Opcion_1.setMnemonic('O');
        Opcion_1.setText("Opciones");

        opcion_nuevo.setText("Nuevo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem1.setText("Borrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        opcion_nuevo.add(jMenuItem1);

        Opcion_1.add(opcion_nuevo);

        opcion_historial.setText("Historial");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.setText("Abrir Historial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        opcion_historial.add(jMenuItem2);

        Opcion_1.add(opcion_historial);

        Menu.add(Opcion_1);

        Opcion_2.setBackground(new java.awt.Color(0, 0, 0));
        Opcion_2.setText("Ayuda");

        Manual.setText("Manual");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem3.setText("Abrir Manual");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Manual.add(jMenuItem3);

        Opcion_2.add(Manual);

        Menu.add(Opcion_2);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        if(!(this.label_casilla.getText().contains("."))){
          
        this.label_casilla.setText(this.label_casilla.getText()+".");    
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        this.num2=Float.parseFloat(this.label_casilla.getText());
        
        switch(this.operador){
            case "+": this.label_casilla.setText(sincero(this.num1+this.num2));
            resultado=num1+num2;
            break;
            
            case "-": this.label_casilla.setText(sincero(this.num1-this.num2));
            resultado=num1-num2;
            break;
            
            case "*": this.label_casilla.setText(sincero(this.num1*this.num2));
            resultado=num1*num2;
            break;
            
            case "/":
                if(this.num2==0){this.label_casilla.setText("Error");} 
                else{    
                this.label_casilla.setText(sincero(this.num1/this.num2));
                resultado=num1/num2;
                }
            break;
            
        }
       
    // Guardar la operación y el resultado en el historial
    guardarHistorial(this.num1 + "\n "  +  this.operador + "\n " + this.num2 + " \n " + this.resultado );
    
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        this.num1=Float.parseFloat(this.label_casilla.getText());
        this.operador="-";
        this.label_casilla.setText("");
        
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        this.num1=Float.parseFloat(this.label_casilla.getText());
        this.operador="*";
        this.label_casilla.setText("");
        
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        this.num1=Float.parseFloat(this.label_casilla.getText());
        this.operador="/";
        this.label_casilla.setText("");
        
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        this.label_casilla.setText(this.label_casilla.getText()+"2");       
     
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       this.label_casilla.setText(this.label_casilla.getText()+"3");
        
    }//GEN-LAST:event_btn_3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        label_casilla.setText("");
        
        num1 = 0;
        num2 = 0;
        operador = "";
        guardarHistorial("Nuevo");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        this.num1=Float.parseFloat(this.label_casilla.getText());
        this.operador="+";
        this.label_casilla.setText("");
            
        
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Abrir historial
        abrirHistorial();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    // Metodo para abrir el pdf a traves de 'ayuda'
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Abrir pdf
        
         // Ruta al archivo PDF
    File pdfFile = new File("Manual.pdf");

    try {
        // Verifica si el archivo existe
        if (pdfFile.exists()) {
            // Usa Desktop para abrir el archivo
            Desktop.getDesktop().open(pdfFile);
        } else {
            // Muestra un mensaje si el archivo no se encuentra
            JOptionPane.showMessageDialog(null, "No se encontró el archivo Manual.pdf");
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo.");
    }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    // Metodo para eliminar el decimal cero
    public String sincero(float resultado){
        String retorno="";
        
        retorno=Float.toString(resultado);
        
        if(resultado%1==0){
            retorno=retorno.substring(0, retorno.length()-2);
        }
        
        return retorno;
    }
    // Método para guardar el historial en el archivo
    private void guardarHistorial(String texto) {
        try (FileWriter fw = new FileWriter("bitacoraCalculadora.txt", true)) {
            fw.write(texto + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Método para leer el historial del archivo y mostrarlo en un área de texto
    private void abrirHistorial() {
       /* StringBuilder historial = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("bitacoraCalculadora.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                historial.append(linea).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        javax.swing.JOptionPane.showMessageDialog(this, historial.toString(), "Historial", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    */
    File txtFile = new File("bitacoraCalculadora.txt");

    try {
        // Verifica si el archivo existe
        if (txtFile.exists()) {
            // Usa Desktop para abrir el archivo
            Desktop.getDesktop().open(txtFile);
        } else {
            // Muestra un mensaje si el archivo no se encuentra
            JOptionPane.showMessageDialog(null, "No se encontró el archivo bitacoraCalculadora.txt");
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo.");
    }   
    }   
    // Metodo para reconocer las teclas
    private void handleKeyPress(KeyEvent e) {
    int keyCode = e.getKeyCode();
    boolean shiftPressed = e.isShiftDown();

    // Emitir un beep para las teclas reconocidas
    boolean shouldBeep = false;

    if (keyCode >= KeyEvent.VK_0 && keyCode <= KeyEvent.VK_9) {
        // Si se presiona una tecla de número (0-9)
        this.label_casilla.setText(this.label_casilla.getText() + (keyCode - KeyEvent.VK_0));
        shouldBeep = true;
    } else if (keyCode == KeyEvent.VK_PERIOD || keyCode == KeyEvent.VK_DECIMAL) {
        // Si se presiona la tecla de punto
        if (!(this.label_casilla.getText().contains("."))) {
            this.label_casilla.setText(this.label_casilla.getText() + ".");
            shouldBeep = true;
        }
    } else if (keyCode == KeyEvent.VK_PLUS && shiftPressed) {
        // Si se presiona Shift + +
        this.num1 = Float.parseFloat(this.label_casilla.getText());
        this.operador = "*";
        this.label_casilla.setText("");
        shouldBeep = true;
    } else if (keyCode == KeyEvent.VK_MINUS) {
        // Si se presiona la tecla de resta
        this.num1 = Float.parseFloat(this.label_casilla.getText());
        this.operador = "-";
        this.label_casilla.setText("");
        shouldBeep = true;
    } else if (keyCode == KeyEvent.VK_7 && shiftPressed) {
        // Si se presiona Shift + 7
        this.num1 = Float.parseFloat(this.label_casilla.getText());
        this.operador = "/";
        this.label_casilla.setText("");
        shouldBeep = true;
    } else if (keyCode == KeyEvent.VK_DIVIDE) {
        // Si se presiona la tecla de división (por si acaso se usa la tecla de división en el teclado numérico)
        this.num1 = Float.parseFloat(this.label_casilla.getText());
        this.operador = "/";
        this.label_casilla.setText("");
        shouldBeep = true;
        
    } else if (keyCode == KeyEvent.VK_PLUS) {
        // Si se presiona la tecla de división (por si acaso se usa la tecla de división en el teclado numérico)
        this.num1 = Float.parseFloat(this.label_casilla.getText());
        this.operador = "+";
        this.label_casilla.setText("");
        shouldBeep = true;
    } else if (keyCode == KeyEvent.VK_EQUALS || keyCode == KeyEvent.VK_ENTER) {
        // Si se presiona la tecla de igual
        this.num2 = Float.parseFloat(this.label_casilla.getText());
        switch (this.operador) {
            case "+": this.label_casilla.setText(sincero(this.num1 + this.num2));
                resultado = num1 + num2;
                break;
            case "-": this.label_casilla.setText(sincero(this.num1 - this.num2));
                resultado = num1 - num2;
                break;
            case "*": this.label_casilla.setText(sincero(this.num1 * this.num2));
                resultado = num1 * num2;
                break;
            case "/":
                if (this.num2 == 0) {
                    this.label_casilla.setText("Error");
                } else {
                    this.label_casilla.setText(sincero(this.num1 / this.num2));
                    resultado = num1 / num2;
                }
                break;
        }
        // Guardar la operación y el resultado en el historial
        guardarHistorial(this.num1 + "\n " + this.operador + "\n " + this.num2 + " \n " + this.resultado);
        shouldBeep = true;
    }
    
    // Emitir beep si corresponde
    if (shouldBeep) {
        Toolkit.getDefaultToolkit().beep();
    }
}
    
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
            java.util.logging.Logger.getLogger(frm_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_calc().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Manual;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Opcion_1;
    private javax.swing.JMenu Opcion_2;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JLabel casilla;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_casilla;
    private javax.swing.JMenu opcion_historial;
    private javax.swing.JMenu opcion_nuevo;
    // End of variables declaration//GEN-END:variables
}
