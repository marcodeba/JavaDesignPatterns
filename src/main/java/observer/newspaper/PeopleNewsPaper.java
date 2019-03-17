package observer.newspaper;

import java.util.ArrayList;
import java.util.List;

public class PeopleNewsPaper implements INewsPaper {

    private List<ISubScribe> subScribeList = new ArrayList<ISubScribe>();

    @Override
    public void registerSubscriber(ISubScribe subScribe) {
        if (!subScribeList.contains(subScribe)) {
            subScribeList.add(subScribe);
        }
    }

    @Override
    public void removeSubscriber(ISubScribe subScribe) {
        if (subScribeList.indexOf(subScribe) >= 0) {
            subScribeList.remove(subScribeList.indexOf(subScribe));
        }
    }

    @Override
    public void sendPaper() {
        for (ISubScribe subScribe : subScribeList) {
            subScribe.getNewsPaper();
        }
    }
}
