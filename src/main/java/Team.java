import java.util.ArrayList;

public class Team {
    private ArrayList<String> name;
    private ArrayList<Integer> position;


    public void newMember(String name) {
        this.name.add(name);
    }

    public void leaveTeam(String name){
        this.name.remove(name);
    }

    public ArrayList<String> getMembers() {
        return name;
    }
}
