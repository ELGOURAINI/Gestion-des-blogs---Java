
package Views;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;
import Metier.Blogger;
import Metier.Controler;
import javax.swing.*;
import java.awt.*;
import javax.swing.LayoutStyle.ComponentPlacement;


@SuppressWarnings("serial")
public class EditProfile extends javax.swing.JFrame {

	private Controler CTRL = new Controler();
	private Blogger blogger;
    public EditProfile(Blogger B) {
    	this.blogger=B;
    	setUndecorated(true);
        initComponents();
        
    }
 
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setRequestFocusEnabled(false);
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new Dimension(1000, 600));

        jPanel1.setBackground(SystemColor.desktop);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(SystemColor.desktop);
        Right.setPreferredSize(new Dimension(500, 500));
        
        JButton MyBlogs = new JButton("");
        MyBlogs.setToolTipText("Modifier Profile");
        MyBlogs.setBackground(SystemColor.desktop);
        MyBlogs.setBorderPainted(false);
        MyBlogs.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\la-personne.png"));
        
        AddBlog = new JButton("");
        AddBlog.setToolTipText("Ajouter Un blog");
        AddBlog.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        AddBlog.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\blog (3).png"));
        AddBlog.setBorderPainted(false);
        AddBlog.setBackground(SystemColor.desktop);
        
        Logout = new JButton("");
        Logout.setToolTipText("Se déconnecter");
        Logout.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\se-deconnecter (1).png"));
        Logout.setBorderPainted(false);
        Logout.setBackground(SystemColor.desktop);
        
        Home = new JButton("");
        Home.setToolTipText("Acceuil");
        
        Home.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\accueil (2).png"));
        Home.setBorderPainted(false);
        Home.setBackground(SystemColor.desktop);
        
        AddBlog_1 = new JButton("");
        AddBlog_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MyBlogsActionPerformed(e);
        	}
        });
        AddBlog_1.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\blog (2).png"));
        AddBlog_1.setToolTipText("Mes Blogs");
        AddBlog_1.setBorderPainted(false);
        AddBlog_1.setBackground(SystemColor.desktop);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        RightLayout.setHorizontalGroup(
        	RightLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, RightLayout.createSequentialGroup()
        			.addContainerGap(11, Short.MAX_VALUE)
        			.addComponent(Home, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, RightLayout.createSequentialGroup()
        			.addContainerGap(11, Short.MAX_VALUE)
        			.addComponent(AddBlog_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, RightLayout.createSequentialGroup()
        			.addContainerGap(11, Short.MAX_VALUE)
        			.addComponent(AddBlog, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(MyBlogs)
        			.addContainerGap(11, Short.MAX_VALUE))
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(Logout, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(11, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
        	RightLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addGap(175)
        			.addComponent(Home, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(AddBlog_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(AddBlog, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(MyBlogs)
        			.addGap(18)
        			.addComponent(Logout, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(148, Short.MAX_VALUE))
        );
        Right.setLayout(RightLayout);

        jPanel1.add(Right);
        Right.setBounds(0, 0, 86, 600);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        
        separator_2 = new JSeparator();
        
        jButton1 = new JButton();
        jButton1.setText("Modifier");
        jButton1.setForeground(Color.WHITE);
        jButton1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jButton1.setBackground(new Color(0, 51, 204));
        
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	handleUpdate(textField_1.getText(),textField_2.getText(),txtEntrezVotreNom.getText(),textField.getText(), new String(passwordField.getPassword()));
            }
        });
        
        passwordField = new JPasswordField();
        passwordField.setText(this.blogger.getPassword());
        passwordField.setForeground(new Color(102, 102, 102));
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        jLabel7 = new JLabel();
        jLabel7.setText("Mot de Passe");
        jLabel7.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel7.setBackground(new Color(102, 102, 102));
        
        textField = new JTextField();
        textField.setText(this.blogger.getEmail());
        textField.setForeground(new Color(102, 102, 102));
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        jLabel7_1 = new JLabel();
        jLabel7_1.setText("Email");
        jLabel7_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel7_1.setBackground(new Color(102, 102, 102));
        
        textField_1 = new JTextField();
        textField_1.setText(this.blogger.getNom());
        textField_1.setForeground(new Color(102, 102, 102));
        textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        textField_2 = new JTextField();
        textField_2.setText(this.blogger.getPrénom());
        textField_2.setForeground(new Color(102, 102, 102));
        textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        lblPrnom = new JLabel();
        lblPrnom.setText("Prénom");
        lblPrnom.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblPrnom.setBackground(new Color(102, 102, 102));
        
        jLabel5 = new JLabel();
        jLabel5.setText("Nom");
        jLabel5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel5.setBackground(new Color(102, 102, 102));
        
        lblModifierVosInformation = new JLabel();
        lblModifierVosInformation.setHorizontalAlignment(SwingConstants.CENTER);
        lblModifierVosInformation.setText("Modifier Vos Informations");
        lblModifierVosInformation.setForeground(SystemColor.desktop);
        lblModifierVosInformation.setFont(new Font("Segoe UI", Font.BOLD, 30));
        
        txtEntrezVotreNom = new JTextField();
        txtEntrezVotreNom.setText(this.blogger.getUsername());
        txtEntrezVotreNom.setForeground(new Color(102, 102, 102));
        txtEntrezVotreNom.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        jLabel7_2 = new JLabel();
        jLabel7_2.setText("Nom d'Utilisateur");
        jLabel7_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel7_2.setBackground(new Color(102, 102, 102));
        
        btnNewButton_4 = new JButton("");
        btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\editer (1).png"));
        btnNewButton_4.setBorderPainted(false);
        btnNewButton_4.setBackground(SystemColor.window);
        
     

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        LeftLayout.setHorizontalGroup(
        	LeftLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGap(226)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtEntrezVotreNom, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        				.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
        				.addGroup(LeftLayout.createSequentialGroup()
        					.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(LeftLayout.createSequentialGroup()
        							.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        							.addGap(195)
        							.addComponent(lblPrnom, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
        						.addGroup(LeftLayout.createSequentialGroup()
        							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
        						.addComponent(lblModifierVosInformation, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel7_2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(173, Short.MAX_VALUE))
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGap(207)
        			.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        			.addGap(263))
        );
        LeftLayout.setVerticalGroup(
        	LeftLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGap(26)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblModifierVosInformation, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        			.addGap(22)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblPrnom, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(6)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(25)
        			.addComponent(jLabel7_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtEntrezVotreNom, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabel7_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addComponent(textField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(27)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(80))
        );
        Left.setLayout(LeftLayout);

        jPanel1.add(Left);
        Left.setBounds(84, 0, 916, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBackground(SystemColor.inactiveCaptionBorder);
        separator.setBounds(84, 0, 7, 600);
        
        Home.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HomeActionPerformed(e);
        	}
        });
        
        Logout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LogoutActionPerformed(e);
        	}
        });
        
        AddBlog.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddBlogActionPerformed(e);
        	}
        });
        
        jPanel1.add(separator);
        getContentPane().setLayout(layout);

        getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }
    
    private void handleUpdate(String nom, String prenom,String username, String email,String password) {

    // Mettez à jour l'objet Blogger actuellement connecté
    this.blogger.setNom(nom);
    this.blogger.setPrénom(prenom);
    this.blogger.setUsername(username);
    this.blogger.setEmail(email);
    this.blogger.setPassword(password);

    CTRL.updateBlogger(this.blogger);

    // Affichez un message de succès 
    JOptionPane.showMessageDialog(this, "Informations mises à jour avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @SuppressWarnings("unused")
	private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Index index = new Index(this.blogger);
        index.setVisible(true);
        index.pack();
        index.setLocationRelativeTo(null); 
        this.dispose();
    }
    
    private void MyBlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Index index = new Index(this.blogger);
        index.setVisible(true);
        index.pack();
        index.setLocationRelativeTo(null); 
        this.dispose();
    }

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    EditProfile index = new EditProfile(this.blogger);
    index.setVisible(true);
    index.pack();
    index.setLocationRelativeTo(null); 
    this.dispose();
    }
    
    private void AddBlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        AddBlog index = new AddBlog(this.blogger);
        index.setVisible(true);
        index.pack();
        index.setLocationRelativeTo(null); 
        this.dispose();
        }
    
    

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    Login index = new Login();
    index.setVisible(true);
    index.pack();
    index.setLocationRelativeTo(null); 
    this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel jPanel1;
    private JButton AddBlog;
    private JButton Logout;
    private JButton Home;
    private JSeparator separator_2;
    private JButton jButton1;
    private JPasswordField passwordField;
    private JLabel jLabel7;
    private JTextField textField;
    private JLabel jLabel7_1;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblPrnom;
    private JLabel jLabel5;
    private JLabel lblModifierVosInformation;
    private JTextField txtEntrezVotreNom;
    private JLabel jLabel7_2;
    private JButton btnNewButton_4;
    private JButton AddBlog_1;
}
