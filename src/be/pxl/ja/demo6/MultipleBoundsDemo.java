package be.pxl.ja.demo6;

import be.pxl.ja.streamingservice.model.*;

import java.util.ArrayList;
import java.util.List;

public class MultipleBoundsDemo {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        Movie brotherBear = new Movie("Brother Bear", Rating.LITTLE_KIDS);
        brotherBear.setDuration(125);
        Movie theLionKing = new Movie("The Lion King", Rating.LITTLE_KIDS);
        brotherBear.setDuration(135);
        movies.add(brotherBear);
        movies.add(theLionKing);

        List<Documentary> documentaries = new ArrayList<>();
        Documentary planetEarth = new Documentary("Planet Earht", Rating.OLDER_KIDS);
        planetEarth.setDuration(200);
        Documentary ourOcean = new Documentary("Our Ocean", Rating.OLDER_KIDS);
        planetEarth.setDuration(140);

        startPlayableContent(ourOcean);
    }

    private static <T extends Content & Playable> void startPlayableContent(T playableContent) {
        playableContent.play();
    }
}
