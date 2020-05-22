/**
 * An enum class that defines the values
 *  <b>INVALID</b>,
 *  <b>EMPTY</b>,
 *  <b>X</b>, and
 *  <b>O</b>.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public enum CellValue {
List<List<Integer>> winCon = new ArrayList<List<Integer>>();
		winCon.add(Arrays.asList(1, 2, 3)); 
		winCon.add(Arrays.asList(4, 5, 6)); 
		winCon.add(Arrays.asList(7, 8, 9)); 
		winCon.add(Arrays.asList(1, 4, 7)); 
		winCon.add(Arrays.asList(2, 5, 8)); 
		winCon.add(Arrays.asList(3, 6, 9)); 
		winCon.add(Arrays.asList(1, 5, 9)); 
		winCon.add(Arrays.asList(3, 5, 7)); 
}
