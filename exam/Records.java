package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Records {
    Scanner scan= new Scanner(System.in);
    ArrayList<Vaccination> info = new ArrayList<>();

    public void addPerson(String name, int age, String status, int nid){
        Vaccination vacc= new Vaccination(name, age, status, nid);
        info.add(vacc);
    }

    public Vaccination findPeople(int nid)
    {
        for(int i=0; i<info.size(); i++)
        {
            if(info.get(i).NID == nid)
                return info.get(i);
        }
        return null;
    }

    public void statusUpdate(int nid, String status)
    {
        Vaccination vcc = findPeople(nid);

        if(vcc == null) System.out.println("Not in the system");
        else if(status.equals("registered") && vcc.getStatus().equals("unregistered")) vcc.setStatus("registered");
        else if(status.equals("1st dose") && vcc.getStatus().equals("registered")) vcc.setStatus("1st dose");
        else if(status.equals("2nd dose") && vcc.getStatus().equals("1st dose")) vcc.setStatus("2nd dose");

        System.out.println("Invalid status\n last status : "+vcc.getStatus());
    }

    public void display(String st)
    {
        for(int i=0; i<info.size(); i++)
        {
            if(info.get(i).getStatus().equals(st)) System.out.println(info);
        }
    }
    public void display(int nid)
    {
        Vaccination vcc = findPeople(nid);
        if(vcc == null) System.out.println("Not in the system");
        else System.out.println(info);
    }
    public void display()
    {
        for(int i=0;i<info.size();i++){
            Vaccination vcc= info.get(i);
            System.out.println(vcc);
        }
    }

}
