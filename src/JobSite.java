import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed{
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();


    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObserver();
    }
    @Override
    public void addObserver(Observer observer){
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for (Observer observer:subscribers){
            observer.HandleEvent(this.vacancies);
        }
    }
}
