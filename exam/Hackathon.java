package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Hackathon {
    Scanner scan= new Scanner(System.in);
    ArrayList<Team> info = new ArrayList<>();

    public void addTeam(String name, String m1, String m2, String m3, double j1, double j2, double j3){
        Team tm= new Team(name, m1, m2, m3, j1, j2, j3);
        info.add(tm);
    }

    public Team findTeam(String name)
    {
        for(int i=0; i<info.size(); i++)
        {
            if(info.get(i).name.equals(name))
                return info.get(i);
        }
        return null;
    }

    public void marksUpdate(String name, int judge, double marks){
        Team tm = findTeam(name);
        if(tm == null) System.out.println("No Team");
        else if( judge == 1) tm.setJudge1(marks);
        else if( judge == 2) tm.setJudge2(marks);
        else if( judge == 3) tm.setJudge3(marks);
    }

    public void display(String name)
    {
        Team tm = findTeam(name);
        if(tm == null) System.out.println("No Team");
        else System.out.println(info);
    }
    public void display()
    {
        for(int i=0;i<info.size();i++){
            Team tm= info.get(i);
            System.out.println(tm);
        }
    }

    public void winner()
    {
        int j = 0;
        double max = info.get(0).avg;
        for(int i=1; i<info.size(); i++)
        {
            if(info.get(i).avg > max)
            {
                max = info.get(i).avg;
                j = i;
            }
        }
        System.out.println("Winners :"+info.get(j).name);
    }
}
