/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UBER;

import java.sql.Connection;
import javax.swing.JOptionPane;
import static UBER.SavingData.passengers;
import static UBER.SavingData.requests;
import java.awt.Color;

/**
 *
 * @author Tukaa
 */
public class WaitingPage extends javax.swing.JFrame implements Runnable {

    Connection n;
    int s = 0;
    Thread th;
    CurrentUser currentphone = CurrentUser.getInstance();
    public String phonePassenger = currentphone.getCurrentPhone();
    //  public Driver driver = drivers.get(phoneDriver);
    Passenger p = passengers.get(phonePassenger);

    /**
     * Creates new form WaitingPage
     */
    public WaitingPage() {
        super("loading");
        setBackground(new Color(255, 255, 255));
        initComponents();
        th = new Thread((Runnable) this);
    }

    public void setUploading() {
        setVisible(false);
        th.start();
    }

    public void run() {
        try {
            while (true) {
                for (int i = 1; i <= 200; i++) {
                    s = s + 1;
                    int n = WaitingBar.getMaximum();
                    int v = WaitingBar.getValue();
                    if (v < n) {
                        WaitingBar.setValue(WaitingBar.getValue() + 1);
                    } else {
                        i = 201;
                        s = 0;
                        WaitingBar.setValue(s);
                    }
                    Thread.sleep(50);
                }
                Thread.sleep(50);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        CancelRequest = new javax.swing.JButton();
        WaitingBar = new javax.swing.JProgressBar();
        WaitLabel = new javax.swing.JLabel();
        TitlePage = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Waiting for Driver");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CancelRequest.setBackground(new java.awt.Color(210, 27, 230));
        CancelRequest.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        CancelRequest.setForeground(new java.awt.Color(255, 255, 255));
        CancelRequest.setText("Cancel Request");
        CancelRequest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelRequest.setBorderPainted(false);
        CancelRequest.setFocusable(false);
        CancelRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CancelRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CancelRequestMousePressed(evt);
            }
        });

        WaitingBar.setBackground(new java.awt.Color(255, 255, 255));
        WaitingBar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        WaitingBar.setForeground(new java.awt.Color(230, 27, 210));
        WaitingBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        WaitingBar.setStringPainted(true);

        WaitLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        WaitLabel.setForeground(new java.awt.Color(210, 27, 230));
        WaitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WaitLabel.setText("Please Wait");

        TitlePage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        TitlePage.setForeground(new java.awt.Color(210, 27, 230));
        TitlePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitlePage.setText("# Searching For Driver ....");

        logout.setBackground(new java.awt.Color(210, 27, 230));
        logout.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/logout.png"))); // NOI18N
        logout.setText("Logout  ");
        logout.setToolTipText("");
        logout.setAlignmentX(1.0F);
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        logout.setDefaultCapable(false);
        logout.setFocusTraversalPolicyProvider(true);
        logout.setFocusable(false);
        logout.setHideActionText(true);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        logout.setIconTextGap(0);
        logout.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logout.setMultiClickThreshhold(3L);
        logout.setRequestFocusEnabled(false);
        logout.setRolloverEnabled(false);
        logout.setVerifyInputWhenFocusTarget(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
            .addComponent(TitlePage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(WaitingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(WaitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(logout)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(TitlePage, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WaitingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(WaitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(CancelRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        setSize(new java.awt.Dimension(555, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelRequestMousePressed
        // TODO add your handling code here:
        p.CancelRequest(p.getPhoneNumber());
        setVisible(false);
        this.dispose();
        PassengerWindow passengerhome = new PassengerWindow();
        passengerhome.setVisible(true);
    }//GEN-LAST:event_CancelRequestMousePressed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Intro it = new Intro();
        it.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(WaitingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WaitingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WaitingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WaitingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaitingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelRequest;
    private javax.swing.JLabel TitlePage;
    private javax.swing.JLabel WaitLabel;
    private javax.swing.JProgressBar WaitingBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
