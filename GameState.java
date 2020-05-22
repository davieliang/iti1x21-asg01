/**
 * An enum class that defines the values
 *  <b>PLAYING</b>,
 *  <b>DRAW</b>,
 *  <b>XWIN</b>, and
 *  <b>OWIN</b>
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public enum GameState{
public static String winner() {
        List<List<Integer>> winCon = new ArrayList<List<Integer>>();
        winCon.add(Arrays.asList(1, 2, 3)); // first Row of the table
        winCon.add(Arrays.asList(4, 5, 6)); // Second Row of the table
        winCon.add(Arrays.asList(7, 8, 9)); // Third Row of the table
        winCon.add(Arrays.asList(1, 4, 7)); // First Column of the table
        winCon.add(Arrays.asList(2, 5, 8)); // Second Column of the table
        winCon.add(Arrays.asList(3, 6, 9)); // Third Column of the table
        winCon.add(Arrays.asList(1, 5, 9)); // first diagonal of the table
        winCon.add(Arrays.asList(3, 5, 7)); // Second diagonal of the table

        for (List<Integer> l : winCon) {
            if (playerPosition.containsAll(l)) {
                return "Congargulations !!!! You Won :)";
            } else if (cpuPosition.containsAll(l)) {
                return "Robot Nailed it. Cpu Won!!!";
            } else if (playerPosition.size() + cpuPosition.size() == 9) {
                return "It's a Tie Buddy";
            }
        }
        return "";
    }

}
