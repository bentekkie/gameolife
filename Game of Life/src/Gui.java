import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
public class Gui {
		 JFrame frame=new JFrame();
		 JButton[][] grid; //names the grid of buttons
	        public void ButtonGrid(int width, int length){
	                frame.setLayout(new GridLayout(width,length));
	                grid=new JButton[width][length]; //allocate the size of grid
	                for(int y=0; y<length; y++){ 
	                        for(int x=0; x<width; x++){
	                                grid[x][y]=new JButton("("+x+","+y+")");   
	                                frame.add(grid[x][y]); //adds button to grid
	                        }
	                }
	                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	                frame.pack(); 
	                frame.setVisible(true); 
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonGrid(3,3);

}}
