// Harrison Paxton
// ScreenSpec interface contains specifications of screens
// 10/24/2018

/**
 * Interface for screen specifications to be used with various screen types.
 */
public interface ScreenSpec {

  public String getResolution();

  public int getRefreshRate();

  public int getResponseTime();

}
