import javax.swing.JOptionPane;




public class main {

	public static int Score = 0;
	public static int wid = 19;
	public static int len = 19;
	public static boolean isGameRunning = false;
	public static boolean gameJustStarted = false;
    public static void main(String[] args) {
		String wids = "19";
		String lens = "19";
		
		wids = JOptionPane.showInputDialog(null, " Enter width: ");
		lens = JOptionPane.showInputDialog(null, " Enter length: ");
		if(wids == null){
			wid = 19;
		}else{
		wid = Integer.parseInt(wids);}
		if(lens == null){
			len = 19;}else{
		len = Integer.parseInt(lens);}
		Update.score = 1;
		gameJustStarted = true;
		isGameRunning = true;
		ButtonGrid.main(args);
		
		// TODO Auto-generated method stub tjlh;sdgflsaj;

	}


    }