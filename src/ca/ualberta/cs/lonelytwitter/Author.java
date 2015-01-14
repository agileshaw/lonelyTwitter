package ca.ualberta.cs.lonelytwitter;


public class Author extends User{
	
	public Author() {
		super();
		name = "anonymous author";
	}
	
	public Autho(String string) {
		super(string);
	}
	
	@Override
	public void setName(Sring x) {
		name = x;
	}



}
