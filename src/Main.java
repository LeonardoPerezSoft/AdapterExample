import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");

        Scanner scanner = new Scanner(System.in);
        String mediaType;

        do {
            System.out.print("Enter the media type to play (mp3/vlc/mp4), or 'exit' to quit: ");
            mediaType = scanner.nextLine();

            if (mediaType.equalsIgnoreCase("mp3") || mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4")) {
                MediaAdapter mediaAdapter = new MediaAdapter(mediaType);
                mediaAdapter.play(mediaType, "song." + mediaType);
            } else if (!mediaType.equalsIgnoreCase("exit")) {
                System.out.println("Invalid media type. Please enter 'mp3', 'vlc', 'mp4', or 'exit'.");
            }
        } while (!mediaType.equalsIgnoreCase("exit"));
    }
}