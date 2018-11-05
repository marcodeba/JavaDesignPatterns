package decorator;

public class Client {
    public static void main(String[] args) throws Exception {
        BoardHandler mb = new ColorFilter(new FrameFilter(new PictureBoard()));
        String content = mb.hangUp("picture");
        System.out.println(content);

        //new BufferedInputStream(new DataInputStream(new FileInputStream("")));
    }
}
