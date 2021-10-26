
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


/**
 *
 * @author vladimirgligic
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        procenat = new javax.swing.JButton();
        koren = new javax.swing.JButton();
        kvadrat = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        ce = new javax.swing.JButton();
        c = new javax.swing.JButton();
        back = new javax.swing.JButton();
        podeljeno = new javax.swing.JButton();
        sedam = new javax.swing.JButton();
        osam = new javax.swing.JButton();
        devet = new javax.swing.JButton();
        puta = new javax.swing.JButton();
        cetiri = new javax.swing.JButton();
        pet = new javax.swing.JButton();
        sest = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        jedan = new javax.swing.JButton();
        dva = new javax.swing.JButton();
        tri = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        predznak = new javax.swing.JButton();
        nula = new javax.swing.JButton();
        zarez = new javax.swing.JButton();
        jednako = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        procenat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        procenat.setText("%");

        koren.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        koren.setText("SQR");
        koren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korenActionPerformed(evt);
            }
        });

        kvadrat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kvadrat.setText("X2");
        kvadrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kvadratActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("1/X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ce.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ce.setText("CE");
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("<-");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        podeljeno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        podeljeno.setText("/");
        podeljeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podeljenoActionPerformed(evt);
            }
        });

        sedam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sedam.setText("7");
        sedam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedamActionPerformed(evt);
            }
        });

        osam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        osam.setText("8");
        osam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osamActionPerformed(evt);
            }
        });

        devet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        devet.setText("9");
        devet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devetActionPerformed(evt);
            }
        });

        puta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        puta.setText("X");
        puta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putaActionPerformed(evt);
            }
        });

        cetiri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cetiri.setText("4");
        cetiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetiriActionPerformed(evt);
            }
        });

        pet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pet.setText("5");
        pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petActionPerformed(evt);
            }
        });

        sest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sest.setText("6");
        sest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sestActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        jedan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jedan.setText("1");
        jedan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jedanActionPerformed(evt);
            }
        });

        dva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dva.setText("2");
        dva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvaActionPerformed(evt);
            }
        });

        tri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tri.setText("3");
        tri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        predznak.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        predznak.setText("+ -");
        predznak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predznakActionPerformed(evt);
            }
        });

        nula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nula.setText("0");
        nula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nulaActionPerformed(evt);
            }
        });

        zarez.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zarez.setText(".");
        zarez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zarezActionPerformed(evt);
            }
        });

        jednako.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jednako.setText("=");
        jednako.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jednakoActionPerformed(evt);
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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(procenat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ce)
                            .addComponent(sedam)
                            .addComponent(cetiri)
                            .addComponent(jedan)
                            .addComponent(predznak))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(koren, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c)
                            .addComponent(osam)
                            .addComponent(pet)
                            .addComponent(dva)
                            .addComponent(nula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kvadrat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back)
                            .addComponent(devet)
                            .addComponent(sest)
                            .addComponent(tri)
                            .addComponent(zarez))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jednako)
                            .addComponent(plus)
                            .addComponent(minus)
                            .addComponent(puta)
                            .addComponent(podeljeno))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back, c, ce, cetiri, devet, dva, jButton4, jedan, jednako, koren, kvadrat, minus, nula, osam, pet, plus, podeljeno, predznak, procenat, puta, sedam, sest, tri, zarez});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(procenat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(kvadrat)
                        .addComponent(koren)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ce)
                    .addComponent(c)
                    .addComponent(back)
                    .addComponent(podeljeno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(osam)
                        .addComponent(devet)
                        .addComponent(puta))
                    .addComponent(sedam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cetiri)
                        .addComponent(pet))
                    .addComponent(sest)
                    .addComponent(minus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jedan)
                        .addComponent(dva))
                    .addComponent(tri)
                    .addComponent(plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(predznak)
                    .addComponent(nula)
                    .addComponent(zarez)
                    .addComponent(jednako))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {back, c, ce, cetiri, devet, dva, jButton4, jedan, jednako, koren, kvadrat, minus, nula, osam, pet, plus, podeljeno, predznak, procenat, puta, sedam, sest, tri, zarez});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jedanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jedanActionPerformed
   
        String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("1");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "1"); 
        set=2;
        }
        
   
    }//GEN-LAST:event_jedanActionPerformed

    private void dvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvaActionPerformed
    String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("2");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "2"); 
        set=2;
        }
    }//GEN-LAST:event_dvaActionPerformed

    private void triActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triActionPerformed
    String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("3");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "3"); 
        set=2;
        }
    }//GEN-LAST:event_triActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
    String str;
        str = jTextField1.getText();
        String text = str.substring(str.length() - 1);
        if (!text.equals("-") && !text.equals("+") && !text.equals("/")&& !text.equals("*")){
         jTextField1.setText(jTextField1.getText() + "+");
         set=3;
        }
        else{
                     
        }
    }//GEN-LAST:event_plusActionPerformed

    private void nulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nulaActionPerformed
    String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("0");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "0"); 
        set=2;
        }
    }//GEN-LAST:event_nulaActionPerformed

    private void zarezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zarezActionPerformed
    
    String str;
    str=jTextField1.getText();
    if (!(str.contains(".")) && set==2){
     jTextField1.setText(jTextField1.getText() + "."); 
     set=4;
    }
    else{
    
    }
    }//GEN-LAST:event_zarezActionPerformed

    private void cetiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetiriActionPerformed
     String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("4");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "4"); 
        set=2;
        }
    }//GEN-LAST:event_cetiriActionPerformed

    private void petActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petActionPerformed
        String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("5");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "5"); 
        set=2;
        }
    }//GEN-LAST:event_petActionPerformed

    private void sestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sestActionPerformed
    String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("6");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "6"); 
        set=2;
        }
    }//GEN-LAST:event_sestActionPerformed

    private void sedamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedamActionPerformed
   String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("7");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "7"); 
        set=2;
        }
    }//GEN-LAST:event_sedamActionPerformed

    private void osamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osamActionPerformed
     String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("8");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "8"); 
        set=2;
        }
    }//GEN-LAST:event_osamActionPerformed

    private void devetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devetActionPerformed
   String str;
        str = jTextField1.getText();
        if("0.0".equals(str) || "0".equals(str) || set==1){
        jTextField1.setText("9");
        set=2;
        }
        else{
        jTextField1.setText(jTextField1.getText() + "9"); 
        set=2;
        }
    }//GEN-LAST:event_devetActionPerformed

    private void putaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putaActionPerformed
     String str;
        str = jTextField1.getText();
        String text = str.substring(str.length() - 1);
        if (!text.equals("-") && !text.equals("+") && !text.equals("/")&& !text.equals("*")){
         jTextField1.setText(jTextField1.getText() + "*");
         set=3;
        }
        else{
                     
        } 
    }//GEN-LAST:event_putaActionPerformed

    @SuppressWarnings("empty-statement")
    private void jednakoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jednakoActionPerformed
   
    set=1;  
    String str;
    str = jTextField1.getText();
    String text = str.substring(str.length() - 1);
    if (!text.equals("-") && !text.equals("+") && !text.equals("/")&& !text.equals("*")){
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String foo;
        foo = jTextField1.getText();
        try {
             Object eval;
             eval=(engine.eval(foo));
            //try {
            //System.out.println(engine.eval(foo));
            //System.out.println(eval);
            jTextField1.setText(eval+""); 
            jTextField1.setText(jTextField1.getText()); 
       //rez = (Double) engine.eval(foo);
       
        } catch (ScriptException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else{}
    }//GEN-LAST:event_jednakoActionPerformed

    private void predznakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predznakActionPerformed
        set=2;
        String text;
        text = jTextField1.getText();
        double value = Double.parseDouble(text);
        double rez=-1*value;
        jTextField1.setText(""+rez); 
    }//GEN-LAST:event_predznakActionPerformed

    private void kvadratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kvadratActionPerformed
       set=1;
        String text;
        text = jTextField1.getText();
        double value = Double.parseDouble(text);
        double rez=Math.pow(value,2);
        jTextField1.setText(""+rez); 
    }//GEN-LAST:event_kvadratActionPerformed

    private void korenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korenActionPerformed
        set=1;
        String text;
        text = jTextField1.getText();
        double value = Double.parseDouble(text);
        double rez=Math.sqrt(value);
        jTextField1.setText(""+rez); 
    }//GEN-LAST:event_korenActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        set=1;
        String text;
        text = jTextField1.getText();
        double value = Double.parseDouble(text);
        double rez=1/value;
        jTextField1.setText(""+rez); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        String str;
        str = jTextField1.getText();
        String text = str.substring(0, str.length() - 1);
        jTextField1.setText(text); 
    }//GEN-LAST:event_backActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
         String str;
        str = jTextField1.getText();
        String text = str.substring(str.length() - 1);
        if (!text.equals("-") && !text.equals("+") && !text.equals("/")&& !text.equals("*")){
         jTextField1.setText(jTextField1.getText() + "-");
         set=3;
        }
        else{
                     
        } 
    }//GEN-LAST:event_minusActionPerformed

    private void podeljenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podeljenoActionPerformed
     String str;
        str = jTextField1.getText();
        String text = str.substring(str.length() - 1);
        if (!text.equals("-") && !text.equals("+") && !text.equals("/")&& !text.equals("*")){
         jTextField1.setText(jTextField1.getText() + "/");
         set=3;
        }
        else{
                     
        }
    }//GEN-LAST:event_podeljenoActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
    jTextField1.setText(""); 
    }//GEN-LAST:event_ceActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
       jTextField1.setText("0");
    }//GEN-LAST:event_cActionPerformed

    
            
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton c;
    private javax.swing.JButton ce;
    private javax.swing.JButton cetiri;
    private javax.swing.JButton devet;
    private javax.swing.JButton dva;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jedan;
    private javax.swing.JButton jednako;
    private javax.swing.JButton koren;
    private javax.swing.JButton kvadrat;
    private javax.swing.JButton minus;
    private javax.swing.JButton nula;
    private javax.swing.JButton osam;
    private javax.swing.JButton pet;
    private javax.swing.JButton plus;
    private javax.swing.JButton podeljeno;
    private javax.swing.JButton predznak;
    private javax.swing.JButton procenat;
    private javax.swing.JButton puta;
    private javax.swing.JButton sedam;
    private javax.swing.JButton sest;
    private javax.swing.JButton tri;
    private javax.swing.JButton zarez;
    // End of variables declaration//GEN-END:variables
    private int set;
}

