import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<Variable> val = new ArrayList<Variable>();
		val = Code.Parse("arguments");
	}
}
