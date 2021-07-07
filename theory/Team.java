package theory;

public class Team implements Comparable<Team> {
    String teamName;
    Integer teamId; Double marks;
    String[] members;

    public Team(String teamName, int teamId, double marks, String[] members) {
        this.teamName = teamName;
        this.teamId = teamId;
        this.marks = marks;
        this.members = members;
    }

    public int compareTo(Team tm){
        return this.marks.compareTo(tm.marks);
    }
    void display(){
        System.out.printf("Team: %d(%s)\n",teamId,teamName);
        System.out.println("Marks: "+marks);
        System.out.println("Members: ");
        for(String member: members)
            System.out.println(member);
    }
}
