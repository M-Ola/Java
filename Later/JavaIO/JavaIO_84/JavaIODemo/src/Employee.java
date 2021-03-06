import java.io.Serializable;

public class Employee implements Serializable
{
	private static final long serialVersionUID = 3558283530338723147L;
	private int id;
	private String Name;

	public Employee(int id, String name)
	{
		super();
		this.id = id;
		Name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

}