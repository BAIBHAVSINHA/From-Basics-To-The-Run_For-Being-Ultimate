import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class Road {
 public String city1;
    public String city2;

    public Road(String city1, String city2) {
        this.city1 = city1;
        this.city2 = city2;
    }

}
class RoadMap {
    Map<String, Set<Road>> roadMap = new HashMap<String, Set<Road>>();

    //This function helps to get all the cities in the graph
    public Set<String> getAllCities() {
        return this.roadMap.keySet();
    }
