import java.awt.Color;
import java.awt.Desktop;
import java.net.URL;
import java.util.Random;



public class Update {
	public static int update = 0;
	public static int lenran = 1;
	public static int widrand = 1;
	public static int glenran = 1;
	public static int gwidrand = 1;
	public static int score = 0;
	public static String scoref = "0";
	public static double scored = 0;
	public static int count = 5;
	public static int green = 2;
	public static void clear(int width, int length){
		update = 0;
	 for(int y=0; y<length; y++){
         for(int x=0; x<width; x++){
     		Color a = ButtonGrid.grid[x][y].getBackground(); 
             	Color g = new Color(128,128,128);
             	if(a.getRed() == 255){
             		ButtonGrid.grid[x][y].setBackground(g);
             		update++;
             	}
             	
                     }}
	 			score = 0;
	 			
	 			ButtonGrid.frame.setTitle(title());
	 			Random rand = new Random();
	 			ButtonGrid.grid[rand.nextInt(main.wid)][rand.nextInt(main.len)].setBackground(new Color(255,0,0));
	 			ButtonGrid.timer = 0;;
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
		}
		if(a.getGreen()==255){
			Random rand = new Random();
			Update.green++;
		    gwidrand = rand.nextInt(main.wid);
		    glenran = rand.nextInt(main.len);
		    while(gwidrand == widrand){
			    gwidrand = rand.nextInt(main.wid);
		    }
		    while(glenran == lenran){
		    	glenran = rand.nextInt(main.len);
		    }
		    score = score/(1+(Update.green/10));
		    ButtonGrid.timer = ButtonGrid.timer+(Update.green*Update.green);
				return true;
		}else{
			return false;
		}
	}
	public static String title(){
		scored = (score*((main.len*main.wid)/10))/(Math.log10(fixDivideByZero(ButtonGrid.timer)));
		scored = Math.round(scored*100)/100.0d;
		scoref = doubleToStringFraction(scored);
		
		
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
		String out = result.toString();
		return out.trim();
		}
 public static String twittershare(){
	 String temp = scoref;
	 temp = temp.replace(" ", "+");
	 String str = "https://twitter.com/intent/tweet?source=webclient&text=I+just+got+"+temp+"+points%21+%23Winning";
	 
	return str;
 }
 public static void openWebpage(String urlString) {
	    try {
	        Desktop.getDesktop().browse(new URL(urlString).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
 public static int fixDivideByZero(int input){
	 if(input <= 0){
		 return 1;
	 }else{
		 return input;
	 }
 }
	}

