package kr.co.kosta.contact.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContactView {

	public void run() throws IOException {
		String choice = "";
		do {
			printMainMenu();
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			choice = br.readLine();
			
			if (choice.startsWith("1")) {
				System.out.println("1번 누르셨습니다.");
			}
			else if (choice.startsWith("2")) {
				System.out.println("2번 누르셨습니다.");
			}
			else {
				
			}
			
		} while (!choice.trim().toUpperCase().startsWith("Q"));
		System.out.println("program terminated..");
	}

	private void printMainMenu() {
		System.out.println("=======================");
		System.out.println("1. register contact");
		System.out.println("2. view all contacts");
		System.out.println("Q. quit app");
		System.out.println("=======================");
		System.out.print("choice>");
	}
}
