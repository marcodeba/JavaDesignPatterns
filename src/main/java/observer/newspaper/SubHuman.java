package observer.newspaper;

public class SubHuman implements ISubScribe {

    //订阅者的名字
    private String p_name;

    public SubHuman(String f_name) {
        p_name = f_name;
    }

    @Override
    public void getNewsPaper() {
        System.out.println(p_name + "!! 有新的报纸了，请查收！");;
    }
}
