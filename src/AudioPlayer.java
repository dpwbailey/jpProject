import java.io.Serializable;

public class AudioPlayer extends Product implements MultimediaControl, Serializable {

  //fields
  private String audioSpecifications = "Default Audio Specifications";
  private ItemType mediaType;

  @Override
  public String toString() {
    return super.toString() +
        "\r\n Audio Specifications: " + audioSpecifications +
        "\r\n Media Type: " + mediaType + "\r\n---------\r\n";

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
    System.out.println("Going to previous");
  }

  @Override
  public void next() {
    System.out.println("Going to next");
  }

  public AudioPlayer(String name, String audioSpecifications) {
    super();
    this.mediaType = ItemType.AUDIO;
  }

  public static void main(String[] args) {
    AudioPlayer ap1 = new AudioPlayer("Player One", "generic audio specifications");
    System.out.println(ap1);
  }

  @Override
  public int compareTo(Item o) {
    return 0;
  }
}
