/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;

public class home extends javax.swing.JFrame {

    // main
    public home() {
        initComponents();
         setIconImage();
        
        Icon i = bgimage1.getIcon();
        ImageIcon icon = (ImageIcon) i;
        Image image = icon.getImage().getScaledInstance(bgimage1.getWidth(), bgimage1.getHeight(), Image.SCALE_SMOOTH);
        bgimage1.setIcon(new ImageIcon(image));
     
        Icon i1 = bgimage2.getIcon();
        ImageIcon icon1 =(ImageIcon)i1;
        Image image1 = icon1.getImage().getScaledInstance(bgimage2.getWidth(), bgimage2.getHeight(), Image.SCALE_SMOOTH);
        bgimage2.setIcon(new ImageIcon(image1));
        
        Icon i2 = bgimage3.getIcon();
        ImageIcon icon2 =(ImageIcon)i2;
        Image image2 = icon2.getImage().getScaledInstance(bgimage3.getWidth(), bgimage3.getHeight(), Image.SCALE_SMOOTH);
        bgimage3.setIcon(new ImageIcon(image2));
        
        
        Icon i3 = bgimage4.getIcon();
        ImageIcon icon3 =(ImageIcon)i3;
        Image image3 = icon3.getImage().getScaledInstance(bgimage4.getWidth(), bgimage4.getHeight(), Image.SCALE_SMOOTH);
        bgimage4.setIcon(new ImageIcon(image3));
        
        
        Icon i4 = bgimage5.getIcon();
        ImageIcon icon4 =(ImageIcon)i4;
        Image image4 = icon4.getImage().getScaledInstance(bgimage5.getWidth(), bgimage5.getHeight(), Image.SCALE_SMOOTH);
        bgimage5.setIcon(new ImageIcon(image4));
        
        
        Icon i5 = bgimage6.getIcon();
        ImageIcon icon5 =(ImageIcon)i5;
        Image image5 = icon5.getImage().getScaledInstance(bgimage6.getWidth(), bgimage6.getHeight(), Image.SCALE_SMOOTH);
        bgimage6.setIcon(new ImageIcon(image5));
        
        
        Icon i6 = bgimage7.getIcon();
        ImageIcon icon6 =(ImageIcon)i6;
        Image image6 = icon6.getImage().getScaledInstance(bgimage7.getWidth(), bgimage7.getHeight(), Image.SCALE_SMOOTH);
        bgimage7.setIcon(new ImageIcon(image6));
        
        
        Icon i7 = bgimage8.getIcon();
        ImageIcon icon7 =(ImageIcon)i7;
        Image image7 = icon7.getImage().getScaledInstance(bgimage8.getWidth(), bgimage8.getHeight(), Image.SCALE_SMOOTH);
        bgimage8.setIcon(new ImageIcon(image7));
        
        
        Icon i8 = bgimage9.getIcon();
        ImageIcon icon8 =(ImageIcon)i8;
        Image image8 = icon8.getImage().getScaledInstance(bgimage9.getWidth(), bgimage9.getHeight(), Image.SCALE_SMOOTH);
        bgimage9.setIcon(new ImageIcon(image8));
        
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        bgimage8 = new javax.swing.JButton();
        bgimage7 = new javax.swing.JButton();
        bgimage9 = new javax.swing.JButton();
        bgimage1 = new javax.swing.JButton();
        bgimage2 = new javax.swing.JButton();
        bgimage3 = new javax.swing.JButton();
        bgimage4 = new javax.swing.JButton();
        bgimage5 = new javax.swing.JButton();
        bgimage6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOCATIONS");
        setMaximumSize(new java.awt.Dimension(1060, 1480));
        setMinimumSize(new java.awt.Dimension(1060, 700));
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        bgimage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/a.Juhu beach.jpeg"))); // NOI18N
        bgimage8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage8ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage8);
        bgimage8.setBounds(385, 990, 280, 380);

