package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	TweetListModel tweets;
	
	public TweetListModelTest()
	{
		super(LonelyTwitterActivity.class);
		
	}
	
	protected void setup() throws Exception 
	{
		super.setUp();
		tweets = new TweetListModel();
	}

	public void testCounts()
	{
		NormalTweetModel normalTweet = new NormalTweetModel("Hello");
		tweets.addTweet(normalTweet);
		assertEquals("Count should be one", tweets.getCount(), 1);
		tweets.rmvTweet(normalTweet);
		assertEquals("Count should be zero", tweets.getCount(), 0);
	}
	
	public void testAddTweets()
	{
		NormalTweetModel normalTweet = new NormalTweetModel("Hi");
		tweets.addTweet(normalTweet);
		assertEquals("There should be a tweet in the list", 1 , tweets.getTweets().size());
		assertNotNull("The tweets list in not iniialized", tweets.getTweets());
	}
	
	
}
