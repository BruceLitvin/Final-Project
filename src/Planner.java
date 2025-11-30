import java.util.Scanner;

public class Planner {
    private int listTotal = 24;
    String[] itemList = new String[listTotal];

    public Planner(){

    }

    public void add() {
        boolean control = true;
        while(control) {
            Scanner s = new Scanner(System.in);
            System.out.println("What do you want to add");
            String activity = s.next();
            System.out.println("What hour?");
            int hour = s.nextInt();
            itemList[hour]= activity;
            System.out.println("Want to add something else?");
            String response = s.next();
            if(response.equals("No")) control=false;
            else if(response.equals("no")) control=false;
        }
    }

    public void add(String activity, int hour){
        itemList[hour]= activity;
    }


    public void remove(){
        boolean exists= true;
        while(exists) {
            Scanner f = new Scanner(System.in);
            System.out.println("Type the hour of the activity you want removed if any?");
            int response = f.nextInt();  //9
            if (response>24 || response<0 ){
                exists=false;
                System.out.println("Not an element");
            }
            else {
                exists=false;
                itemList[response] = null;

            }
        }
    }

    public void remove( int hour){
        itemList[hour]=null;
    }
    public boolean isHourBusy(int hour){
        if(itemList[hour]==null)
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
}




