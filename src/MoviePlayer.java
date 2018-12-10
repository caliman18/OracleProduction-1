// Harrison Paxton
// MoviePlayer is similar to audio player but movies instead of audio
// 10/24/2018
public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;

  /**
   * Constructor for movie player.
   *
   * @param name name of the movie player
   * @param screen movie player screen
   * @param type type of monitor on movie player
   */
  public MoviePlayer(String name, Screen screen, MonitorType type) {
    super(name);
    this.screen = screen;
    this.monitorType = type;
  }

  /**
   * Displays when user "plays" movie.
   */
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  /**
   * Displays when user "stops" movie.
   */
  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  /**
   * Displays when user selects previous movie.
   */
  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  /**
   * Displays when user selects next movie.
   */
  @Override
  public void next() {
    System.out.println("Next movie");
  }

  /**
   * To string for movie player, displays monitor type.
   *
   * @return Displays monitor type
   */
  public String toString() {

    String superString = super.toString();

    superString += screen + "\n"
        + "Monitor Type : "
        + monitorType;

    return superString;
  }

}
