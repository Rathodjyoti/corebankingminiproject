package Bankservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bank {
	public static void main(String args[]) //main class of bank
		throws IOException
	{

		BufferedReader sc = new BufferedReader(
		new InputStreamReader(System.in));
		String name;
		int pass_code;
		int a;

		while (true) {
			System.out.println("\n ** WELCOME TO THE BANK SERVICES ** \n");
			System.out.println("1.Create Account");
			System.out.println("2.Login Account");

			try {
				System.out.print("\n Enter Input:"); //user input
				a = Integer.parseInt(sc.readLine());

				switch (a) {
				case 1:
					try {
						System.out.print("Enter UserName:");
						name = sc.readLine();
						System.out.print("Enter Unique Password:");
						pass_code = Integer.parseInt(
							sc.readLine());

						if (bankManagement.createAccount(name, pass_code))
						{
							System.out.println("MESSAGE : Account Created Successfully!\n");
						}
						else {
							System.out.println("ERROR : Account Creation Failed!\n");
						}
					}
					catch (Exception e) {
						System.out.println("ERROR : Enter Valid Data::Insertion Failed!\n");
					}
					break;

				case 2:
					try {
						System.out.print("Enter UserName:");
						name = sc.readLine();
						System.out.print("Enter Password:");
						pass_code = Integer.parseInt(sc.readLine());

						if (bankManagement.loginAccount(name, pass_code)) {
							System.out.println("MESSAGE : Logout Successfully!\n");
						}
						else {
							System.out.println("ERROR : login Failed!\n");
						}
					}
					catch (Exception e) {
						System.out.println(" ERROR : Enter Valid Data::Login Failed!\n");
					}

					break;

				default:
					System.out.println("Invalid Entry!\n");
				}

				if (a == 5) {
					System.out.println("Exited Successfully!\n\n THANK YOU FOR BANKING WITH US)");
					break;
				}
			}
			catch (Exception e) {
				System.out.println("Enter Valid Entry!");
			}
		}
		sc.close();
	}
}

