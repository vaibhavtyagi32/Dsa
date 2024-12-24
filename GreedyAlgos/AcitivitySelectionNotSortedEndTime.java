package GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AcitivitySelectionNotSortedEndTime {
    public static void main(String[] args) {
        int start[]={0,5,1,3,8,5};
        int end[]={6,7,2,4,9,9};
        int Acitivities[][]=new int[start.length][3];
        for(int i=0;i< start.length;i++){
            Acitivities[i][0]=i;
            Acitivities[i][1]=start[i];
            Acitivities[i][2]=end[i];
        }
        Arrays.sort(Acitivities, Comparator.comparingDouble(a -> a[2]));
        ArrayList<Integer> list=new ArrayList<>();
        int maxAct=0;

        list.add(Acitivities[0][0]);
        maxAct=1;
        int lastIndex=Acitivities[0][2];
        for(int i=1;i<end.length;i++){
            if(Acitivities[i][1]>=lastIndex){
                maxAct++;
                list.add(Acitivities[i][0]);
                lastIndex=Acitivities[i][2];
            }
        }
        System.out.println("Maximum Activities "+maxAct);
        for(int i=0;i<list.size();i++){
            System.out.print("A"+list.get(i)+" ");
        }
        System.out.println();
    }
}
