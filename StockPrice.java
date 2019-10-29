package lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenhao.lu18
 */
public class StockPrice {

	/**
	 * @param args the command line arguments
	 */
	// CREATE MY PARAMETERS!!!!!
	private String Ticker;
	private String Date;
	private double Open;
	private double High;
	private double Low;
	private double Close;
	private int Volume;//Just test for static variable...

	public StockPrice() {
		
	}
	// Create constructors with parameters
	public StockPrice(String Ticker, String Date, double Open, double High, double Low, double Close, int Volume) {
		this.Ticker = Ticker;
		this.Date = Date;
		this.Open = Open;
		this.High = High;
		this.Low = Low;
		this.Close = Close;
		this.Volume = Volume;
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
	
	

	
	
	public String toString() {
		return "Stock:ticker=" + Ticker + ", date=" + Date + ", opening price=" + Open + ", closing price=" + Close
				+ ", high=" + High + ", low=" + Low + ", volume=" + Volume;
	}
	
	
	
	// OK now you can construct your methods...
	public double calSpread() {
		
		double spread = High - Low;
		return spread;
		
		//return High - Low;
	}

	
	
	public boolean comps(StockPrice comp) {
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

}
