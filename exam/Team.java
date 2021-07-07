package exam;

public class Team {
    public String name, member1, member2, member3;
    public double judge1, judge2, judge3, avg;

    public Team(String name, String member1, String member2, String member3, double judge1, double judge2, double judge3) {
        this.name = name;
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
        this.judge1 = judge1;
        this.judge2 = judge2;
        this.judge3 = judge3;
        this.avg = (judge1+ judge2 + judge3)/3;
    }

    public void setJudge1(double judge1) {
        this.judge1 = judge1;
        setAvg((judge1 + judge2+ judge3)/3);
    }

    public void setJudge2(double judge2) {
        this.judge2 = judge2;
        setAvg((judge1 + judge2+ judge3)/3);
    }

    public void setJudge3(double judge3) {
        this.judge3 = judge3;
        setAvg((judge1 + judge2+ judge3)/3);
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", member1='" + member1 + '\'' +
                ", member2='" + member2 + '\'' +
                ", member3='" + member3 + '\'' +
                ", judge1=" + judge1 +
                ", judge2=" + judge2 +
                ", judge3=" + judge3 +
                ", avg=" + avg +
                '}';
    }
}
