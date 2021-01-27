import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Road {
    public String city1;
    public String city2;
    public int safetyScore;
 public Road(String city1, String city2, int safetyScore) {
        this.city1 = city1;
        this.city2 = city2;
        this.safetyScore = safetyScore;
    }
}
class RoadMap {
    Map<String, Set<Road>> roadMap = new HashMap<String, Set<Road>>();

    //This function helps to get all the cities in the graph	
    public Set<String> getAllCities() {
        return this.roadMap.keySet();
    }
 //This function will read the input
    public void readLine(String line) {
        String[] csv = line.split(",");
        String city1 = csv[0];
        String city2 = csv[1];
        int safety = Integer.parseInt(csv[2]);
        addRoad(city1, city2, safety);
    }
 private void addCity(String city) {
        this.roadMap.put(city, new HashSet<Road>());
    }

    //This function will add both outgoing and incoming roads between two cities
    private void addRoad(String city1, String city2, int safetyScore) {
        Road road1 = new Road(city1, city2, safetyScore);
        Road road2 = new Road(city2, city1, safetyScore);
        if (!this.roadMap.containsKey(city1)) {
            addCity(city1);
        }
if (!this.roadMap.containsKey(city2)) {
            addCity(city2);
        }

        this.roadMap.get(city1).add(road1);
        this.roadMap.get(city2).add(road2);
    }
 //This function will return all the outgoing roads from a city
    public Set<Road> getAllOutgoingRoads(String node) {
        return this.roadMap.get(node);
    }

}
