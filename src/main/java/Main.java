import java.util.Arrays;

/**
 * Created by marti on 2017.05.23..
 */
public class Main {

    public static void main(String[] args) {
        Nearby result = new Nearby();
        System.out.println(Arrays.toString(result.nearbyStream(1,3,2)));


    }

}
