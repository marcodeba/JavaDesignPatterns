package observer.newspaper;

public class SubHuman implements ISubScribe {

    //�����ߵ�����
    private String p_name = "";

    public SubHuman(String f_name) {
        p_name = f_name;
    }

    @Override
    public void getNewsPaper() {
        System.out.println(p_name + "!! ���µı�ֽ�ˣ�����գ�");
        ;
    }
}
