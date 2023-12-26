package Aliensvarld;

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
    public class HenteraAlienForAdmin extends javax.swing.JFrame {
    private InfDB mibDB;
    public Admin admin;
    private int id;
    public HenteraAlienForAdmin() {
             initComponents();
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Vi användar en metod för att stänga av bara den här JFrame
    Admin admin = new Admin(id);
        try{
             mibDB = new InfDB("C:\\db\\MIBDB.FDB"); //Lägger till sökvägen dit databasen är placerad i undermappen "db" 
        }catch(InfException e){ //här fångas felet upp med sökvägen och felet hanteras av programmet. Detta undantag kan endast inträffa inuti try-blocket.
             JOptionPane.showMessageDialog(null,"Login misslyckad"); //Meddelandet visas vid undantag
             System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + e.getMessage());//Felmeddelandet printas
            }
         this.setLocationRelativeTo(null); //Metoden centrerar fönstret på skärmen om komponenten är null
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextNamn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextplats = new javax.swing.JTextField();
        jTextansvarig = new javax.swing.JTextField();
        jTextRegister = new javax.swing.JTextField();
        jTextTelefon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextLosenord = new javax.swing.JTextField();
        jLosenord = new javax.swing.JLabel();
        jAllaAlien = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tillbacka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Regisrera Datum", "Namn", "Losenord", "Telefon", "Plats", "Ansvarig Agent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alla Alien");

        jButton5.setBackground(new java.awt.Color(0, 102, 255));
        jButton5.setText("Visa nya Alien");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ändra info för Alien");

        jButton6.setText("Ändra");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Namn");

        jTextplats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextplatsActionPerformed(evt);
            }
        });

        jTextansvarig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextansvarigActionPerformed(evt);
            }
        });

        jTextRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegisterActionPerformed(evt);
            }
        });

        jTextTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefon");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ansvarig Agent");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Plats");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("RegistreringsDatum");

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setText("Ta bort");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 153, 51));
        jButton8.setText("Lägga till");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");

        jButton1.setText("Töm innehållet i tabellen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLosenordActionPerformed(evt);
            }
        });

        jLosenord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLosenord.setForeground(new java.awt.Color(255, 255, 255));
        jLosenord.setText("Losenord");

        jAllaAlien.setText("Visa Alla Alien");
        jAllaAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAllaAlienActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nya Alien");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jAllaAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextansvarig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextplats, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAllaAlien)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextplats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextansvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hantera Alien (Admin)");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbacka)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(Tillbacka)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         dispose(); //Stänger fönstret
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              ArrayList<HashMap<String, String>> sokaNyaAlien;
      try{ //Metoden söker efter nyligen tillagda aliens
             String fraga = "SELECT * FROM ALIEN WHERE Alien.REGISTRERINGSDATUM>'2020-01-01'"; //Välj aliens som är registrerade efter 2020-01-01.
             sokaNyaAlien = mibDB.fetchRows(fraga);
         for(HashMap<String, String> alien : sokaNyaAlien){ //Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i Hashmap med typen string
             String alien_id = String.valueOf(alien.get("ALIEN_ID"));
             String regisreringsDatum = alien.get("REGISTRERINGSDATUM");
             String namn = alien.get("NAMN");
             String losenord = alien.get("LOSENORD");
             String telefon = alien.get("TELEFON");
             String plats = String.valueOf(alien.get("PLATS"));
             String ansvarigAgent = String.valueOf(alien.get("ANSVARIG_AGENT"));

        String tbData[] ={alien_id, regisreringsDatum, namn, losenord, telefon , plats, ansvarigAgent};
             DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel(); //Resultatet listas i tabellen
             tblModel.addRow(tbData);
               }
    }catch(InfException ex){ //Fångar upp särfall och hanterar de
             System.out.println(ex.getMessage());
    }catch(NullPointerException e) {////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!");
          }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamnActionPerformed
      
    }//GEN-LAST:event_jTextNamnActionPerformed

    private void jTextplatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextplatsActionPerformed
        
    }//GEN-LAST:event_jTextplatsActionPerformed

    private void jTextansvarigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextansvarigActionPerformed
      
    }//GEN-LAST:event_jTextansvarigActionPerformed

    private void jTextRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegisterActionPerformed
        
    }//GEN-LAST:event_jTextRegisterActionPerformed

    private void jTextTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonActionPerformed
        
    }//GEN-LAST:event_jTextTelefonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){  //Metoderna från valideringsklassen anropar och kontrollerar så att användaren har skrivit in rätt värde eller heltal i txtrutorna.
       int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill ta bort en Aliens information", "Ta bort",JOptionPane.YES_NO_OPTION);
        if(opt==0){      
         ArrayList<HashMap<String, String>> taBortAlien; //Metoden tar bort Aliens från systemet.
     try{
           int ID = Integer.parseInt(jTextID.getText()); 
           String fraga = "SELECT * FROM ALIEN WHERE ALIEN.ALIEN_ID='"+ID+"'"; //Välj alien där alien_ID är ett visst ID nummer.
           taBortAlien = mibDB.fetchRows(fraga);
        for(HashMap<String, String> alien : taBortAlien){ //När for-loopen har gått igenom kommer den valda alien att tas bort.
            String alien_id = String.valueOf(alien.get("ALIEN_ID"));
            String namn = alien.get("NAMN");

           mibDB.delete("DELETE FROM ALIEN WHERE ALIEN.ALIEN_ID='"+alien_id+"'");
           JOptionPane.showMessageDialog(null,"Alien '" + namn + "' har tagit bort");
             }
    }catch(InfException ex){ //Vid särfall kommer den fångar upp och skicka ett felmeddelande. 
           System.out.println(ex.getMessage());
    }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
           System.out.println("NullPointerException thrown!");
            }
        }
     }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
       
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((DefaultTableModel)jTable.getModel()).setRowCount(0); //Vi använde den här metoden för att radera tabellinnehåll
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){ //Metoderna från valideringsklassen anropar och kontrollerar så att användaren har skrivit in rätt värde eller heltal i txtrutorna.
     int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill ändra Aliens information", "ändra",JOptionPane.YES_NO_OPTION);
        if(opt==0){     
        ArrayList<HashMap<String, String>> andraInfoAlien; //metoden ändrar information om alien
        
        String id = jTextID.getText();
        String namn = jTextNamn.getText();
        String plats = jTextplats.getText();  //Vi instansierar flera olika variablar 
        String losenord = jTextLosenord.getText();// vilka ta vad användare skriver i txtrutor 
        String AnsvarigAgent = jTextansvarig.getText();
        String RegistreringsDatum = jTextRegister.getText();
        String telefon = jTextTelefon.getText();
     try{
           int ID = Integer.parseInt(jTextID.getText());
           String fraga = "SELECT * FROM ALIEN WHERE ALIEN.ALIEN_ID='"+ID+"'";
           andraInfoAlien = mibDB.fetchRows(fraga);
        for(HashMap<String, String> alien : andraInfoAlien){
            String alien_id = String.valueOf(alien.get("ALIEN_ID"));
            String user = alien.get("NAMN");

             mibDB.update("UPDATE ALIEN SET NAMN = ('"+namn+"'), plats = ('"+plats+"'), LOSENORD=('"+losenord+"'), ANSVARIG_AGENT = ('"+AnsvarigAgent+"'), REGISTRERINGSDATUM = ('"+RegistreringsDatum+"'), TELEFON = ('"+telefon+"')  WHERE ALIEN.ALIEN_ID='"+id+"'");
             JOptionPane.showMessageDialog(null,"Aliens '" + user + "'s information har ändrat ");
                 }
    }catch(InfException ex){
             System.out.println(ex.getMessage());
    }catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
            }
        }
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){ 
        //ArrayList<HashMap<String, String>> laggaTillAlien;
        //Metoderna från valideringsklassen anropar och kontrollerar så att användaren har skrivit in rätt värde eller heltal i txtrutorna.
        //Metoden lägger till Alien
         int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill lägga till en ny Alien", "Lägg",JOptionPane.YES_NO_OPTION);
        if(opt==0){ 
        int id = Integer.parseInt(jTextID.getText());
        String registreringsDatum = jTextRegister.getText();
        String losenord = jTextLosenord.getText();  //Vi instansierar flera olika variablar  
        String namn = jTextNamn.getText();    //som användaren skriver i txtrutor
        String plats = jTextplats.getText();    
        String ansvarigAgent = jTextansvarig.getText();
        String telefon = jTextTelefon.getText();

     try{
         mibDB.insert("insert into ALIEN (ALIEN_ID, REGISTRERINGSDATUM, LOSENORD, NAMN, TELEFON, PLATS, ANSVARIG_AGENT) VALUES(('"+id+"'),('"+registreringsDatum+"'),('"+losenord+"'),('"+namn+"'), ('"+telefon+"'), ('"+plats+"'), ('"+ansvarigAgent+"'))");
         JOptionPane.showMessageDialog(null,"Ny Alien som heter '" + namn + "' har lagat till");
   }catch(InfException ex){
         System.out.println(ex.getMessage());
   }catch(NullPointerException e) {
         System.out.println("NullPointerException thrown!");
            }
        }
     }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLosenordActionPerformed
        
    }//GEN-LAST:event_jTextLosenordActionPerformed

    private void jAllaAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAllaAlienActionPerformed
           ArrayList<HashMap<String, String>> sokaAllaAlien;
     try{
          String fraga = "SELECT * FROM ALIEN ";
          sokaAllaAlien = mibDB.fetchRows(fraga);
       for(HashMap<String, String> alien : sokaAllaAlien){
         String alien_id = String.valueOf(alien.get("ALIEN_ID"));
         String regisreringsDatum = alien.get("REGISTRERINGSDATUM");
         String namn = alien.get("NAMN");
         String losenord = alien.get("LOSENORD");
         String telefon = alien.get("TELEFON");
         String plats = String.valueOf(alien.get("PLATS"));
         String ansvarigAgent = String.valueOf(alien.get("ANSVARIG_AGENT"));


      String tbData[] ={alien_id, regisreringsDatum, namn, losenord, telefon , plats, ansvarigAgent};
         DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel(); //Resultatet listas i tabellen
         tblModel.addRow(tbData);
         }
    }catch(InfException ex){
           System.out.println(ex.getMessage());
    }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
          System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jAllaAlienActionPerformed

    private void TillbackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbackaActionPerformed
        Admin adm = new Admin(id);
        adm.setVisible(true);
        dispose();
//        this.toBack();
//        setVisible(false);
//        new Admin(id).toFront();
//        new Admin(id).setState(java.awt.Frame.NORMAL);
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
            java.util.logging.Logger.getLogger(HenteraAlienForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HenteraAlienForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HenteraAlienForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HenteraAlienForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HenteraAlienForAdmin().setVisible(true); //Typ boolean, om sant så visas fönstret och om falskt så visas det inte.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbacka;
    private javax.swing.JButton jAllaAlien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLosenord;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextLosenord;
    private javax.swing.JTextField jTextNamn;
    private javax.swing.JTextField jTextRegister;
    private javax.swing.JTextField jTextTelefon;
    private javax.swing.JTextField jTextansvarig;
    private javax.swing.JTextField jTextplats;
    // End of variables declaration//GEN-END:variables
}
