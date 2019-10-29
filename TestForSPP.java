package testLab6;

import lab6.StockPricePlus;

public class TestForSPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StockPricePlus st1=new StockPricePlus("AAPL","2006-12-1",92.2,90.5,92.2,91.7,12213511);
  
      //st1.setQueries(1);//The first value is 1
      //st1.setSum(1);
      
      StockPricePlus st2=new StockPricePlus("AAPL","2006-12-4",91.88,92.5,90.23,91.23,13493892);
     
      //st2.setQueries(1);
      //st2.setSum(1);
      
      StockPricePlus st3=new StockPricePlus("AAPL","2006-12-5",91.22,92.13,90.90,91.11,12314555);
      //st3.setQueries(1);
      //st3.setSum(1);
   
     //Test for Query tracking
     // System.out.println(st1.toString());
     // System.out.println(st2.toString());
     // System.out.println(st1.toString());
     
      
    
      System.out.println(" ");
     
     // st1.getSumNumber();
      
      
      System.out.println(" "+"Test for checkpoint");
      st1.printAllStocksCreated();
   
	}

}
