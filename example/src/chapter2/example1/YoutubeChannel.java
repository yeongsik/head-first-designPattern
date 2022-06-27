package chapter2.example1;

import chapter2.Observer;
import chapter2.Subject;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    private List<Observer> subscribers;

    private Integer subscribersCnt;


    public YoutubeChannel () {
        subscribers = new ArrayList<>();
    }

    public Integer showSubscriberCnt(){
        return subscribers.size();
    }
    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }
}
