package Sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter total elments you want in a array");
		int n = scr.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter element ");
			a[i] = scr.nextInt();
		}

		System.out.println("final array ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		scr.close();
		int i, j, key;
		for (i = 0; i < a.length; i++) {
			key = a[i];
			j = i - 1;

			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = key;
		}

		System.out.println("\n\nsorted array");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");

		}
	}
}
