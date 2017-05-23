import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by marti on 2017.05.23..
 */
public class Nearby {

    private int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public int[] nearby(int x, int y, int range) {
        List<Integer> resultList = new ArrayList<>();
        if (x > multi.length ) throw new IllegalArgumentException("There is no row: " + x );
        if (y > multi[x].length ) throw new IllegalArgumentException("There is no column: " + y);
        for (int j = 0; j < multi[x].length; j++) {
            if (j >= (y - range) && j <= (y + range) && j!=y) {
                resultList.add(multi[x][j]);
            }
        }
        int[] resultArray = resultList.stream().mapToInt(i -> i).toArray();
        return resultArray;
    }

    public int[] nearbyStream(int x, int y, int range) throws IllegalArgumentException {
        int[] result = Arrays.stream(IntStream.range(0, multi[x].length).
                filter(i -> i >= y - range && i <= y + range && i != y).toArray()).
                map(j -> multi[x][j]).toArray();

        return result;
    }

}
