import java.util.List;

public class Subscriber implements Observer{
    String name;
    String LastName;
    public Subscriber(String name ,String LastName){
        this.name = name;
        this.LastName = LastName;
    }
    @Override
    public void HandleEvent(List<String> vacancy){
        System.out.println("Dear " + name + "\nVacancies is changed "+vacancy+"\n=====================================\n");
    }
}
