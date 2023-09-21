package no.hvl.dat250.javalinrest;

import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        Javalin javalinServer = Javalin.create();
        javalinServer.get("/", ctx -> ctx.result("it works"));
        javalinServer.start(7072);
    }
}
