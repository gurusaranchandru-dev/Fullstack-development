package Pattern;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Taking Photo");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

public class Multipleinheritance {

    public static void main(String[] args) {

        Smartphone s = new Smartphone();

        s.takePhoto();
        s.playMusic();
    }
}