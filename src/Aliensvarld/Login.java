package Aliensvarld;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**

 * @author oday_
 * @author Sumeya_
 * @author Isabell_
 */
public class Login extends javax.swing.JFrame {
private InfDB mibDB;
private Agent agentId;
private Admin adminId;
private Alien alienId;
private  int id;

    public Login(InfDB mibDB) {
        
        initComponents();
        agentId = new Agent(id); //instanser av klasser. Operatorn "new" skapar objekt.
        adminId = new Admin(id);
        alienId = new Alien(id);
         try{ 
                mibDB = new InfDB("C:\\db\\MIBDB.FDB");//Lägger till sökvägen dit databasen är placerad i undermappen "db" 
        }catch(InfException e){//här fångas felet upp med sökvägen och felet hanteras av programmet. Detta undantag kan endast inträffa inuti try-blocket.
                JOptionPane.showMessageDialog(null,"Login misslyckad"); //meddelandet vid undantag
                System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + e.getMessage()); //Printar felmeddelande
                }
        this.setLocationRelativeTo(null); //Metoden centrerar fönstret på skärmen om komponenten är null
                }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtUser = new javax.swing.JTextField();
        jTxtPass = new javax.swing.JPasswordField();
        cbValjAnvandTyp = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jForgotPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        jTxtUser.setBackground(new java.awt.Color(153, 153, 153));
        jTxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUserActionPerformed(evt);
            }
        });

        jTxtPass.setBackground(new java.awt.Color(153, 153, 153));
        jTxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPassActionPerformed(evt);
            }
        });

        cbValjAnvandTyp.setForeground(new java.awt.Color(153, 153, 153));
        cbValjAnvandTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User....", "Agent", "Alien", "Admin" }));
        cbValjAnvandTyp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbValjAnvandTypMouseClicked(evt);
            }
        });
        cbValjAnvandTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjAnvandTypActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 51));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jForgotPass.setForeground(new java.awt.Color(255, 255, 255));
        jForgotPass.setText("Reset  my Password");
        jForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jForgotPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jForgotPass)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbValjAnvandTyp, 0, 149, Short.MAX_VALUE)
                                .addComponent(jTxtUser)
                                .addComponent(jTxtPass)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jButton1)
                            .addGap(57, 57, 57)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                            .addComponent(jButton3))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbValjAnvandTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jForgotPass, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jTxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUserActionPerformed
            
    }//GEN-LAST:event_jTxtUserActionPerformed

    private void jTxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPassActionPerformed
            
    }//GEN-LAST:event_jTxtPassActionPerformed

    private void jForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jForgotPassMouseClicked
        ResetPass respass = new ResetPass(); // instansierar objektet för metoden att ändra lösenord. 
        respass.setVisible(true);
    }//GEN-LAST:event_jForgotPassMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTxtUser.setText(null);
        jTxtPass.setText(null);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         System.exit(0); //Stänger fönstret
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (Validering.textFaltHarVarde(jTxtUser) && Validering.textFaltHarVarde(jTxtPass)){  //Om metoden textFaltHarVarde och isHeltal i klassen validering stämmer kommer värden hämtas och metoden att logga in.   
            String user = jTxtUser.getText();   //Vi instansiera flera olika variablar där användare anropar parametrar
            String pass = new String(jTxtPass.getPassword()); //i txtrutor och vad användaren vill logga in med för användartyp
            String userTyp = cbValjAnvandTyp.getSelectedItem().toString();
            //Metoden loggar in i systemet
    switch (userTyp) { //En tilldelningssats som som ger oss alternativen att logga in som Agent, Alien eller Admin.
        case "Agent": //Ett fall i switch-satsen.
            try{//Genererar undantagen
                    int id = agentId.AgentId(user);
                    String namn = agentId.AgentNamn(id);
                    String losenord = agentId.AgentLosenord(id);
                    String typ = agentId.AgentTyp(id);
                if(typ.equals("N")&& user.equals(namn)&& pass.equals(losenord)){
                    JOptionPane.showMessageDialog(null," Lösenordet är rätt. Du är inloggad som Agent");
                    Agent ag = new Agent(id);
                    ag.setVisible(true);
                    ag.toFront();
                     dispose();
                }
           }catch(Exception e){ //Fångar upp och hanterar särfall 
                    JOptionPane.showMessageDialog(null,"  Användarnamn eller lösenord är fel, eller så har du valt fel användartyp ");
                    System.out.println(e.getMessage());
            }   break; //Lämnar switch-satsen.
        case "Admin": //Ett fall i switch-satsen.
            try{//Genererar undantagen
                    int id = adminId.AdmintId(user);
                    String namn = adminId.AdminNamn(id);
                    String losenord = adminId.AdminLosenord(id);
                    String typ = adminId.AdminTyp(id);
                if(typ.equals("J")&& user.equals(namn)&& pass.equals(losenord)){
                    JOptionPane.showMessageDialog(null," Lösenordet är rätt. Du är inloggad som Admin");
                    Admin ad = new Admin(id);
                    ad.setVisible(true);
                    ad.toFront();
                     dispose();
                }
            }catch(Exception e){//Fångar upp särfall
                JOptionPane.showMessageDialog(null," Användarnamn eller lösenord är fel, eller så har du valt fel användartyp");
            }   break; //Lämnar switch-satsen.
        case "Alien":   //Ett fall i switch-satsen.
            try{//Genererar undantagen
                    int id = alienId.AleintId(user);
                    String namn = alienId.AlienNamn(id);
                    String losenord = alienId.AlienLosenord(id);
                if(user.equals(namn)&& pass.equals(losenord)){
                    JOptionPane.showMessageDialog(null," Lösenordet är rätt. Du är inloggad som Alien");
                    Alien al = new Alien(id);
                    al.setVisible(true);
                    al.toFront();
                     dispose();
                }
            }catch(Exception e){//fångar upp särfall
                    JOptionPane.showMessageDialog(null," Användarnamn eller lösenord är fel, eller så har du valt fel användartyp");
           }   break; //Lämnar switch-satsen.
    }
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbValjAnvandTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjAnvandTypActionPerformed
                
    }//GEN-LAST:event_cbValjAnvandTypActionPerformed

    private void cbValjAnvandTypMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbValjAnvandTypMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbValjAnvandTypMouseClicked
     public void setId(int id){ //Metoden setId sätter sitt värde ID och this.id refererar till objektet vid metodanrop.
     this.id =id;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new Login(mibDB).setVisible(true);
////            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbValjAnvandTyp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jForgotPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTxtPass;
    private javax.swing.JTextField jTxtUser;
    // End of variables declaration//GEN-END:variables


}
