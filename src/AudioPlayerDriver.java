// Harrison Paxton
// Driver class for AudioPlayer that will test to see whether we can instantiate occurrences of it,
// use the media controls and print out their details to the console.
// 10/24/2018

public class AudioPlayerDriver {

  /**
   * Driver for testing audio player.
   */
  public static void testAudioPlayer() {

    AudioPlayer ap = new AudioPlayer("iPod Mini", "MP3");
    ap.play();
    ap.stop();
    ap.next();
    ap.previous();
    System.out.println(ap.toString());

    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV");
    System.out.println(ap2.toString());


  }
}
