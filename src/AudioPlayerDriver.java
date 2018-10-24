// Harrison Paxton
// Driver class for AudioPlayer that will test to see whether we can instantiate occurrences of it,
// use the media controls and print out their details to the console.
// 10/24/2018

public class AudioPlayerDriver {

  public static void testAudioPlayer() {

    AudioPlayer ap = new AudioPlayer("iPod Mini", "MP3", ItemType.AUDIO);
    ap.play();
    ap.stop();
    ap.next();
    ap.previous();
    System.out.println(ap.toString());

    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV", ItemType.AUDIO);
    System.out.println(ap2.toString());


  }
}
