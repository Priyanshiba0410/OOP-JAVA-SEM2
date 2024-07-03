abstract class Vegetable
{
	 String color;
	 String Veginame;
	 abstract public String toString();
}
class potato extends Vegetable
{
	potato(String c){
		super.color=c;
		super.Veginame="potato";		
		}
		public String toString(){
			return "color=" + super.color + "Veginame=" + super.Veginame;}

}
class brinjal extends Vegetable
{
	brinjal(String c){
		super.color=c;
		super.Veginame="brinjal";
	}

		public String toString(){
			return "color=" + super.color + "Veginame=" + super.Veginame;}

}
class tomato extends Vegetable
{
	tomato(String c){
		super.color=c;
		super.Veginame="tomato";
		}
			public String toString(){
			return "color=" + super.color + "Veginame=" + super.Veginame;}

}
public class VegetableDemo{
	public static void main(String[] args) 
	{
		potato p = new potato("Brown");
		System.out.println(p);
		brinjal b = new brinjal("purple");
		System.out.println(b);
		tomato t = new tomato("red");
		System.out.println(t);

	}
}