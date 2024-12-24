package PriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Introduction {
    public static void main(String[] args) {
        // priority queue give priority in ascending order
        // if we want to give priority in reverse order then we use Comprator.reverseOrder()
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(4); // O(logn)
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(5);
        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }
    }
}
