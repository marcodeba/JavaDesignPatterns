package observer.gperadvice;

public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");

        gper.addObserver(new Teacher("Tom"));
        gper.addObserver(new Teacher("Mic"));
        gper.publishQuestion(question);
    }
}
