public class CommandLineUpperCase{
	public static void main(String[] args) {
		String str=args[0];
		char ch = str.charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Valid");
		}
		else{
			System.out.println("Not valid");
		}
	}
}