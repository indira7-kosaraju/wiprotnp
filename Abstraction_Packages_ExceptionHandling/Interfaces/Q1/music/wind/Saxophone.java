package Q1.music.wind;

import Q1.music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Saxophone is playing");
    }
}