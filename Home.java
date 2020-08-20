
package employee;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Home extends javax.swing.JFrame {

  
    public Home() {
        initComponents();
        
        JLabel h1=new JLabel("Make Registration Here");
        h1.setBounds(100,200,500,44);
        h1.setFont(new Font("serif",Font.BOLD,30));
        h1.setForeground(Color.blue);
        add(h1);
        
        
        
        JLabel us=new JLabel("Username");
        us.setBounds(100,190,300,250);
        add(us);
        
        JTextField tus=new JTextField();
        tus.setBounds(200,305,200,25);
        add(tus);
        
        
        JLabel p=new JLabel("Password");
        p.setBounds(100,220,300,400);
        add(p);
        
        JTextField tp=new JTextField();
        tp.setBackground(Color.GRAY);
        tp.setBounds(200,390,200,25);
        add(tp);
        
        JButton b1=new JButton("Submit");
        b1.setBounds(200,4750,100,30);
        b1.setBackground(Color.blue);
        add(b1);
        
        JButton b2=new JButton("Cancel");
        b2.setBounds(400,480,100,30);
        b2.setBackground(Color.red);
        add(b2);
        
        setBounds(200,30,800,600);
        setLayout(null);
        setVisible(true);
        
        JButton k2=new JButton("Submit");
        k2.setBounds(200,480,100,30);
        k2.setBackground(Color.blue);
        add(k2);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
public static void main(String[] args){
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
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
