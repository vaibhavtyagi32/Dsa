package GreedyAlgos;

import java.util.ArrayList;

public class ActivitySelectionSortedEndTime {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        ArrayList<Integer> list=new ArrayList<>();
        int maxAct=0;

        list.add(0);
        maxAct=1;
        int lastIndex=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastIndex){
                maxAct++;
                list.add(i);
                lastIndex=end[i];
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print("A"+list.get(i)+" ");
        }
        System.out.println();
    }
}
