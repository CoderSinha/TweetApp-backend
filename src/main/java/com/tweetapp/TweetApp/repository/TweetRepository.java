package com.tweetapp.TweetApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.tweetapp.TweetApp.domain.Tweet;
import com.tweetapp.TweetApp.domain.User;

@Repository
public interface TweetRepository extends MongoRepository<Tweet, String> {

	List<Tweet> findAllByUser(User user);

	@Query(value="select t.tag from Tweet t Group By tag order by count(*) desc")
	List<String> findByTag();
}
