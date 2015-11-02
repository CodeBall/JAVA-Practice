/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.one;

/**
 *
 * @author xqq
 */

 import java.util.Scanner;

class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
public class PracticeOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			Point p1 = new Point(0, 0);
			int l = sc.nextInt();
			int h = sc.nextInt();
			Point p2 = new Point(l, h);

			int pointsCount = sc.nextInt();
			Point[] points = new Point[pointsCount + 2];

			points[0] = p1; 
			points[pointsCount + 1] = p2;

			for (int j = 1; j <= pointsCount; j++) 
			{
				int x = sc.nextInt();
				int y = sc.nextInt();
				points[j] = new Point(x, y);
			}

			int area1 = areaFromXDirection(points, l, h);

			int area2 = areaFromYDirection(points, l, h);

			System.out.println(Math.max(area1, area2));
		}
	}

	private static int areaFromYDirection(Point[] points, int l, int h) {
		for (int i = 0; i < points.length - 1; i++) {
			int k = i;
			for (int j = i + 1; j < points.length; j++) {
				if (points[j].getY() < points[k].getY()) {
					k = j;
				}
                                else if(points[j].getY() == points[k].getY() && points[j].getX() < points[k].getX())
                                    k = j;
			}
			if (k != i) {
				Point p = points[i];
				points[i] = points[k];
				points[k] = p;
			}
		}
		int maxArea = 0;
		for (int i = 0; i < points.length - 1; i++) {
			int low = 0;
			int high = l;
			int maxY = h - points[i].getY();
			for (int j = i + 1; j < points.length; j++) {
				if (points[j].getX() <= high && points[j].getX() >= low) {
					maxArea = Math.max(maxArea,(points[j].getY() - points[i].getY())* (high - low));
					if (points[j].getX() == points[i].getX()) {
						break;
					}
					if (points[j].getX() > points[i].getX()) {
						high = points[j].getX();
					} else {
						low = points[j].getX();
					}
					if ((high - low) * maxY < maxArea) {
						break;
					}
				}
			}
		}
		return maxArea;

	}

	private static int areaFromXDirection(Point[] points, int l, int h) {
		for (int i = 0; i < points.length - 1; i++) {
			int k = i;
			for (int j = i + 1; j < points.length; j++) {
				if (points[j].getX() < points[k].getX()
						|| (points[j].getX() == points[k].getX())
						&& (points[j].getY() < points[k].getY())) {
					k = j;
				}
			}
			if (k != i) {
				Point p = points[i];
				points[i] = points[k];
				points[k] = p;
			}
		}
		int maxArea = 0;
		for (int i = 0; i < points.length - 1; i++) {
			int low = 0;
			int high = h;
			int maxX = l - points[i].getX();
			for (int j = i + 1; j < points.length; j++) {
				if (points[j].getY() <= high && points[j].getY() >= low) {
					maxArea = Math.max(maxArea,
							(points[j].getX() - points[i].getX())
									* (high - low));
					if (points[j].getY() == points[i].getY()) {
						break;
					}
					if (points[j].getY() > points[i].getY()) {
						high = points[j].getY();
					} else {
						low = points[j].getY();
					}
					if ((high - low) * maxX < maxArea) {
						break;
					}
				}
			}
		}
		return maxArea;
	}
}


