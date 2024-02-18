
package Views;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;

import Metier.Blog;
import Metier.Blogger;
import Metier.Controler;
import Metier.ControlerBlog;
import Metier.Domaine;

import javax.swing.*;
import java.awt.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.util.List;


@SuppressWarnings("serial")
public class EditBlog extends javax.swing.JFrame {

	private Controler CTRL = new Controler();
	private Blogger blogger;
	private Blog B;
	private String id_Blog;
	private ControlerBlog CB = new ControlerBlog();
	private List<Domaine> domainesList;
	Blog blog;
	
    public EditBlog(Blogger BB,Blog blog) {
    	this.blogger=BB;
    	this.blog=blog;
    	domainesList =CTRL.getDomaine();
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
        
        JButton EditProfile = new JButton("");
        EditProfile.setBackground(SystemColor.desktop);
        EditProfile.setBorderPainted(false);
        EditProfile.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\Profil.png"));
        
        AddBlog = new JButton("");
        
        AddBlog.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\blog.png"));
        AddBlog.setBorderPainted(false);
        AddBlog.setBackground(SystemColor.desktop);
        
        Logout = new JButton("");
        
        Logout.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\Logout.png"));
        Logout.setBorderPainted(false);
        Logout.setBackground(SystemColor.desktop);
        
        Home = new JButton("");
        
        Home.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\accueil.png"));
        Home.setBorderPainted(false);
        Home.setBackground(SystemColor.desktop);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        RightLayout.setHorizontalGroup(
        	RightLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap(11, Short.MAX_VALUE)
        			.addGroup(RightLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(RightLayout.createParallelGroup(Alignment.LEADING)
        					.addComponent(Home, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        					.addComponent(AddBlog, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        					.addComponent(Logout, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        				.addComponent(EditProfile, Alignment.TRAILING))
        			.addContainerGap())
        );
        RightLayout.setVerticalGroup(
        	RightLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addGap(218)
        			.addComponent(Home, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(AddBlog, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(Logout, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(EditProfile)
        			.addContainerGap(164, Short.MAX_VALUE))
        );
        Right.setLayout(RightLayout);

        jPanel1.add(Right);
        Right.setBounds(0, 0, 86, 600);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        
        JSeparator separator_1 = new JSeparator();
        
        separator_2 = new JSeparator();
        
        lblAjouterUnBlog = new JLabel();
        lblAjouterUnBlog.setText("Modifier  Blog");
        lblAjouterUnBlog.setHorizontalAlignment(SwingConstants.CENTER);
        lblAjouterUnBlog.setForeground(SystemColor.desktop);
        lblAjouterUnBlog.setFont(new Font("Segoe UI", Font.BOLD, 30));
        
        btnNewButton_4 = new JButton("");
        btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\blog.png"));
        btnNewButton_4.setBorderPainted(false);
        btnNewButton_4.setBackground(SystemColor.window);
        
        txtTitre = new JTextField();
        txtTitre.setText(this.blog.getTitre());
        txtTitre.setForeground(new Color(102, 102, 102));
        txtTitre.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        jLabel5 = new JLabel();
        jLabel5.setText("Titre");
        jLabel5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jLabel5.setBackground(new Color(102, 102, 102));
        
        lblPrnom = new JLabel();
        lblPrnom.setText("Domaine");
        lblPrnom.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblPrnom.setBackground(new Color(102, 102, 102));
        
        jButton1 = new JButton();
        
        jButton1.setText("Terminer");
        jButton1.setForeground(Color.WHITE);
        jButton1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jButton1.setBackground(SystemColor.desktop);
        
        JTextArea txtrGgggg = new JTextArea();
        txtrGgggg.setText(this.blog.getTexte());
        txtrGgggg.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtrGgggg.setBorder(new LineBorder(Color.LIGHT_GRAY));
        
        JLabel lblContenu = new JLabel();
        lblContenu.setText("Contenu");
        lblContenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblContenu.setBackground(new Color(102, 102, 102));
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBorder(new LineBorder(Color.LIGHT_GRAY));
        comboBox.setEditable(true);
        

        
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ModifierBlog(comboBox.getSelectedItem().toString(),txtTitre.getText(),txtrGgggg.getText());
        	}
        });
        
        for (Domaine d : domainesList) {
        	comboBox.addItem(d.getLibelle_Domaine());
        	if(this.blog.getDomaine().getLibelle_Domaine().equals(d.getLibelle_Domaine()))
        	{
        		comboBox.setSelectedItem(this.blog.getDomaine().getLibelle_Domaine());
        	}
        }
        int i;
        for (i=0;i<domainesList.size();i++) {
        	if(domainesList.get(i).getLibelle_Domaine()==this.blog.getDomaine().getLibelle_Domaine())
        	{
        		comboBox.setSelectedItem(i);
        	}
        }
        
        System.out.println();
        
        
        
        //jComboBox1.addItem("Mangue");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        LeftLayout.setHorizontalGroup(
        	LeftLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(LeftLayout.createSequentialGroup()
        					.addGap(35)
        					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(LeftLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 755, GroupLayout.PREFERRED_SIZE)
        						.addGroup(LeftLayout.createSequentialGroup()
        							.addGap(165)
        							.addComponent(lblAjouterUnBlog, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        						.addGroup(LeftLayout.createSequentialGroup()
        							.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblContenu, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtTitre, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE))
        							.addGap(66)
        							.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblPrnom, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)))
        						.addComponent(txtrGgggg, GroupLayout.PREFERRED_SIZE, 783, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(LeftLayout.createSequentialGroup()
        					.addGap(223)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(91, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
        	LeftLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(LeftLayout.createSequentialGroup()
        					.addGap(21)
        					.addGroup(LeftLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblAjouterUnBlog, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblPrnom, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(comboBox, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        				.addComponent(txtTitre, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        			.addGap(18)
        			.addComponent(lblContenu, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtrGgggg, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
        			.addGap(34)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(79))
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
        
        EditProfile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		EditProfileActionPerformed(e);
        	}
        });
        
        AddBlog.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MyBlogsActionPerformed(e);
        	}
        });
        
        Logout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LogoutActionPerformed(e);
        	}
        });
        
