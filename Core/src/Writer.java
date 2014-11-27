import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


public class Writer 
{
	public static void Write(ArrayList<Variable> vl, String ClassName) throws FileNotFoundException, UnsupportedEncodingException
	{
		PrintWriter writer = new PrintWriter("results", "UTF-8");	
		writer.write(Start(vl,ClassName));
		writer.close();
	}
	
	
	public static String Start(ArrayList<Variable> vl, String ClassName)
	{
		String foo = "";
		foo += "public class " +ClassName+" {"+"\n"+
				"\n";
		for (int c = 0; c < vl.size(); c++)
		{	
		foo += "\t\tprivate "+ vl.get(c).getType()+" " + vl.get(c).getVarName()+";\n";
		}
		
		
		foo += Constructor(vl,ClassName);
		
		
	return foo;
	}
	
	public static String Constructor(ArrayList<Variable> vl, String ClassName)
	{
		String a = "\n\tpublic " + "ClassName(";
		for (int c = 0; c < vl.size(); c++)
		{
			if (c < vl.size()-1)
			a += vl.get(c).getType() + " " + vl.get(c).getVarName() + ", ";
			else
			a += vl.get(c).getType() + " " + vl.get(c).getVarName();
				
		}
		a += ")\n" +
		"\t" + "{\n";
		for (int c = 0; c < vl.size(); c++)
		{
			a += "\t\tthis." + vl.get(c).getVarName() + " = " + vl.get(c).getVarName() + ";\n";
		}
		a += "\t}\n";
		return a;
	}
}
