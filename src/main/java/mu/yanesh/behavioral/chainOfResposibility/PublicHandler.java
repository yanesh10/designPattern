package mu.yanesh.behavioral.chainOfResposibility;

public class PublicHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getUrl().contains("public")) {
            System.out.println(String.format(logMessage, request.getUrl()));
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
