package Aliensvarld;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 * @author oday_
 * @author Sumeya_
 * @author Isabell_
 */
public class ResetPass extends javax.swing.JFrame {
private InfDB mibDB;
private Agent agentId;
private Admin adminId;
private Alien alienId;
private  int id;

    public ResetPass() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Vi användar en metod för att stänga av bara den här JFrame

        agentId = new Agent(id); //instanser av klasser. Operatorn "new" skapar objekt.
        adminId = new Admin(id);
        alienId = new Alien(id);
    
        try{
        mibDB = new InfDB("C:\\db\\MIBDB.FDB");//Lägger till sökvägen dit databasen är placerad i undermappen "db" 
        }
        catch(InfException e){ //Fångar upp undantag
        JOptionPane.showMessageDialog(null,"Login misslyckad");
        System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + e.getMessage());
        }
        this.setLocationRelativeTo(null); //Metoden centrerar fönstret på skärmen om komponenten är null
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jOldPass = new javax.swing.JPasswordField();
        jNewPass = new javax.swing.JPasswordField();
        jConfPass = new javax.swing.JPasswordField();
        jTxtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboAnvandareTyp = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jLabel1.setBackground(new java.awt.Color(204, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reset Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Old Password");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");

        jOldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOldPassActionPerformed(evt);
            }
        });

        jNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewPassActionPerformed(evt);
            }
        });

        jConfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfPassActionPerformed(evt);
            }
        });

        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboAnvandareTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select användare......", "Agent", "Admin", "Alien" }));
        jComboAnvandareTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAnvandareTypActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboAnvandareTyp, 0, 136, Short.MAX_VALUE)
                            .addComponent(jNewPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jConfPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jOldPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jOldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jConfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboAnvandareTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
            //Metod för att anropa UserId
    }//GEN-LAST:event_jTxtIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose(); //Stänger fönstret
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jTxtId.setText(null);  //Vi använde de här metoder för att radera txtlinnehåll
       jOldPass.setText(null);
       jNewPass.setText(null);
       jConfPass.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewPassActionPerformed
            
    }//GEN-LAST:event_jNewPassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(Validering.textFaltHarVarde(jTxtId) && Validering.isHeltal(jTxtId) && Validering.textFaltHarVarde(jOldPass) && Validering.textFaltHarVarde(jNewPass) && Validering.textFaltHarVarde(jConfPass)){
                // Om metoderna som anropats från klassen validering kommer variablarna hämtas och ett nyy lösenord skapar för användaren.
                //Metoden byter lösenord
       String userId= jTxtId.getText();
       String oldpass= jOldPass.getText();   //Vi instansiera flera olika variabel vilka ta vad användare skriver 
       String newpass= jNewPass.getText();   // i txtrutor och vad användare väljer från jComboAnvandareTyp
       String confpass= jConfPass.getText();
       String userTyp = jComboAnvandareTyp.getSelectedItem().toString();
switch (userTyp) { //En tilldelningssats som som ger oss alternativen att ändra användartypen som Agent, Alien eller Admin.
     case "Agent": //Ett fall i switch-satsen.
            try{
                int id =Integer.parseInt(userId); 
                String losenord = agentId.AgentLosenord(id);
              if(oldpass.equals(losenord) && newpass.equals(confpass)){ //Om det gamla lösenordet stämmer in på lösenord och det nya lösenordet samt det 
                                                                        // konfirmerade lösenordet är samma kommer lösenordet att uppdateras. 
                mibDB.update( "UPDATE AGENT SET LOSENORD = '"+newpass+"' WHERE AGENT.AGENT_ID = '"+id+"'");
                 JOptionPane.showMessageDialog(null," Lösenordet har ändrats, logga in med ditt nya lösenord");
                  }
            }catch(Exception e){//Vid undantag för satsen kommer det fångas upp och visa felmeddelande.
                 JOptionPane.showMessageDialog(null," Felmeddelande");

               }
      case "Admin"://Ett fall i switch-satsen.
            try{
                int id =Integer.parseInt(userId); 
                String losenord = adminId.AdminLosenord(id);
              if(oldpass.equals(losenord) && newpass.equals(confpass)){
                mibDB.update( "UPDATE AGENT SET LOSENORD = '"+newpass+"' WHERE AGENT.AGENT_ID = '"+id+"'");
                 JOptionPane.showMessageDialog(null," Lösenordet har ändrats, logga in med ditt nya lösenord");
                  }
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null," Felmeddelande");

               }
     case "Alien": //Ett fall i switch-satsen.
            try{
                int id =Integer.parseInt(userId); 
                String losenord = alienId.AlienLosenord(id);
              if(oldpass.equals(losenord) && newpass.equals(confpass)){
                mibDB.update( "UPDATE ALIEN SET LOSENORD = '"+newpass+"' WHERE ALIEN.ALIEN_ID = '"+id+"'");
                 JOptionPane.showMessageDialog(null," Lösenordet har ändrats, logga in med ditt nya lösenord");
                  }
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null," Felmeddelande");

               }
          }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jOldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOldPassActionPerformed
       
    }//GEN-LAST:event_jOldPassActionPerformed

    private void jConfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfPassActionPerformed
        
    }//GEN-LAST:event_jConfPassActionPerformed

    private void jComboAnvandareTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAnvandareTypActionPerformed
        
    }//GEN-LAST:event_jComboAnvandareTypActionPerformed

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
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPass().setVisible(true); //Typ boolean, om sant så visas fönstret och om falskt så visas det inte.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboAnvandareTyp;
    private javax.swing.JPasswordField jConfPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jNewPass;
    private javax.swing.JPasswordField jOldPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTxtId;
    // End of variables declaration//GEN-END:variables
}
