public class CommandlineSum {
	public static void main(String[] args) {
		System.out.println(args[0]+""+args[1]);
		int x = Integer.parseInt(args[0]); //first arguments.
		int y = Integer.parseInt(args[1]); //second arguments.
		int sum = x + y;
		System.out.println("The sum of x and y is: " +sum);
	}
	
}