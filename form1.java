
package employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class form1 extends javax.swing.JFrame implements ActionListener{

  
    public form1() {
        initComponents();
        
        JLabel h1=new JLabel("Welcome  to Employee Payroll System");
        h1.setBounds(100,0,500,44);
        h1.setFont(new Font("serif",Font.BOLD,30));
        h1.setForeground(Color.blue);
        add(h1);
        
        JLabel bb=new JLabel("Make Registration Here");
        bb.setBounds(300,60,300,100);
        bb.setFont(new Font("serif",Font.ITALIC,20));
        bb.setForeground(Color.red);
        add(bb);
        
        JLabel fn=new JLabel("First Name:");
        fn.setBounds(100,100,300,150);
        fn.setFont(new Font("serif",Font.BOLD,20));
        add(fn);
        
        JTextField tfn=new JTextField();
        tfn.setBackground(Color.white);
        tfn.setBounds(250,160,250,25);
        add(tfn);
        
        JLabel ln=new JLabel("Last Name:");
        ln.setBounds(100,130,300,200);
        ln.setFont(new Font("serif",Font.BOLD,20));
        add(ln);
        
        JTextField tln=new JTextField();
        tln.setBackground(Color.GRAY);
        tln.setBounds(250,220,250,25);
        add(tln);
        
        JLabel us=new JLabel("Username:");
        us.setBounds(100,160,300,250);
        us.setFont(new Font("serif",Font.BOLD,20));
        add(us);
        
        JTextField tus=new JTextField();
        tus.setBackground(Color.white);
        tus.setBounds(250,270,250,25);
        add(tus);
        
        JLabel em=new JLabel("Email:");
       em.setBounds(100,190,300,300);
       em.setFont(new Font("serif",Font.BOLD,20));
        add(em);
        
        JTextField tem=new JTextField();
        tem.setBackground(Color.GRAY);
        tem.setBounds(250,320,250,25);
        add(tem);
        
        JLabel pn=new JLabel("Phone:");
        pn.setBounds(100,220,300,350);
        pn.setFont(new Font("serif",Font.BOLD,20));
        add(pn);
        
        JTextField tpn=new JTextField();
        tpn.setBackground(Color.white);
        tpn.setBounds(250,380,250,25);
        add(tpn);
        
        JLabel p=new JLabel("Password:");
        p.setBounds(100,250,300,400);
        p.setFont(new Font("serif",Font.BOLD,20));
        add(p);
        
        JTextField tp=new JTextField();
        tp.setBackground(Color.GRAY);
        tp.setBounds(250,440,250,25);
        add(tp);
        
        JButton b1=new JButton("Submit");
        b1.setBounds(200,480,100,30);
        b1.setBackground(Color.blue);
        add(b1);
        
        JButton b2=new JButton("Cancel");
        b2.setBounds(400,480,100,30);
        b2.setBackground(Color.red);
        add(b2);
        
                
        
        
        setBounds(200,30,800,600);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(EventAction ea){
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
                new form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