        EditProfile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		EditProfileActionPerformed(e);
        	}
        });
        
        jPanel1.add(separator);
        getContentPane().setLayout(layout);

        getAccessibleContext().setAccessibleName("Ajouter Blog");

        pack();
    }
    
   /** @SuppressWarnings("unused")
	private void CompleteCreationBlog(String Domaine,String titre,String Texte) {
    	
    	B=new Blog(titre,Texte,blogger,CB.getDomaineByLibelle(Domaine));
    	this.id_Blog=B.getId_blog();
        AddImage IndexFrame = new AddImage(blogger,B,this);
        IndexFrame.setVisible(true);
        //this.setVisible(true);
        IndexFrame.pack();
        IndexFrame.setLocationRelativeTo(null); 
        //this.dispose();
        
        
    }**/
    
    private void ModifierBlog(String Domaine,String titre,String Texte)
    {
    	//B=new Blog(this.id_Blog,titre,Texte,blogger,CB.getDomaineByLibelle(Domaine));
		CB.updateBlog(blog, titre, Texte, CB.getDomaineByLibelle(Domaine).getId_domaine());
		JOptionPane.showMessageDialog(this, "Blog Modifié avec succés");
		MyBlogs index = new MyBlogs(this.blogger);
        index.setVisible(true);
        index.pack();
        index.setLocationRelativeTo(null); 
        this.dispose();
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
        
        MyBlogs index = new MyBlogs(this.blogger);
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
    private JLabel lblAjouterUnBlog;
    private JButton btnNewButton_4;
    private JTextField txtTitre;
    private JLabel jLabel5;
    private JLabel lblPrnom;
    private JButton jButton1;
    String filename;
    byte[] blog_image=null;
}

