/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package projectjava.Dorm4;

import java.awt.Color;
import javax.swing.JOptionPane;
import projectjava.*;
/**
 *
 * @author User
 */
public class Dorm4_Floor3JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Dorm4_Floor3JPanel
     */
    Profile pr;
    public Dorm4_Floor3JPanel(Profile oldpr,String dorm) {
        initComponents();
        javax.swing.JLabel[] color_room = {room1,room2,room3,room4,room5,room6,room7,room8,room9};
        pr = oldpr;
        pr.setColor(color_room,dorm);
    }
    public Dorm4_Floor3JPanel() {
        initComponents();
    }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        room1 = new javax.swing.JLabel();
        room2 = new javax.swing.JLabel();
        room3 = new javax.swing.JLabel();
        room4 = new javax.swing.JLabel();
        room5 = new javax.swing.JLabel();
        room6 = new javax.swing.JLabel();
        room7 = new javax.swing.JLabel();
        room8 = new javax.swing.JLabel();
        room9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(35, 43, 115));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-100.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        room1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room1.setForeground(new java.awt.Color(238, 238, 238));
        room1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room1.setText("ROOM 431");

        room2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room2.setForeground(new java.awt.Color(238, 238, 238));
        room2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room2.setText("ROOM 432");

        room3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room3.setForeground(new java.awt.Color(238, 238, 238));
        room3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room3.setText("ROOM 433");

        room4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room4.setForeground(new java.awt.Color(238, 238, 238));
        room4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room4.setText("ROOM 434");

        room5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room5.setForeground(new java.awt.Color(238, 238, 238));
        room5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room5.setText("ROOM 435");

        room6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room6.setForeground(new java.awt.Color(238, 238, 238));
        room6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room6.setText("ROOM 436");

        room7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room7.setForeground(new java.awt.Color(238, 238, 238));
        room7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room7.setText("ROOM 437");

        room8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room8.setForeground(new java.awt.Color(238, 238, 238));
        room8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room8.setText("ROOM 438");

        room9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        room9.setForeground(new java.awt.Color(238, 238, 238));
        room9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        room9.setText("ROOM 439");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(room7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(room1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(room4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addComponent(room2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(room5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(room3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(room5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(room6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        if(room1.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room1.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if(room2.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room2.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if(room3.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room3.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if(room4.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room4.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        if(room5.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room5.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        if(room6.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room6.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        if(room7.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room7.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        if(room8.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room8.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        if(room9.getForeground().equals(Color.red)) {
            JOptionPane.showMessageDialog(this, "Sorry , This room is FULL");
            return;
        }
        if(pr.checkRoom(room9.getText())) JOptionPane.showMessageDialog(this, "BOOK SUCCESS");
        else JOptionPane.showMessageDialog(this, "You have Book","Message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel room1;
    private javax.swing.JLabel room2;
    private javax.swing.JLabel room3;
    private javax.swing.JLabel room4;
    private javax.swing.JLabel room5;
    private javax.swing.JLabel room6;
    private javax.swing.JLabel room7;
    private javax.swing.JLabel room8;
    private javax.swing.JLabel room9;
    // End of variables declaration//GEN-END:variables
}