package theory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;

public class TeamRecords {
    public static void main(String[] args){
        ArrayList<Team> teams = new ArrayList<Team>();
        teams.add(new Team("Marani",19101020,5, new String[]{"Marai1","Marani2"}));
        teams.add(new Team("Piku",19101003,7, new String[]{"Piku1","Piku2"}));
        teams.add(new Team("Tanmoy",19101013,3, new String[]{"Tanmoy1","Tanmoy2"}));

        Collections.sort(teams);
        System.out.println("Teams :");
        for(Team t: teams) t.display();

        Team winner = Collections.max(teams, new Comparator<Team>(){
            public int compare(Team t1, Team t2){
                return t1.marks.compareTo(t2.marks);
            }
        } );
        System.out.println("Winners: ");
        winner.display();
    }
}
