
package viewUrnaEleitoral;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ViewUrna extends javax.swing.JFrame {

    
    public ViewUrna() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jToolBar1 = new javax.swing.JToolBar();
        telaPrincipal = new javax.swing.JPanel();
        telaCargoCandidato = new javax.swing.JLabel();
        fotoCandidato = new javax.swing.JLabel();
        fotoVice = new javax.swing.JLabel();
        numeroCandidato = new javax.swing.JLabel();
        nomeCandidato = new javax.swing.JLabel();
        partidoCandidato = new javax.swing.JLabel();
        painelNumerico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        painelNome = new javax.swing.JLabel();
        painelPartido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        painelVice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBranco = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tabCandidatos = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaPresidente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaGovernador = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaPrefeitos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVotos = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton13.setText("jButton13");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area de Acesso");
        setBackground(new java.awt.Color(211, 205, 127));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        telaPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        telaCargoCandidato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        fotoCandidato.setBackground(new java.awt.Color(255, 255, 255));
        fotoCandidato.setMaximumSize(new java.awt.Dimension(70, 15));
        fotoCandidato.setMinimumSize(new java.awt.Dimension(70, 15));

        numeroCandidato.setText("NUMERO");

        nomeCandidato.setText("NOME");

        partidoCandidato.setText("PARTIDO");

        painelNumerico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                painelNumericoFocusGained(evt);
            }
        });
        painelNumerico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelNumericoActionPerformed(evt);
            }
        });
        painelNumerico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                painelNumericoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("SEU VOTO PARA :");

        painelNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        painelPartido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setText("VICE");

        painelVice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout telaPrincipalLayout = new javax.swing.GroupLayout(telaPrincipal);
        telaPrincipal.setLayout(telaPrincipalLayout);
        telaPrincipalLayout.setHorizontalGroup(
            telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPrincipalLayout.createSequentialGroup()
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCandidato)
                            .addComponent(numeroCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partidoCandidato)
                            .addComponent(jLabel3))
                        .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaPrincipalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(painelNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(telaPrincipalLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelNome, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(painelPartido, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(painelVice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(telaPrincipalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telaCargoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(97, 97, 97)
                .addComponent(fotoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fotoVice, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        telaPrincipalLayout.setVerticalGroup(
            telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telaCargoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(painelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaPrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(nomeCandidato)))
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaPrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(telaPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(painelVice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(telaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partidoCandidato)
                    .addComponent(painelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(telaPrincipalLayout.createSequentialGroup()
                .addComponent(fotoCandidato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(fotoVice, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnBranco.setBackground(new java.awt.Color(255, 255, 255));
        btnBranco.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnBranco.setText("BRANCO");
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });

        btnCorrige.setBackground(new java.awt.Color(255, 153, 51));
        btnCorrige.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnCorrige.setText("CORRIGE");
        btnCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigeActionPerformed(evt);
            }
        });

        btnConfirma.setBackground(new java.awt.Color(102, 255, 102));
        btnConfirma.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnConfirma.setText("CONFIRMA");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorderPainted(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btn0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn0KeyPressed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnCorrige)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel1.setText("   JUSTIÇA");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel4.setText("ELEITORAL");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\tamir\\Documents\\NetBeansProjects\\Urna Imagens Candidatos\\UA icon.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabCandidatos.setBackground(new java.awt.Color(0, 0, 255));
        tabCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCandidatosMouseClicked(evt);
            }
        });

        tabelaPresidente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Enji Todoroki", "Hawks",  new Short((short) 23), "Dourado"},
                {"Nemuri Kayamai", "Mirko",  new Short((short) 27), "Roxo"},
                {"Tomura Shigaraki", "Dabi",  new Short((short) 20), "Preto"},
                {"Kai Chisaki", "Chizome Akaguro",  new Short((short) 31), "Azul"},
                {"Shota Aizawa ", "Hizashi Yamada",  new Short((short) 30), "Cinza"}
            },
            new String [] {
                "Presidente", "Vice", "Numero", "Partido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaPresidente.setName(""); // NOI18N
        tabelaPresidente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPresidenteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaPresidenteMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaPresidente);
        if (tabelaPresidente.getColumnModel().getColumnCount() > 0) {
            tabelaPresidente.getColumnModel().getColumn(0).setHeaderValue("Presidente");
            tabelaPresidente.getColumnModel().getColumn(1).setHeaderValue("Vice");
            tabelaPresidente.getColumnModel().getColumn(2).setHeaderValue("Numero");
            tabelaPresidente.getColumnModel().getColumn(3).setHeaderValue("Partido");
        }
        tabelaPresidente.getAccessibleContext().setAccessibleName("");

        tabCandidatos.addTab("Presidentes", jScrollPane3);

        tabelaGovernador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Izuku Midoriya", "Shoto Todoroki", "23", "Dourado"},
                {"Katsuki Bakugo", "Eijiro Kirishima", "27", "Roxo"},
                {"Kurogiri", "Atsuhiro Sako", "20", "Preto"},
                {"Jin Bubaigawara", "Himiko Toga", "31", "Azul"},
                {"Fumikage Tokoyami", "Dark Shadow", "30", "Cinza"}
            },
            new String [] {
                "Governador", "Vice", "Numero", "Partido"
            }
        ));
        tabelaGovernador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaGovernadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaGovernador);

        tabCandidatos.addTab("Governadores", jScrollPane2);

        tabelaPrefeitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ten-ya Iida", "Momo Yaoyorozu", "23", "Dourado"},
                {"Ochaco Uraraka", "Mina Ashido", "27", "Roxo"},
                {"Shiuchi Iguchi", "Manami Aiba", "20", "Preto"},
                {"Giran", "Kenji Hikiishi", "31", "Azul"},
                {"Hitoshi Shinsou", "Kyoka Jiro", "30", "Cinza"}
            },
            new String [] {
                "Prefeito", "Vice", "Numero", "Partido"
            }
        ));
        tabelaPrefeitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPrefeitosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaPrefeitos);

        tabCandidatos.addTab("Prefeitos", jScrollPane4);

        menuVotos.setText("Contagem de Votos");
        menuVotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVotosMouseClicked(evt);
            }
        });
        menuVotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVotosActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuVotos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabCandidatos, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Urna Eleitoral");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigeActionPerformed
        painelNumerico.setText("");
        painelNome.setText("");
        painelVice.setText("");
        painelPartido.setText("");
        telaCargoCandidato.setText("");
        fotoCandidato.setIcon(null);
        fotoVice.setIcon(null);
    }//GEN-LAST:event_btnCorrigeActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        // TODO add your handling code here:
        
        try {
            
            

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos", "root", "fuhupthe1r0ns");
            
            
       
            if (null != telaCargoCandidato.getText()) switch (telaCargoCandidato.getText()) {
                case "Presidente":{
                    String tab_name = "votos_presidentes";
                    String sql = "insert into " +tab_name+ " (nome,numero,partido,cargo) values (?,?,?,?) ";
                    PreparedStatement stmt = con.prepareCall(sql);
                    stmt.setString(1, painelNome.getText());
                    stmt.setInt(2, Integer.parseInt(painelNumerico.getText()));
                    stmt.setString(3, painelPartido.getText());
                    stmt.setString(4,telaCargoCandidato.getText());
                    stmt.executeUpdate();
                        break;
                    }
                case "Governador":{
                    String tab_name = "votos_governadores";
                    String sql = "insert into `" +tab_name+ "` (nome,numero,partido,cargo) values (?,?,?,?) ";
                    PreparedStatement stmt = con.prepareCall(sql);
                    stmt.setString(1, painelNome.getText());
                    stmt.setInt(2, Integer.parseInt(painelNumerico.getText()));
                    stmt.setString(3, painelPartido.getText());
                    stmt.setString(4,telaCargoCandidato.getText());
                    stmt.executeUpdate();
                        break;
                    }
                case "Prefeitos":{
                    String tab_name = "votos_prefeitos";
                    String sql = "insert into `" +tab_name+ "` (nome,numero,partido,cargo) values (?,?,?,?) ";
                    PreparedStatement stmt = con.prepareCall(sql);
                    stmt.setString(1, painelNome.getText());
                    stmt.setInt(2, Integer.parseInt(painelNumerico.getText()));
                    stmt.setString(3, painelPartido.getText());
                    stmt.setString(4,telaCargoCandidato.getText());
                    stmt.executeUpdate();
                        break;
                    }
                default:
                    break;
            }
            

        } catch (SQLException | ClassNotFoundException   ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        JOptionPane.showMessageDialog(null, "Voto Confirmado!");
         painelNumerico.setText("");
         painelNome.setText("");
         painelVice.setText("");
         painelPartido.setText("");
         telaCargoCandidato.setText("");
         fotoCandidato.setIcon(null);
         fotoVice.setIcon(null);
        
         
        
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       painelNumerico.setText(painelNumerico.getText()+ "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
       painelNumerico.setText(painelNumerico.getText()+ "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        painelNumerico.setText(painelNumerico.getText()+ "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        painelNumerico.setText(painelNumerico.getText()+ "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       painelNumerico.setText(painelNumerico.getText()+ "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        painelNumerico.setText(painelNumerico.getText()+ "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        painelNumerico.setText(painelNumerico.getText()+ "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        painelNumerico.setText(painelNumerico.getText()+ "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       painelNumerico.setText(painelNumerico.getText()+ "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        painelNumerico.setText(painelNumerico.getText()+ "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn0KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn0KeyPressed

    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        // TODO add your handling code here:
        
        try {
            
            

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos", "root", "fuhupthe1r0ns");
            
            
       
            if (null != telaCargoCandidato.getText()) switch (telaCargoCandidato.getText()) {
                case "Presidente":{
                    
                    String sql = "insert into votos_presidentes (nome,cargo) values ('Branco', 'Presidente') ";
                    PreparedStatement stmt = con.prepareCall(sql);          
                    stmt.executeUpdate();
                        break;
                    }
                case "Governador":{
                   String sql = "insert into votos_governadores (nome,cargo) values ('Branco', 'Governador') ";
                    PreparedStatement stmt = con.prepareCall(sql);          
                    stmt.executeUpdate();
                        break;
                    }
                case "Prefeito":{
                    String sql = "insert into votos_prefeitos (nome,cargo) values ('Branco', 'Prefeito') ";
                    PreparedStatement stmt = con.prepareCall(sql);          
                    stmt.executeUpdate();
                        break;
                    }
                default:
                    break;
            }
            

        } catch (SQLException | ClassNotFoundException   ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        JOptionPane.showMessageDialog(null, "Voto Em Branco Confirmado!");
         painelNumerico.setText("");
         painelNome.setText("");
         painelVice.setText("");
         painelPartido.setText("");
         telaCargoCandidato.setText("");
         fotoCandidato.setIcon(null);
         fotoVice.setIcon(null);
        
        
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void painelNumericoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelNumericoActionPerformed

        BufferedImage img1 = null;
        BufferedImage img2 = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos", "root", "fuhupthe1r0ns");
            
            
            


            String sql = "select id, nome,nomevice,numero,partido,cargo,foto,fotovice from presidentes where numero like ? ";
            String num = painelNumerico.getText();

            PreparedStatement stmt = con.prepareCall(sql);
            stmt.setString(1, num);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String id = rs.getString(1);
                String nome = rs.getString(2);
                String nomevice = rs.getString(3);
                int numero = rs.getInt(4);
                String partido = rs.getString(5);
                String cargo = rs.getString(6);
                
                String imageCandidato = "C:/Users/tamir/Documents/NetBeansProjects/Urna Imagens Candidatos/Presidentes/"+nome+".jpg";
                img1 = ImageIO.read(new File(imageCandidato));
                String imageVice = "C:/Users/tamir/Documents/NetBeansProjects/Urna Imagens Candidatos/Presidentes/"+nomevice+".jpg";
                img2 = ImageIO.read(new File(imageVice));

               
                telaCargoCandidato.setText(cargo);
                painelNome.setText(nome);
                painelVice.setText(nomevice);
                painelPartido.setText(partido);
                fotoCandidato.setIcon(new ImageIcon (img1));
                fotoVice.setIcon(new ImageIcon (img2));
                


            }


        } catch (SQLException | ClassNotFoundException | IOException   ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        
    }//GEN-LAST:event_painelNumericoActionPerformed

    private void tabCandidatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCandidatosMouseClicked
       
    }//GEN-LAST:event_tabCandidatosMouseClicked

    private void tabelaPresidenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPresidenteMousePressed
         telaCargoCandidato.setText("Presidente");
    }//GEN-LAST:event_tabelaPresidenteMousePressed

    private void tabelaPresidenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPresidenteMouseClicked
        telaCargoCandidato.setText("Presidente");
        
        BufferedImage img1 = null;
        BufferedImage img2 = null;
        
         try {

         
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");
            
            String num = painelNumerico.getText();
            String sql = "select id, nome,nomevice,numero,partido,cargo from presidentes where numero like ? ";
            
            PreparedStatement stmt = con.prepareCall(sql);
            stmt.setString(1, num);
            ResultSet rs = stmt.executeQuery();
            
           
            while (rs.next()) {
                String id = rs.getString(1);
                String nome = rs.getString(2);
                String nomevice = rs.getString(3);
                int numero = rs.getInt(4);
                String partido = rs.getString(5);
                String cargo = rs.getString(6);
                
                String imageCandidato = "C:/Users/tamir/Documents/NetBeansProjects/Urna Imagens Candidatos/Presidentes/"+nome+".jpg";
                img1 = ImageIO.read(new File(imageCandidato));
                String imageVice = "C:/Users/tamir/Documents/NetBeansProjects/Urna Imagens Candidatos/Presidentes/"+nomevice+".jpg";
                img2 = ImageIO.read(new File(imageVice));

               
                telaCargoCandidato.setText(cargo);
                painelNome.setText(nome);
                painelVice.setText(nomevice);
                painelPartido.setText(partido);
                fotoCandidato.setIcon(new ImageIcon (img1));
                fotoVice.setIcon(new ImageIcon (img2));
                
                //        fazer procedimento aqui para mandar dados para o banco
              
            }
         
            
        } catch (SQLException | ClassNotFoundException | IOException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_tabelaPresidenteMouseClicked

    private void tabelaGovernadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaGovernadorMouseClicked
        telaCargoCandidato.setText("Governador");
        BufferedImage img1 = null;
        BufferedImage img2 = null;
        
         try {

         
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");
            
            String num = painelNumerico.getText();
            String sql = "select id, nome,nomevice,numero,partido,cargo from governadores where numero like ? ";
            
            PreparedStatement stmt = con.prepareCall(sql);
            stmt.setString(1, num);
            ResultSet rs = stmt.executeQuery();
            
           
            while (rs.next()) {
                String id = rs.getString(1);
                String nome = rs.getString(2);
                String nomevice = rs.getString(3);
                int numero = rs.getInt(4);
                String partido = rs.getString(5);
                String cargo = rs.getString(6);
                
                String imageCandidato = "C:/Users/tamir/Documents/NetBeansProjects/Urna Imagens Candidatos/Governadores/"+nome+".jpg";
                img1 = ImageIO.read(new File(imageCandidato));
                String imageVice = "C:/Users/tamir/Documents/NetBeansProjects/Urna Imagens Candidatos/Governadores/"+nomevice+".jpg";
                img2 = ImageIO.read(new File(imageVice));
                
                telaCargoCandidato.setText(cargo);
                painelNome.setText(nome);
                painelVice.setText(nomevice);
                painelPartido.setText(partido);
                fotoCandidato.setIcon(new ImageIcon (img1));
                fotoVice.setIcon(new ImageIcon (img2));
                
                //        fazer procedimento aqui para mandar dados para o banco
              
            }
         
            
        } catch (SQLException | ClassNotFoundException | IOException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaGovernadorMouseClicked

    private void tabelaPrefeitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPrefeitosMouseClicked
        telaCargoCandidato.setText("Prefeito");
        BufferedImage img1 = null;
        BufferedImage img2 = null;
        
         try {

         
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");
            
            String num = painelNumerico.getText();
            String sql = "select id, nome,nomevice,numero,partido,cargo from prefeitos where numero like ? ";
            
            PreparedStatement stmt = con.prepareCall(sql);
            stmt.setString(1, num);
            ResultSet rs = stmt.executeQuery();
            
           
            while (rs.next()) {
                String id = rs.getString(1);
                String nome = rs.getString(2);
                String nomevice = rs.getString(3);
                int numero = rs.getInt(4);
                String partido = rs.getString(5);
                String cargo = rs.getString(6);
                
                String imageCandidato = "C:/Users/tamir/Documents/NetBeansProjects/Urna Imagens Candidatos/Prefeitos/"+nome+".jpg";
                img1 = ImageIO.read(new File(imageCandidato));
                String imageVice = "C:/Users/tamir/Documents/NetBeansProjects/Urna Imagens Candidatos/Prefeitos/"+nomevice+".jpg";
                img2 = ImageIO.read(new File(imageVice));
                
                telaCargoCandidato.setText(cargo);
                painelNome.setText(nome);
                painelVice.setText(nomevice);
                painelPartido.setText(partido);
                fotoCandidato.setIcon(new ImageIcon (img1));
                fotoVice.setIcon(new ImageIcon (img2));
                
                //        fazer procedimento aqui para mandar dados para o banco

              
            }
         
            
        } catch (SQLException | ClassNotFoundException | IOException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaPrefeitosMouseClicked

    private void painelNumericoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_painelNumericoKeyTyped
        
    }//GEN-LAST:event_painelNumericoKeyTyped

    private void painelNumericoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_painelNumericoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_painelNumericoFocusGained

    private void menuVotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVotosActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_menuVotosActionPerformed

    private void menuVotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVotosMouseClicked
        // TODO add your handling code here:
        
//       CONSTRUTOR DA ABA SENHA
        JPasswordField password = new JPasswordField(10);
	password.setEchoChar('*'); 
	
	JLabel rotulo = new JLabel("Entre com a senha: 'password' ");
        
			
	JPanel entUsuario = new JPanel();
	entUsuario.add(rotulo);
      
	entUsuario.add(password);

	JOptionPane.showMessageDialog(null, entUsuario, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);

        if(Arrays.equals(password.getPassword(), new char[]{'p','a','s','s','w','o','r','d'})) {
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
            new viewVotos().setVisible(true);
            
//            QUERY TOTAL DE VOTOS A PRESIDENTES
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");           
            String sql = "select count(*) as num_votos from votos_presidentes;";
            
            PreparedStatement stmt = con.prepareCall(sql);

            ResultSet rs = stmt.executeQuery();
            
                while (rs.next()) {
                    String total_votos = rs.getString(1);
                    viewVotos.totalVotosPresLabel.setText("Total De Votos =                 " + total_votos);
                }
                
 
        } catch (SQLException | ClassNotFoundException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
//            QUERY DE VOTOS A PRESIDENTES
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");           
            String sql = "select nome,partido, count(*) as votos from votos_presidentes group by nome order by votos desc limit 6;";
            
            PreparedStatement stmt = con.prepareCall(sql);

            ResultSet rs = stmt.executeQuery();
            
                rs.next();
                String nome1 = rs.getString(1);
                String partido = rs.getString(2);
                String count = rs.getString(3);
                viewVotos.candidato1Label.setText(nome1);
                viewVotos.qtdVotos1.setText("Votos = " + count);
                viewVotos.progBarCand1.setValue(Integer.parseInt(count));
                viewVotos.progBarCand1.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome2 = rs.getString(1);
                String partido2 = rs.getString(2);
                String count2 = rs.getString(3);
                viewVotos.candidato2Label.setText(nome2);
                viewVotos.qtdVotos2.setText("Votos = " + count2);
                viewVotos.progBarCand2.setValue(Integer.parseInt(count2));
                viewVotos.progBarCand2.setStringPainted(rootPaneCheckingEnabled);
                
                
                
                rs.next();
                String nome3 = rs.getString(1);
                String partido3 = rs.getString(2);
                String count3 = rs.getString(3);
                viewVotos.candidato3Label.setText(nome3);
                viewVotos.qtdVotos3.setText("Votos = " + count3);
                viewVotos.progBarCand3.setValue(Integer.parseInt(count3));
                viewVotos.progBarCand3.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome4 = rs.getString(1);
                String partido4 = rs.getString(2);
                String count4 = rs.getString(3);
                viewVotos.candidato4Label.setText(nome4);
                viewVotos.qtdVotos4.setText("Votos = " + count4);
                viewVotos.progBarCand4.setValue(Integer.parseInt(count4));
                viewVotos.progBarCand4.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome5 = rs.getString(1);
                String partido5 = rs.getString(2);
                String count5 = rs.getString(3);
                viewVotos.candidato5Label.setText(nome5);
                viewVotos.qtdVotos5.setText("Votos = " + count5);
                viewVotos.progBarCand5.setValue(Integer.parseInt(count5));
                viewVotos.progBarCand5.setStringPainted(rootPaneCheckingEnabled);
                
                
        } catch (SQLException | ClassNotFoundException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
            
//           QUERY TOTAL DE VOTOS GOVERNADORES 
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");           
            String sql = "select count(*) as num_votos from votos_governadores;";
            
            PreparedStatement stmt = con.prepareCall(sql);

            ResultSet rs = stmt.executeQuery();
            
                while (rs.next()) {
                    String total_votos = rs.getString(1);
                    viewVotos.totalVotosGovLabel.setText("Total De Votos =                 " + total_votos);
                }
                
 
        } catch (SQLException | ClassNotFoundException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
            
//          QUERY DE VOTOS A GOVERNADORES
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");           
            String sql = "select nome,partido, count(*) as votos from votos_governadores group by nome order by votos desc limit 6;";
            
            PreparedStatement stmt = con.prepareCall(sql);

            ResultSet rs = stmt.executeQuery();
            
                rs.next();
                String nome1 = rs.getString(1);
                String partido = rs.getString(2);
                String count = rs.getString(3);
                viewVotos.candidatoGov1Label.setText(nome1);
                viewVotos.qtdVotosGov1.setText("Votos = " + count);
                viewVotos.progBarCandGov1.setValue(Integer.parseInt(count));
                viewVotos.progBarCandGov1.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome2 = rs.getString(1);
                String partido2 = rs.getString(2);
                String count2 = rs.getString(3);
                viewVotos.candidatoGov2Label.setText(nome2);
                viewVotos.qtdVotosGov2.setText("Votos = " + count2);
                viewVotos.progBarCandGov2.setValue(Integer.parseInt(count2));
                viewVotos.progBarCandGov2.setStringPainted(rootPaneCheckingEnabled);
                
                
                
                rs.next();
                String nome3 = rs.getString(1);
                String partido3 = rs.getString(2);
                String count3 = rs.getString(3);
                viewVotos.candidatoGov3Label.setText(nome3);
                viewVotos.qtdVotosGov3.setText("Votos = " + count3);
                viewVotos.progBarCandGov3.setValue(Integer.parseInt(count3));
                viewVotos.progBarCandGov3.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome4 = rs.getString(1);
                String partido4 = rs.getString(2);
                String count4 = rs.getString(3);
                viewVotos.candidatoGov4Label.setText(nome4);
                viewVotos.qtdVotosGov4.setText("Votos = " + count4);
                viewVotos.progBarCandGov4.setValue(Integer.parseInt(count4));
                viewVotos.progBarCandGov4.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome5 = rs.getString(1);
                String partido5 = rs.getString(2);
                String count5 = rs.getString(3);
                viewVotos.candidatoGov5Label.setText(nome5);
                viewVotos.qtdVotosGov5.setText("Votos = " + count5);
                viewVotos.progBarCandGov5.setValue(Integer.parseInt(count5));
                viewVotos.progBarCandGov5.setStringPainted(rootPaneCheckingEnabled);
                
                
 
        } catch (SQLException | ClassNotFoundException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        //           QUERY TOTAL DE VOTOS PREFEITOS
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");           
            String sql = "select count(*) as num_votos from votos_prefeitos;";
            
            PreparedStatement stmt = con.prepareCall(sql);

            ResultSet rs = stmt.executeQuery();
            
                while (rs.next()) {
                    String total_votos = rs.getString(1);
                    viewVotos.totalVotosPrefLabel.setText("Total De Votos =                 " + total_votos);
                }
                
 
        } catch (SQLException | ClassNotFoundException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }
            
//          QUERY DE VOTOS A PREFEITOS
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidatos","root","fuhupthe1r0ns");           
            String sql = "select nome,partido, count(*) as votos from votos_prefeitos group by nome order by votos desc limit 6;";
            
            PreparedStatement stmt = con.prepareCall(sql);

            ResultSet rs = stmt.executeQuery();
            
                rs.next();
                String nome1 = rs.getString(1);
                String partido = rs.getString(2);
                String count = rs.getString(3);
                viewVotos.candidatoPref1Label.setText(nome1);
                viewVotos.qtdVotosPref1.setText("Votos = " + count);
                viewVotos.progBarCandPref1.setValue(Integer.parseInt(count));
                viewVotos.progBarCandPref1.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome2 = rs.getString(1);
                String partido2 = rs.getString(2);
                String count2 = rs.getString(3);
                viewVotos.candidatoPref2Label.setText(nome2);
                viewVotos.qtdVotosPref2.setText("Votos = " + count2);
                viewVotos.progBarCandPref2.setValue(Integer.parseInt(count2));
                viewVotos.progBarCandPref2.setStringPainted(rootPaneCheckingEnabled);
                
                
                
                rs.next();
                String nome3 = rs.getString(1);
                String partido3 = rs.getString(2);
                String count3 = rs.getString(3);
                viewVotos.candidatoPref3Label.setText(nome3);
                viewVotos.qtdVotosPref3.setText("Votos = " + count3);
                viewVotos.progBarCandPref3.setValue(Integer.parseInt(count3));
                viewVotos.progBarCandPref3.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome4 = rs.getString(1);
                String partido4 = rs.getString(2);
                String count4 = rs.getString(3);
                viewVotos.candidatoPref4Label.setText(nome4);
                viewVotos.qtdVotosPref4.setText("Votos = " + count4);
                viewVotos.progBarCandPref4.setValue(Integer.parseInt(count4));
                viewVotos.progBarCandPref4.setStringPainted(rootPaneCheckingEnabled);
                
                
                rs.next();
                String nome5 = rs.getString(1);
                String partido5 = rs.getString(2);
                String count5 = rs.getString(3);
                viewVotos.candidatoPref5Label.setText(nome5);
                viewVotos.qtdVotosPref5.setText("Votos = " + count5);
                viewVotos.progBarCandPref5.setValue(Integer.parseInt(count5));
                viewVotos.progBarCandPref5.setStringPainted(rootPaneCheckingEnabled);
                
                
 
        } catch (SQLException | ClassNotFoundException  ex) {
            Logger.getLogger(ViewUrna.class.getName()).log(Level.SEVERE, null, ex);
        }    


            
            
        } else {
          JOptionPane.showMessageDialog(null, "Senha Incorreta!");
        }
	char[] senha = password.getPassword();
               
    }//GEN-LAST:event_menuVotosMouseClicked

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
            java.util.logging.Logger.getLogger(ViewUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUrna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewUrna().setVisible(true);
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JLabel fotoCandidato;
    private javax.swing.JLabel fotoVice;
    private javax.swing.JButton jButton13;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuVotos;
    private javax.swing.JLabel nomeCandidato;
    private javax.swing.JLabel numeroCandidato;
    private javax.swing.JLabel painelNome;
    private javax.swing.JTextField painelNumerico;
    private javax.swing.JLabel painelPartido;
    private javax.swing.JLabel painelVice;
    private javax.swing.JLabel partidoCandidato;
    private javax.swing.JTabbedPane tabCandidatos;
    private javax.swing.JTable tabelaGovernador;
    private javax.swing.JTable tabelaPrefeitos;
    private javax.swing.JTable tabelaPresidente;
    private javax.swing.JLabel telaCargoCandidato;
    private javax.swing.JPanel telaPrincipal;
    // End of variables declaration//GEN-END:variables

    public JTextField getPainelNumerico() {
        return painelNumerico;
    }

    public void setPainelNumerico(JTextField painelNumerico) {
        this.painelNumerico = painelNumerico;
    }

    



}




