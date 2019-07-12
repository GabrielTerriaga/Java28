package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\java.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally { //boa pratica para fechar o Scanner, assim ele vai fechar independente de ter dado certo o try
			//Coloca a condicional para verificar se o scanner está nulo, para não gerar um erro de POINTER EXCEPTION
			
			if (sc != null) {
			sc.close();
			}
		}
	}

}
