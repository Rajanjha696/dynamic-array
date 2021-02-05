package com.solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of dynamic arrays need to be made");
		int n = sc.nextInt();
		System.out.println("enter the no queries to be made");
		int q = sc.nextInt();
		int lastans = 0;
		ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ls.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < q; i++) {
			System.out.println("enter the query type");
			int queryType = sc.nextInt();
			System.out.println("enter the value of x and y");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (queryType == 1) {
				int index = (x ^ lastans) % ls.size();
				ls.get(index).add(y);
			} else {
				int index = (x ^ lastans) % ls.size();
				int ind = y % ls.get(index).size();
				lastans = ls.get(index).get(ind);
				System.out.println(lastans);
			}
		}
	}
}
