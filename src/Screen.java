// Harrison Paxton
// Screen implements the ScreenSpec interface
// 10/24/2018

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  /**
   * Constructor for screen of movie player, takes in and sets resolution, refresh rate, and
   * response time.
   *
   * @param resolution Resolution of screen
   * @param refreshrate Refresh rate of screen
   * @param responsetime Response time of screen
   */
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  /**
   * Getter for screen resolution.
   */
  public String getResolution() {
    return resolution;
  }

  @Override
  /**
   * Getter for refresh rate of screen.
   */
  public int getRefreshRate() {
    return refreshrate;
  }

  @Override
  /**
   * Getter for response time of screen.
   */
  public int getResponseTime() {
    return responsetime;
  }

  /**
   * To string method for the screen.
   *
   * @return Displasy resolution, refresh rate and response time of screen
   */
  public String toString() {
    return "Resolution : " + resolution + "\n"
        + "Refresh rate : " + refreshrate + "\n"
        + "Response time : " + responsetime;
  }
}
