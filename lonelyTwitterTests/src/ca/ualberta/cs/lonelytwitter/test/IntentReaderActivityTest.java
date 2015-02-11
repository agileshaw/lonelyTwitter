package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity>
{

	public IntentReaderActivityTest()
	{

		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception
	{

		super.setUp();
	}

	public void testSendText()
	{
		String text = "Hello world!";
		int code = IntentReaderActivity.NORMAL;
		IntentReaderActivity activity = startwithText(text, code);
		assertEquals("Is the text correct?", text, activity.getText());
		
	}
	
	public void testDoubleText() 
	{
		String text = "Hello";
		IntentReaderActivity activity = startwithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("Double trasform working?", text+text, activity.getText());
		
	}
	
	public void testDisplayText()
	{
		String text = "Hello world";
		IntentReaderActivity activity = startwithText(text, IntentReaderActivity.NORMAL);
		assertEquals("corrext text?", text, activity.getText());
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("dispaly corect text?", text, view.getText().toString());
	}
	
	private IntentReaderActivity startwithText(String text, int code)
	{
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, code);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
	
	public void testReverseText()
	{
		String text = "Welcome!";
		IntentReaderActivity activity = startwithText(text, IntentReaderActivity.REVERSE);
		String reverse = new StringBuffer(text).reverse().toString();
		assertEquals("Is the text reversed?", activity.getText(), reverse);
	}
}
