package ModesOfAES;
/*
 * This is the father class of all other classes
 * class basically call the sub class named Driver
 * Drive implement the core functionality 
 * 
 */
public class Main 
{


	public static void main(String arg[])
	{
		AES E=new OFB();
		E.Encryption("Nasir and Ahsan & AFaq","Thats my Kung Fu");
		System.out.println (E.GetCipherText()) ;
		E.Decryption();
		System.out.println (E.GetPlainText()) ;

	}

}
