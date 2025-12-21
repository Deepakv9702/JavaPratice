package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		try {

			System.out.println(n);
			n = 0;
			sc.close();

		} catch (Exception e) {
			System.out.println("no limit ");
		}

		finally {
			System.out.println("reached finally ");
			sc.close();
		}

		File file = new File("D:\\file/hi.txt");
		try (FileInputStream fileInputStream = new FileInputStream(file)) {
		} catch (IOException e) {
			System.out.println("No file ");
		}

		File file2 = new File("D:\\file/hid.txt");
		try (FileInputStream fileInputStream = new FileInputStream(file2)) {
		} catch (IOException e) {
			System.out.println("No file ");
		}

	}

}
