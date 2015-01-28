package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import android.test.ActivityInstrumentationTestCase2;


public class LonelyTweetTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public LonelyTweetTest()
	{

		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception
	{

		super.setUp();
	}
	
	public void testSampleCode()
	{
		
		//assertFalse("This is not true", isGreaterEqual(5,6));
		assertEquals("5 should be equal to 5", 5, 5);
		//fail("This is a failing test");
	}
	
	private boolean isGreatEqual(int i, int j) 
	{
		//TODO Auto-generated method stub
		
		if (i >= j)
			return true;
		return false;
	}
	

}
