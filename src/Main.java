import java.util.LinkedList;

public class Main {

    record Place(String name, int distance) {

    }

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
    }


    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate:" + place);
            return;
        }
        list.add(place);
    }
}
