package Menus;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import Turo.Turo;

public class MainMenu {

	private static final String SEARCH = "\t1 - Search For Trip";
	private static final String LOGIN_LISTER = "\t2 - Login As A Lister";
	private static final String LOGIN_RENTER = "\t3 - Login As Renter";
	private static final String REGISTER_LISTER = "\t4 - Register As Lister";
	private static final String REGISTER_RENTER = "\t5 - Register As Renter";
	private static final String EXIT = "\t6- Exit";
	
	public static Turo system = new Turo();

	private static void print_menu()
	{
		System.out.println("Main Menu:");
		System.out.println(SEARCH);
		System.out.println(LOGIN_LISTER);
		System.out.println(LOGIN_RENTER);
		System.out.println(REGISTER_LISTER);
		System.out.println(REGISTER_RENTER);
		System.out.println(EXIT);
	}

	public static void main(String[] args) throws IOException, InterruptedException
	{
		int op = 0;

		while(op != 6)
		{
			print_menu();

			System.out.print("Option:");
			Scanner reader = new Scanner(System.in);
			op = reader.nextInt();

			while (op > 6 || op < 1)
			{
				System.out.println("Invalid Option\n");

				print_menu();
				System.out.print("Option:");
				op = reader.nextInt();
			}

			switch (op)
			{
				case 1:
				{
					//nothing for now
					break;
				}
				case 2:
				{
					//nothing for now
					break;
				}
				case 3:
				{
					//nothing for now
					break;
				}
				case 4:
				{
					ListerRegisterMenu menu = new ListerRegisterMenu();
					menu.menu();
					break;
				}
				case 5:
				{
					RenterRegisterMenu menu = new RenterRegisterMenu();
					menu.menu();
					break;
				}
			}
		}
	}

}
