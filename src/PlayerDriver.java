// Harrison Paxton
// tests all drivers
// 10/24/2018

public class PlayerDriver {

  /**
   * Test driver for various media players.
   */
  public static void testPlayer() {

    MoviePlayer mp1 = new MoviePlayer("DBPOWER MK101\n", new Screen("720x480",
        40, 22),
        MonitorType.LCD);

    MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK\n", new Screen("1366x768",
        40, 22),
        MonitorType.LED);

    System.out.println(mp1);
    System.out.println(mp2);

    AudioPlayer ap = new AudioPlayer("iPod Mini", "MP3");
    ap.next();
    ap.play();
    ap.previous();
    ap.stop();

    mp1.next();
    mp1.play();
    mp1.previous();
    mp1.stop();
  }

}