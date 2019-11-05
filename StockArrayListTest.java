/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.ArrayList;
import static lab9.StockArrayList.DisplayStocks;
import static lab9.StockArrayList.stocklist;

/**
 *
 * @author chenhao.lu18
 */
public class StockArrayListTest {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        StockArrayList st1 = new StockArrayList("AAPL","2006-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
        StockArrayList st2 = new StockArrayList("AAPL", "2006-12-4", 91.88, 92.05, 90.5, 91.12, 25340600);
        StockArrayList st3 = new StockArrayList("AAPL", "2006-12-5", 91.655, 92.33, 90.87, 91.27, 23672800);
        StockArrayList st4 = new StockArrayList("AAPL", "2006-12-7", 91.65, 92.93, 90.8, 91.7, 23692800);
        StockArrayList st5 = new StockArrayList("AAPL", "2006-12-9", 91.55, 92.73, 90.7, 91.29, 23632800);
        
       //execute methods in StockArrayList 
       DisplayStocks();
       
       
     
        
        
        
        
    }
    
}
