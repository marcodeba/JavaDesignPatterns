package builder;

/**
 * Created by marcopan on 17/10/23.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.getABenzModel().run();
        director.getBBenzModel().run();
        director.getCBMWModel().run();
    }
}
