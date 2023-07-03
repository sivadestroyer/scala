import java.util.ArrayList;
import java.util.List;

class UnionThread extends Thread {
    private final List<Integer> list1;
    private final List<Integer> list2;
    private List<Integer> result;


    public UnionThread(List<Integer> lst1, List<Integer> lst2){
        list1 = lst1;
        list2 = lst2;
    }

    public void run() {
        List<Integer> union = new ArrayList<>(list1);

        for (Integer num : list2) {
            if( !union.contains(num) ){
                union.add(num);
            }
        }

        result = union;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> getResults() {
        return result;
    }
}

class IntersectionThread extends Thread {
    private final List<Integer> list1;
    private final List<Integer> list2;
    private List<Integer> result;

    public IntersectionThread(List<Integer> lst1, List<Integer> lst2) {
        list1 = lst1;
        list2 = lst2;
    }

    public void run() {
        List<Integer> intersection = new ArrayList<Integer>();

        for( Integer num : list1) {
            if( list2.contains(num) && !intersection.contains(num) ){
                intersection.add(num);
            }
        }

        result = intersection;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> getResults() {
        return result;
    }
}

public class Prev {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8);

        UnionThread union = new UnionThread(list1, list2);
        IntersectionThread intersection = new IntersectionThread(list1, list2);

        union.start();
        intersection.start();

        try {
            union.join();
            intersection.join();
        } catch (InterruptedException e ){
            System.out.println("Threads Interrupted");
        }

        List<Integer> unionResult = union.getResults();
        List<Integer> intersectionResult = intersection.getResults();

        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectionResult);
    }
}