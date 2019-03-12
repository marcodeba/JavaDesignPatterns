package observer.newspaper;

public class Client {

    public static void main(String[] args) {
        INewsPaper newsPaper = new PeopleNewsPaper();
        ISubScribe xiaoMing = new SubHuman("С��");
        ISubScribe zhaoYun = new SubHuman("����");
        ISubScribe liuBei = new SubHuman("����");

        //С������
        newsPaper.registerSubscriber(xiaoMing);
        //���ƶ���
        newsPaper.registerSubscriber(zhaoYun);
        //��������
        newsPaper.registerSubscriber(liuBei);

        //���±�ֽ��
        newsPaper.sendPaper();
        System.out.println("---------------���걨ֽ��------------------");

        //С�����붩�ˣ�ȡ����ֽ
        newsPaper.removeSubscriber(xiaoMing);
        //�����±�ֽ�ˣ���û��С���ı�ֽ��
        newsPaper.sendPaper();
    }
}