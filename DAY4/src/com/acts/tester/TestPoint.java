package com.acts.tester;

import com.acts.code.Point2D;
import java.util.*;

class TestPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of point array: ");
		Point2D p[] = new Point2D[sc.nextInt()];
		boolean flag = false;

		while (!flag) {
			System.out.println(
					"1. Plot a point\n2. Display all points\n3. Check equality and calculate distance\n0. Exit");
			System.out.println("Enter choice: ");
			switch (sc.nextInt()) {
			case 0:
				flag = true;
				break;
			case 1:
				System.out.println("Enter array index to insert: ");
				int i = sc.nextInt();
				if (i <= 0 || i > p.length) {
					System.out.println("Index can not be accessible...");
					break;
				}
				System.out.println("Enter coordinates: ");
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				if (p[i] == null) {
					p[i] = new Point2D(x, y);
					System.err.println("plotted point succcessfully.");
				} else {
					System.out.println("Already plotted...");
				}
				break;
			case 2:
				for (Point2D point : p) {
					if (point != null)
						System.out.println(point.show());
				}
				break;
			case 3:
				System.out.println("Enter two indices to compare: ");
				i = sc.nextInt();
				int j = sc.nextInt();
				if (p[i] == null || p[j] == null) {
					System.out.println("Invalid Index!!!");
				} else {
					if (p[i].isEqual(p[j])) {
						System.out.println("Same points");
					} else {
						System.out.println("Different points");
						System.out.println("Distance = " + p[i].calculateDistance(p[j]));
					}
				}
				break;
			default:
				System.out.println("Invalid choice!!!!");
			}
		}
		sc.close();
	}
}