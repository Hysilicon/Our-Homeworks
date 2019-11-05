/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.ArrayList;

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
    private int Volume;//Just test for static variable...

    public StockArrayList() {

    }
    static ArrayList stocklist = new ArrayList();

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

        stocklist.add(this);
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

    public boolean equals(StockArrayList stocklist) {
        if (stocklist == null) {
            return false;
        }else{
            if(stocklist.getDate().equals(this.getDate())){
            return true;
        }else{
                return false;
            }
        }
    }

   
}
