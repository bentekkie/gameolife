import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class ButtonGrid extends JFrame {
 
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		static JFrame frame=new JFrame(); //creates frame
        static JButton[][] grid; //names the grid of buttons
        private static clearHandler clearhandler;
        public static int timer = 1;
 
        public ButtonGrid(int width, int length) { //constructor
            frame.setLayout(new GridLayout(width,length)); //set layout
            
            Color g1 = new Color(128,128,128);
        	JMenuBar menuBar = new JMenuBar();
        	menuBar.setBackground(g1);
        	menuBar.setBorderPainted(false);
        	frame.setJMenuBar(menuBar);
			JMenu fileMenu = new JMenu("File");
			fileMenu.setBackground(g1);
			fileMenu.setBorderPainted(false);
	        menuBar.add(fileMenu);
	        JMenuItem setupAction = new JMenuItem("Clear");
	        setupAction.setBackground(g1);
	        setupAction.setBorderPainted(false);
	        clearhandler = new clearHandler();
	        fileMenu.add(setupAction);
	        setupAction.addActionListener(clearhandler);
                grid=new JButton[width][length]; //allocate the size of grid
                for(int y=0; y<length; y++){
                        for(int x=0; x<width; x++){
                        	final int x1 = x;
                        	final int y1 = y;
                                grid[x][y]=new JButton(); //creates new button     
                                frame.add(grid[x][y]); //adds button to grid
                            	Color g = new Color(128,128,128);
                    	        main.state[x][y] = false;
                    	        grid[x1][y1].setBackground(g);

                            	
                            	grid[x][y].setPreferredSize(new Dimension(40, 30));
                            	grid[x][y].setBorderPainted(false);
                            	grid[x][y].addMouseListener(new java.awt.event.MouseAdapter() {
                            	    public void mouseEntered(java.awt.event.MouseEvent evt) {
                                    	Color r = new Color(255,0,0);
                                    	if(Update.check(x1, y1, 19, 19)){
                                    		Color g = new Color(128,128,128);
                                	        grid[x1][y1].setBackground(g);
                                    		grid[Update.widrand][Update.lenran].setBackground(r);;
                                    			
                                    	};
                                    	
                                    	
                                		System.out.println("("+x1+","+y1+")");
                            	    }
                            	    public void mouseExited(java.awt.event.MouseEvent evt) {
                                    	//Color g = new Color(128,128,128);
                            	        //grid[x1][y1].setBackground(g);
                                    	}
                            	    }
                            	   );
                               /* grid[x][y].addActionListener(new ActionListener() {
                                	 
                                    public void actionPerformed(ActionEvent e)
                                    {
                                    	
                                    	Color w = new Color(255,255,255);
                                    	Color g = new Color(128,128,128);
                                    	
                                    	if(main.state[x1][y1]){
                                    		grid[x1][y1].setBackground(w);
                                    		main.state[x1][y1] = false;
                                    	}else {

                                        	grid[x1][y1].setBackground(g);
                                        	main.state[x1][y1] = true;
                                    	}
                                    	
                                        System.out.println("("+x1+","+y1+")");
                                    }}); */
                        }
                }
                ActionListener actListner = new ActionListener() {

                	@Override

                	public void actionPerformed(ActionEvent event) {

                	     timer++;
                	     ButtonGrid.frame.setTitle("Score: "+Update.score+"^2/"+ButtonGrid.timer+" = "+(Update.score*Update.score)/ButtonGrid.timer);

                	     

                	}

                	  };
                	  Timer timer = new Timer(1000, actListner);

                	  timer.start();
                frame.setTitle("Score: "+Update.score);
                Random rand = new Random();
	 			ButtonGrid.grid[rand.nextInt(19)][rand.nextInt(19)].setBackground(new Color(255,0,0));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack(); //sets appropriate size for frame
                frame.setVisible(true); //makes frame visible
        }
        public static void main(String[] args) {
            
                new ButtonGrid(19,19);//makes new ButtonGrid with 2 parameters
        }
}
class clearHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		Update.clear(19,19);
		System.out.println(Update.update+" squares cleared!");
	}
}
