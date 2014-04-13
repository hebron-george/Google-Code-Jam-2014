package com.hebrongeorge.problema;

public class Case {
	/*
	 *	id = Case number
	 *	firstRows = First 4 rows of card placement
	 *	secondRows = Second 4 rows of card placement
	 *	ans = The two row picks by audience member 
	 */
	private int id = 0;
	private int firstRows[][] = new int[4][4];
	private int secondRows[][] = new int[4][4];
	private int[] ans = new int[2];
	
	public int getID()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public int[][] getFirstRows() {
		return firstRows;
	}
	public void setFirstRows(int[][] rows) {
		this.firstRows = rows;
	}
	public int[] getAns() {
		return ans;
	}
	public void setAns(int[] ans) {
		this.ans = ans;
	}
	public int[][] getSecondRows() {
		return secondRows;
	}
	public void setSecondRows(int secondRows[][]) {
		this.secondRows = secondRows;
	}
}
