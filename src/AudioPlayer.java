// Harrison Paxton
// AudioPlayer captures the details of an audio player, is a subclass of Product and implements the
// MultimediaControl interface.
// 10/24/2018

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  /**
   * Constructor for audio player.
   *
   * @param name Name of audio player
   * @param audioSpecification Specification of audio player
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  /**
   * Displays specs and media type of audio player.
   *
   * @return toString method from the parent class
   */
  public String toString() {

    String superString = super.toString();

    superString += "\nAudio Spec : " + audioSpecification
        + "\n"
        + "Type : " + mediaType;

    return superString;
  }
}
