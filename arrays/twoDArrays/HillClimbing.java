package arrays.twoDArrays;

import java.util.*;



public class HillClimbing {
    static Map<String, Integer> heuristic = new HashMap<>();
    static Map<String, List<String>> graph = new HashMap<>();

    static {
        heuristic.put("A", 7);
        heuristic.put("B", 6);
        heuristic.put("C", 4);
        heuristic.put("D", 3);
        heuristic.put("E", 4);
        heuristic.put("F", 1);
        heuristic.put("G", 0);

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D"));
        graph.put("C", Arrays.asList("E"));
        graph.put("E", Arrays.asList("F"));
        graph.put("F", Arrays.asList("G"));
        graph.put("D", Collections.emptyList());
        graph.put("G", Collections.emptyList());
    }

    public static List<String> hillClimbing(String start, String goal) {
        String current = start;
        List<String> path = new ArrayList<>();
        path.add(current);

        while (!current.equals(goal)) {
            List<String> neighbors = graph.get(current);

            if (neighbors.isEmpty()) {
                System.out.println("No more neighbors. Stuck!");
                break;
            }


            String next = neighbors.get(0);
            for (String n : neighbors) {
                if (heuristic.get(n) < heuristic.get(next))
                    next = n;
            }

            // if next node is worse → stop
            if (heuristic.get(next) >= heuristic.get(current)) {
                System.out.println("Reached local optimum at " + current);
                break;
            }

            current = next;
            path.add(current);
        }

        return path;
    }

    public static void main(String[] args) {
        List<String> result = hillClimbing("A", "G");
        System.out.println("Final Path: " + result);
    }
}

