    package Aliensvarld;
    import java.awt.Desktop;
    import java.io.IOException;
    import java.net.URI;
    import java.net.URISyntaxException;
    import java.util.ArrayList;
    import java.util.HashMap;
    import javax.swing.JFrame;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import oru.inf.InfDB;
    import oru.inf.InfException;
    /**
     * @author oday_
     * @author Sumeya_
     * @author Isabell_
     */
    public class Alien extends javax.swing.JFrame {
    private InfDB mibDB;
    private static int id;
    private String namn;
    private Login login;
    
    public int AleintId(String namn){
       this.namn= namn;
       String alienNamn= AlienNamn(id);
        try {
               String sql = mibDB.fetchSingle("SELECT ALIEN.ALIEN_ID FROM ALIEN WHERE NAMN = '"+namn+"'");
               id = Integer.parseInt(sql);
        }catch(InfException e){
                System.out.print("Felmeddelande, kan inte hämta information om Alien");
                    }
                return id;
                   }
    public String AlienNamn(int id){
       String namn = "";
        try {
               String sql = mibDB.fetchSingle("SELECT ALIEN.NAMN FROM ALIEN WHERE ALIEN.ALIEN_ID = '"+id+"'"); //Hämtar ett värde från ALIEN vid ett visst ID nummer.
               namn= sql;
        }catch(InfException e){ //Fångar upp undantag från sql frågan
                System.out.print("Felmeddelande, kan inte hämta information om Alien");
                    }
                return namn;
                   }
    public String AlienLosenord(int id){
               String losenord = "";
        try {
               String sql = mibDB.fetchSingle("SELECT ALIEN.LOSENORD FROM ALIEN WHERE ALIEN.ALIEN_ID = '"+id+"'"); // Denna sql fråga hämtar endast ett värde från cellen alien vid ett angivet ID nummer.
               losenord= sql;
        }catch(InfException e){ //Fångar upp undantag från sql frågan
                System.out.print("Felmeddelande, kan inte hämta information om Alien");
                    }
                return losenord;
                   }
    public Alien(int id) {
           initComponents();
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Vi användar en metod för att stänga av bara den här JFrame
          
        try{
           mibDB = new InfDB("C:\\db\\MIBDB.FDB"); //Lägger till sökvägen dit databasen är placerad i undermappen "db" 
       }catch(InfException e){ //här fångas felet upp med sökvägen och felet hanteras av programmet. Detta undantag kan endast inträffa inuti try-blocket.
            JOptionPane.showMessageDialog(null,"Login misslyckad"); //Meddelandet visas vid undantag
            System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + e.getMessage()); //Felmeddelande printas
        }
          this.setLocationRelativeTo(null); //Metoden centrerar fönstret på skärmen om komponenten är null
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tillbacka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setText("Maila min Agent");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Namn", "Telefon", "Område", "RegisreringsDatum", "AnsvarigAgent"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton8.setText("Töm innehållet i tabellen");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 255));
        jButton5.setText("Visa min ansvarig Agent");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setText("Alien som bor i mitt område");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton5)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4)
                        .addGap(26, 26, 26)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jButton8)
                .addGap(49, 49, 49)
                .addComponent(jButton3)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Välkommen Alien");

        Tillbacka.setText("TillBaka");
        Tillbacka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbackaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbacka)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tillbacka))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose(); //Stänger fönstret
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     try {
        Desktop.getDesktop().browse(new URI("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox")); //En metod för att maila aliens områdeschef med hjälp av en direktlänk med ett epost-program. 
         
    }catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ((DefaultTableModel)jTable1.getModel()).setRowCount(0); //Vi använde den här metoden för att radera tabellinnehåll
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            String alienNamn = AlienNamn(id); // Metoden visar ansvarig agent för alien samt dess nödvändiga information.
            int aliensID = AleintId(alienNamn);
        try{
            String result1= mibDB.fetchSingle( "SELECT NAMN FROM AGENT WHERE AGENT_ID IN(SELECT ANSVARIG_AGENT FROM ALIEN WHERE ALIEN_ID = '"+aliensID+"');");
            String agentsNamn = result1;
            String result2= mibDB.fetchSingle( "SELECT TELEFON FROM AGENT WHERE AGENT_ID IN(SELECT ANSVARIG_AGENT FROM ALIEN WHERE ALIEN_ID = '"+aliensID+"');");
            String telefon =result2;
            String alien_id = String.valueOf(aliensID);
            String [] tbData ={agentsNamn, telefon};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(tbData); //Resultatet listas i tabellen
            JOptionPane.showMessageDialog(null," Information om '"+agentsNamn+"' som är din områdeschef");
////
//                   
      }catch(InfException ex){
            System.out.println(ex.getMessage());
//      }catch(NullPointerException e) {
//            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            String alienNamn= AlienNamn(id); // Denna metod kollar vilka Aliens som bor i området.
            int aliensID = AleintId(alienNamn);
            
             ArrayList<HashMap<String, String>> alienIMittOmrade;
      try{
            String fraga=  "SELECT * FROM ALIEN WHERE PLATS IN(SELECT PLATS_ID FROM PLATS WHERE PLATS_ID IN(SELECT PLATS FROM ALIEN WHERE ALIEN_ID  ='"+aliensID+"'))";
             alienIMittOmrade = mibDB.fetchRows(fraga);
         for(HashMap<String, String> alien : alienIMittOmrade){ // for-loopen itererar igenom hasmapen och går igenom alla värden som är listade.
             String alien_id = String.valueOf(alien.get("ALIEN_ID")); //hämtar värdet för ALIEN_ID
             String regisreringsDatum = alien.get("REGISTRERINGSDATUM"); //Hämtar värdet för REGISTRERINGSDATUM
             String namn = alien.get("NAMN"); //Hämtar värdet för NAMN
             String telefon = alien.get("TELEFON"); //Hämtar värdet för TELEFON
             String plats = String.valueOf(alien.get("PLATS")); //Hämtar värdet för PLATS
             String ansvarigAgent = String.valueOf(alien.get("ANSVARIG_AGENT")); //Hämtar värdet för ANSVARIG_AGENT

        String tbData[] ={ alien_id, namn, telefon, plats, regisreringsDatum, ansvarigAgent};
             DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel(); //Resultatet listas i tabellen
             tblModel.addRow(tbData);
            }  
              JOptionPane.showMessageDialog(null," All information om Aliens som bor i mitt område"); //Fönster visas med meddelandet.
                    
      }catch(InfException ex){
            System.out.println(ex.getMessage());

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TillbackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbackaActionPerformed
        Login log = new Login(mibDB);
        log.setVisible(true);
        dispose();

    }//GEN-LAST:event_TillbackaActionPerformed
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
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alien(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbacka;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