        bgimage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/a.Sanjay Gandhi National Park.JPG"))); // NOI18N
        bgimage7.setMaximumSize(new java.awt.Dimension(75, 25));
        bgimage7.setMinimumSize(new java.awt.Dimension(75, 25));
        bgimage7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage7ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage7);
        bgimage7.setBounds(20, 990, 280, 380);

        bgimage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/a.Snow world.jpg"))); // NOI18N
        bgimage9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage9ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage9);
        bgimage9.setBounds(750, 990, 280, 380);

        bgimage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/GATEWAY.jpg"))); // NOI18N
        bgimage1.setMaximumSize(new java.awt.Dimension(75, 25));
        bgimage1.setMinimumSize(new java.awt.Dimension(75, 25));
        bgimage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage1ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage1);
        bgimage1.setBounds(20, 30, 280, 380);

        bgimage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/a.Shree Siddhivinayak Temple.jpg"))); // NOI18N
        bgimage2.setText("jButton1");
        bgimage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage2ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage2);
        bgimage2.setBounds(385, 30, 280, 380);

        bgimage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/elephanta.jpg"))); // NOI18N
        bgimage3.setText("jButton3");
        bgimage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage3ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage3);
        bgimage3.setBounds(750, 30, 280, 380);

        bgimage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/a.Chhatrapati Shivaji Maharaj Vastu Sangrahalaya.jpg"))); // NOI18N
        bgimage4.setMaximumSize(new java.awt.Dimension(75, 25));
        bgimage4.setMinimumSize(new java.awt.Dimension(75, 25));
        bgimage4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage4ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage4);
        bgimage4.setBounds(20, 510, 280, 380);

        bgimage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testing/a.BOUNCE Inc Mumbai(Trampoline park).jpg"))); // NOI18N
        bgimage5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage5ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage5);
        bgimage5.setBounds(385, 510, 280, 380);

        bgimage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f303863c0fcfb2f91fe159cb9d1f5dd9.jpg"))); // NOI18N
        bgimage6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgimage6ActionPerformed(evt);
            }
        });
        jPanel1.add(bgimage6);
        bgimage6.setBounds(750, 510, 280, 380);

        jLabel1.setText("gateway");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 420, 150, 16);

        jLabel2.setText("Siddhivinayak");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 420, 120, 16);

        jLabel3.setText("Elephanta caves");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(860, 420, 100, 16);

        jLabel4.setText("Chhatrapati Shivaji Maharaj Vastu Sangrahalaya");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 900, 280, 16);

        jLabel5.setText("BOUNCE Inc Mumbai(Trampoline park)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, 900, 230, 16);

        jLabel6.setText("Byculla zoo");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(870, 900, 80, 16);

        jLabel7.setText("Sanjay Gandhi National Park");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 1380, 170, 16);

        jLabel8.setText("Juhu beach");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 1380, 90, 16);

        jLabel9.setText("Snow world");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(850, 1380, 70, 16);

        jLabel10.setText("LOCATIONS");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(500, 0, 90, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 1900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        int h = jPanel1.getHeight();
        int a =evt.getWheelRotation();
        int x = jPanel1.getX();
        int y = jPanel1.getY();
        int b = 0;
        if(a>0){
            if(y== this.getHeight()- jPanel1.getHeight()){
                a=0;
            }
            else{
                b+=50;
                jPanel1.setLocation(x, y-b);
                b=0;
            }
        }
        
         if(a<0){
            if(y== 0){
                a=0;
            }
            else{
                b+=50;
                jPanel1.setLocation(x, y+b);
                b=0;
            }
        }
    }//GEN-LAST:event_formMouseWheelMoved

    private void bgimage5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage5ActionPerformed
location5 location5Frame = new location5();
    
    // Set the login frame to be visible
    location5Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage5ActionPerformed

    private void bgimage6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage6ActionPerformed
location6 location6Frame = new location6();
    
    // Set the login frame to be visible
    location6Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage6ActionPerformed

    private void bgimage8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage8ActionPerformed
location8 location8Frame = new location8();
    
    // Set the login frame to be visible
    location8Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage8ActionPerformed

    private void bgimage9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage9ActionPerformed
location9 location9Frame = new location9();
    
    // Set the login frame to be visible
    location9Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage9ActionPerformed

    private void bgimage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage1ActionPerformed
location1 location1Frame = new location1();
    
    // Set the login frame to be visible
    location1Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage1ActionPerformed

    private void bgimage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage2ActionPerformed
location2 location2Frame = new location2();
    
    // Set the login frame to be visible
    location2Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage2ActionPerformed

    private void bgimage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage3ActionPerformed
location3 location3Frame = new location3();
    
    // Set the login frame to be visible
    location3Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage3ActionPerformed

    private void bgimage4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage4ActionPerformed
location4 location4Frame = new location4();
    
    // Set the login frame to be visible
    location4Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage4ActionPerformed

    private void bgimage7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgimage7ActionPerformed
location7 location7Frame = new location7();
    
    // Set the login frame to be visible
    location7Frame.setVisible(true);
    
    // Close the current introductory frame
   this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bgimage7ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           // java.util.logging.Loggebgimageger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpeg")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bgimage1;
    private javax.swing.JButton bgimage2;
    private javax.swing.JButton bgimage3;
    private javax.swing.JButton bgimage4;
    private javax.swing.JButton bgimage5;
    private javax.swing.JButton bgimage6;
    private javax.swing.JButton bgimage7;
    private javax.swing.JButton bgimage8;
    private javax.swing.JButton bgimage9;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
