package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User extends Object implements UserLike
{
	protected String name;

	
	public String getName()
	{
	
		return name;
	}

	
	//public abstract void setName(String x) throw IOException;
	
	/*{
	    // use this to indicate setName name, not private string name
		this.name = x;
	}*/

	
    // any name that exactly like class name is the constructor
	public User(String name)
	{

		super(); // the object of this class
		this.name = name;
	}
	
	public User() {
		super();
		this.name = "anonymous";
	}
	
	
}
