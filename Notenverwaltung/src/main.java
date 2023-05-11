import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {

	public static void main(String[] args) {  
		
		window();
		
		}  
		
		public static void window() {
			
			
			JFrame f=new JFrame();//creating instance of JFrame  
	          
			JButton b=new JButton("click");//creating instance of JButton  
			b.setBounds(130,100,100, 50);//x axis, y axis, width, height  
			          
			JLabel l = new JLabel();
			l.setText("Hoffe das Klappt jetzt mal!");
			
			
			f.add(l);
			f.add(b);//adding button in JFrame  
			          
			f.setSize(400,500);//400 width and 500 height  
			f.setLayout(null);//using no layout managers  
			f.setVisible(true);//making the frame visible  
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}
