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
public static void placePiece(char[][] gameBoard, int placement, String user) {
        char symbol;
        char cpuIcon;
        char userIcon;
        if(userSymbol == 1) {
            cpuIcon = 'O';
            userIcon = 'X';
        } else {
            cpuIcon = 'X';
            userIcon = 'O';
        }
        if(user.equals("cpu")) {
            symbol = cpuIcon;
            cpuPosition.add(placement);

        } else {
            symbol = userIcon;
            playerPosition.add(placement);

        }
        switch (placement) {

        case 1:
            gameBoard[0][0] = symbol;
            break;
        case 2:
            gameBoard[0][2] = symbol;
            break;
        case 3:
            gameBoard[0][4] = symbol;
            break;
        case 4:
            gameBoard[2][0] = symbol;
            break;
        case 5:
            gameBoard[2][2] = symbol;
            break;
        case 6:
            gameBoard[2][4] = symbol;
            break;
        case 7:
            gameBoard[4][0] = symbol;
            break;
        case 8:
            gameBoard[4][2] = symbol;
            break;
        case 9:
            gameBoard[4][4] = symbol;
            break;
        }

    }
    public static void printGameConsole(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
