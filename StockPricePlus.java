package lab6;

import java.util.ArrayList;//import array list package

public class StockPricePlus extends StockPrice {

	private int Queries = 1;// Do not set this value in static way (Assassin)
	private static int Sum = 1;

    static ArrayList<StockPricePlus> stocksCreated =new ArrayList<>();//
	// constructors without parameters
	public StockPricePlus() {

	}

	public StockPricePlus(String Ticker, String Date, double Open, double High, double Low, double Close, int Volume) {
		super(Ticker, Date, Open, High, Low, Close, Volume);
        
		stocksCreated.add(this);//The useful utility of "this"
		//Dedicated by Mr.Shaw's work!
	}

	public int getSum() {
		return Sum++;
	}

	public void setSum(int sum) {
		StockPricePlus.Sum = sum;
	}

	public int getQueries() {
		return Queries++;// Every query cause an increment process.
	}

	public void setQueries(int queries) {
		this.Queries = queries;
	}

	public void test() {
		System.out.println(this.getTicker() + " with " + this.getQueries() + "are father and son instance.");
	}

	public String toString() {

		return "Stock:ticker=" + this.getTicker() + ", date=" + this.getDate() + ", opening price=" + this.getOpen()
				+ ", closing price=" + this.getClose() + ", high=" + this.getHigh() + ", low=" + this.getLow()
				+ ", volume=" + this.getVolume() + ", queries=" + this.getQueries() + ", sum=" + this.getSum();
	}
	
	// Override method toString

	public void getSumNumber() {
		System.out.println("Total Query amount is " + (this.getSum() - 1));
	}

	public void printAllStocksCreated() {
		for(int i=0;i<stocksCreated.size();i++) {
			StockPricePlus spp = stocksCreated.get(i);
			System.out.println(spp.toString());
		}
	}
}
