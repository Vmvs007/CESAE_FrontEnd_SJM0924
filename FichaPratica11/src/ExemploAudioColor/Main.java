package ExemploAudioColor;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Audio.playMusic("AudioFiles/Sound Effects of Super Mario Bros.wav");
        System.out.println(ConsoleColors.YELLOW_UNDERLINED + "\n\n***** Really Epic and Confusing Game *****" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE_GREEN_THING + "Invalid choice!" + ConsoleColors.RESET);
        sleep(10000);
    }
}
