package mu.yanesh.behavioral.chainOfResposibility;

public abstract class Handler {

    protected String logMessage = "Approved url %s";

    protected Handler nextHandler;

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    public abstract void handleRequest(Request request);
}
