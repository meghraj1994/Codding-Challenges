package designpatterns.chainofresponsiblitypattern;

public abstract class Handler {

    private Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler(){
        return nextHandler;
    }

    public abstract void handlePackage(Package thePackage);
}
