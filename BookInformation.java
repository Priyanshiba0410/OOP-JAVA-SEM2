import java.util.Scanner;
class Book
{
	private String author_name;
	Book(String a_name)
	{
		this.author_name = a_name;
	}

	void display()
	{
		Scanner sc = new Scanner(System.in)
		System.out.println(author_name);
	}
}
class book_publication extends Book
{
	private String title;
	book_publication(String t, String a_name)
	{
		super(a_name);
		this.title = t;
	}
	void display()
	{
		super.display()
		System.out.println(title);
	}
}
class paper_publication extends book
{
	private String title;
	paper_publication(String t1,au_name)
	{
		super(au_name);
		this.
	}
}
public class BookInformation
{
	public static void main(String[] args) {
		Book b;
		Scanner sc = new Scanner(System.in)
		System.out.println("enter book'spublication");
		String p = sc.next();


		if(p.equals(book))
		{
			b = new book_publication(title,author_name);
		}
		else
		{
			b = new paper_publication(title,author_name);3
		}
	}
}