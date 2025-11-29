import java.util.Scanner;

public class Planner {
    private int listTotal = 24;
    String[] itemList = new String[listTotal];

    public Planner(){

    }

    public String add() {
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
        for(int i=0; i<listTotal-1; i++){
            if(itemList[i] != null){
                System.out.println(" Acitivty: " + itemList[i] + " | " + " hour: " + i );
            }






        }






        return null;
    }


}




