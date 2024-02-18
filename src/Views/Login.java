
package Views;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Metier.Blogger;
import Metier.Controler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class Login extends javax.swing.JFrame {

	private Controler CTRL = new Controler();
    public Login() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setUndecorated(true);
    	//setAlwaysOnTop(true);
    	
        initComponents();
    }
 
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setText("");
        jTextField1.setToolTipText("Entrez Votre email [example@gmail.com]");
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.setToolTipText("Entrez Votre mot de passe");
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin(jTextField1.getText(), new String(jPasswordField1.getPassword()));
            }
        });
        jButton2 = new javax.swing.JButton();
        jButton2.setBackground(new Color(34, 139, 34));
        setTitle("LOGIN");
        setPreferredSize(new Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(SystemColor.desktop);
        Right.setPreferredSize(new Dimension(500, 500));

        jLabel5.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\Blogy.png")); // NOI18N

        jLabel6.setFont(new Font("Segoe UI", Font.BOLD, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("O'Blogs");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("copyright © O'Blogs All rights reserved");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        RightLayout.setHorizontalGroup(
        	RightLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addGroup(RightLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(RightLayout.createSequentialGroup()
        					.addGap(85)
        					.addComponent(jLabel5))
        				.addGroup(RightLayout.createSequentialGroup()
        					.addGap(171)
        					.addComponent(jLabel6))
        				.addGroup(RightLayout.createSequentialGroup()
        					.addGap(124)
        					.addComponent(jLabel7)))
        			.addContainerGap(105, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
        	RightLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addGap(98)
        			.addComponent(jLabel5)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel6)
        			.addGap(70)
        			.addComponent(jLabel7)
        			.addGap(67))
        );
        Right.setLayout(RightLayout);

        jPanel1.add(Right);
        Right.setBounds(0, 0, 500, 600);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(SystemColor.desktop);
        jLabel1.setText("Authentication");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jButton1.setBackground(SystemColor.desktop);
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Se Connecter");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(Color.WHITE);
        jButton2.setText("Créer un Compte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        JSeparator separator = new JSeparator();
        
        JButton Quitter = new JButton("");
        Quitter.setBorder(null);
        Quitter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Quitter(e);
        	}
        });
        Quitter.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\Quitter.png"));
        Quitter.setBorderPainted(false);
        Quitter.setBackground(SystemColor.window);

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        LeftLayout.setHorizontalGroup(
        	LeftLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGap(109)
        			.addComponent(jLabel1)
        			.addContainerGap(137, Short.MAX_VALUE))
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addContainerGap(103, Short.MAX_VALUE)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
        				.addGroup(LeftLayout.createSequentialGroup()
        					.addGap(21)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)))
        			.addGap(101))
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addContainerGap(435, Short.MAX_VALUE)
        			.addComponent(Quitter, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        		.addGroup(Alignment.LEADING, LeftLayout.createSequentialGroup()
        			.addGap(69)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(LeftLayout.createSequentialGroup()
        					.addComponent(jLabel2)
        					.addContainerGap())
        				.addGroup(LeftLayout.createSequentialGroup()
        					.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        						.addGroup(LeftLayout.createSequentialGroup()
        							.addComponent(jLabel3)
        							.addPreferredGap(ComponentPlacement.RELATED, 296, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        						.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
        					.addGap(74))))
        );
        LeftLayout.setVerticalGroup(
        	LeftLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addComponent(Quitter, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(32)
        			.addComponent(jLabel1)
        			.addGap(53)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(22)
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(27)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(separator, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton2)
        			.addContainerGap(145, Short.MAX_VALUE))
        );
        Left.setLayout(LeftLayout);

        jPanel1.add(Left);
        Left.setBounds(500, 0, 500, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null); 
        this.dispose();
    }
    //Permet de tester si les informations entrés existe pour qu'un bloggeur puisse acceder àl'app
	private void handleLogin(String username, String password) {
        Blogger blogger = CTRL.getBloggerByLogin(username,password);
        if (blogger != null && blogger.getPassword().equals(password) && blogger.getEmail().equals(username)) {
            System.out.println("Login réussi.");
            System.out.println(blogger.getEmail()+blogger.getNom());
            Index IndexFrame = new Index(blogger);
            /**EditProfile IndexFrame = new EditProfile(blogger);**/
            IndexFrame.setVisible(true);
            IndexFrame.pack();
            IndexFrame.setLocationRelativeTo(null); 
            this.dispose();
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe incorrect.");
            jPasswordField1.setText("");
            JOptionPane.showMessageDialog(this, "Nom d'utilisateur ou mot de passe incorrect.", "Erreur", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    private void Quitter(java.awt.event.ActionEvent evt)
    {
    	this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
}
