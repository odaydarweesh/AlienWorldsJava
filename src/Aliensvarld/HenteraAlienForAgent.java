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
public class HenteraAlienForAgent extends javax.swing.JFrame {
private InfDB mibDB;
private Login login;
private Agent agent;
private int id;


    public HenteraAlienForAgent() {
        initComponents();
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Vi användar en metod för att stänga av bara den här JFrame

   try{
        mibDB = new InfDB("C:\\db\\MIBDB.FDB"); //Lägger till sökvägen dit databasen är placerad i undermappen "db" 
  }catch(InfException e){ //här fångas felet upp med sökvägen och felet hanteras av programmet. Detta undantag kan endast inträffa inuti try-blocket.
        JOptionPane.showMessageDialog(null,"Login misslyckad!");//Meddelandet visas vid undantag
        System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + e.getMessage());//Felmeddelandet printas
              }
        this.setLocationRelativeTo(null); //Metoden centrerar fönstret på skärmen om komponenten är null
        fyllCbValjOmrode();
        fyllCbValjAlien();
//        fyllCbValjOmradesChef();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jInfoTabel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jChefCombo = new javax.swing.JComboBox<>();
        cbValjaRas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextRegister = new javax.swing.JTextField();
        jTextLosenord = new javax.swing.JTextField();
        jTextplats = new javax.swing.JTextField();
        jTextNamn = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jAlienCombo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbValjaOmrode = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextTypRasID = new javax.swing.JTextField();
        jAlienRasNamn = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextNyTypRas = new javax.swing.JTextField();
        jTextGammalTypRas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jTextansvarig = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextTelefon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
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

        jInfoTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Registrerings Datum", "Namn", "Telefon", "Plats", "Ansvarig Agent"
            }
        ));
        jScrollPane1.setViewportView(jInfoTabel);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nya registrerade Aliens");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alien i en plats");

        jChefCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ett område...", "Svealand", "Götaland", "Norrland" }));
        jChefCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChefComboActionPerformed(evt);
            }
        });

        cbValjaRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select en viss Ras...", "WORM", "SQUID", "BOGLODITE" }));
        cbValjaRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjaRasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aliens ras");

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setText("Visa nya Aliens");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hantera dina Aliens");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("AlienID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Namn");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Plats");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lösenord");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Regisirerings datum");

        jTextRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegisterActionPerformed(evt);
            }
        });

        jTextLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLosenordActionPerformed(evt);
            }
        });

        jTextplats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextplatsActionPerformed(evt);
            }
        });

        jTextNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamnActionPerformed(evt);
            }
        });

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });

        jButton6.setText("Ändra");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setText("Ta bort");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Aliens som registerad mellan...");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("From");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("To..");

        jButton4.setText("Visa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("OmrådesChef för...");

        jAlienCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Alien..." }));
        jAlienCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlienComboActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Information om Alien");

        cbValjaOmrode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select en plats..." }));
        cbValjaOmrode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjaOmrodeActionPerformed(evt);
            }
        });

        jButton8.setText("Töm innehållet i tabellen");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Ändra Aliens ras");

        jTextTypRasID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTypRasIDActionPerformed(evt);
            }
        });

        jAlienRasNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlienRasNamnActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 153, 51));
        jButton9.setText("Lägg till");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Alien ID");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Namn");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Gammal Ras");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Ny ras");

        jButton10.setText("Ändra ras");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextansvarig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextansvarigActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Admins ansvar");

        jTextTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefon");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
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
                        .addGap(203, 203, 203)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextplats, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextansvarig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbValjaRas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChefCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAlienCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbValjaOmrode, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(13, 13, 13)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 438, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(jButton4))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(128, 128, 128))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jAlienRasNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextTypRasID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jTextNyTypRas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextGammalTypRas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(143, 143, 143))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbValjaOmrode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbValjaRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAlienCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jChefCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextTypRasID)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAlienRasNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextplats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9)))))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextGammalTypRas)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNyTypRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextansvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton10)))
                        .addGap(3, 3, 3)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hantera Alien (Agent)");

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
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tillbacka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jTextNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamnActionPerformed
        
    }//GEN-LAST:event_jTextNamnActionPerformed

    private void jTextplatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextplatsActionPerformed
            
    }//GEN-LAST:event_jTextplatsActionPerformed

    private void jTextLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLosenordActionPerformed
         
    }//GEN-LAST:event_jTextLosenordActionPerformed

    private void jTextRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegisterActionPerformed
          
    }//GEN-LAST:event_jTextRegisterActionPerformed

    private void jTextansvarigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextansvarigActionPerformed
           
    }//GEN-LAST:event_jTextansvarigActionPerformed

    private void jTextTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonActionPerformed
          
    }//GEN-LAST:event_jTextTelefonActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (Validering.textFaltHarVarde(jTextTypRasID) && (Validering.isHeltal(jTextTypRasID))){
            //ArrayList<HashMap<String, String>> laggaTillAlien;
            //Metoderna från valideringsklassen anropar och kontrollerar så att användaren har skrivit in rätt värde eller heltal i txtrutorna.
            //Metoderna tar bort och lägger till ny ras till Alien
             int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill ändra Alien ras", "ändra",JOptionPane.YES_NO_OPTION);
        if(opt==0){ 
            int id = Integer.parseInt(jTextTypRasID.getText());////Vi instansierar flera olika variabel 
            //String namn = jAlienRasNamn.getText();         //vilka tar olika värden vad användare skriver i txtrutor 
            String gammalRas = jTextGammalTypRas.getText();
            String nyRas = jTextNyTypRas.getText();

            try{
                mibDB.delete("delete FROM "+gammalRas+" WHERE ALIEN_ID = '"+id+"'"); //sql fråga för att radera en gammal ras från en alien 
                mibDB.insert("insert into "+nyRas+"(ALIEN_ID) VALUES('"+id+"')"); //sql fråga som lägger till ett nytt värde på aliens ras

                JOptionPane.showMessageDialog(null," Rasen har ändrats!");
            }catch(InfException ex){ //Undantaget från sql frågorna fångas upp och hanteras.
                System.out.println(ex.getMessage());
            }
            catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
                System.out.println("NullPointerException thrown!");
            }
        }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){ //Om metoden textFaltHarVarde och isHeltal i klassen validering samt att parametrarna anropas kommer värden hämtas och metoden att lägga till Aliens.
        //ArrayList<HashMap<String, String>> laggaTillAlien;
        //Metoderna från valideringsklassen anropar och kontrollerar så att användaren har skrivit in rätt värde eller heltal i txtrutorna.
        //Metoden lägger till Alien
         int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill lägga till Aleins information", "Lägg",JOptionPane.YES_NO_OPTION);
        if(opt==0){ 
        int id = Integer.parseInt(jTextID.getText());
        String registreringsDatum = jTextRegister.getText();
        String losenord = jTextLosenord.getText(); ////Vi instansierar flera olika variabel 
        String namn = jTextNamn.getText(); // vilka tar olika värden vad användare skriver i txtrutor 
        String plats = jTextplats.getText();
        String ansvarigAgent = jTextansvarig.getText();
        String telefon = jTextTelefon.getText();

            try{
           mibDB.insert("insert into ALIEN (ALIEN_ID, REGISTRERINGSDATUM, LOSENORD, NAMN, TELEFON, PLATS, ANSVARIG_AGENT) VALUES(('"+id+"'),('"+registreringsDatum+"'),('"+losenord+"'),('"+namn+"'), ('"+telefon+"'), ('"+plats+"'), ('"+ansvarigAgent+"'))");
           JOptionPane.showMessageDialog(null,"Ny Alien som heter '" + namn + "' har lagts till");
            }catch(InfException ex){
         System.out.println(ex.getMessage());
            }
            catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
         System.out.println("NullPointerException thrown!");
            }
        }
      }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jAlienRasNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlienRasNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlienRasNamnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ((DefaultTableModel)jInfoTabel.getModel()).setRowCount(0); //Vi använder den här metoden för att radera tabellinnehåll
    }//GEN-LAST:event_jButton8ActionPerformed

