package GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={0,5,1,3,8,5};
        int end[]={6,7,2,4,9,9};
        int Activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            Activities[i][0]=i;
            Activities[i][1]=start[i];
            Activities[i][2]=end[i];
        }
        Arrays.sort(Activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans=new ArrayList<>();
        int maxAct=0;

        ans.add(Activities[0][0]);
        maxAct=1;
        int lastEnd=Activities[0][2];
        for(int i=1;i<start.length;i++){
            if(Activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(Activities[i][0]);
                lastEnd=Activities[i][2];
            }
        }
        System.out.println("Maximum activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
