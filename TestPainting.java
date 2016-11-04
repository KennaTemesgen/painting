import java.util.Scanner;
public class TestPainting
{
	public static void main(String[] args)
	{
		Painting[] paintings = new Painting[10];//creating array called paintings
		Scanner sc = new Scanner(System.in);
		String title, artistName;

		for (int i = 0; i < paintings.length; i++)
		{
			Painting painting = new Painting();//creating object
			System.out.print("Enter the Title: ");
			title = sc.nextLine();

			System.out.print("Enter the Artist name: ");
			artistName = sc.nextLine();

			if (artistName.equals("Degas") || artistName.equals("Monet") || artistName.equals("Picasso") || artistName.equals("Rembrandt"))
			{
				painting = new FamousPaintings(title, artistName);
			}

			else
			{
				painting = new Painting(title, artistName);
			}

			paintings[i] = painting;
		}	
		for (int i = 0; i < paintings.length; i++)
		{
			paintings[i].display();
		}
	}
}