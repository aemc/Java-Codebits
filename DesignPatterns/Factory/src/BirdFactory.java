public class BirdFactory {

    public Bird getBird(String birdSounds) {
        if (birdSounds == null) {
            return null;
        }
        if (birdSounds.equalsIgnoreCase("EAGLE")) {
            return new Eagle();
        } else if (birdSounds.equalsIgnoreCase("OWL")) {
            return new Owl();
        } else if (birdSounds.equalsIgnoreCase("Finch")) {
            return new Finch();
        } else {
            return null;
        }
    }
}
