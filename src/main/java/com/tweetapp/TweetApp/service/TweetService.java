package com.tweetapp.TweetApp.service;

import java.util.List;

import com.tweetapp.TweetApp.domain.Tweet;
import com.tweetapp.TweetApp.dto.tweet.TweetRequest;

public interface TweetService {
	public String postTweet(String username, Tweet tweet);

	public List<Tweet> getAllTweets();

	public String updateTweet(String id, TweetRequest tweetRequest);

	public String deleteTweet(String id);

	public String addReply(String username, String id, TweetRequest tweetReplyRequest);

	public String addLike(String username, String id);

	public List<Tweet> getAllTweetsByUser(String username);

	/*public List<String> getTrends();*/
}
