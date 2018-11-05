package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    /**
     * ��������ע��Ĺ۲��߶���
     */
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * ע��۲��߶���
     *
     * @param observer �۲��߶���
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Attached an observer");
    }

    /**
     * ɾ���۲��߶���
     *
     * @param observer �۲��߶���
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * ֪ͨ����ע��Ĺ۲��߶���
     */
    public void nodifyObservers(String newState) {
        for (Observer observer : observers) {
            observer.update(newState);
        }
    }
}
