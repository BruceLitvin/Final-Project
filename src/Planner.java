import java.util.Scanner;

public class Planner {
    private int listTotal = 24;
    String[] itemList = new String[listTotal];
    String[] goalList = new String[10];

    public Planner() {

    }

    public void add() {
        boolean control = true;
        while (control) {
            Scanner s = new Scanner(System.in);
            System.out.println("What do you want to add");
            String activity = s.next();
            System.out.println("What hour?");
            int hour = s.nextInt();
            itemList[hour] = activity;
            System.out.println("Want to add something else?");
            String response = s.next();
            if (response.equalsIgnoreCase("No")) control = false;

        }
    }

    public void add(String activity, int hour) {
        itemList[hour] = activity;
    }


    public void remove() {
        boolean exists = true;
        while (exists) {
            Scanner f = new Scanner(System.in);
            System.out.println("Type the hour of the activity you want removed if any?");
            int response = f.nextInt();  //9
            if (response > 24 || response < 0) {
                exists = false;
                System.out.println("Not an element");
            } else {
                exists = false;
                itemList[response] = null;

            }
        }
    }

    public void remove(int hour) {
        itemList[hour] = null;
    }

    public boolean isHourBusy(int hour) {
        if (itemList[hour] == null)
            return true;
        else return false;
    }


    public void result() {
        for (int i = 0; i < listTotal - 1; i++) {
            if (itemList[i] != null) {
                System.out.println(" Activity: " + itemList[i] + " | " + " hour: " + i);
            }
        }
    }

    public void goalInput() {
        boolean goals = true;
        while (goals) {
            Scanner g = new Scanner(System.in);
            System.out.println("Type out goals here or no if you want to skip ideally in order of preference");
            String goal = g.next();
            System.out.println("Another one?");
            String answer = g.next();
            if (answer.equalsIgnoreCase("no")) {
                goals = false;
            }
            goalPlace(goal);
        }
        for (int i = 0; i < goalList.length - 1; i++) {
            if (goalList[i] != null) {
                System.out.println(" Goal: " + goalList[i] + " Preference: " + i);
            }
        }
    }

    public void goalPlace(String goal) {
        for (int i = 0; i < goalList.length - 1; i++) {
            if (goalList[i] == null) {
                goalList[i] = goal;
                return;
            }
        }

    }

    public void goalRemove() {
        boolean a = true;
        while (a) {
            Scanner g = new Scanner(System.in);
            System.out.println("Which goal do you want removed");
            int goal = g.nextInt();
            if (goal > 10 || goal < 0) {
                a = false;
                System.out.println("Not an element");
            } else {
                a = false;
                goalList[goal] = null;


            }
        }
        for (int i = 0; i < goalList.length; i++) {
            if(goalList[i]!= null){
                System.out.println(" Goal: " + goalList[i] + " Preference: " + i);
            }
        }
    }
}






