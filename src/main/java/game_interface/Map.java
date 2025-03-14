package game_interface;

import java.util.ArrayList;
import java.util.Arrays;

public class Map {

    ArrayList<Integer> levels = new ArrayList<Integer>();

    public Map() {
        levels.add(3);
        levels.add(6);
        levels.add(9);
        levels.add(12);
        levels.add(15);
    }


    private void createMap(int level, String[][] arrayMap){
        int actualLevel = levels.get(level -1);

        for (int fila = 0; fila < actualLevel; fila++) {
            for (int columna = 0; columna < actualLevel; columna++) {
                arrayMap[fila][columna] = "[]";
            }
        }


    }


    public void showMap(int level) {
        int actualLevel = levels.get(level -1);
        String[][] arrayMap = new String[actualLevel][actualLevel];

        createMap(level, arrayMap);

        for (int fila = 0; fila < actualLevel; fila ++) {
            System.out.println(Arrays.toString(arrayMap[fila]));
        }

    }
}

