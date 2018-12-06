import java.io.Serializable;

public class MoviePlayer extends Product implements MultimediaControl, Serializable {
//fields
  protected static Screen movieScreen = new Screen("1920 x 1080", 144, 1);
  public MonitorType monitorType = MonitorType.LCD;

  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  @Override
  public void previous() {
    System.out.println("Going to previous movie");
  }

  @Override
  public void next() {
    System.out.println("Going to next movie");
  }

  @Override
  public String toString() {
    return super.toString() +
        "\r\n" + movieScreen.toString() + "\r\n" +
        "Monitor Type       : " + monitorType + "\r\n---------\r\n";
  }

  public MoviePlayer(String pName, Screen movieScreen, MonitorType monitorType) {
    super(pName);
    this.movieScreen = movieScreen; //had to write to static field or it just didnt print
    this.monitorType = monitorType;
  }
  public MoviePlayer(){

  }

  public static void main(String[] args) {
    MoviePlayer player1 = new MoviePlayer();
    System.out.println(player1);
    //System.out.println(movieScreen);
  }

  @Override
  public int compareTo(Item o) {
    return 0;
  }
}
