package Class15.is_a_has_a;

public class ScrumTeam {
    //Scrum Team has a tester
    Tester tester;
    //Scrum Team has a developer
    Developer developer;

    public ScrumTeam(Tester tester, Developer developer) {
        this.tester = tester;
        this.developer = developer;
    }
}
