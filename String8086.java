
public class String8086 
{
	private String stringToChar;
	private char[] charArray;
	
	public String8086(String s)
	{
		this.stringToChar = s;
		this.charArray = new char[64];
	}
	
	//fill charArray with string vals
	public void stringToCharArray()
	{
		int i = 0;
		while(stringToChar.charAt(i) != '$')
		{
			charArray[i] = stringToChar.charAt(i);
			i++;
		}
		charArray[i] = stringToChar.charAt(i);
	}
	
	//print charArray one bucket at a time
	public void printCharArray()
	{
		int i = 0;
		while(charArray[i] != '$')
		{
			System.out.println(charArray[i]);
			i++;
		}
	}
}
