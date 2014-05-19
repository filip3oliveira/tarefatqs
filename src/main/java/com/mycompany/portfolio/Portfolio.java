package com.mycompany.portfolio;


import java.util.ArrayList;
import java.util.List;

public class Portfolio {

private String name = "";


private List<Stock> stocks = new ArrayList<Stock>();

/*
* this method gets the market value for each stock, sums it up and returns
* the total value of the portfolio.
*/


public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public List<Stock> getStocks() {
return stocks;
}

public void setStocks(List<Stock> stocks) {
this.stocks = stocks;
}

public void addStock(Stock stock) {
stocks.add(stock);
}



}
