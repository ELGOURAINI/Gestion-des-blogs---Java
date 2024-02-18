package Views;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.GroupLayout.Alignment;
import Metier.Blog;
import Metier.Blogger;
import Metier.Controler;
import Metier.ControlerBlog;
import Metier.ImageB;
import javax.swing.*;
import java.awt.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;


@SuppressWarnings("serial")
public class Index extends javax.swing.JFrame {

	@SuppressWarnings("unused")
	private Controler CTRL = new Controler();
	private ControlerBlog CB=new ControlerBlog(); 
	private Blogger blogger;
	int currentIndex = 0;
    public Index(Blogger B) {
    	this.blogger=B;
    	setUndecorated(true);
        initComponents();
    }
 
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setRequestFocusEnabled(false);
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        FlowLayout flowLayout = (FlowLayout) Left.getLayout();
        flowLayout.setAlignOnBaseline(true);
        flowLayout.setAlignment(FlowLayout.LEADING);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Index");
        setPreferredSize(new Dimension(1000, 600));

        jPanel1.setBackground(new Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(SystemColor.desktop);
        Right.setPreferredSize(new Dimension(500, 500));
        
        JButton EditProfile = new JButton("");
        EditProfile.setToolTipText("Modifier Profile");
        EditProfile.setBackground(SystemColor.desktop);
        EditProfile.setBorderPainted(false);
        EditProfile.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\la-personne.png"));
        
        AddBlog = new JButton("");
        AddBlog.setToolTipText("Ajouter Un Blog");
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
        
        JButton AddBlog_1 = new JButton("");
        AddBlog_1.setToolTipText("Mes Blogs");
        AddBlog_1.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\blog (2).png"));
        AddBlog_1.setBorderPainted(false);
        AddBlog_1.setBackground(SystemColor.desktop);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        RightLayout.setHorizontalGroup(
        	RightLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(AddBlog_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(11, Short.MAX_VALUE))
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(Home, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(11, Short.MAX_VALUE))
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(EditProfile)
        			.addContainerGap(11, Short.MAX_VALUE))
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap(11, Short.MAX_VALUE)
        			.addComponent(Logout, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, RightLayout.createSequentialGroup()
        			.addContainerGap(11, Short.MAX_VALUE)
        			.addComponent(AddBlog, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        RightLayout.setVerticalGroup(
        	RightLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addGap(154)
        			.addComponent(Home, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(AddBlog_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(AddBlog, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(EditProfile)
        			.addGap(18)
        			.addComponent(Logout, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(169, Short.MAX_VALUE))
        );
        Right.setLayout(RightLayout);

        jPanel1.add(Right);
        Right.setBounds(0, 0, 86, 600);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        
        JLabel lblListeDesBlogs = new JLabel();
        lblListeDesBlogs.setText("Liste des blogs");
        lblListeDesBlogs.setForeground(SystemColor.desktop);
        lblListeDesBlogs.setFont(new Font("Segoe UI", Font.BOLD, 36));
        //javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        //jScrollPane1.setViewportView(table);
        
        Left.setBounds(56, 0, 884, 600);
        Left.setLayout(new BoxLayout(Left, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(Left);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(84, 0, 906,600);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        
        //cardsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        List<Blog> blogs = CB.getBlogsWithoutMine(this.blogger);
        
        for (Blog blog : blogs) {
        	JPanel Right_1 = new JPanel();
    		Right_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    		Right_1.setPreferredSize(new Dimension(800, 500));
    		Right_1.setBackground(SystemColor.textHighlightText);
    		getContentPane().add(Right_1);
    		
    		JLabel lblNewLabel_2 = new JLabel("Texte :");
    		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
    		
    		JTextArea txtrTexte = new JTextArea();
    		txtrTexte.setEditable(false);
    		txtrTexte.setText(blog.getTexte());
    		txtrTexte.setFont(new Font("Tahoma", Font.PLAIN, 14));
    		txtrTexte.setBorder(null);
    		txtrTexte.setBackground(SystemColor.textHighlightText);
    		txtrTexte.setLineWrap(true);
    		txtrTexte.setWrapStyleWord(true);
    		
    		
    		
    		System.out.println(blog.getTexte());
    		
    		System.out.println(blog.getTitre());
    		JLabel lblNewLabel_3 = new JLabel("Titre: "+ blog.getTitre());
    		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
    		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
    		
    		System.out.println();
    		JLabel lblNewLabel_1 = new JLabel("Domaine :");
    		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
    		
    		System.out.println(blog.getDomaine().getLibelle_Domaine());
    		JLabel lblNewLabel_4 = new JLabel(blog.getDomaine().getLibelle_Domaine());
    		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
    		
    		JLabel imgs = new JLabel("");
    		imgs.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    		imgs.setHorizontalAlignment(SwingConstants.CENTER);
    		if(!Images(blog).isEmpty())
    		{
    			currentIndex=0;
    			ImageIcon resizedIcon = resizeImageIcon(new ImageIcon(Images(blog).get(currentIndex).getChemin()), 200, 300);
    			imgs.setIcon(resizedIcon);
    			System.out.println(Images(blog).get(currentIndex).getChemin());
    			
    		}
    		
    		
    		
    		JButton Suivant = new JButton("");
    		Suivant.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				if (currentIndex+1 < Images(blog).size()) {	
    					currentIndex++;
    					ImageIcon resizedIcon = resizeImageIcon(new ImageIcon(Images(blog).get(currentIndex).getChemin()), 200, 300);
    	    			imgs.setIcon(resizedIcon);
    	    			System.out.println(currentIndex);
    				//System.out.println(Images(blog).get(currentIndex+1).getChemin());
    				//currentIndex++;
    				
    				}
    				 
    				
    			}
    		});
    		
    		

    		Suivant.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\bouton-suivant.png"));
    		Suivant.setBorder(null);
    		
    		
    		JButton Suivant_1 = new JButton("");
    		Suivant_1.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\precedent.png"));
    		Suivant_1.setBorder(null);
    		Suivant_1.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    				if(currentIndex == (Images(blog).size() ))
    				{
    					currentIndex=0;
    					ImageIcon resizedIcon = resizeImageIcon(new ImageIcon(Images(blog).get(currentIndex).getChemin()), 200, 300);
    	    			imgs.setIcon(resizedIcon);
    					System.out.println(currentIndex);
    					//currentIndex++;
    					
    				}else if(currentIndex>0 && currentIndex<(Images(blog).size() ))
    				{
    					currentIndex--;
    					ImageIcon resizedIcon = resizeImageIcon(new ImageIcon(Images(blog).get(currentIndex).getChemin()), 200, 300);
    	    			imgs.setIcon(resizedIcon);
    					System.out.println(currentIndex);
    					
    				}
    				
    			}
    		});
    		
    		JTextField Comment = new JTextField();
    		Comment.setToolTipText("Ecrire un commentaire");
    		Comment.setText("Ecrire un commentaire");
    		Comment.setForeground(new Color(102, 102, 102));
    		Comment.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    		
    		JButton btnEcrireUnCommentaire = new JButton("");
    		btnEcrireUnCommentaire.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				//Comment.getText();
    				AddCommentaire(blogger, blog, Comment.getText());
    				Comment.setText("Ecrire un commentaire");
    			}
    		});
    		btnEcrireUnCommentaire.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\commenter.png"));
    		btnEcrireUnCommentaire.setToolTipText("Cliquer Pour ajouter un commentaire");
    		btnEcrireUnCommentaire.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
    		btnEcrireUnCommentaire.setBorder(new LineBorder(new Color(0, 0, 0)));
    		
