package theory;
public class Animal{
    String name, color;
    int noOfLeg;
    float weight, hight;

    public Animal(String n, String c, int nOl, float w, float h){
        this.name =n;
        this.color =c;
        this.noOfLeg = nOl;
        this.weight= w;
        this.hight=h;
    }
    public void eat(String food){
        System.out.printf("%s eatss %s.\n",name,food);
    }

    public void sleep(){
        System.out.printf("%s sleep at night.\n",name);
    }

    public float getWeight(){
        return weight;
    }

    public void display(){
        System.out.printf("Name: %s, Color: %s. Leg: %d. Weight: %f. Hight: %f\n",name,color,noOfLeg,weight,hight);
    }
}

