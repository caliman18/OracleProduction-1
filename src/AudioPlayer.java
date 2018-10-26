// Harrison Paxton
// AudioPlayer captures the details of an audio player, is a subclass of Product and implements the
// MultimediaControl interface.
// 10/24/2018

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
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

  public String toString() {

    String superString = super.toString();

    superString += "\nAudio Spec : " + audioSpecification + "\n" +
        "Type : " + mediaType;

    return superString;
  }
}
