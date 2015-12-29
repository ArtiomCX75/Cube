package myProject1;

public class CodeWar {
	public static int sortDesc(final int num) {
		String s = Integer.valueOf(num).toString();
		String s2 = "";
		for(int i=0;i<s.length();i++)
		{
			s2=s2+s.substring(s.length()-1-i, s.length()-i);
		}
		return Integer.valueOf(s2);
	}

}