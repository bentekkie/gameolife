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
	 			
	 			ButtonGrid.frame.setTitle(title());
	 			Random rand = new Random();
	 			ButtonGrid.grid[rand.nextInt(main.wid)][rand.nextInt(main.len)].setBackground(new Color(255,0,0));
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
			    widrand = rand.nextInt(main.wid);
			    lenran = rand.nextInt(main.len);
			    score++;
			    ButtonGrid.frame.setTitle(title());
			    return true;
		}else{
			return false;
		}
	}
	public static String title(){
		double scored = Math.log10(score)*Math.log10(score)*10;
		scored = Math.round(scored*100)/100.0d;
		String scoref = doubleToStringFraction(scored);
		
		
		return   "Score: "+scoref;
	}
	public static int gcd(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

public static String doubleToStringFraction(Double d)
	{
		StringBuffer result = new StringBuffer(" " + ((int) Math.floor(d)));
		int whole = (int) ((d - Math.floor(d)) * 10000);
		int gcd = gcd(whole, 10000);
		result.append(" " + (whole / gcd) + "/" + 10000 / gcd + " ");
		return result.toString();
	}
 
	}

