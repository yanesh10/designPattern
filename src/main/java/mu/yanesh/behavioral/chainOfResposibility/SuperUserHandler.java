package mu.yanesh.behavioral.chainOfResposibility;

public class SuperUserHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println(String.format(logMessage, request.getUrl()));
        handleRequest(request);
    }
}
