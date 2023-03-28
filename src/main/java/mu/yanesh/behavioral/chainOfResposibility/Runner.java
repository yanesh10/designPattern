package mu.yanesh.behavioral.chainOfResposibility;

public class Runner {

    public static void main(String[] args) {
        Request privateRequest = Request.builder()
                .url(".../private/")
                .build();

        Request userRequest = Request.builder()
                .url("../private/user")
                .user(new User(Role.USER))
                .build();

        Request adminRequest = Request.builder()
                .url("../private/admin")
                .user(new User(Role.ADMIN))
                .build();

        Request publicRequest = Request.builder()
                .url("../public/")
                .build();

        Handler handler = new PublicHandler();
        Handler privateHandler = new PrivateHandler();
        Handler userHandler = new UserHandler();
        Handler adminHandler = new AdminHandler();
        Handler superUserHandler = new SuperUserHandler();

        handler.setNextHandler(privateHandler);
        privateHandler.setNextHandler(userHandler);
        userHandler.setNextHandler(adminHandler);
        adminHandler.setNextHandler(superUserHandler);

        handler.handleRequest(privateRequest);
        handler.handleRequest(userRequest);
        handler.handleRequest(adminRequest);
        handler.handleRequest(publicRequest);
    }
}
