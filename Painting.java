public class Painting
{
	public String title;
	public String artistName;
	public int value;

	//default
	public Painting()
	{
		this.value = 400;
	}

	public Painting(String title, String artistName)
	{
		this.title = title;
		this.artistName = artistName;
		this.value = 400;
	}

	public void display()
	{
		System.out.println("The painting "+title+ " is by "+artistName+ " and costs $" + value);
	}

}