    		JLabel lblNewLabel = new JLabel("Publié le "+blog.getTimestamp());
    		lblNewLabel.setFont(new Font("Segoe UI", Font.ITALIC, 10));
    		GroupLayout gl_Right_1 = new GroupLayout(Right_1);
    		gl_Right_1.setHorizontalGroup(
    			gl_Right_1.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_Right_1.createSequentialGroup()
    					.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_Right_1.createSequentialGroup()
    							.addGap(102)
    							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE))
    						.addGroup(Alignment.TRAILING, gl_Right_1.createSequentialGroup()
    							.addGap(57)
    							.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    								.addGroup(gl_Right_1.createSequentialGroup()
    									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
    									.addPreferredGap(ComponentPlacement.RELATED)
    									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_Right_1.createSequentialGroup()
    									.addGap(1)
    									.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    										.addGroup(gl_Right_1.createSequentialGroup()
    											.addComponent(Comment, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
    											.addPreferredGap(ComponentPlacement.RELATED)
    											.addComponent(btnEcrireUnCommentaire, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
    										.addGroup(gl_Right_1.createSequentialGroup()
    											.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
    											.addPreferredGap(ComponentPlacement.RELATED)
    											.addComponent(txtrTexte, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)))))
    							.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
    							.addGroup(gl_Right_1.createParallelGroup(Alignment.TRAILING)
    								.addGroup(gl_Right_1.createSequentialGroup()
    									.addComponent(Suivant_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
    									.addGap(18)
    									.addComponent(Suivant)
    									.addGap(80))
    								.addComponent(imgs, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
    								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))))
    					.addContainerGap())
    		);
    		gl_Right_1.setVerticalGroup(
    			gl_Right_1.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_Right_1.createSequentialGroup()
    					.addGap(30)
    					.addComponent(lblNewLabel_3)
    					.addGap(41)
    					.addGroup(gl_Right_1.createParallelGroup(Alignment.TRAILING)
    						.addGroup(gl_Right_1.createSequentialGroup()
    							.addGroup(gl_Right_1.createParallelGroup(Alignment.BASELINE)
    								.addComponent(lblNewLabel_1)
    								.addComponent(lblNewLabel_4))
    							.addGap(18)
    							.addGroup(gl_Right_1.createParallelGroup(Alignment.BASELINE)
    								.addComponent(lblNewLabel_2)
    								.addComponent(txtrTexte, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)))
    						.addGroup(gl_Right_1.createSequentialGroup()
    							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
    							.addPreferredGap(ComponentPlacement.UNRELATED)
    							.addComponent(imgs, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)))
    					.addGap(27)
    					.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    						.addComponent(btnEcrireUnCommentaire, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
    						.addComponent(Comment, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
    						.addComponent(Suivant_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
    						.addComponent(Suivant))
    					.addContainerGap(62, Short.MAX_VALUE))
    		);
    		
    		Right_1.setLayout(gl_Right_1);
    		Left.add(Right_1);
        }
        jPanel1.add(scrollPane);
        
        
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBackground(SystemColor.inactiveCaptionBorder);
        separator.setBounds(84, 0, 7, 600);
        
        Home.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HomeActionPerformed(e);
        	}
        });
        
        AddBlog_1.addActionListener(new ActionListener() {
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
    
    @SuppressWarnings("unused")
    //
	private void AfficherBlogs() {
    	@SuppressWarnings("unused")
		List<Blog> blogs=CB.getAllBlogs();
     }
    
    private ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    
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
    
    private List<ImageB> Images(Blog blog)
	{
		return CB.ImageBlog(blog);
	}
    
    private void  AddCommentaire(Blogger blogger , Blog blog , String txt)
    {
    	CB.addComment(blogger, blog, txt);
    	JOptionPane.showMessageDialog(this, "Le commentaire est ajouté avec succés");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel jPanel1;
    private JButton AddBlog;
    private JButton Logout;
    private JButton Home;
}
