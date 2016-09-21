import javax.swing.JOptionPane;

public class Cipher {
	
	/*
	 * The first known secret code
	 * it is an alphabet shift
	 * start with plain text, and a "key"
	 * let's say key = 2, and 
	 * plain text is abc
	 * then a + 2 --> c
	 * b + 2 -- d
	 * c + 2 -- e
	 * so secret code for abc is cde
	 * deciphering the code is just reversing the key
	 *
	 *Graded req
	 *Part one - The first grade
	 *Use JOP to ask for the plainText, then
	 *1. Fix the space problem (hint: use an if to test for space, if yes add a spacxe to codedText)
	 *2. Fix the z wrap (hint: if index + key > 26, then subtract 26
	 *example: z +2 is 25 + 2 = 27; 27 > 25 so crash; instead if > 25 subtract 25
	 *so from above 27 - 25 = 2 = b perfect
	 *Syso is fine
	 *
	 *Part two
	 *add decoding knowing the key -- reverse the process
	 *
	 *Part three
	 *crack a code where youi do not know the key
	 *JOP'd and jar'd -- at the very end
	 */

	public static void main(String[] args) {
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int key = 2;
		String plainText = "abc";
		String codedText = "";
		int indexPlaintext = 0;
		int indexShifted = 0;
		
		//one baby step at a time -- couple lines of code + test
		plainText = JOptionPane.showInputDialog("What is your word?");
		plainText = plainText.toLowerCase();
		//System.out.println("lowercase: " + plainText);
		
		//plainText.charAt(0) tells me the char at posn 0 (I)
		//find the alphabetical index for that char at posn 0
		//so for the i its a... b... c... d... e... f... g... h... i should be 8
		for (int i = 0; i < plainText.length(); i++){
		indexPlaintext = alpha.indexOf(plainText.charAt(i));
		//System.out.println("Alpha index for the first char of plainText is: " + indexPlaintext);
		
		//now shift using the key
		indexShifted = indexPlaintext + key;
		
		//System.out.println("key: " + key);
		//System.out.println("Index of plaintext: " + indexPlaintext);
		//System.out.println("Index of shiftedtext : " + indexShifted);
		//System.out.println("Shifted char is: " + alpha.charAt(indexShifted));
		codedText = codedText + alpha.charAt(indexShifted);
		
		}//end of loop
		//JOptionPane.showMessageDialog(null, codedText);
		System.out.println("Original: "+ plainText);
		System.out.println("Key : " + key);
		System.out.println("Secret coded message: " + codedText);
		
	}//end of main

}//end of class
