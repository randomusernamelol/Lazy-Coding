
public class Variable 
{
	private String type;
	private String var_name;
	
	public Variable(String type, String var_name)
	{
		this.type = type;
		this.var_name = var_name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getVarName()
	{
		return var_name;
	}
}
