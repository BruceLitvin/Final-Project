import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Planner f= new Planner();
       boolean lock = true;
        System.out.println("Key: EventA to add goal");
        System.out.println("EventB to remove a goal");
        System.out.println("GoalA to add goal");
        System.out.println("GoalR to remove goal");
        System.out.println("End to cut program");
       while(lock) {
           Scanner a = new Scanner(System.in);
           System.out.println("What would you like to do");
           String activity = a.next();
           if(activity.equals("EventA")){
               f.add();
           }
           else if(activity.equals("EventR")){
               f.remove();
           }
           else if(activity.equals("GoalA")){
               f.goalInput();
           }
           else if(activity.equals("GoalR")){
               f.goalRemove();
           }
           else if(activity.equals("End")){
               lock= false;

           }
           else if(activity.equals("end")){
               lock= false;

           }



       }
    }



}
