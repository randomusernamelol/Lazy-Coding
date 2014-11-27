import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<Variable> val = new ArrayList<Variable>();
		val = Code.Parse("arguments");
		
		for (int c = 0; c < 3; c++)
		System.out.println(val.get(c).toString());
	}
}
