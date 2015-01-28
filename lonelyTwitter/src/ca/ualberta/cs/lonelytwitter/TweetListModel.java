package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel{
private int count;
private ArrayList<LonelyTweetModel> tweetList;
	
	public TweetListModel()
	{
		//TODO Auto-generated constructor stub
		count = 0;
		tweetList = new ArrayList<LonelyTweetModel>();
		
	}
	
	public int getCount() 
	{
		return count;
	}
	
	public ArrayList<LonelyTweetModel> getTweets()
	{
		return tweetList;
	}
	
	public void addTweet(LonelyTweetModel tweet) {
		count++;
		tweetList.add(tweet);
	}
	
	public void rmvTweet(LonelyTweetModel tweet) {
		count--;
		tweetList.remove(tweet);
	}
	
}
