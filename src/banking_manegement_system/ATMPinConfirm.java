/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_manegement_system;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ATMPinConfirm extends javax.swing.JFrame {

    LinkedList list=new LinkedList();
    // Customer cus;
    public ATMPinConfirm() {
        initComponents();
        scaleImage();
        readFile();
    }
 public void scaleImage(){
        ImageIcon icon=new ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\chip.png");
        Image img=icon.getImage();
        Image imgScale=img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon scaledIcon=new ImageIcon(imgScale);
        jLabel1.setIcon(scaledIcon);
    }
    private void readFile(){
        try{
            File myObj=new File("data.txt");
            Scanner myReader=new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                if(data.length()>5)
                {
                    String[] cus=data.split(";");
                    // cnic+";"+name+";"+ balance+";"+pin+ ";" + accountNo + ";"+card
                    list.insert(new Customer(cus[0],cus[1],Double.parseDouble(cus[2]),Integer.parseInt(cus[3]),cus[4],cus[5]));
                }
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occured...");
            e.printStackTrace();
    }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        card = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pin = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(240, 255, 228));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        card.setBackground(new java.awt.Color(0, 0, 0));
        card.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        card.setForeground(new java.awt.Color(255, 255, 255));
        card.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardFocusGained(evt);
            }
        });
        card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 153, 153));
        jButton10.setText(".");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Enter Card #");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\chip.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 153, 153));
        jButton11.setText(" ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 48)); // NOI18N
        label1.setText("GOLDEN ATM");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\circle.png")); // NOI18N
        jLabel2.setText("jLabel2");

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 153, 153));
        jButton12.setText("0");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\circle.png")); // NOI18N
        jLabel3.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\circle.png")); // NOI18N
        jLabel4.setText("jLabel2");

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton13.setText("OK");

        jButton14.setBackground(new java.awt.Color(255, 153, 0));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Clear");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\circle.png")); // NOI18N
        jLabel5.setText("jLabel2");

        jButton15.setBackground(new java.awt.Color(255, 0, 0));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Cancle");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\circle.png")); // NOI18N
        jLabel6.setText("jLabel2");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 153, 51));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Enter");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\circle.png")); // NOI18N
        jLabel7.setText("jLabel2");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("6");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\circle.png")); // NOI18N
        jLabel8.setText("jLabel2");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\nisan\\OneDrive\\Documents\\NetBeansProjects\\Banking_Manegement_System\\İcon\\circle.png")); // NOI18N
        jLabel9.setText("jLabel2");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 153));
        jButton6.setText("4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(403, 347));

        jLabel10.setBackground(new java.awt.Color(102, 192, 251));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PIN");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pin.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 13)); // NOI18N
        pin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pinFocusLost(evt);
            }
        });
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 153, 153));
        jButton7.setText("9");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 153, 153));
        jButton8.setText("7");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 153, 153));
        jButton9.setText("8");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(46, 46, 46)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(108, 108, 108))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int p=0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      JOptionPane.showMessageDialog(null,""+p);
      
        if(p==1)
        {
            pin.setText(pin.getText()+"3");
        }
        else if(p==2)
        {
            if(card.getText().length()==4)
            {
                card.setText(card.getText()+" ");
            }
            else if(card.getText().length()==8)
            {
                card.setText(card.getText()+" ");
            }
            else if(card.getText().length()==12)
            {
                card.setText(card.getText()+" ");
            }
            card.setText(card.getText()+"3");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(null, ""+p);
        if(p==1)
        {
          pin.setText(pin.getText()+"5");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"5");
           
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

      this.setVisible(false);
new Home().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:

       
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
Customer cus= list.checkPInCard(pin.getText(),card.getText());
        if(cus!=null)
        {
            this.setVisible(false);
        new ATMHOME(cus).setVisible(true);
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Invalid Card PIN or CARD #");
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      
    }//GEN-LAST:event_jLabel7MouseClicked

    private void cardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardFocusGained
        p=2;    // TODO add your handling code here:
    }//GEN-LAST:event_cardFocusGained

    private void cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(p==1)
        {
          pin.setText(pin.getText()+"1");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"1");
           
        }
// TODO add your handling code here:
                                          

    }//GEN-LAST:event_jButton1ActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void pinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinFocusGained
      p=1;  // TODO add your handling code here:
    }//GEN-LAST:event_pinFocusGained

    private void pinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_pinFocusLost

    private void pinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinKeyPressed

    private void pinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pinKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
           if(p==1)
        {
          pin.setText(pin.getText()+"9");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"9");
           
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         if(p==1)
        {
          pin.setText(pin.getText()+"0");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"0");
           
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
          if(p==1)
        {
          pin.setText(pin.getText()+".");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+".");
           
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        pin.setText("");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(p==1)
        {
          pin.setText(pin.getText()+"2");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"2");
           
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      if(p==1)
        {
          pin.setText(pin.getText()+"4");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"4");
           
        }    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(p==1)
        {
          pin.setText(pin.getText()+"6");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"6");
           
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      if(p==1)
        {
          pin.setText(pin.getText()+"7");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"7");
           
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         if(p==1)
        {
          pin.setText(pin.getText()+"8");
        
        }
        else if(p==2)
        {
           if(card.getText().length()==4)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
           else if(card.getText().length()==8)
            
           {
              card.setText(card.getText()+" ");
           }
           
           
          else if(card.getText().length()==12)
            
           {
              card.setText(card.getText()+" ");
           }
           
            card.setText(card.getText()+"8");
           
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

  
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
            java.util.logging.Logger.getLogger(ATMPinConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMPinConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMPinConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMPinConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMPinConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField card;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private javax.swing.JTextField pin;
    // End of variables declaration//GEN-END:variables
}
