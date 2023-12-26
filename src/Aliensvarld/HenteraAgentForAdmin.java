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
    public class HenteraAgentForAdmin extends javax.swing.JFrame {
    private InfDB mibDB;
    private Login login;
    private int id;

    public HenteraAgentForAdmin() {
            initComponents();
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Vi användar en metod för att stänga av bara den här JFrame
           
         try{
            mibDB = new InfDB("C:\\db\\MIBDB.FDB"); //Lägger till sökvägen dit databasen är placerad i undermappen "db" 
       } catch(InfException e){ //här fångas felet upp med sökvägen och felet hanteras av programmet. Detta undantag kan endast inträffa inuti try-blocket.
            JOptionPane.showMessageDialog(null,"Login misslyckad"); //Meddelandet visas vid undantag
            System.out.println("DBsuppkoplingen misslyckad. Felmeddelande: " + e.getMessage()); //Felmedddelandet printas
                    }
            this.setLocationRelativeTo(null); //Metoden centrerar fönstret på skärmen om komponenten är null
            fyllCbValjAgent(); // välj agent i comboxen
            fyllCbValjOmrode(); // välj område i comboboxen
            fyllCbValjAgentChef(); 
            fyllCbValjAgentChef1();
            fyllCbValjKontor(); // välj kontor
       }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Losenord = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextOmrade = new javax.swing.JTextField();
        jTextLosenord = new javax.swing.JTextField();
        jTextAdmin = new javax.swing.JTextField();
        jTextAnstDatum = new javax.swing.JTextField();
        jTextTelefon = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextNamn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSelectAgent = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSelectOmrade = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jSelectAgentChef = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSelectKontor = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jSelectAgentChef1 = new javax.swing.JComboBox<>();
        jLaggaTill = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tillbacka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setText("Ge Adminsstatus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Agent ID", "Namn", "Telefon", "Anställnings Datum", "Adminstratör", "Losenord", "Område"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alla Agenter");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adminsstatus");

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setText("Visa nya Agenter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Namn");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefon");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Anställnings Datum");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Administrator");

        Losenord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Losenord.setForeground(new java.awt.Color(255, 255, 255));
        Losenord.setText("Losenord");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Område");

        jTextOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOmradeActionPerformed(evt);
            }
        });

        jTextLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLosenordActionPerformed(evt);
            }
        });

        jTextAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAdminActionPerformed(evt);
            }
        });

        jTextAnstDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAnstDatumActionPerformed(evt);
            }
        });

        jTextTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonActionPerformed(evt);
            }
        });

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setText("Ta bort");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ändra");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ändra info för Agenter");

        jTextNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Agent ID");

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setText("Visa alla agenter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nya Agenter");

        jSelectAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select en Agent..." }));
        jSelectAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectAgentActionPerformed(evt);
            }
        });

        jButton5.setText("Töm innehållet i tabellen");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setText("Ta bort Adminsstatus");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Områdeschefsstatus");

        jSelectOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ett Område..." }));
        jSelectOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectOmradeActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 102, 255));
        jButton9.setText("Ge Chefstatus");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 51, 51));
        jButton10.setText("Ta bort Chefsstatus");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jSelectAgentChef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select en Agent..." }));
        jSelectAgentChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectAgentChefActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Kontorschefsstatus");

        jSelectKontor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ett kontor..." }));
        jSelectKontor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectKontorActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 51, 51));
        jButton11.setText("Ta bort Chefstatus");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 102, 255));
        jButton12.setText("Ge Chefstatus");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jSelectAgentChef1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select en Agent..." }));
        jSelectAgentChef1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectAgentChef1ActionPerformed(evt);
            }
        });

        jLaggaTill.setBackground(new java.awt.Color(0, 153, 51));
        jLaggaTill.setText("Lägga till");
        jLaggaTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLaggaTillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jSelectKontor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSelectAgentChef1, 0, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jSelectOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSelectAgentChef, 0, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(210, 210, 210))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Losenord, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLaggaTill, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextAnstDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSelectAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSelectAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextAnstDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLaggaTill, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSelectOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSelectAgentChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Losenord, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSelectAgentChef1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSelectKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(jButton12))
                        .addGap(95, 95, 95)
                        .addComponent(jButton3)))
                .addGap(40, 40, 40))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hantera Agent (Admin)");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbacka)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbacka)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ((DefaultTableModel)jTable.getModel()).setRowCount(0);// Vi använde den här metoden för att radera tabellinnehåll

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
             ArrayList<HashMap<String, String>> listaAllaAgent;//Denna metod visar alla agenter för Admin
        try{
                String sql= "SELECT * FROM AGENT";
                listaAllaAgent = mibDB.fetchRows(sql);
            for(HashMap<String, String> agent : listaAllaAgent){
                String id = String.valueOf(agent.get("AGENT_ID")); //Vi hämtar agentens ID
                String namn = agent.get("NAMN"); //Vi hämtar agentens namn 
                String telefon = agent.get("TELEFON");   ////Vi instansierar flera olika variablar
                String anstalldatum = agent.get("ANSTALLNINGSDATUM");//  Hämtar värden från Hashmap agent
                String adminstrator = String.valueOf(agent.get("ADMINISTRATOR")); // Hämtar agentens admin
                String losenord = agent.get("LOSENORD");// Hämtar agentens Lösenord
                String omrade = String.valueOf(agent.get("OMRADE")); //Hämtar agentens område

            String tbData[] ={id, namn, telefon, anstalldatum,adminstrator,losenord, omrade};
                DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel();
                tblModel.addRow(tbData); //Resultatet listas i tabellen
            }
       }catch(InfException ex){
               System.out.println(ex.getMessage());
       }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
               System.out.println("NullPointerException thrown!"); //Meddelandet printas
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamnActionPerformed
       
    }//GEN-LAST:event_jTextNamnActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed

    }//GEN-LAST:event_jTextIDActionPerformed

    private void jTextTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonActionPerformed

    }//GEN-LAST:event_jTextTelefonActionPerformed

    private void jTextAnstDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAnstDatumActionPerformed

    }//GEN-LAST:event_jTextAnstDatumActionPerformed

    private void jTextAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAdminActionPerformed

    }//GEN-LAST:event_jTextAdminActionPerformed

    private void jTextLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLosenordActionPerformed

    }//GEN-LAST:event_jTextLosenordActionPerformed

    private void jTextOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOmradeActionPerformed

    }//GEN-LAST:event_jTextOmradeActionPerformed
    private void fyllCbValjAgent(){//Vi har skapat en metod som hjälper oss att fylla Combobox på namn from Agentstabell
           String fraga = "Select NAMN from AGENT";
           ArrayList<String> allaAgentsnamn;
      try {
          allaAgentsnamn = mibDB.fetchColumn(fraga);
          for(String namn : allaAgentsnamn){
          jSelectAgent.addItem(namn);
          }
     }catch(InfException ettUndantag){ //lägger även till nullpointer exception
          JOptionPane.showMessageDialog(null, "Databasfel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
     }catch(Exception ettUndantag){ //lägger även till nullpointer exception
          JOptionPane.showMessageDialog(null, "Något gick fel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
          }  
       }

    private void fyllCbValjAgentChef(){//Vi har skapat en metod som hjälper oss att fylla Combobox på namn from Agentstabell
           String fraga = "Select NAMN from AGENT";
           ArrayList<String> allaAgentsnamn;
      try {
          allaAgentsnamn = mibDB.fetchColumn(fraga);
          for(String namn : allaAgentsnamn){
          jSelectAgentChef.addItem(namn);
          }
     }catch(InfException ettUndantag){
          JOptionPane.showMessageDialog( null, "Databasefel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
     }catch(Exception ettUndantag){ //lägger även till nullpointer exception
          JOptionPane.showMessageDialog(null, "Något gick fel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
          }  
       }

    private void fyllCbValjAgentChef1(){//Vi har skapat en metod som hjälper oss att fylla Combobox på namn från Agentstabell
           String fraga = "Select NAMN from AGENT";
           ArrayList<String> allaAgentsnamn;
      try {
          allaAgentsnamn = mibDB.fetchColumn(fraga); 
          for(String namn : allaAgentsnamn){ 
          jSelectAgentChef1.addItem(namn);
          }
     }catch(InfException ettUndantag){//Fångar upp särfall från frågan
          JOptionPane.showMessageDialog(null, "Databasfel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
     }catch(Exception ettUndantag){
          JOptionPane.showMessageDialog(null, "Något gick fel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
          }  
       }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          ArrayList<HashMap<String, String>> soktaNyaAgenter; // Denna metod anropar alla nya registrerade agenter 
    try{
            String fraga = "SELECT * FROM AGENT WHERE AGENT.ANSTALLNINGSDATUM>'2020-01-01'";
            soktaNyaAgenter = mibDB.fetchRows(fraga);
        for(HashMap<String, String> nyAgent : soktaNyaAgenter){ //For-loop som går igenom alla variablar i hashmap
            String id = String.valueOf(nyAgent.get("AGENT_ID"));
            String namn = nyAgent.get("NAMN");   // //Vi instansierar flera olika variabel 
            String telefon = nyAgent.get("TELEFON");// vilka tar olika värden som kommer från Hashmap nyAgent
            String anstallDatum = nyAgent.get("ANSTALLNINGSDATUM");
            String administrator = String.valueOf(nyAgent.get("ADMINISTRATOR"));
            String losenord = nyAgent.get("LOSENORD");
            String omrade = String.valueOf(nyAgent.get("OMRADE"));

         String tbData[] ={id, namn, telefon, anstallDatum, administrator,losenord, omrade};
                DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel();
                tblModel.addRow(tbData); // Resultatet listas i tabellen
                       }
    }catch(InfException ex){ //Fångar upp särfall
            System.out.println(ex.getMessage());
    }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         dispose(); //Stänger fönstret
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{ // Denna metod ger en agent administratörrättigheter.
               String valdOmrade = jSelectAgent.getSelectedItem().toString();
               mibDB.update("Update AGENT SET AGENT.ADMINISTRATOR = ('J') WHERE AGENT.NAMN ='"+valdOmrade+"'");
               JOptionPane.showMessageDialog(null,"Agent har blivit Admin (J)");
        }catch(InfException ex){ //Fångar upp särfall
               JOptionPane.showMessageDialog(null,"Något gick fel!");
               System.out.println("DBsUppkoplingen misslyckad. Felmeddelande: " + ex.getMessage());
        }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
               System.out.println("NullPointerException thrown!");
               }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSelectAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectAgentActionPerformed
                // Metoden väljer en agent i Combobox       
    }//GEN-LAST:event_jSelectAgentActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      try{ // Denna metod tar bort en agents administratörrättigheter
             String valdAgent = jSelectAgent.getSelectedItem().toString(); //Vi instansierar en variabel som ta vad användare väljer från jSelectAgent
             mibDB.update("Update AGENT SET AGENT.ADMINISTRATOR = ('N') WHERE AGENT.NAMN ='"+valdAgent+"'");
             JOptionPane.showMessageDialog(null,"Agent har blivit Agent (N)");
     }catch(InfException ex){
            JOptionPane.showMessageDialog(null,"Något gick fel!");
            System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + ex.getMessage());
     }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){   //Här lägger vi till metoder från klassen validering kontrollerar att användaren skriver in rätt värde eller ett heltal i txtrutan. 
            if (Validering.textFaltHarVarde(jTextNamn) && Validering.textFaltHarVarde(jTextTelefon)){ 
                if (Validering.textFaltHarVarde(jTextAnstDatum) && Validering.textFaltHarVarde(jTextAdmin)){   
                    if (Validering.textFaltHarVarde(jTextLosenord) && Validering.textFaltHarVarde(jTextOmrade)){   
           int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill ändra Agents information", "ändra",JOptionPane.YES_NO_OPTION);
        if(opt==0){ 
          ArrayList<HashMap<String, String>> andraInfoAgent;
          String agentID= jTextID.getText();
          String namn = jTextNamn.getText();     //Vi instansieraer flera olika variabel
          String telefon = jTextTelefon.getText();   //vilka ta vad användare skriver i txtrutor
          String anstallningsDatum = jTextAnstDatum.getText();
          String  adminstrator = jTextAdmin.getText();
          String losenord = jTextLosenord.getText();
          String omrade = jTextOmrade.getText();
    try{
           int ID = Integer.parseInt(jTextID.getText());
           String fraga = "SELECT * FROM AGENT WHERE AGENT.AGENT_ID='"+agentID+"'";
           andraInfoAgent = mibDB.fetchRows(fraga);
      for(HashMap<String, String> agent : andraInfoAgent){
           String agent_id = String.valueOf(agent.get("ALIEN_ID"));
           mibDB.update("UPDATE AGENT SET NAMN = ('"+namn+"'), TELEFON = ('"+telefon+"'), ANSTALLNINGSDATUM = ('"+anstallningsDatum+"'), ADMINISTRATOR = ('"+adminstrator+"'), LOSENORD = ('"+losenord+"'),OMRADE = ('"+omrade+"')   WHERE AGENT.AGENT_ID='"+agentID+"'");
           JOptionPane.showMessageDialog(null," Information Agents '"+namn+"' har ändrat");
                }
    }catch(InfException ex){
           System.out.println(ex.getMessage());
    }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
           System.out.println("NullPointerException thrown!");
           }
         }  
                }
            }
       }
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){  //Metoderna från valideringsklassen anropas som kontrollerar att rätt värde eller ett heltal skrivs in i txtrutorna. 
      int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill ta bort Agents information", "ta borta",JOptionPane.YES_NO_OPTION);
        if(opt==0){       
          ArrayList<HashMap<String, String>> taBortAgent;
     try{
           int ID = Integer.parseInt(jTextID.getText());
           String fraga = "SELECT * FROM Agent WHERE AGENT.AGENT_ID='"+ID+"'";
           taBortAgent = mibDB.fetchRows(fraga);
           for(HashMap<String, String> agent : taBortAgent){
           String agent_id = String.valueOf(agent.get("AGENT_ID"));
           String namn = agent.get("NAMN");

           mibDB.delete("DELETE FROM AGENT WHERE AGENT.AGENT_ID='"+agent_id+"'");
          JOptionPane.showMessageDialog(null,"Agent '" + namn + "' har tagit bort");
             }
    }catch(InfException ex){
          System.out.println(ex.getMessage());
             }
    catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
          System.out.println("NullPointerException thrown!");
           }
        }
      }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jSelectOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectOmradeActionPerformed
        // Metoden väljer ett område för områdeschefen
    }//GEN-LAST:event_jSelectOmradeActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    try{
          String valdOmrade = jSelectOmrade.getSelectedItem().toString();//Vi instansierar en variabell som ta vad användare väljer från jSelectOmrade
          String valdAgent = jSelectAgentChef.getSelectedItem().toString();//Vi instansierar en variabell som ta vad användare väljer från jSelectAgentChef
          String sql1 = "SELECT AGENT.AGENT_ID FROM AGENT WHERE AGENT.NAMN = '"+valdAgent+"'";
          String svar = mibDB.fetchSingle(sql1);
          String id = svar;
          String sql2 = "SELECT OMRADE.OMRADES_ID FROM OMRADE WHERE OMRADE.BENAMNING = '"+valdOmrade+"'";
          String result = mibDB.fetchSingle(sql2);
          String omrade = result;
          mibDB.insert("INSERT INTO OMRADESCHEF (AGENT_ID, OMRADE) VALUES(('"+id+"'),('"+omrade+"'))");
          JOptionPane.showMessageDialog(null,"Agent har blivit en Chef");
    }catch(InfException ex){
           JOptionPane.showMessageDialog(null,"Agent är redan en chef för ett område!");
           System.out.println("DBsUppkoplingen misslyckad. Felmeddelande: " + ex.getMessage());
    }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
           System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            String agentsNamn = jSelectAgentChef.getSelectedItem().toString();//Vi instansierar en variabel som ta vad användare väljer från jSelectAgentChef
     try{
            mibDB.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID IN( SELECT AGENT.AGENT_ID FROM AGENT WHERE AGENT.NAMN ='"+agentsNamn+"')");
            JOptionPane.showMessageDialog(null,"Agenten är inte längre Chef.");
    }catch(InfException ex){
            JOptionPane.showMessageDialog(null,"Något gick fel!");
            System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + ex.getMessage());
    }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!");
            }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jSelectAgentChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectAgentChefActionPerformed
        //Denna metod väljer vilken agent som ska behandlas
    }//GEN-LAST:event_jSelectAgentChefActionPerformed

    private void jSelectKontorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectKontorActionPerformed
        //Metoden ger användaren möjlighet att välja ett kontor åt kontorschefen. 
    }//GEN-LAST:event_jSelectKontorActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
          String agentsNamn = jSelectAgentChef1.getSelectedItem().toString(); //Vi instansierar en variabel som användaren väljer från jSelectAgentChef1 för att ta bort chefstatusen för en agent.
    try{
          mibDB.delete("DELETE FROM KONTORSCHEF WHERE AGENT_ID IN( SELECT AGENT.AGENT_ID FROM AGENT WHERE AGENT.NAMN ='"+agentsNamn+"')");
          JOptionPane.showMessageDialog(null,"Agenten är inte längre chef över ett kontor.");
             }
    catch(InfException ex){
          JOptionPane.showMessageDialog(null,"Något gick fel!");
          System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + ex.getMessage());
   }catch(NullPointerException e){
          System.out.println("NullPointerException thrown!");
            }
    }//GEN-LAST:event_jButton11ActionPerformed
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    try{ // Metoden gör det möjligt för admin att göra agenter till kontorschefer.
          String valdPlats = jSelectKontor.getSelectedItem().toString(); //Vi instansierar en variabel som tillåter användaren välja vilken plats. 
          String valdAgent = jSelectAgentChef1.getSelectedItem().toString(); //Vi instansierar en variabel som tillåter användaren väljer från jSelectAgentChef1
          String sql1 = "SELECT AGENT.AGENT_ID FROM AGENT WHERE AGENT.NAMN = '"+valdAgent+"'";
          String svar = mibDB.fetchSingle(sql1);
          String id = svar;
          String sql2 = "SELECT PLATS.BENAMNING FROM PLATS WHERE PLATS.BENAMNING = '"+valdPlats+"'";
          String result = mibDB.fetchSingle(sql2);
          String plats = result;
          mibDB.insert("INSERT INTO KONTORSCHEF (AGENT_ID, KONTORSBETECKNING) VALUES(('"+id+"'),('"+plats+"'))");
          JOptionPane.showMessageDialog(null,"Agenten är nu chef över '"+plats+"'");
    }catch(InfException ex){
          JOptionPane.showMessageDialog(null,"Agenten är redan chef över ett område!");
          System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + ex.getMessage());
    }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
          System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jSelectAgentChef1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectAgentChef1ActionPerformed
        // Metoden anropar en agent som ska hanteras.
    }//GEN-LAST:event_jSelectAgentChef1ActionPerformed

    private void jLaggaTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLaggaTillActionPerformed
         if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){ 
        //ArrayList<HashMap<String, String>> laggaTillAgent; Metoden lägger till en agent 
  int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill lägga till en ny Agents ", "Lägg till",JOptionPane.YES_NO_OPTION);
        if(opt==0){        
        int id = Integer.parseInt(jTextID.getText());
        String anstallningsDatum = jTextAnstDatum.getText();
        String losenord = jTextLosenord.getText();  
        String namn = jTextNamn.getText();    
        String omrade = jTextOmrade.getText();    
        String administrator = jTextAdmin.getText();
        String telefon = jTextTelefon.getText();
            //Vi instansierar flera olika variablar på kodrader 849-854 för att lägga till och hämta information till metoden laggaTillAgent
     try{
         mibDB.insert("insert into AGENT (AGENT_ID, ANSTALLNINGSDATUM, LOSENORD, NAMN, TELEFON, OMRADE, ADMINISTRATOR) VALUES(('"+id+"'),('"+anstallningsDatum+"'),('"+losenord+"'),('"+namn+"'), ('"+telefon+"'), ('"+omrade+"'), ('"+administrator+"'))");
         JOptionPane.showMessageDialog(null,"En ny Agent med namnet '" + namn + "' har lagts till.");
   }catch(InfException ex){
         System.out.println(ex.getMessage());
   }catch(NullPointerException e) { ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
         System.out.println("NullPointerException thrown!");
            }
        }
         }
    }//GEN-LAST:event_jLaggaTillActionPerformed

    private void TillbackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbackaActionPerformed
        Admin adm = new Admin(id);
        adm.setVisible(true);
        dispose();
        //        this.toBack();
        //        setVisible(false);
        //        new Admin(id).toFront();
        //        new Admin(id).setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_TillbackaActionPerformed
    private void fyllCbValjOmrode(){//Vi har skapat en metod som hjälper oss att fylla Combobox på benamning from områdestabell
         String fraga = "Select BENAMNING from OMRADE";
         ArrayList<String> allaOmradesnamn;
     try {
          allaOmradesnamn = mibDB.fetchColumn(fraga); //Hämtar alla värden från en kolumn
       for(String namn : allaOmradesnamn){ //En for slinga som går igenom alla Områdesnamn i kolumnen som hämtades
          jSelectOmrade.addItem(namn); //Väljer ett område och lägger till
          }
    }catch(InfException ettUndantag){ //
          JOptionPane.showMessageDialog(null, "Databasfel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
   }catch(Exception ettUndantag){
          JOptionPane.showMessageDialog(null, "Något gick fel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
      }  
   }

    private void fyllCbValjKontor(){//Vi har skapat en metod som hjälpa oss att fylla Combobox på benamning from platstabell
          String fraga = "Select BENAMNING from PLATS";
          ArrayList<String> allaPlatssnamn;
      try {
          allaPlatssnamn = mibDB.fetchColumn(fraga);
        for(String namn : allaPlatssnamn){ //for-loop, metoden går igenom alla namn i arraylistan
          jSelectKontor.addItem(namn);
          }
     }catch(InfException ettUndantag){
          JOptionPane.showMessageDialog(null, "Databasfel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
     }catch(Exception ettUndantag){ ////lägger även till nullpointer exception. Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
          JOptionPane.showMessageDialog(null, "Något gick fel!"); 
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
          }  
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
            java.util.logging.Logger.getLogger(HenteraAgentForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HenteraAgentForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HenteraAgentForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HenteraAgentForAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HenteraAgentForAdmin().setVisible(true); //Typ boolean, om sant så visas fönstret och om falskt så visas det inte.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Losenord;
    private javax.swing.JButton Tillbacka;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLaggaTill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jSelectAgent;
    private javax.swing.JComboBox<String> jSelectAgentChef;
    private javax.swing.JComboBox<String> jSelectAgentChef1;
    private javax.swing.JComboBox<String> jSelectKontor;
    private javax.swing.JComboBox<String> jSelectOmrade;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextAdmin;
    private javax.swing.JTextField jTextAnstDatum;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextLosenord;
    private javax.swing.JTextField jTextNamn;
    private javax.swing.JTextField jTextOmrade;
    private javax.swing.JTextField jTextTelefon;
    // End of variables declaration//GEN-END:variables
}
