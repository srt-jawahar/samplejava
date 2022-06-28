package password;

class Generation
{
	public void generation()
	{
//		String text = "pasdj+sdb$jhjd7+sdhjsk";
//		String txt = "+";
//		int sep = text.lastIndexOf(txt);
//		System.out.println();
		
		String str ="hsdngh;j@bwfen;";
		String [] twoStringArray= str.split("@", 2);
		String us = twoStringArray[0];
		System.out.println("String befor comma = "+us);
		
		// receiver
		// 
		
	}
}

public class Typeindex 
{
	public static void main(String[] args) 
	{
		Generation g = new Generation();
		g.generation();
	}
}
