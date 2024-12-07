/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectjava;

import java.awt.Color;

/**
 *
 * @author User
 */
public class Setting {
    Menu mainmn;
    Setting st;
    javax.swing.JPanel panel;
    javax.swing.JLabel[] menu_label;
    javax.swing.JLabel check_label;
    public Setting(Menu mn){
        mainmn = mn;
    }
    public void switchPanel(Profile pr, int check){      
    
        if(check == -1){
            panel.removeAll();
            panel.add(new NewJPanel(pr));
            panel.repaint();
            panel.revalidate();
        }
        else if(check == 0){
            menu_label[check].setBackground(new Color(204,204,255));
            panel.removeAll();
            panel.add(new ProJPanel(pr,st));
            panel.repaint();
            panel.revalidate();
        }
        else if(check == 1){
            menu_label[check].setBackground(new Color(204,204,255));
            panel.removeAll();
            panel.add(new BookJPanel(pr,mainmn,st));
            panel.repaint();
            panel.revalidate();
        }
        else if(check == 2){
            menu_label[check].setBackground(new Color(204,204,255));
            panel.removeAll();
            panel.add(new CancelJPanel(pr,mainmn,st));
            panel.repaint();
            panel.revalidate();
        }
        else if(check == 3){
            menu_label[check].setBackground(new Color(204,204,255));
            panel.removeAll();
            panel.add(new SelectPayJPanel(pr,mainmn,st));
            panel.repaint();
            panel.revalidate();
        }
        else if(check == 4){
            menu_label[check].setBackground(new Color(204,204,255));
            panel.removeAll();
            panel.add(new ReportJPanel(pr,st));
            panel.repaint();
            panel.revalidate();
        }
        if(check == -1){
            if(check_label != null) {
                check_label.setBackground(new Color(238,238,238));
            }
        }
        else {
            if(check_label != null && menu_label[check] != check_label) {
                check_label.setBackground(new Color(238,238,238));
            }
        }
        if(check > -1) check_label = menu_label[check];
    }
     public void setting(Setting oldst,javax.swing.JPanel newpanel,javax.swing.JLabel[] label){
         st = oldst;
         panel = newpanel;
         menu_label = label;
    }
}
