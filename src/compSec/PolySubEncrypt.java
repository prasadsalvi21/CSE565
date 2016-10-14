package compSec;

public class PolySubEncrypt {

	public static void main(String[] args) {
	System.out.println("Plaintext: ");
	String plaintext="I have of late – but wherefore I know not – lost all my mirth, forgone all custom of exercise; and indeed it goes so heavily with my disposition that this goodly frame, the earth, seems to me a sterile promontory. This most excellent canopy the air, look you, this brave o’erhanging, this majestical roof fretted with golden fire – why, it appears no other thing to me than a foul and pestilent congregation of vapours.";
	//String plaintext="Harry has jet-black hair and green eyes. His glasses are held together by tape because Dudley had smashed them so many times. The thing that distinguishes Harry from others the most is the lightning-shaped scar on his forehead. He often wonders how he got it, and the Dursleys have told him that he got it from the car crash that killed Harry's parents. Harry doesn't know much more about the accident though, because the Dursleys' first rule is to not ask questions.";
	plaintext = plaintext.replaceAll("[^A-Za-z]","");
	plaintext=plaintext.toLowerCase();
	System.out.println(plaintext);
	
	char even[]=new char[26];
	char odd[]=new char[26];
	
	int odd_number=0;
	int even_number=0;
	for(int i=0;i<=25;i++)
	{
		odd_number= (3*i)%26;
		even_number=((5*i)+13)%26;
		odd[i]=getLetter(odd_number);	
		even[i]=getLetter(even_number);
	}
	System.out.println("\nOdd Table:");
	for(int i=0;i<=25;i++)
		System.out.print(odd[i]);
	System.out.println("\n\nEven Table:");
	for(int i=0;i<=25;i++)
		System.out.print(even[i]);
	char[] ch  = plaintext.toCharArray();
	int n1=ch.length;
	char op[]=new char[n1];
	for(int i = 0; i < n1; i++)
	{
	int temp = (int)ch[i];
	temp=temp-97;
	if(i%2==0)
	{
	//even
		op[i]=even[temp];
	}
	else
	{
	//odd
		op[i]=odd[temp];
	}
	}
	String ciphertext=new String(op);
	System.out.println("\n\nCiphertext: ");
	System.out.println(ciphertext);
	
	char c1;
	int counter[]=new int[26];
	int count=0;
	System.out.println("\nFrequency Distribution of Ciphertext: ");
	for(int i = 0; i <26; i++)
	{
		c1 = getLetter(i);
		for(int j=0;j<n1;j++)
		{
			if(c1==op[j])
				count++;
		}
		counter[i]=count;
		count=0;
	}
	for(int i = 0; i <26; i++)
	{
		System.out.print(getLetter(i)+":"+counter[i]+", ");
	}
	}
	
	public static char getLetter(int c)
	{
	int charValue = c; //this is the number you enter
	char letter = (char)(charValue+97);  //this is the character you want
	return letter;
	}
	

}
