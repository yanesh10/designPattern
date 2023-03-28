package mu.yanesh.behavioral.chainOfResposibility;

import java.util.Objects;

public class AdminHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getUrl().contains("private") && Objects.nonNull(request.getUser()) && Role.ADMIN.equals(request.getUser())) {
            System.out.println(String.format(logMessage, request.getUrl()));
        } else {
            handleRequest(request);
        }
    }
}
