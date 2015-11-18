package com.cameo;
import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        //Create array list to store all lakes that have been ran around
        ArrayList<Lake> lakesIveRanAround = new ArrayList<>();

        //Three Lake objects
        Lake calhoun = new Lake("Lake Calhoun");
        calhoun.addRunTime(45.15);
        calhoun.addRunTime(43.32);
        lakesIveRanAround.add(calhoun);

        Lake harriet = new Lake("Lake Harriet");
        harriet.addRunTime(49.34);
        harriet.addRunTime(44.43);
        harriet.addRunTime(46.22);
        lakesIveRanAround.add(harriet);

        Lake como = new Lake("Lake Como");
        como.addRunTime(32.11);
        como.addRunTime(28.14);
        lakesIveRanAround.add(como);

        while(true) {
            try {
                //Create scanner to obtain new lake and run times
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the lake you just ran around");
                String lake = s.nextLine();
                System.out.println("Enter your run time for this lake");
                double newRunTime = Double.parseDouble(s.nextLine());

                boolean createNewLake = true;  //Assume lake has not been ran around

                for (Lake eachLake : lakesIveRanAround) {
                    if (eachLake.getName().toLowerCase().equals(lake.toLowerCase())) { //If lake has already been ran around, add runTime
                        eachLake.addRunTime(newRunTime);
                        System.out.println("Since you've already run around this lake, this new time has been added to the list");
                        createNewLake = false;
                    }
                }

                if (createNewLake) { //Create new Lake object,
                    Lake lakeToAdd = new Lake(lake);
                    lakesIveRanAround.add(lakeToAdd);
                    lakeToAdd.addRunTime(newRunTime);
                }

                //Display fastest time for each lake
                for (Lake eachLake : lakesIveRanAround) {
                    System.out.println("Your fastest time for " + eachLake.getName() + " is " + eachLake.fastestTime());
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}

