package mu.yanesh.behavioral.chainOfResposibility;

import java.util.Objects;

public class UserHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getUrl().contains("private") && Objects.nonNull(request.getUser()) && request.getUser().equals(Role.USER)) {
            System.out.println(String.format(logMessage, request.getUrl()));
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
