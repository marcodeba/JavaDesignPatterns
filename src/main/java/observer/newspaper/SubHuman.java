package observer.newspaper;

public class SubHuman implements ISubScribe {

    //订阅者的名字
    private String subScribeName;

    public SubHuman(String subScribeName) {
        this.subScribeName = subScribeName;
    }

    @Override
    public void getNewsPaper() {
        System.out.println(subScribeName + "!! 有新的报纸了，请查收！");
    }
}
