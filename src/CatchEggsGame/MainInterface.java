/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatchEggsGame;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yomna
 */
public class MainInterface extends javax.swing.JFrame {
static boolean M =true;
    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
     
        initComponents();
        setSize(1024, 598);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Play = new javax.swing.JButton();
        Levels = new javax.swing.JButton();
        Instructions = new javax.swing.JButton();
        EndGame = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Play.setBackground(new java.awt.Color(51, 255, 51));
        Play.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        Play.setForeground(new java.awt.Color(255, 255, 255));
        Play.setText("Play");
        Play.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Play.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PlayMouseMoved(evt);
            }
        });
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 290, 50));

        Levels.setBackground(new java.awt.Color(0, 255, 255));
        Levels.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        Levels.setForeground(new java.awt.Color(255, 255, 255));
        Levels.setText("Levels");
        Levels.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Levels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelsActionPerformed(evt);
            }
        });
        getContentPane().add(Levels, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 290, 50));

        Instructions.setBackground(new java.awt.Color(255, 204, 51));
        Instructions.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        Instructions.setForeground(new java.awt.Color(255, 255, 255));
        Instructions.setText("Instructions");
        Instructions.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Instructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionsActionPerformed(evt);
            }
        });
        getContentPane().add(Instructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 290, 50));

        EndGame.setBackground(new java.awt.Color(255, 51, 51));
        EndGame.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        EndGame.setForeground(new java.awt.Color(255, 255, 255));
        EndGame.setText("Exit");
        EndGame.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        EndGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameActionPerformed(evt);
            }
        });
        getContentPane().add(EndGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1040, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseMoved

    }//GEN-LAST:event_PlayMouseMoved


    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        new play().setVisible(true);
        try {

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        this.dispose();
    }//GEN-LAST:event_PlayActionPerformed

    private void LevelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelsActionPerformed
        new levels().setVisible(true);
        try {

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        this.dispose();
    }//GEN-LAST:event_LevelsActionPerformed
    private void InstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructionsActionPerformed
        new Instructions().setVisible(true);

        try {

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

        this.dispose();

    }//GEN-LAST:event_InstructionsActionPerformed

    private void EndGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameActionPerformed

        try {

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        System.exit(0);
    }//GEN-LAST:event_EndGameActionPerformed
boolean pause=false;

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
               long clipTime = Main1.clip.getMicrosecondPosition();
                if (pause || !M) {
                    Main1.clip.setMicrosecondPosition(clipTime);
                    Main1.clip.start();
                    pause = false;
                    M=true;
                } else if (M) {
                    M=false;
                    Main1.clip.stop();
                    pause = true;
                }
                }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainInterface().setVisible(true);
//
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndGame;
    private javax.swing.JButton Instructions;
    private javax.swing.JButton Levels;
    private javax.swing.JButton Play;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
