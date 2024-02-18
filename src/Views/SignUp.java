
package Views;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import Metier.Blogger;
import Metier.Controler;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JButton;


public class SignUp extends javax.swing.JFrame {

	private Controler CTRL = new Controler();
    public SignUp() {
    	setUndecorated(true);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setPreferredSize(new Dimension(300, 300));
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setText("Entrez Votre Nom");
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleRegister(jTextField1.getText(),txtEntrezVotreNom.getText(),txtEntrezVotreNom.getText()+" "+jTextField1.getText(),txtEntrezVotreEmail.getText(), new String(passwordField.getPassword()));
            }
        });
        
       /** jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleRegister(nomRegisterField.getText(), prenomRegisterField.getText(),
                        usernameRegisterField.getText(), emailRegisterField.getText(),
                        new String(passwordRegisterField.getPassword()));
            }
        });**/
        jButton2 = new javax.swing.JButton();
        jButton2.setBackground(new Color(51, 51, 255));
        jButton2.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setPreferredSize(new Dimension(1000, 660));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(SystemColor.desktop);

        jLabel1.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\Blogy.png")); // NOI18N

        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("O'BLOGS");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("copyright © O'Blogs All rights reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(113)
        					.addComponent(jLabel3))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(71)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(162)
        					.addComponent(jLabel2)))
        			.addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap(118, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel2)
        			.addGap(94)
        			.addComponent(jLabel3)
        			.addGap(57))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 481, 660);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nom");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        jButton1.setBackground(SystemColor.desktop);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("S'inscrire");

        jButton2.setForeground(Color.WHITE);
        jButton2.setText("Se Connecter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        txtEntrezVotreNom = new JTextField();
        txtEntrezVotreNom.setText("Entrez Votre Prénom");
        txtEntrezVotreNom.setForeground(new Color(102, 102, 102));
        txtEntrezVotreNom.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        JLabel lblPrnom = new JLabel();
        lblPrnom.setText("Prénom");
        lblPrnom.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblPrnom.setBackground(new Color(102, 102, 102));
        
        JLabel lblInscription = new JLabel();
        lblInscription.setText("INSCRIPTION");
        lblInscription.setForeground(SystemColor.desktop);
        lblInscription.setFont(new Font("Segoe UI", Font.BOLD, 36));
        
        passwordField = new JPasswordField();
        passwordField.setForeground(new Color(102, 102, 102));
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        jLabel7_1 = new JLabel();
        jLabel7_1.setText("Mot de Passe");
        jLabel7_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel7_1.setBackground(new Color(102, 102, 102));
        
        txtEntrezVotreEmail = new JTextField();
        txtEntrezVotreEmail.setText("Entrez Votre Email [example@gmail.com]");
        txtEntrezVotreEmail.setForeground(new Color(102, 102, 102));
        txtEntrezVotreEmail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        separator = new JSeparator();
        
        Quitter = new JButton("");
        Quitter.setBorder(null);
        Quitter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Quitter(e);
        	}
        });
        Quitter.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\Quitter.png"));
        Quitter.setBorderPainted(false);
        Quitter.setBackground(SystemColor.window);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap(143, Short.MAX_VALUE)
        			.addComponent(lblInscription, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
        			.addGap(122))
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(48)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel7)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addGap(30)
        							.addComponent(lblPrnom, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(txtEntrezVotreNom, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))))
        				.addComponent(passwordField)
        				.addComponent(txtEntrezVotreEmail)
        				.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel7_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(57, Short.MAX_VALUE))
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(79)
        			.addComponent(separator, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(86, Short.MAX_VALUE))
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(100)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(105, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        			.addContainerGap(454, Short.MAX_VALUE)
        			.addComponent(Quitter, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addComponent(Quitter, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(29)
        			.addComponent(lblInscription, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addGap(50)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblPrnom, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtEntrezVotreNom, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jLabel7)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtEntrezVotreEmail, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabel7_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(27)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(separator, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(481, 0, 519, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }
    //Ajout d'un bloggeur(inscription) après vérification des informations entrés
	private void handleRegister(String nom, String prenom,String username, String email,String password ) {
        Blogger existingBlogger = CTRL.getBloggerByUsername(email);
        if (existingBlogger == null) {
        	if(isValidEmail(email) && isValidPassword(password) && isValidName(nom) && isValidName(prenom))
        	{
        		Blogger newBlogger = new Blogger(nom, prenom, username, email, password);
                CTRL.insertBlogger(newBlogger);
                System.out.println("Inscription réussie.");
                JOptionPane.showMessageDialog(this, "Inscription réussie.");
                jTextField1.setText("");
            	txtEntrezVotreNom.setText("");
            	txtEntrezVotreNom.setText("");
            	txtEntrezVotreEmail.getText();
            	passwordField.setText("");
        	}
        	else {
        		if(!isValidName(nom) || !isValidName(prenom)) {
        			JOptionPane.showMessageDialog(this, "Nom ou Prénom Invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
        		}
        		if(!isValidEmail(email)) {
        			JOptionPane.showMessageDialog(this, "Email Invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
        		}
        		if(!isValidPassword(password)) {
        			JOptionPane.showMessageDialog(this, "Mot de Passe Invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
        		}
        	
        	}
        } else {
        	
        	System.out.println("Email déjà utilisé. Choisissez un autre email.");
        	jTextField1.setText("");
        	txtEntrezVotreNom.setText("");
        	txtEntrezVotreNom.setText("");
        	txtEntrezVotreEmail.getText();
        	passwordField.setText("");
        	JOptionPane.showMessageDialog(this, "Email déjà utilisé. Choisissez un autre email.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //validation du format d'email écrit
    private boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }
  //validation du format du MDP écrit
    private boolean isValidPassword(String password) {
        return password.length() >= 3;
    }
  //validation du Nom inseré
    private boolean isValidName(String name) {
        return name.matches("^[a-zA-Z]+$");
    }
    //Cette fonction permet d'arreter l'app
    private void Quitter(java.awt.event.ActionEvent evt)
    {
    	this.dispose();
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private JTextField txtEntrezVotreNom;
    private JPasswordField passwordField;
    private JLabel jLabel7_1;
    private JTextField txtEntrezVotreEmail;
    private JSeparator separator;
    private JButton Quitter;
}
