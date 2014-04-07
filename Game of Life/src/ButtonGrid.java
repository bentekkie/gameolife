import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

public class ButtonGrid extends JFrame {
 
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		static JFrame frame=new JFrame(); //creates frame
        static JButton[][] grid; //names the grid of buttons
        private static stopHandler stophandler;
        public static int timer = 1;
        public static boolean drag;
        static Point mouseDownCompCoords;
 
        public ButtonGrid(int width, int length) { //constructor
            frame.setLayout(new GridLayout(width,length)); //set layout
            URL iconURL = getClass().getResource("icon.png");
            mouseDownCompCoords = null;
         // iconURL is null when not found
         ImageIcon icon = new ImageIcon(iconURL);
         frame.setIconImage(icon.getImage());
            Color g1 = new Color(128,128,128);
        	JMenuBar menuBar = new JMenuBar();
        	menuBar.setBackground(g1);
        	menuBar.setBorderPainted(false);
        	frame.setJMenuBar(menuBar);
	        //menuBar.add(fileMenu);
	        JMenuItem stopAction = new JMenuItem("To Stop Press Space");
	        stopAction.setAccelerator(KeyStroke.getKeyStroke(' '));
	        stophandler = new stopHandler();
	        menuBar.add(stopAction);
	        stopAction.setHorizontalTextPosition(10);
	        stopAction.addActionListener(stophandler);
            grid=new JButton[width][length]; //allocate the size of grid
            for(int y=0; y<length; y++){
                        for(int x=0; x<width; x++){
                        	final int x1 = x;
                        	final int y1 = y;
                                grid[x][y]=new JButton(); //creates new button     
                                frame.add(grid[x][y]); //adds button to grid
                            	Color g = new Color(128,128,128);
                    	        grid[x1][y1].setBackground(g);

                            	
                            	grid[x][y].setPreferredSize(new Dimension(40, 30));
                            	grid[x][y].setBorderPainted(false);
                            	grid[x][y].addMouseListener(new java.awt.event.MouseAdapter() {
                            		public void mouseDragged(java.awt.event.MouseEvent evt) 
                    	        	{
                    	        	   
                    	        	       
                    	        	        frame.setLocation(frame.getX()+MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
                    	        	    
                    	        	}
                            	    public void mouseEntered(java.awt.event.MouseEvent evt) {
                                    	Color r = new Color(255,0,0);
                                    	Color gr = new Color(0,255,0);
                                    	Color a = grid[x1][y1].getBackground();
                                    	if(Update.check(x1, y1, main.wid, main.len)){
                                    		Color g = new Color(128,128,128);

                                	        grid[x1][y1].setBackground(g);
                                   		 main.isGameRunning = true;
                                   		 if(a.getRed()== 255){
                                	        grid[x1][y1].setBackground(g);
                                    		grid[Update.widrand][Update.lenran].setBackground(r);
                                    		Update.count--;
                                   		 }
                                    		if (Update.count == 0){
                                    			grid[Update.gwidrand][Update.glenran].setBackground(gr);
                                    			Random rand = new Random();
                                    			Update.count = 10+rand.nextInt(10);
                                    		}
                                   		 
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
                                    }});kjgdkjglgdgjkd */
                        }
                }
                ActionListener actListner = new ActionListener() {

                	@Override

                	public void actionPerformed(ActionEvent event) {

                		if(main.isGameRunning){
                			timer++;
                		}
                	     ButtonGrid.frame.setTitle(Update.title());
                	}

                	  };
                	  Timer timer = new Timer(1000, actListner);

                	  timer.start();
                frame.setTitle("Score: "+Update.score);
                Random rand = new Random();
	 			ButtonGrid.grid[rand.nextInt(main.wid)][rand.nextInt(main.len)].setBackground(new Color(255,0,0));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack(); //sets appropriate size for frame
                frame.setVisible(true); //makes frame visible
        }
        public static void main(String[] args) {
            
                new ButtonGrid(main.wid,main.len);//makes new ButtonGrid with 2 parameters
        }
}
class clearHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		Update.clear(main.wid,main.len);
		Update.score = 1;
		System.out.println(Update.update+" squares cleared!");
	}
}
class stopHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		main.isGameRunning = false;
		// JOptionPane.showMessageDialog(null, "Your score is " + Update.scoref + ".");  
		Object[] options = { "OK","SHARE" };
		int option = JOptionPane.showOptionDialog(null, "CONGRATULATIONS, YOU GOT A SCORE OF "+Update.scoref+"!", "GAME STOPPED",
		JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		null, options, options[0]);
		if(option == 1){
			Update.openWebpage(Update.twittershare());
		};
		 Update.clear(main.wid,main.len);
		 Update.count = 30;
		 Update.green = 2;
		 Update.score = 1;
	     ButtonGrid.frame.setTitle(Update.title());
;
	}
	
}
class dragHandler implements MouseListener
{

	DragUndecoratedWindow test = new DragUndecoratedWindow(ButtonGrid.frame);
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		test.onPress(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		test.moveWindow(e);
	}
	
}
