package com.practice;

public class Functions {
	static void getMovieDetails(String moviename, String moviedesc, int movieduration, String movielang, String moviereleasedate, String moviecountry, String moviegenre) {
		System.out.println("Movie name: " +moviename);
		System.out.println("Movie Desc: " +moviedesc);
		System.out.println("Movie Duration: " +movieduration);
		System.out.println("Movie Language: " +movielang);
		System.out.println("Movie Release Date: " +moviereleasedate);
		System.out.println("Movie Country: " +moviecountry);
		System.out.println("Movie Genre: " +moviegenre);
	}
	public static void main (String[]args) {
		getMovieDetails(
				"Singam",
				"Cop and Thug",
				2,
				"Tamil",
				"Dec 1",
				"India",
				"Action"
			);
				
		}
	}
