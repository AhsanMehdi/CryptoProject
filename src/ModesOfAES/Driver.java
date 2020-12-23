package ModesOfAES;
import java.util.*;  
/*purpose of this
 * class is to call all the classes
 *  objects and functions 
 */
public class Driver {
  private int inputChoice = 0 ; /* variable to get work what user want to do?*/
  private String key ;
  private String message ; /*plain text*/
    
	public Driver() {
		
	}
	public void Menu()
	{  
		Scanner sc= new Scanner(System.in); /*to input a string*/                
		Scanner scan = new Scanner(System.in); /* for integer input*/
		/*-----------------------------------------------------------*/
		System.out.print("\t\tWELCOME TO AES ALGORITHM OF CRYPTOGRAPHY\n\n\n");
		/*-------------------------key input-------------------------------------*/
		System.out.print("Press 1 to Enter the Key [16]\n");
		inputChoice = scan.nextInt();
		System.out.print("Enter a key [16 chars]: ");  
		this.key= sc.nextLine();
		/*-------------------------Message input----------------------------------*/
		System.out.print("Press 2 to Enter the Message \n");
		inputChoice = scan.nextInt() ;
		System.out.print("Enter a key [16 chars]: ");  
		this.message= sc.nextLine();
		/*------------------------------------------------------------------------*/
		
		System.out.print("\tWe have Five Modes of AES Here\n");
		System.out.print("\t --CBC--CFB--ECB--OFB--CTR \n");
		SubMenu(); 
	
	}
	/*
	 * function responsible to call the other objects of modes of AES
	 */
	public void SubMenu()
	{   Scanner scan = new Scanner(System.in); /* for integer input*/
		System.out.print("Press 1 for CBC\n");
		System.out.print("Press 2 for CFB\n");
		System.out.print("Press 3 for ECB\n");
		System.out.print("Press 4 for OFB\n");
		System.out.print("Press 5 for CTR\n");
		inputChoice = scan.nextInt() ;
		
		/*validating user choice*/
		if (this.inputChoice == 1 ){  /*CBC*/
			AES Mode=new CBC();
			Mode.Encryption(this.message, this.key) ;
			String OriginalMessage = Mode.Decryption() ;
			
		}
		else if ( this.inputChoice == 2 ) {/*CFB*/
			AES Mode=new CFB();
			Mode.Encryption(this.message , this.key) ;
			String OriginalMessage = Mode.Decryption() ;
		}
		else if ( this.inputChoice == 3 ) {/*ECB*/
			AES Mode=new ECB();	
			Mode.Encryption(this.message , this.key) ;
			String OriginalMessage = Mode.Decryption() ;
		}
		else if ( this.inputChoice == 4 ) {/*OFB*/
			AES Mode=new OFB();
			Mode.Encryption(this.message , this.key) ;
			String OriginalMessage = Mode.Decryption() ;
		}
		else if ( this.inputChoice == 5 ) {/*CTR*/
			
		}
	}

}
