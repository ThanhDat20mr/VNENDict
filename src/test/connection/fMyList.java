/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.connection;

import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TAEDA
 */
public class fMyList extends javax.swing.JFrame {

    /**
     * Creates new form fMyList
     */
    public fMyList() {
        initComponents();
        bindData();
        sync();
    }
    DefaultListModel defaultListModel = new DefaultListModel();
    ImageIcon iconF = new ImageIcon(getClass().getResource("/Res/Fav.png"));
    ImageIcon iconUnF = new ImageIcon(getClass().getResource("/Res/UnFav.png"));
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNewVo = new javax.swing.JPanel();
        lbLang = new javax.swing.JLabel();
        btnTrain = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listVo = new javax.swing.JList<>();
        txtSearch = new javax.swing.JTextField();
        btnFav = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextArea();
        btnPro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/logo.png"))); // NOI18N

        btnNewVo.setBackground(new java.awt.Color(0, 102, 102));
        btnNewVo.setToolTipText("");
        btnNewVo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNewVoMousePressed(evt);
            }
        });

        lbLang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbLang.setForeground(new java.awt.Color(255, 255, 255));
        lbLang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/add.png"))); // NOI18N
        lbLang.setText("  New Vocabulary");

        javax.swing.GroupLayout btnNewVoLayout = new javax.swing.GroupLayout(btnNewVo);
        btnNewVo.setLayout(btnNewVoLayout);
        btnNewVoLayout.setHorizontalGroup(
            btnNewVoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNewVoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbLang)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btnNewVoLayout.setVerticalGroup(
            btnNewVoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNewVoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLang, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnTrain.setBackground(new java.awt.Color(0, 102, 102));
        btnTrain.setToolTipText("");
        btnTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTrainMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/training.png"))); // NOI18N
        jLabel2.setText("  Training");

        javax.swing.GroupLayout btnTrainLayout = new javax.swing.GroupLayout(btnTrain);
        btnTrain.setLayout(btnTrainLayout);
        btnTrainLayout.setHorizontalGroup(
            btnTrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTrainLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnTrainLayout.setVerticalGroup(
            btnTrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTrainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnExit.setBackground(new java.awt.Color(0, 102, 102));
        btnExit.setToolTipText("");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/exit.png"))); // NOI18N
        jLabel3.setText("  Back");

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("My List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNewVo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTrain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnNewVo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        listVo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listVo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listVoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listVo);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnFav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/UnFav.png"))); // NOI18N
        btnFav.setText("None");
        btnFav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFavMousePressed(evt);
            }
        });

        txtContent.setEditable(false);
        txtContent.setColumns(20);
        txtContent.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtContent.setRows(5);
        jScrollPane1.setViewportView(txtContent);

        btnPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/pro.png"))); // NOI18N
        btnPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFav, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPro)
                        .addComponent(btnFav))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList getVo() {
        ArrayList vo = new ArrayList();
        try {
            Connection con = DAO.getConnection();
            String sql = "SELECT * FROM dbo.[Vocabulary]";
            var ps = con.prepareStatement(sql);
            var rs = ps.executeQuery();

            while (rs.next()) {
                vo.add(rs.getString("vo"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return vo;
    }

    public void bindData() {
        ArrayList vo = getVo();
        try {
            Connection con = DAO.getConnection();
            String sql = "SELECT * FROM dbo.[Favorite]";
            var ps = con.prepareStatement(sql);
            var rs = ps.executeQuery();

            while (rs.next()) {
                vo.add(rs.getString("vo"));
                defaultListModel.addElement(rs.getString("vo"));
            }
            listVo.setModel(defaultListModel);
            listVo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    public void searchFilter(String text) {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList vo = getVo();
        try {
            Connection con = DAO.getConnection();
                String sql = "SELECT * FROM dbo.[Favorite]";
                var ps = con.prepareStatement(sql);
                var rs = ps.executeQuery();

                while (rs.next()) {

                    String vocabulary = rs.getString("vo");
                    if (vocabulary.contains(txtSearch.getText())) {
                        filteredItems.addElement(vocabulary);

                    }
                }

                defaultListModel = filteredItems;
                listVo.setModel(defaultListModel);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    private void search() {
        try {
            Connection con = DAO.getConnection();
            String find = txtSearch.getText();
            String text = "";
            String sql = "SELECT * FROM dbo.[Favorite] WHERE vo like '" + find + "' or mean like N'" + find + "'";
            var ps = con.prepareStatement(sql);
            var rs = ps.executeQuery();
            while (rs.next()) {
                text = rs.getString("vo");
                text += " "  + rs.getString("stt") ;
                text += " "  + rs.getString("pro") ;
                text += "\nNghĩa: " + rs.getString("mean");
                if (rs.getString("fav").contains("F")) {
                    resetIcon();
                }
                if (rs.getString("fav").contains("T")) {
                    setIcon();
                }
            }
            txtContent.setText(text);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private void updateFav(){
        try {
            Connection con = DAO.getConnection();
            String check = "SELECT * FROM Vocabulary where vo like '" + txtSearch.getText() + "'";
            String flw = "Update Vocabulary set fav='"+"T"+"' where vo like '" + txtSearch.getText() + "'";
            String unflw = "Update Vocabulary set fav='"+"F"+"' where vo like '" + txtSearch.getText() + "'";
            String copy = "INSERT INTO Favorite(vo,stt,pro,mean,fav) VALUES(?,?,?,?,?)";
            String remove = "DELETE Favorite where vo like '" + txtSearch.getText() + "'";
            var ps = con.prepareStatement(check);
            var rs = ps.executeQuery();
            while(rs.next()){
                if (rs.getString("fav").contains("F")) {
                var ps1 = con.prepareStatement(flw);
                var rs1 = ps1.executeUpdate();
                var ps2 = con.prepareStatement(copy);
                ps2.setString(1, rs.getString("vo"));
                ps2.setString(2, rs.getString("stt"));
                ps2.setString(3, rs.getString("pro"));
                ps2.setString(4, rs.getString("mean"));
                ps2.setString(5, "T");
                var rs2 = ps2.executeUpdate();
                }
                else if(rs.getString("fav").contains("T")){
                    var ps1 = con.prepareStatement(unflw);
                    var rs1 = ps1.executeUpdate();
                    var ps2 = con.prepareStatement(remove);
                    var rs2 = ps2.executeUpdate();                   
                }
            }          
        } catch (SQLException ex) {
            Logger.getLogger(fMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void delFav(){
        try {
            Connection con = DAO.getConnection();
            String sql = "DELETE Favorite WHERE vo like '" + txtSearch.getText() + "'";
            var ps = con.createStatement();
            var rs = ps.executeUpdate(sql);          
        } catch (SQLException ex) {
            Logger.getLogger(fNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNewVoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewVoMousePressed
        setColor(btnNewVo);
        resetColor(btnExit);
        resetColor(btnTrain);
        try {
            new fNew().setVisible(true);
            this.hide();
        } catch (SQLException ex) {
            Logger.getLogger(fMyList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnNewVoMousePressed

    private void btnTrainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMousePressed
        setColor(btnTrain);
        resetColor(btnExit);
        resetColor(btnNewVo);
        new fTrain().setVisible(true);
    }//GEN-LAST:event_btnTrainMousePressed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        setColor(btnExit);
        resetColor(btnNewVo);
        resetColor(btnTrain);
        this.hide();
        new fMain().setVisible(true);
    }//GEN-LAST:event_btnExitMousePressed

    private void listVoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVoMouseClicked
        txtSearch.setText(listVo.getSelectedValue());
        search();
    }//GEN-LAST:event_listVoMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search();

        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchFilter(txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnFavMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFavMousePressed
        if (btnFav.getIcon().equals(iconUnF)) {
            setIcon();
            updateFav();
            JOptionPane.showMessageDialog(this,"Followed");
            sync();
            
        } else{
            resetIcon();
            updateFav();
            delFav();
            JOptionPane.showMessageDialog(this,"Unfollowed");
            sync();
        }
    }//GEN-LAST:event_btnFavMousePressed

    private void btnProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProActionPerformed
        String find = txtSearch.getText();
        String voice="";
        try {
            Connection con=DAO.getConnection();

            String check = "SELECT * FROM dbo.[Vocabulary] WHERE vo like '" + find + "' or mean like N'" + find + "'";
            var ps = con.prepareStatement(check);
            var rs = ps.executeQuery();
            while (rs.next()){
                voice = rs.getString("vo")+".mp3";
                MP3Player mp3 = new MP3Player(getClass().getResource("/Res/audio/"+voice+""));
                mp3.play();
            }     
        }catch (SQLException ex) {
            Logger.getLogger(fMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProActionPerformed
    void sync(){
        txtSearch.setText("");
        searchFilter(txtSearch.getText());
        txtContent.setText("");
    }
    void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 153, 153));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(0, 102, 102));
    }
    void setIcon() {
        btnFav.setIcon(iconF);
    }

    void resetIcon() {
        btnFav.setIcon(iconUnF);
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
            java.util.logging.Logger.getLogger(fMyList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMyList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMyList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMyList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fMyList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnExit;
    private javax.swing.JLabel btnFav;
    private javax.swing.JPanel btnNewVo;
    private javax.swing.JButton btnPro;
    private javax.swing.JPanel btnTrain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbLang;
    private javax.swing.JList<String> listVo;
    private javax.swing.JTextArea txtContent;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
