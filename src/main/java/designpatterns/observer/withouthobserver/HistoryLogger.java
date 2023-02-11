package designpatterns.observer.withouthobserver;

public class HistoryLogger {

    public void log(Stock stock) {
        System.out.println("HistoryLogger log stock : "+stock);
    }

}
