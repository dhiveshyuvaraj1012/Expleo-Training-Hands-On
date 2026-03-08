package com.practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class MovieReel {

	public static void main(String[] args) throws ParseException {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter Movie ID: ");
		int movieId = console.nextInt();
		console.nextLine();
		
		System.out.print("Enter movie name: ");
		String moviename = console.nextLine();
		
		System.out.print("Enter movie description: ");
		String moviedesc = console.nextLine();
		
		System.out.print("Enter movie language: ");
		String movielang = console.nextLine();
		
		System.out.print("Enter movie genre: ");
		String moviegenre = console.nextLine();
		
		System.out.print("Enter movie date: (dd/MM/yyyy) ");
		String date = console.next();
		SimpleDateFormat moviereleasedate = new SimpleDateFormat("dd/MM/yyyy");
		Date moviedate = moviereleasedate.parse(date);
		
		
		System.out.print("Enter movie seat cost: ");
		float movieprice = console.nextFloat();
		
		System.out.println("Entered movie details are:");
		System.out.println("Movie ID: " +movieId);
		System.out.println("Movie name: " +moviename);
		System.out.println("Movie desc: " +moviedesc );
		System.out.println("Movie lang: " +movielang);
		System.out.println("Movie genre: " +moviegenre);
		System.out.println("Movie date: " +moviedate);
		System.out.println("Seat cost: " +movieprice);
		console.close();
	}
}

