package observer.newspaper;

public class Client {

	public static void main(String[] args) {
		INewsPaper newsPaper = new PeopleNewsPaper();
		ISubScribe xiaoMing = new SubHuman("小明");
		ISubScribe zhaoYun = new SubHuman("赵云");
		ISubScribe liuBei = new SubHuman("刘备");
		
        //小明订报
		newsPaper.registerSubscriber(xiaoMing);
        //赵云订报
		newsPaper.registerSubscriber(zhaoYun);
        //刘备订报
		newsPaper.registerSubscriber(liuBei);
        
        //有新报纸了
		newsPaper.sendPaper();
        System.out.println("---------------发完报纸了------------------");

        //小明不想订了，取消报纸
		newsPaper.removeSubscriber(xiaoMing);
        //又有新报纸了，就没有小明的报纸了
		newsPaper.sendPaper();
	}
}