//private void fyllCbValjOmradesChef(){
//   String fraga = "Select AGENT.NAMN from AGENT WHERE AGENT.AGENT_ID in (SELECT OMRADESCHEF.AGENT_ID FROM OMRADESCHEF)";
//  ArrayList<String> omradesChefsNamn;
//  try {
//      omradesChefsNamn = mibDB.fetchColumn(fraga);
//      for(String namn : omradesChefsNamn){
//      jChefCombo.addItem(namn);
//      }
//  }
//  catch(InfException ettUndantag){
//  JOptionPane.showMessageDialog(null, "Databasefel!");
//  System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
//  }
//   catch(Exception ettUndantag){
//   JOptionPane.showMessageDialog(null, "Något gick fel!");
//  System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
//      }  
//   }
    private void cbValjaOmrodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjaOmrodeActionPerformed
        ArrayList<HashMap<String, String>> sokaAlien; //Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i ArrayList<HashMap<String, String>> som söker efter Aliens.
        try{ //Metoden väljer ett område från combobox
            String valdOmrade = cbValjaOmrode.getSelectedItem().toString();
            String fraga = "SELECT * FROM ALIEN WHERE ALIEN.PLATS IN ( SELECT PLATS.PLATS_ID FROM PLATS WHERE PLATS.BENAMNING= '" + valdOmrade + "')";
            sokaAlien = mibDB.fetchRows(fraga); //hämtar värden från raderna utifrån sql frågan
            for(HashMap<String, String> alien : sokaAlien){ //Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i Hashmap med typen string

                String alien_id = String.valueOf(alien.get("ALIEN_ID"));
                String regisreringsDatum = alien.get("REGISTRERINGSDATUM");
                String namn = alien.get("NAMN");//Vi instansierar flera olika variabel vilka tar olika värden som kommer från Hashmap alien
                //String losenord = alien.get("LOSENORD");
                String telefon = alien.get("TELEFON");
                String plats = String.valueOf(alien.get("PLATS"));
                String ansvarigAgent = String.valueOf(alien.get("ANSVARIG_AGENT"));
              String tbData[] ={alien_id, regisreringsDatum, namn,telefon , plats,ansvarigAgent};
                DefaultTableModel tblModel = (DefaultTableModel)jInfoTabel.getModel();
                tblModel.addRow(tbData); //Resultatet listas i tabellen
                }
                JOptionPane.showMessageDialog(null, "De Aliens som bor i '"+valdOmrade+"' finner du i tabellen");
         }catch(InfException ex){ //Vid särfall fångas den upp och hanteras vid denna metod
               System.out.println(ex.getMessage());
        }catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
               System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_cbValjaOmrodeActionPerformed

    private void jAlienComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlienComboActionPerformed
             ArrayList<HashMap<String, String>> soktaInfoAlien;
      try{ //Metoden söker information om alien
            String valdOmrade = jAlienCombo.getSelectedItem().toString();
            String fraga = "SELECT * FROM ALIEN WHERE NAMN='" + valdOmrade + "'";
            soktaInfoAlien = mibDB.fetchRows(fraga);
        for(HashMap<String, String> alien : soktaInfoAlien){ //Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i Hashmap med typen string

            String alien_id = String.valueOf(alien.get("ALIEN_ID"));
            String regisreringsDatum = alien.get("REGISTRERINGSDATUM");
            String namn = alien.get("NAMN");//Vi instansierar flera olika variabel vilka tar olika värden som kommer från Hashmap alien
          //String losenord = alien.get("LOSENORD");
            String telefon = alien.get("TELEFON");
            String plats = String.valueOf(alien.get("PLATS"));
            String ansvarigAgent = String.valueOf(alien.get("ANSVARIG_AGENT"));

         String [] tbData ={alien_id, regisreringsDatum, namn,telefon , plats,ansvarigAgent};
            DefaultTableModel tblModel = (DefaultTableModel)jInfoTabel.getModel();
            tblModel.addRow(tbData); //Resultatet listas i tabellen
            JOptionPane.showMessageDialog(null," All information om Alien '"+namn+"' finner du i tabellen.");

                   }
      }catch(InfException ex){
            System.out.println(ex.getMessage());
      }catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_jAlienComboActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     if ((Validering.textFaltHarVarde(jTextField1))|| (Validering.textFaltHarVarde(jTextField2))){
                //Denna metod söker upp aliens som  är registrerade mellan två datum som matas in av användaren.
            ArrayList<HashMap<String, String>> sokaAlienTvaDatum;
            String date1 = jTextField1.getText();
            String date2 = jTextField2.getText();
    try{
            String fraga = "select * from Alien where  ALIEN.REGISTRERINGSDATUM >= '"+date1+"' and ALIEN.REGISTRERINGSDATUM <= '"+date2+"'"; //sql frågan väljer två datum och söker sedan i tabellen alien för registreringdatum.
            sokaAlienTvaDatum = mibDB.fetchRows(fraga);
        for(HashMap<String, String> alien : sokaAlienTvaDatum){ //Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i Hashmap med typen string

            String alien_id = String.valueOf(alien.get("ALIEN_ID"));
            String regisreringsDatum = alien.get("REGISTRERINGSDATUM");
            String namn = alien.get("NAMN");//Vi instansierar flera olika variabel vilka tar olika värden som kommer från Hashmap alien
            //String losenord = alien.get("LOSENORD");
            String telefon = alien.get("TELEFON");
            String plats = String.valueOf(alien.get("PLATS"));
            String ansvarigAgent = String.valueOf(alien.get("ANSVARIG_AGENT"));

        String tbData[] ={alien_id, regisreringsDatum, namn,telefon , plats, ansvarigAgent};
            DefaultTableModel tblModel = (DefaultTableModel)jInfoTabel.getModel();
            tblModel.addRow(tbData);
            JOptionPane.showMessageDialog(null, "Alien i tabellen har registerats mellan dessa datum!");
            }
    }catch(InfException ex){
            System.out.println(ex.getMessage());
    }catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!"); 
            JOptionPane.showMessageDialog(null, "Det finns inga Alien registrerade mellan dessa datum!"); //om inte något objekt nås printas felmeddelandet.
          }
       } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){ //Om metoden textFaltHarVarde och isHeltal i klassen validering samt att parametrarna anropas kommer värden hämtas och metoden att ta bort Aliens.
        int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill ta borta Aliens information", "Ta bort",JOptionPane.YES_NO_OPTION);
        if(opt==0){     
            ArrayList<HashMap<String, String>> taBortAlien;
            //Metoden tar bort alien 
     try{
            int ID = Integer.parseInt(jTextID.getText());
            String fraga = "SELECT * FROM ALIEN WHERE ALIEN.ALIEN_ID='"+ID+"'";
            taBortAlien = mibDB.fetchRows(fraga); 
         for(HashMap<String, String> alien : taBortAlien){ //Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i Hashmap med typen string, slutligen tar den bort alien om slingan går igenom.
            String alien_id = String.valueOf(alien.get("ALIEN_ID"));
            String namn = alien.get("NAMN");//Vi instansierar två olika variabel vilka tar olika värden som kommer från Hashmap alien
            mibDB.delete("DELETE FROM ALIEN WHERE ALIEN.ALIEN_ID='"+alien_id+"' or ALIEN.NAMN = '"+namn+"'");
            JOptionPane.showMessageDialog(null," Aliens '"+namn+"' information har tagits bort");
                }
     }catch(InfException ex){
                System.out.println(ex.getMessage());
     }catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
                System.out.println("NullPointerException thrown!");
            }
        }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (Validering.textFaltHarVarde(jTextID) && (Validering.isHeltal(jTextID))){ //if satsen visar att om metoderna i klassen valideringen kommer for loopen gå igenom slingan och kollar alla värden i Hashmap med typen string
          int opt =JOptionPane.showConfirmDialog(null, " Äe du säker att du vill ändra Aliens information", "ändra",JOptionPane.YES_NO_OPTION);
        if(opt==0){                                                                                // vilket kommer göra det möjligt att ändra info om alien.
            ArrayList<HashMap<String, String>> andraInfoAlien;
            String id = jTextID.getText();
            String namn = jTextNamn.getText();//Vi instansiera flera olika variablar 
            String plats = jTextplats.getText(); //vad användare skriver i txtrutor 
            String AnsvarigAgent = jTextansvarig.getText();
            String RegistreringsDatum = jTextRegister.getText();
            String telefon = jTextTelefon.getText();

     try{
            int ID = Integer.parseInt(jTextID.getText());
            String fraga = "SELECT * FROM ALIEN WHERE ALIEN.ALIEN_ID='"+ID+"'"; //Väljer ut från tabellen ALIEN där ALIEN_ID är ett visst IS.
            andraInfoAlien = mibDB.fetchRows(fraga); //Hämtar värden från flera rader
        for(HashMap<String, String> alien : andraInfoAlien){ //Anropsparametern skickas till metoden och ändrar information om alien 
            String alien_id = String.valueOf(alien.get("ALIEN_ID"));//Vi instansierar en variabel vilka tar ett värden som kommer från Hashmap alien
            mibDB.update("UPDATE ALIEN SET NAMN = ('"+namn+"'), plats = ('"+plats+"'), ANSVARIG_AGENT = ('"+AnsvarigAgent+"'), REGISTRERINGSDATUM = ('"+RegistreringsDatum+"'), TELEFON = ('"+telefon+"')  WHERE ALIEN.ALIEN_ID='"+id+"'");
            JOptionPane.showMessageDialog(null," Agentens information har ändrats");
                }
     }catch(InfException ex){ //Fångar upp särfall från metoden
                System.out.println(ex.getMessage());
     }catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
                System.out.println("NullPointerException thrown!");
            }
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
            //Parametern som ska anropas
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            ArrayList<HashMap<String, String>> sokaNyaAlien; ///Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i Hashmap med typen string. Tabellen för nya aliens visas.
     try{
            String fraga = "SELECT * FROM ALIEN WHERE Alien.REGISTRERINGSDATUM>'2021-01-01'"; //Sql fråga som hämtar värden från tabellen ALIEN där registreringsdatumet är större än 2021-01-01.
            sokaNyaAlien = mibDB.fetchRows(fraga); //Hämtar värden för flera rader 
        for(HashMap<String, String> alien : sokaNyaAlien){ //for-loopen får igenom alla aliens i hashmapen.

            String alien_id = String.valueOf(alien.get("ALIEN_ID"));
            String regisreringsDatum = alien.get("REGISTRERINGSDATUM");
            String namn = alien.get("NAMN");//Vi instansierar flera olika variabel vilka tar olika värden som kommer från Hashmap alien
            //String losenord = alien.get("LOSENORD");
            String telefon = alien.get("TELEFON");
            String plats = String.valueOf(alien.get("PLATS"));
            String ansvarigAgent = String.valueOf(alien.get("ANSVARIG_AGENT"));

            String tbData[] ={alien_id, regisreringsDatum, namn,telefon , plats, ansvarigAgent};
            DefaultTableModel tblModel = (DefaultTableModel)jInfoTabel.getModel();
            tblModel.addRow(tbData); //Resultatet listas i tabellen
             }
            JOptionPane.showMessageDialog(null, "De senaste registrerade Aliens efter 2021-01-01");

    }catch(InfException ex){ //Fångar upp särfall från metoden
            System.out.println(ex.getMessage());
    }catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!");
            JOptionPane.showMessageDialog(null, "Det finns inga nya registrerade Aliens efter 2021-01-01");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbValjaRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjaRasActionPerformed
           ArrayList<HashMap<String, String>> sokaRas; //Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i Hashmap med typen string
    try{
            String valdRas = cbValjaRas.getSelectedItem().toString();
            String fraga = "SELECT * FROM ALIEN WHERE ALIEN.ALIEN_ID IN (SELECT ALIEN_ID FROM " + valdRas + ")"; //Välj ut alien _ID från alientabellen i combobox vid valdras.
            sokaRas = mibDB.fetchRows(fraga);
      for(HashMap<String, String> alien : sokaRas){ //for-loop som går igenom aliens raser.
            String alien_id = String.valueOf(alien.get("ALIEN_ID"));
            String regisreringsDatum = alien.get("REGISTRERINGSDATUM");
            String namn = alien.get("NAMN");//Vi instansierar flera olika variabel vilka tar olika värden som kommer från Hashmap alien
          //String losenord = alien.get("LOSENORD");
            String telefon = alien.get("TELEFON");
            String plats = String.valueOf(alien.get("PLATS"));
            String ansvarigAgent = String.valueOf(alien.get("ANSVARIG_AGENT"));

        String tbData[] ={alien_id, regisreringsDatum, namn,telefon , plats, ansvarigAgent};
            DefaultTableModel tblModel = (DefaultTableModel)jInfoTabel.getModel();
            tblModel.addRow(tbData); //Resultatet listas i tabellen
            JOptionPane.showMessageDialog(null," Alien '"+namn+"' tillhör rasen '"+valdRas+"' ");
            }
   }catch(InfException ex){
            JOptionPane.showMessageDialog(null," Aliens information har tagits bort"); //Resultaten har tagits bort från fönstret. 
            System.out.println(ex.getMessage());
   }catch(NullPointerException e) { //Särfallet genereras när en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!");
        }
    }//GEN-LAST:event_cbValjaRasActionPerformed

    private void jChefComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChefComboActionPerformed
            ArrayList<HashMap<String, String>>chefsdetaljer; //Anropsparametrar skickas till metoden vid ett metodanrop som går igenom for slingan och kollar alla värden i Hashmap med typen string
    try {
            String valdOmrade = jChefCombo.getSelectedItem().toString();
            String fraga = "SELECT * FROM AGENT WHERE AGENT.AGENT_ID IN (SELECT OMRADESCHEF.AGENT_ID FROM OMRADESCHEF WHERE OMRADESCHEF.OMRADE IN (SELECT OMRADE.OMRADES_ID FROM OMRADE WHERE BENAMNING ='" + valdOmrade + "'))";
            chefsdetaljer = mibDB.fetchRows(fraga); //hämtar alla rader som stämmer in på frågan
       for(HashMap<String, String> chef : chefsdetaljer){ //for-loopen går igenom slingan och kollar alla värden 
            String id = String.valueOf(chef.get("AGENT_ID"));
            String namn = chef.get("NAMN");//Vi instansierar flera olika variablar som tar olika värden som kommer från Hashmap chef
            String telefon = chef.get("TELEFON");
            String anstalldatum = chef.get("ANSTALLNINGSDATUM");
            String adminstrator = String.valueOf(chef.get("ADMINISTRATOR"));
            String omrade = String.valueOf(chef.get("OMRADE"));

        String tbData[] ={id, namn, telefon, anstalldatum,adminstrator, omrade};
            DefaultTableModel tblModel = (DefaultTableModel)jInfoTabel.getModel();
            tblModel.addRow(tbData); //Resultatet listas i tabellen
            JOptionPane.showMessageDialog(null," Agent '"+namn+"' är chef över '"+valdOmrade+"' "); 
            }
   }catch(InfException ex){
            System.out.println(ex.getMessage()); //Printar meddelandet
   }catch(NullPointerException e) { //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
            System.out.println("NullPointerException thrown!");
                    }
    }//GEN-LAST:event_jChefComboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose(); //Stänger fönstret
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            //Textruta för datum
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
            //Textruta för datum
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextTypRasIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTypRasIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTypRasIDActionPerformed

    private void TillbackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbackaActionPerformed
        Agent age = new Agent(id);
        age.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_TillbackaActionPerformed
    private void fyllCbValjOmrode(){//Vi har skapat en metod som hjälpa oss att fylla Combobox på benamning from platsTabell
           String fraga = "Select BENAMNING from PLATS";
           ArrayList<String> allaOmradesnamn;
    try {
          allaOmradesnamn = mibDB.fetchColumn(fraga); //hämtar ett värdet från en kolumn från databasen.
         for(String namn : allaOmradesnamn){ //for-loop som går igenom alla värden i listan
          cbValjaOmrode.addItem(namn); //Väljer ut ett område
          }
    }catch(InfException ettUndantag){ //FÅngar upp särfall från for-loopen
          JOptionPane.showMessageDialog(null, "Databasfel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
    }catch(Exception ettUndantag){ //Fångar upp särfall från for-loopen
          JOptionPane.showMessageDialog(null, "Något gick fel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
              }  
      }

    private void fyllCbValjAlien(){//Vi har skapat en metod som hjälper oss att fylla Combobox på namn from Alienstabell
          String fraga = "Select NAMN from ALIEN"; //sql fråga som väljer ut namn från tabellen ALIEN
          ArrayList<String> allaAliensnamn;
    try {
          allaAliensnamn = mibDB.fetchColumn(fraga); //hämtar en kolumn med värdet som stämmer in på frågan
       for(String namn : allaAliensnamn){ //Slingan går igenom alla värden
          jAlienCombo.addItem(namn);
          }
    }catch(InfException ettUndantag){ //Fångar upp undantag från sql frågan 
          JOptionPane.showMessageDialog(null, "Databasfel!");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
    }catch(Exception ettUndantag){ //Särfallet genereras nör en referensvariabel nås och inte pekar på något objekt.
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
            java.util.logging.Logger.getLogger(HenteraAlienForAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HenteraAlienForAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HenteraAlienForAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HenteraAlienForAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HenteraAlienForAgent().setVisible(true); //Typ boolean, om sant så visas fönstret och om falskt så visas det inte.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbacka;
    private javax.swing.JComboBox<String> cbValjaOmrode;
    private javax.swing.JComboBox<String> cbValjaRas;
    private javax.swing.JComboBox<String> jAlienCombo;
    private javax.swing.JTextField jAlienRasNamn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jChefCombo;
    private javax.swing.JTable jInfoTabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextGammalTypRas;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextLosenord;
    private javax.swing.JTextField jTextNamn;
    private javax.swing.JTextField jTextNyTypRas;
    private javax.swing.JTextField jTextRegister;
    private javax.swing.JTextField jTextTelefon;
    private javax.swing.JTextField jTextTypRasID;
    private javax.swing.JTextField jTextansvarig;
    private javax.swing.JTextField jTextplats;
    // End of variables declaration//GEN-END:variables
}
