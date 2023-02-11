package designpatterns.chainofresponsiblitypattern;

public class PackageHandler {

    private Handler chainOfHandler;

    public PackageHandler(Handler chainOfHandler) {
        this.chainOfHandler = chainOfHandler;
    }

    public void setChainOfHandler(Package thePackage){
        chainOfHandler.handlePackage(thePackage);
    }
}
