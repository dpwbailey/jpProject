
//step 13
public class Player extends Product implements MultimediaControl {

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public int compareTo(Item o) {
    return 0;
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


}