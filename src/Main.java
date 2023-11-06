import java.util.LinkedList;

public class Main {
    record Place(String name, int distance) {
        @Override
        public String toString() {
            return String.format("%s (%d)", name, distance);


        }
    }


    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place texas = new Place("Texas", 1208);
        addPlace(placesToVisit, texas);
        addPlace(placesToVisit, new Place("Vermont", 872));
        addPlace(placesToVisit, new Place("Tennessee", 485));
        addPlace(placesToVisit, new Place("Maryland", 369));
        addPlace(placesToVisit, new Place("Kentucky", 452));
        addPlace(placesToVisit, new Place("illinois", 741));
        System.out.println(placesToVisit);
    }


    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate:" + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate:" + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace: list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
}
