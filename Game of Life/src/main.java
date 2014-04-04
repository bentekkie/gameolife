import javax.swing.JOptionPane;




public class main {

	public static boolean state[][] = new boolean[20][20];
	public static String name[][] = new String[][]{{"aa", "ba", "ca", "da", "ea", "fa", "ga", "ha", "ia", "ja", "ka", "la", "ma", "na", "oa", "pa", "qa", "ra", }, {"ab", "bb", "cb", "db", "eb", "fb", "gb", "hb", "ib", "jb", "kb", "lb", "mb", "nb", "ob", "pb", "qb", "rb", }, {"ac", "bc", "cc", "dc", "ec", "fc", "gc", "hc", "ic", "jc", "kc", "lc", "mc", "nc", "oc", "pc", "qc", "rc", }, {"ad", "bd", "cd", "dd", "ed", "fd", "gd", "hd", "id", "jd", "kd", "ld", "md", "nd", "od", "pd", "qd", "rd", }, {"ae", "be", "ce", "de", "ee", "fe", "ge", "he", "ie", "je", "ke", "le", "me", "ne", "oe", "pe", "qe", "re", }, {"af", "bf", "cf", "df", "ef", "ff", "gf", "hf", "if", "jf", "kf", "lf", "mf", "nf", "of", "pf", "qf", "rf", }, {"ag", "bg", "cg", "dg", "eg", "fg", "gg", "hg", "ig", "jg", "kg", "lg", "mg", "ng", "og", "pg", "qg", "rg", }, {"ah", "bh", "ch", "dh", "eh", "fh", "gh", "hh", "ih", "jh", "kh", "lh", "mh", "nh", "oh", "ph", "qh", "rh", }, {"ai", "bi", "ci", "di", "ei", "fi", "gi", "hi", "ii", "ji", "ki", "li", "mi", "ni", "oi", "pi", "qi", "ri", }, {"aj", "bj", "cj", "dj", "ej", "fj", "gj", "hj", "ij", "jj", "kj", "lj", "mj", "nj", "oj", "pj", "qj", "rj", }, {"ak", "bk", "ck", "dk", "ek", "fk", "gk", "hk", "ik", "jk", "kk", "lk", "mk", "nk", "ok", "pk", "qk", "rk", }, {"al", "bl", "cl", "dl", "el", "fl", "gl", "hl", "il", "jl", "kl", "ll", "ml", "nl", "ol", "pl", "ql", "rl", }, {"am", "bm", "cm", "dm", "em", "fm", "gm", "hm", "im", "jm", "km", "lm", "mm", "nm", "om", "pm", "qm", "rm", }, {"an", "bn", "cn", "dn", "en", "fn", "gn", "hn", "in", "jn", "kn", "ln", "mn", "nn", "on", "pn", "qn", "rn", }, {"ao", "bo", "co", "do", "eo", "fo", "go", "ho", "io", "jo", "ko", "lo", "mo", "no", "oo", "po", "qo", "ro", }, {"ap", "bp", "cp", "dp", "ep", "fp", "gp", "hp", "ip", "jp", "kp", "lp", "mp", "np", "op", "pp", "qp", "rp", }, {"aq", "bq", "cq", "dq", "eq", "fq", "gq", "hq", "iq", "jq", "kq", "lq", "mq", "nq", "oq", "pq", "qq", "rq", }, {"ar", "br", "cr", "dr", "er", "fr", "gr", "hr", "ir", "jr", "kr", "lr", "mr", "nr", "or", "pr", "qr", "rr", } };
	public static int Score = 0;
	public static int wid = 19;
	public static int len = 19;
	public static void main(String[] args) {
		String wids = "19";
		String lens = "19";
		
		wids = JOptionPane.showInputDialog(null, " Enter width: ");
		lens = JOptionPane.showInputDialog(null, " Enter length: ");
		wid = Integer.parseInt(wids);
		len = Integer.parseInt(lens);
		ButtonGrid.main(args);
		
		// TODO Auto-generated method stub tjlh;sdgflsaj;

	}


    }