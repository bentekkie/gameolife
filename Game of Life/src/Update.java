import java.awt.Color;
import java.util.Random;



public class Update {
	public static int update;
	public static int lenran = 1;
	public static int widrand = 1;
	public static int score = 0;
	public static void clear(int width, int length){
		update = 0;
	 for(int y=0; y<length; y++){
         for(int x=0; x<width; x++){
             	Color g = new Color(128,128,128);
             	if(main.state[x][y]){
             		
             	}else{
             		update++;
             		main.state[x][y] = true;
             	}
             	ButtonGrid.grid[x][y].setBackground(g);
                     }}
	 			score = 0;
	 			
	 			ButtonGrid.frame.setTitle("Score: "+score+"^2/"+ButtonGrid.timer+" = "+(score*score)/ButtonGrid.timer);
	 			Random rand = new Random();
	 			ButtonGrid.grid[rand.nextInt(19)][rand.nextInt(19)].setBackground(new Color(255,0,0));
	 			ButtonGrid.timer = 0;;
         }
	public static void randsel(int width, int length){

     	Color r = new Color(255,0,0);
	    ButtonGrid.grid[13][15].setBackground(r);
	}
	public static Boolean check(int x, int y, int x1, int y1){
		Color a = ButtonGrid.grid[x][y].getBackground(); 
		if(a.getRed() == 255){
			 Random rand = new Random();
			    widrand = rand.nextInt(19);
			    lenran = rand.nextInt(19);
			    score++;
			    ButtonGrid.frame.setTitle("Score: "+score+"^2/"+ButtonGrid.timer+" = "+(score*score)/ButtonGrid.timer);
			    return true;
		}else{
			return false;
		}
	}

 
	}

