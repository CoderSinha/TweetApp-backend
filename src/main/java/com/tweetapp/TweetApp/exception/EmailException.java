package com.tweetapp.TweetApp.exception;

import lombok.Getter;

@Getter
public class EmailException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String emailError;

	public EmailException(String errorMessage) {
		this.emailError = errorMessage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setEmailError(String emailError) {
		this.emailError = emailError;
	}

}
