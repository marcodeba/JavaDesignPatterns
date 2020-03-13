package observer.gperadvice;

import java.util.Observable;

/**
 * JDK提供的一种观察者的实现方式，被观察者
 * Observable：可被观察的对象，即主题对象
 */
public class GPer extends Observable {
    private static GPer gper = new GPer();
    private String name = "GPer生态圈";

    private GPer() {
    }

    public static GPer getInstance() {
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
