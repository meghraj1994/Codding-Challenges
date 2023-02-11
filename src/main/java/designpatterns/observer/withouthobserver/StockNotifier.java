package designpatterns.observer.withouthobserver;

public class StockNotifier {

    public void handleStockChange(Stock stock){
        System.out.println("StockNotifier handle stock : " +stock);
    }
}
