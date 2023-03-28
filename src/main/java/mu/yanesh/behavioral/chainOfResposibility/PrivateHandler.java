package mu.yanesh.behavioral.chainOfResposibility;

public class PrivateHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getUrl().contains("private")) {
            System.out.println(String.format(logMessage, request.getUrl()));
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
