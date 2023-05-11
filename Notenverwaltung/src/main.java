import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.*;


public class main {

	public static void main(String[] args) {  
		
		List<String> faecher = new ArrayList<String>();
		
		window();
		erstelleFach(faecher);
		
			for (String string : faecher) {
				System.out.println(string);
			}
		}  
		
	public static void window() {
			
		JFrame f=new JFrame();//creating instance of JFrame  
	          
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
			          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
			
	}
	
	public static void erstelleFach(List<String> faecher) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Name des Faches: ");
	    
	    String name = myObj.nextLine();
	    
	    faecher.add(name);
		
	}

}
