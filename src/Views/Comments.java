package Views;
import javax.swing.GroupLayout.Alignment;
import Metier.Blog;
import Metier.Commentaire;
import Metier.Controler;
import Metier.ControlerBlog;
import javax.swing.*;
import java.awt.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("serial")
public class Comments extends javax.swing.JFrame {

	private Controler CTRL = new Controler();
	private ControlerBlog CB=new ControlerBlog();
	private Blog blog;
	
	
    public Comments(Blog blog ) {
        this.blog=blog;
    	setUndecorated(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	//setAlwaysOnTop(true);
        initComponents();
        
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setRequestFocusEnabled(false);
        Left = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajouter Images");
        setPreferredSize(new Dimension(700, 500));

        jPanel1.setBackground(SystemColor.desktop);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        
        separator_2 = new JSeparator();
        
        lblAjouterUnBlog = new JLabel();
        lblAjouterUnBlog.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\commenter.png"));
        lblAjouterUnBlog.setText("Commentaires");
        lblAjouterUnBlog.setHorizontalAlignment(SwingConstants.CENTER);
        lblAjouterUnBlog.setForeground(SystemColor.desktop);
        lblAjouterUnBlog.setFont(new Font("Segoe UI", Font.BOLD, 24));

        if(ViewComments(blog).isEmpty())
		{
        	JLabel lblNewLabel = new JLabel("");
            lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
            lblNewLabel.setVisible(false);
            
            JLabel lblNewLabel_1 = new JLabel("Il n'y a aucun commentaire");
            
            javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
            LeftLayout.setHorizontalGroup(
            	LeftLayout.createParallelGroup(Alignment.LEADING)
            		.addGroup(LeftLayout.createSequentialGroup()
            			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            			.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 755, GroupLayout.PREFERRED_SIZE))
            		.addGroup(LeftLayout.createSequentialGroup()
            			.addGap(22)
            			.addComponent(lblAjouterUnBlog, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
            			.addContainerGap(107, Short.MAX_VALUE))
            		.addGroup(LeftLayout.createSequentialGroup()
            			.addGap(40)
            			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
            			.addPreferredGap(ComponentPlacement.RELATED)
            			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
            			.addContainerGap(133, Short.MAX_VALUE))
            );
            LeftLayout.setVerticalGroup(
            	LeftLayout.createParallelGroup(Alignment.LEADING)
            		.addGroup(LeftLayout.createSequentialGroup()
            			.addGap(13)
            			.addComponent(lblAjouterUnBlog, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            			.addPreferredGap(ComponentPlacement.UNRELATED)
            			.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
            			.addPreferredGap(ComponentPlacement.RELATED)
            			.addGroup(LeftLayout.createParallelGroup(Alignment.BASELINE)
            				.addComponent(lblNewLabel)
            				.addComponent(lblNewLabel_1))
            			.addContainerGap(356, Short.MAX_VALUE))
            );
            Left.setLayout(LeftLayout);
		}
        
        else
        {
        
        for(Commentaire cm: ViewComments(blog) )
        {
        	JLabel lblNewLabel = new JLabel(cm.getBlogger().getUsername());
            lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
            
            JLabel lblNewLabel_1 = new JLabel(cm.getContent());
            
            javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
            LeftLayout.setHorizontalGroup(
            	LeftLayout.createParallelGroup(Alignment.LEADING)
            		.addGroup(LeftLayout.createSequentialGroup()
            			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            			.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 755, GroupLayout.PREFERRED_SIZE))
            		.addGroup(LeftLayout.createSequentialGroup()
            			.addGap(22)
            			.addComponent(lblAjouterUnBlog, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
            			.addContainerGap(107, Short.MAX_VALUE))
            		.addGroup(LeftLayout.createSequentialGroup()
            			.addGap(40)
            			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
            			.addPreferredGap(ComponentPlacement.RELATED)
            			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
            			.addContainerGap(133, Short.MAX_VALUE))
            );
            LeftLayout.setVerticalGroup(
            	LeftLayout.createParallelGroup(Alignment.LEADING)
            		.addGroup(LeftLayout.createSequentialGroup()
            			.addGap(13)
            			.addComponent(lblAjouterUnBlog, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            			.addPreferredGap(ComponentPlacement.UNRELATED)
            			.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
            			.addPreferredGap(ComponentPlacement.RELATED)
            			.addGroup(LeftLayout.createParallelGroup(Alignment.BASELINE)
            				.addComponent(lblNewLabel)
            				.addComponent(lblNewLabel_1))
            			.addContainerGap(356, Short.MAX_VALUE))
            );
            Left.setLayout(LeftLayout);
        }
        
        }
        
        

        jPanel1.add(Left);
        Left.setBounds(10, 10, 680, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }
    
    private List<Commentaire> ViewComments(Blog blog)
    {
    	List<Commentaire> comm = new ArrayList<Commentaire>();
    	comm=CB.getComments(blog);
    	
    	return comm;
    	
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel jPanel1;
    private JSeparator separator_2;
    private JLabel lblAjouterUnBlog;
    File f=null;
	String path = null;
	private ImageIcon format=null;
	String fname=null;
	int s=0;
	byte[] pimage=null;
}
