
package Views;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;

import Metier.Blog;
import Metier.ImageB;
import Metier.Blogger;
import Metier.Controler;
import Metier.ControlerBlog;

import javax.swing.*;
import java.awt.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;


@SuppressWarnings("serial")
public class AddImage extends javax.swing.JFrame {

	private Controler CTRL = new Controler();
	private ControlerBlog CB=new ControlerBlog();
	private Blogger blogger;
	private Blog blog;
	AddBlog addBlog;
	
	
    public AddImage(Blogger B,Blog blog , AddBlog addBlog) {
    	this.blogger=B;
        this.blog=blog;
        this.addBlog=addBlog;
    	setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//setAlwaysOnTop(true);
        initComponents();
        
    }
 
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setRequestFocusEnabled(false);
        Left = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajouter Images");
        setPreferredSize(new Dimension(700, 300));

        jPanel1.setBackground(SystemColor.desktop);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        
        separator_2 = new JSeparator();
        
        lblAjouterUnBlog = new JLabel();
        lblAjouterUnBlog.setText("Ajouter Une Image");
        lblAjouterUnBlog.setHorizontalAlignment(SwingConstants.CENTER);
        lblAjouterUnBlog.setForeground(SystemColor.desktop);
        lblAjouterUnBlog.setFont(new Font("Segoe UI", Font.BOLD, 24));
        
        btnNewButton_4 = new JButton("Retour");
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		retour();
        	}
        });
        btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\oumai\\OneDrive\\Documents\\Study\\EMG_Ginfo\\S1\\POO\\Projet\\Gestion_Blogs\\src\\Icon\\retour.png"));
        btnNewButton_4.setBorderPainted(false);
        btnNewButton_4.setBackground(SystemColor.window);
        
        btBrowse = new JButton();
        btBrowse.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 JFileChooser fileChooser = new JFileChooser();
        		 FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        		 fileChooser.addChoosableFileFilter(fnwf);
        		 int load = fileChooser.showOpenDialog(null);
        		 
        		 if(load==fileChooser.APPROVE_OPTION)
        		 {
        			 f=fileChooser.getSelectedFile();
        			 
        			 path=f.getAbsolutePath();
        			 imagePath.setText(path);
        			 ImageIcon ii = new ImageIcon(path);
        			 Image img = ii.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        			 
        		 }
        		
        	}
        });
        btBrowse.setText("Choisir Image");
        btBrowse.setForeground(Color.WHITE);
        btBrowse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btBrowse.setBackground(new Color(0, 0, 0));
        
        imagePath = new JTextField();
        imagePath.setToolTipText("Path Image");
        imagePath.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Chemin de l'image :");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        JButton btnSave = new JButton();
        btnSave.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		SaveImage(imagePath.getText()," ");
        		
        	}
        });
        btnSave.setText("Enregistrer Image");
        btnSave.setForeground(Color.WHITE);
        btnSave.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btnSave.setBackground(new Color(34, 139, 34));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        LeftLayout.setHorizontalGroup(
        	LeftLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(LeftLayout.createSequentialGroup()
        					.addGap(71)
        					.addComponent(lblAjouterUnBlog, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
        					.addGap(29)
        					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
        				.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 755, GroupLayout.PREFERRED_SIZE)))
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGap(152)
        			.addComponent(btBrowse, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnSave)
        			.addContainerGap(320, Short.MAX_VALUE))
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGap(40)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
        				.addComponent(imagePath, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(193, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
        	LeftLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(LeftLayout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblAjouterUnBlog, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNewLabel)
        			.addGap(10)
        			.addComponent(imagePath, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addGap(30)
        			.addGroup(LeftLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btBrowse))
        			.addContainerGap(37, Short.MAX_VALUE))
        );
        Left.setLayout(LeftLayout);

        jPanel1.add(Left);
        Left.setBounds(10, 10, 680, 270);

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
    
    @SuppressWarnings("unused")
	private void SaveImage(String path,String description) {
    	
            ImageB img = new ImageB(path,description,this.blog);
            CB.addImageBlog(img);
            System.out.println("Image ajouté au blog avec réussie.");
            imagePath.setText("");
        	
            JOptionPane.showMessageDialog(this, "Image ajouté au blog avec succes");

    }
    
    private void retour()
    {
    	
        this.addBlog.setVisible(true);
        this.addBlog.pack();
        this.addBlog.setLocationRelativeTo(null); 
        this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel jPanel1;
    private JSeparator separator_2;
    private JLabel lblAjouterUnBlog;
    private JButton btnNewButton_4;
    private JButton btBrowse;
    private JTextField imagePath;
    File f=null;
	String path = null;
	private ImageIcon format=null;
	String fname=null;
	int s=0;
	byte[] pimage=null;
}
