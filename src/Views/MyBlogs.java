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
public class MyBlogs extends javax.swing.JFrame {

	@SuppressWarnings("unused")
	private Controler CTRL = new Controler();
	private ControlerBlog CB=new ControlerBlog(); 
	private Blogger blogger;
	int currentIndex = 0;
    public MyBlogs(Blogger B) {
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
        cardsPanel=new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new Dimension(1000, 600));

        jPanel1.setBackground(SystemColor.desktop);
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
        AddBlog.setToolTipText("Ajouter un blog");
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
        Home.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\accueil.png"));
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
        	RightLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addGroup(RightLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(RightLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(Home, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        				.addGroup(RightLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(AddBlog_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        				.addGroup(RightLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(AddBlog, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        				.addGroup(RightLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(EditProfile))
        				.addGroup(RightLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(Logout, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(11, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
        	RightLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(RightLayout.createSequentialGroup()
        			.addGap(174)
        			.addComponent(Home, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(AddBlog_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(AddBlog, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(EditProfile)
        			.addGap(18)
        			.addComponent(Logout, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(149, Short.MAX_VALUE))
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
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(84, 0, 916,600);
        
        
        //cardsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        List<Blog> blogs = CB.getBlogsByBloggerId(this.blogger);
        
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
    		
    		JButton btnAjouterUneImage = new JButton();
    		btnAjouterUneImage.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				Edit_Blog(blogger, blog);
    				
    			}
    		});
    		btnAjouterUneImage.setText("Modifier Blog");
    		btnAjouterUneImage.setForeground(Color.WHITE);
    		btnAjouterUneImage.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    		btnAjouterUneImage.setBackground(SystemColor.desktop);
    		
    		JButton btnAjouterUneImage_1 = new JButton();
    		
    		btnAjouterUneImage_1.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				if(Images(blog).isEmpty())
    	    		{
    					CompleteCreationBlog(blog, null);
    	    		}
    				else
    				{
    					CompleteCreationBlog(blog, Images(blog).get(currentIndex));
    				}
    				
    				
    			}
    		});
    		
    		if(!Images(blog).isEmpty())
    		{
    			btnAjouterUneImage_1.setText("Modifier Image");
    		}
    		else
    		{
    			btnAjouterUneImage_1.setText("Ajouter Image");
    		}
    		
    		
    		btnAjouterUneImage_1.setForeground(Color.WHITE);
    		btnAjouterUneImage_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    		btnAjouterUneImage_1.setBackground(new Color(34, 139, 34));
    		
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
    		
    		JButton btnVoirCommentaire = new JButton();
    		btnVoirCommentaire.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				ViewComm(blog);
    				
    			}
    		});
    		btnVoirCommentaire.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\icons8_eye_20px_1.png"));
    		btnVoirCommentaire.setText("Commentaires");
    		btnVoirCommentaire.setForeground(Color.WHITE);
    		btnVoirCommentaire.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    		btnVoirCommentaire.setBackground(SystemColor.desktop);
    		GroupLayout gl_Right_1 = new GroupLayout(Right_1);
    		gl_Right_1.setHorizontalGroup(
    			gl_Right_1.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_Right_1.createSequentialGroup()
    					.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_Right_1.createSequentialGroup()
    							.addGap(57)
    							.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    								.addGroup(gl_Right_1.createSequentialGroup()
    									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
    									.addPreferredGap(ComponentPlacement.RELATED)
    									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_Right_1.createSequentialGroup()
    									.addGroup(gl_Right_1.createParallelGroup(Alignment.TRAILING)
    										.addGroup(gl_Right_1.createSequentialGroup()
    											.addComponent(btnVoirCommentaire)
    											.addGap(18)
    											.addComponent(btnAjouterUneImage)
    											.addGap(18)
    											.addComponent(btnAjouterUneImage_1, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
    										.addGroup(gl_Right_1.createSequentialGroup()
    											.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
    											.addPreferredGap(ComponentPlacement.RELATED)
    											.addComponent(txtrTexte, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)))
    									.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
    									.addGroup(gl_Right_1.createParallelGroup(Alignment.TRAILING)
    										.addComponent(imgs, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
    										.addGroup(gl_Right_1.createSequentialGroup()
    											.addComponent(Suivant_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
    											.addGap(18)
    											.addComponent(Suivant)
    											.addGap(81))))))
    						.addGroup(gl_Right_1.createSequentialGroup()
    							.addGap(102)
    							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE)))
    					.addContainerGap())
    		);
    		gl_Right_1.setVerticalGroup(
    			gl_Right_1.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_Right_1.createSequentialGroup()
    					.addGap(30)
    					.addComponent(lblNewLabel_3)
    					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
    					.addGroup(gl_Right_1.createParallelGroup(Alignment.BASELINE)
    						.addComponent(lblNewLabel_1)
    						.addComponent(lblNewLabel_4))
    					.addGap(18)
    					.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_Right_1.createSequentialGroup()
    							.addComponent(imgs, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
    							.addGap(18)
    							.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    								.addComponent(Suivant_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
    								.addComponent(Suivant)))
    						.addGroup(gl_Right_1.createSequentialGroup()
    							.addGroup(gl_Right_1.createParallelGroup(Alignment.BASELINE)
    								.addComponent(lblNewLabel_2)
    								.addComponent(txtrTexte, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
    							.addGap(18)
    							.addGroup(gl_Right_1.createParallelGroup(Alignment.LEADING)
    								.addComponent(btnVoirCommentaire, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
    								.addComponent(btnAjouterUneImage_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
    								.addComponent(btnAjouterUneImage, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
    					.addGap(31))
    		);
    		if(Images(blog).isEmpty())
    		{
    			btnAjouterUneImage_1.setVisible(false);
    		}
    		Right_1.setLayout(gl_Right_1);
    		Left.add(Right_1);
        }
        
       

        jPanel1.add(scrollPane);
        

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
    
    @SuppressWarnings({ "unused", "unused", "unused" })
	private void AfficherBlogs() {

    	List<Blog> blogs=CB.getBlogsByBloggerId(this.blogger);
     }
    
    
private void Edit_Blog(Blogger blogger,Blog blog) {//GEN-FIRST:event_jButton2ActionPerformed
        
	EditBlog index = new EditBlog(blogger,blog);
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
    
    @SuppressWarnings("unused")
	private void MyBlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Index index = new Index(this.blogger);
        index.setVisible(true);
        index.pack();
        index.setLocationRelativeTo(null); 
        this.dispose();
    }

    @SuppressWarnings("unused")
	private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    EditProfile index = new EditProfile(this.blogger);
    index.setVisible(true);
    index.pack();
    index.setLocationRelativeTo(null); 
    this.dispose();
    }
    
    @SuppressWarnings("unused")
	private void AddBlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        AddBlog index = new AddBlog(this.blogger);
        index.setVisible(true);
        index.pack();
        index.setLocationRelativeTo(null); 
        this.dispose();
        }
    
    

    @SuppressWarnings("unused")
	private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    Login index = new Login();
    index.setVisible(true);
    index.pack();
    index.setLocationRelativeTo(null); 
    this.dispose();
    }
    
    //liste des images d'un blog
    private List<ImageB> Images(Blog blog)
	{
		return CB.ImageBlog(blog);
	}
    
    //aller vers la page ou l'utilisateur peut modifier l'image du blog ou il est
    private void CompleteCreationBlog(Blog b,ImageB im) {
    	
        EditImage IndexFrame = new EditImage(blogger,b,im);
        IndexFrame.setVisible(true);
        //this.setVisible(true);
        IndexFrame.pack();
        IndexFrame.setLocationRelativeTo(null); 
        this.dispose();
        
        
    }
    //Cette methode permet d'aller vers la pages ou il y a les commentaires liés à un blog
    private void ViewComm(Blog b) {
    	
        Comments IndexFrame = new Comments(b);
        IndexFrame.setVisible(true);
        //this.setVisible(true);
        IndexFrame.pack();
        IndexFrame.setLocationRelativeTo(null); 
        //this.dispose();
        
        
    }
    
    
    
    private ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // Créez une nouvelle ImageIcon à partir de l'image redimensionnée
        return new ImageIcon(resizedImage);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel cardsPanel;
    private JButton AddBlog;
    private JButton Logout;
    private JButton Home;
    private JButton AddBlog_1;
}
