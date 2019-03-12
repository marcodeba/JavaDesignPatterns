package observer.newspaper;

// ��ֽ�ӿڣ����۲���,Observable��
public interface INewsPaper {
    // ��Ӷ�����
    public void registerSubscriber(ISubScribe subScribe);

    // ȡ������
    public void removeSubscriber(ISubScribe subScribe);

    // ���ͱ�ֽ
    public void sendPaper();
}
