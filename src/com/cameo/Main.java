package com.cameo;
import java.lang.reflect.Array;
import java.util.*;
public class Main {

//Mason from the Learning Center helped me add the generics to the array lists
    public static void main(String[] args) {
        //Create hashmap to store Lake names and run times
        //The key will be the lake name stored as a string

        HashMap<String, ArrayList> lakeRunTimes = new HashMap();

        ArrayList<Double> Calhoun = new ArrayList();
        Calhoun.add(45.15);
        Calhoun.add(43.32);

        ArrayList<Double> Harriet = new ArrayList();
        Harriet.add(49.34);
        Harriet.add(44.43);
        Harriet.add(46.22);

        ArrayList<Double> Como = new ArrayList();
        Como.add(32.11);
        Como.add(28.14);

        //Add data to hash map
        lakeRunTimes.put("Calhoun", Calhoun);
        lakeRunTimes.put("Harriet", Harriet);
        lakeRunTimes.put("Como", Como);

        Set<String> keySet = lakeRunTimes.keySet();
        System.out.println(keySet + " are the lakes for which you have recorded run times.");

        //Create scanner to obtain lake and run time
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lake you just ran around");
        String lake = s.nextLine();
        System.out.println("Enter your run time for this lake");
        double runTime = Double.parseDouble(s.nextLine());

        //Check to see if the lake is already in the hash map.
        if (lakeRunTimes.containsKey(lake)){
            //received help from Mason in Learning Center with next line of code
            lakeRunTimes.get(lake).add(runTime);
        }
        else {
            ArrayList<Double> newLake = new ArrayList();   //Creates new array list for new lake
            newLake.add(runTime);
            lakeRunTimes.put(lake, newLake);    //Adds lake name to Hashmap
        }

        for (String eachLake : keySet) {
            System.out.println("Your fastest time for Lake " + eachLake + " is " + fastestTime(lakeRunTimes.get(eachLake)));
        }
    }

    private static double fastestTime(ArrayList<Double> theLake) {
        //TODO figure out what to use instead of 9999
        double shortestTime = 9999;
        for (Double time : theLake) {
            if (time < shortestTime) {
                shortestTime = time;
            }
        }
        return shortestTime;
     }
    }

