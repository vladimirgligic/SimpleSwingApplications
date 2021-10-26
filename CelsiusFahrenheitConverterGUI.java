package celsiusconverter;

public class CelsiusFahrenheitConverterGUI extends javax.swing.JFrame {

    /**
     * Creates new form CelsiusConverterGUI
     */
    public CelsiusFahrenheitConverterGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tempTextField = new javax.swing.JTextField();
        celsiusLabel = new javax.swing.JLabel();
        fahrenheitLabel = new javax.swing.JLabel();
        tempTextField2 = new javax.swing.JTextField();
        convertButton1 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Celsius Fahrenheit Converter");

        tempTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTextFieldActionPerformed(evt);
            }
        });

        celsiusLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        fahrenheitLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tempTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTextField2ActionPerformed(evt);
            }
        });

        convertButton1.setText("°C to °F");
        convertButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText(" °F to °C");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempTextField)
                    .addComponent(tempTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(convertButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fahrenheitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(celsiusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convertButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(fahrenheitLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(celsiusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempTextField2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tempTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTextFieldActionPerformed

    }//GEN-LAST:event_tempTextFieldActionPerformed

    private void tempTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTextField2ActionPerformed

    }//GEN-LAST:event_tempTextField2ActionPerformed

    private void convertButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButton1ActionPerformed
//Parse degrees Celsius as a double and convert to Fahrenheit.
        int celsius = (int) ((Double.parseDouble(tempTextField.getText())));
        int tempFahr = (int) ((Double.parseDouble(tempTextField.getText()))
                * 1.8 + 32);
        fahrenheitLabel.setText(celsius + " Celsius is " + tempFahr + " Fahrenheit");

        tempTextField2.setText("");
    }//GEN-LAST:event_convertButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
//Parse degrees Fahrenheit as a double and convert to Celsius.
        int farenhajta = (int) ((Double.parseDouble(tempTextField2.getText())));
        int tempCelz = (int) (((Double.parseDouble(tempTextField2.getText()))
                - 32) / 1.8);
        celsiusLabel.setText(farenhajta + " Fahrenheit is " + tempCelz + " Celsius");
        tempTextField.setText("");


    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CelsiusFahrenheitConverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CelsiusFahrenheitConverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CelsiusFahrenheitConverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CelsiusFahrenheitConverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CelsiusFahrenheitConverterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celsiusLabel;
    private javax.swing.JToggleButton convertButton1;
    private javax.swing.JLabel fahrenheitLabel;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JTextField tempTextField2;
    // End of variables declaration//GEN-END:variables
}
