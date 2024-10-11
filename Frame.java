public class Frame extends javax.swing.JFrame {

   
    public Frame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        guess1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        guess2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        result2 = new javax.swing.JLabel();
        result1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 25, 112));

        jLabel1.setBackground(new java.awt.Color(52, 58, 64));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); 
        jLabel1.setForeground(new java.awt.Color(233, 236, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GUESS   THE   NUMBER (1-100)");
        jLabel1.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 255, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PLAY WITH COMPUTER");
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER THE NUMBER");

        num1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(52, 58, 64));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(233,236, 239));
        jButton1.setText("LET'S PLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 255, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLAY WITH A FRIEND");
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(144, 238, 144));
        jLabel6.setText("GUESS THE NUMBER");

        guess1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        guess1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guess1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(52, 58, 64));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(233,236, 239));
        jButton2.setText("ENTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(52, 58, 64));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(233,236, 239));
        jButton3.setText("LET'S PLAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(144, 238, 144));
        jLabel7.setText("GUESS THE NUMBER");

        guess2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        guess2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guess2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guess2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(52, 58, 64));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(233,236, 239));
        jButton4.setText("ENTER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        result2.setBackground(new java.awt.Color(0, 0, 0));
        result2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        result2.setForeground(new java.awt.Color(255, 255, 0));
        result2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result2.setOpaque(true);

        result1.setBackground(new java.awt.Color(0, 0, 0));
        result1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        result1.setForeground(new java.awt.Color(255, 255, 0));
        result1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addGap(58, 58, 58)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(201, 201, 201)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addComponent(guess1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(223, 223, 223)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(result2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(guess2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(195, 195, 195))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guess1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guess2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    int number1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        number1 = Integer.parseInt(num1.getText());
        num1.setText("");
        result1.setText("NOW GUESS THE NUMBER");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guess1ActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
    }//GEN-LAST:event_guess1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int num = Integer.parseInt(guess1.getText());
        
        if(num==number1)
            result1.setText("YAY !! IT'S A RIGHT GUESS");
        else if (num+1==number1 || num-1==number1)
            result1.setText("CLOSE ENOUGH !!");
        else if (num>=number1-5 && num<=number1)
            result1.setText("A LITTLE GREATER");
        else if (num<=number1+5 && num>=number1)
            result1.setText("A LITTLE SMALLER");
        else if (num>=number1-10 && num<=number1)
            result1.setText("BEHIND - GUESS LITTLE LARGER");
        else if (num<=number1+10 && num>=number1)
            result1.setText("AHEAD - GUESS LITTLE SMALLER");
        else if (num<=number1+20 && num<=number1)
            result1.setText("BEHIND - GUESS LARGER");
        else if (num<=number1+20 && num>=number1)
            result1.setText("AHEAD - GUESS SMALLER");
        else if (num-20>number1)
            result1.setText("WAY TO AHEAD");
        else if (num+20<number1)
            result1.setText("WAY TO BEHIND");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    int number2;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double n = (Math.random()+10)*100; // 0.85    10.85 * 100 = 1085 % 100 == 85
        number2 = (int)(n)%100;
        System.out.println(n+" "+number2);
        result2.setText("NOW GUESS THE NUMBER");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void guess2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guess2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guess2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int num = Integer.parseInt(guess2.getText());
        
        if(num==number2)
            result2.setText("YAY !! IT'S A RIGHT GUESS");
        else if (num+1==number2 || num-1==number2)
            result2.setText("CLOSE ENOUGH !!");
        else if (num>=number2-5 && num<=number2)
            result2.setText("A LITTLE GREATER");
        else if (num<=number2+5 && num>=number2)
            result2.setText("A LITTLE SMALLER");
        else if (num>=number2-10 && num<=number2)
            result2.setText("BEHIND - GUESS LITTLE LARGER");
        else if (num<=number2+10 && num>=number2)
            result2.setText("AHEAD - GUESS LITTLE SMALLER");
        else if (num<=number2+20 && num<=number2)
            result2.setText("BEHIND - GUESS LARGER");
        else if (num<=number2+20 && num>=number2)
            result2.setText("AHEAD - GUESS SMALLER");
        else if (num-20>number2)
            result2.setText("WAY TO AHEAD");
        else if (num+20<number2)
            result2.setText("WAY TO BEHIND");
    }    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

   
    private javax.swing.JTextField guess1;
    private javax.swing.JTextField guess2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField num1;
    private javax.swing.JLabel result1;
    private javax.swing.JLabel result2;
}