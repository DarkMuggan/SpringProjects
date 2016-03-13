package dogs;

/**
 * Created by Bloodmonk on 3/12/2016.
 */
public class Alsation implements IDog {

    public String bark(String sound) {
        String bark = "Alsation says: "+sound;
        System.out.println(bark);
        return bark;
    }
}
