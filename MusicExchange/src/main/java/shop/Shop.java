package shop;

import items.Item;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Item> stockList;


    public Shop(String name){
        this.name = name;
        this.stockList = new ArrayList<>();
    }

    public String getShopName(){
        return this.name;
    }

    public ArrayList getStockList(){
        return this.stockList;
    }

    public void addItemOfStock(Item item){
        stockList.add(item);
    }

    public void removeItemOfStock(Item item){
        stockList.remove(item);
    }


    public double getTotalStockProfit() {
        double totalStockProfit = 0.00;
        for (Item item : this.stockList){
            totalStockProfit += item.calculateMarkup();
        }
        return totalStockProfit;
    }
}
