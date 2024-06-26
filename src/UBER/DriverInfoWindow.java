/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UBER;

import static UBER.SavingData.passengers;
import static UBER.SavingData.requests;
import static UBER.SavingData.drivers;

/**
 *
 * @author Tukaa
 */
public class DriverInfoWindow extends javax.swing.JFrame {

    /**
     * Creates new form DriverInfo
     */
    CurrentUser currentphone = CurrentUser.getInstance();
    public String phonepassenger = currentphone.getCurrentPhone();

    public DriverInfoWindow() {
        initComponents();
        String driverphonenumber = "";
        for (int i = 0; i <= requests.size(); i++) {
            if (requests.get(i).getPassengerPhoneNumber().equals(phonepassenger)) {
                driverphonenumber = requests.get(i).getDrivertoken();
            }
            break;
        }
        Drivername1.setText(drivers.get(driverphonenumber).getUsername());
        PhoneNumber1.setText(drivers.get(driverphonenumber).getPhoneNumber());
        VechileColor1.setText(drivers.get(driverphonenumber).getVehicleColor());
        VechileModel1.setText(drivers.get(driverphonenumber).getVehicleModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RidePage1 = new javax.swing.JPanel();
        FormTitle1 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        Drivername1 = new javax.swing.JLabel();
        PhoneNumber1 = new javax.swing.JLabel();
        VechileColor1 = new javax.swing.JLabel();
        Notation1 = new javax.swing.JLabel();
        VechileModel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RidePage1.setBackground(new java.awt.Color(255, 255, 255));
        RidePage1.setToolTipText("");
        RidePage1.setPreferredSize(new java.awt.Dimension(1000, 600));

        FormTitle1.setBackground(new java.awt.Color(255, 255, 255));
        FormTitle1.setFont(new java.awt.Font("Segoe UI Symbol", 3, 40)); // NOI18N
        FormTitle1.setForeground(new java.awt.Color(210, 27, 230));
        FormTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FormTitle1.setText(" Driver Information");

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/driver2.png"))); // NOI18N

        Drivername1.setBackground(new java.awt.Color(255, 255, 255));
        Drivername1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Drivername1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Drivername1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Drivername1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PhoneNumber1.setBackground(new java.awt.Color(255, 255, 255));
        PhoneNumber1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneNumber1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PhoneNumber1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        VechileColor1.setBackground(new java.awt.Color(255, 255, 255));
        VechileColor1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        VechileColor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VechileColor1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VechileColor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Notation1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Notation1.setForeground(new java.awt.Color(210, 27, 230));
        Notation1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Notation1.setText("... The Ride Is Not Over Yet ...");

        VechileModel1.setBackground(new java.awt.Color(255, 255, 255));
        VechileModel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        VechileModel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VechileModel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VechileModel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Phone Num");
        jLabel6.setToolTipText("");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Vechile Color");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("Vechile Model");

        logout1.setBackground(new java.awt.Color(210, 27, 230));
        logout1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        logout1.setForeground(new java.awt.Color(255, 255, 255));
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniuberapp/image/logout.png"))); // NOI18N
        logout1.setText("Logout  ");
        logout1.setToolTipText("");
        logout1.setAlignmentX(1.0F);
        logout1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        logout1.setDefaultCapable(false);
        logout1.setFocusTraversalPolicyProvider(true);
        logout1.setFocusable(false);
        logout1.setHideActionText(true);
        logout1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        logout1.setIconTextGap(0);
        logout1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logout1.setMultiClickThreshhold(3L);
        logout1.setRequestFocusEnabled(false);
        logout1.setRolloverEnabled(false);
        logout1.setVerifyInputWhenFocusTarget(false);
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RidePage1Layout = new javax.swing.GroupLayout(RidePage1);
        RidePage1.setLayout(RidePage1Layout);
        RidePage1Layout.setHorizontalGroup(
            RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RidePage1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(FormTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout1))
            .addGroup(RidePage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Notation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(RidePage1Layout.createSequentialGroup()
                        .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Drivername1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VechileColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VechileModel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        RidePage1Layout.setVerticalGroup(
            RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RidePage1Layout.createSequentialGroup()
                .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RidePage1Layout.createSequentialGroup()
                        .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RidePage1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FormTitle1)))
                .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RidePage1Layout.createSequentialGroup()
                        .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(RidePage1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Drivername1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneNumber1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VechileColor1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(RidePage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VechileModel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(Notation1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RidePage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RidePage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        this.setVisible(false);
        this.dispose();
        Intro n = new Intro();
        n.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_logout1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverInfoWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Drivername1;
    private javax.swing.JLabel FormTitle1;
    private javax.swing.JLabel Notation1;
    private javax.swing.JLabel PhoneNumber1;
    private javax.swing.JPanel RidePage1;
    private javax.swing.JLabel VechileColor1;
    private javax.swing.JLabel VechileModel1;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton logout1;
    // End of variables declaration//GEN-END:variables
}
