package theory;

public class TestString {
    public static void main(String[] arg){
        String id= "19101001, 19101002, 19101003, 19101004, 18101150, Shan";
        //id.charAt(i) == ' ';
        String[] ids = id.split(",");
         //int regCount;
        for(String i: ids) {

             //if(id.endsWith("0")|| id.endsWith("2").....)
            i= i.trim();
            if(i.equalsIgnoreCase("shan"))
                System.out.println("Present");
            if(i.equals("19101003")) System.out.println("Present");
            if (i.startsWith("191"))
                System.out.println(i + "(Regular)");

            else
                System.out.println(i + "(Backlog)");
        }
    }
}
