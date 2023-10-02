public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancy("Java dev");
        jobSite.addVacancy("Web dev");

        Observer Zhasulan = new Subscriber("Zhasulan","Zhailaubai");
        Observer Ers = new Subscriber("Ers","Zharylkasyn");

        jobSite.addObserver(Zhasulan);
        jobSite.addObserver(Ers);

        jobSite.addVacancy("Python dev");
    }
}
