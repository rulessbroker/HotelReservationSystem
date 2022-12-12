package com.bridgelabz;

import java.util.Scanner;

public class HotelReservationServiceMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program");

		Scanner scanner = new Scanner(System.in);
		HotelReservationService hotelReservationService = new HotelReservationService();

		hotelReservationService.addHotel(new Hotel("Lakewood", 110));
		hotelReservationService.addHotel(new Hotel("Bridgewood", 160));
		hotelReservationService.addHotel(new Hotel("Ridgewood", 220));

	}
}
