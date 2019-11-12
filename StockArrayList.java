package lab8;

import static lab8.StockArrayList.stocklist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author chenhao.lu18
 */
public class StockArrayList {

	private String Ticker;
	private String Date;
	private double Open;
	private double High;
	private double Low;
	private double Close;
	private int Volume;



	static ArrayList<StockArrayList> stocklist = new ArrayList<StockArrayList>();

	// Create constructors with parameters
	public StockArrayList(String Ticker, String Date, double Open, double High, double Low, double Close, int Volume) {
		super();
		this.Ticker = Ticker;
		this.Date = Date;
		this.Open = Open;
		this.High = High;
		this.Low = Low;
		this.Close = Close;
		this.Volume = Volume;

		//stocklist.add(this)
	}

	// Doing getters and setters to set up encapsulation works!!!
	// In NetBeans, use"insert codes" for getters and setters
	public String getTicker() {
		return Ticker;
	}

	public String getDate() {
		return Date;
	}

	public double getOpen() {
		return Open;
	}

	public double getHigh() {
		return High;
	}

	public double getLow() {
		return Low;
	}

	public double getClose() {
		return Close;
	}

	public int getVolume() {
		return Volume;
	}



	@Override
	public String toString() {
		return "Stock:ticker=" + Ticker + ", date=" + Date + ", opening price=" + Open + ", closing price=" + Close
				+ ", high=" + High + ", low=" + Low + ", volume=" + Volume;
	}

	public static void DisplayStocks() {

		System.out.println("*******************************");

		for (int i = 0; i < stocklist.size(); i++) {
			System.out.println(stocklist.get(i).toString());

		}
	}

	public static void searchDate(ArrayList<StockArrayList> stocklist, String Date) {
		boolean flag = false;

		System.out.println("Searching for " + Date);

		for (int p = 0; p < stocklist.size(); p++) {

			if (stocklist.get(p).getDate().equals(Date)) {
				flag = true;
				break;
			} // break instruction must in the bracket !!!!!!!!!!

		}
		if (flag) {
			System.out.println("Date Found at: " + Date);

		} else {
			System.out.println("Date not found for " + Date);
		}

	}

	public boolean equals(StockArrayList comp) {
		if (!this.Ticker.equals(comp.getTicker())) {
			return false;
		}
		if (!this.Date.equals(comp.getDate())) {
			return false;
		}
		if (this.Open != (comp.getOpen())) {
			return false;
		}
		if (this.High != comp.getHigh()) {
			return false;
		}
		if (this.Low != (comp.getLow())) {
			return false;
		}
		if (this.Close != (comp.getClose())) {
			return false;
		}
		if (this.Volume != comp.getVolume()) {
			return false;
		}
		return true;
	}

	public static void searchMatch(ArrayList<StockArrayList> stocklist, StockArrayList comp) {

		boolean flag =false;//need a flag

	    Iterator<StockArrayList> it = stocklist.iterator();//Iterator
		while (it.hasNext()) {
			StockArrayList st = it.next();
			if ((st.equals(comp))) {
				it.remove();
				flag = true;
				
			}

		}

		if (flag) {
			System.out.println("Match found, remove from the list");

		} else {

			System.out.println("Not found");

		}
		 System.out.println("The array list size is "+stocklist.size());
	}
	}
