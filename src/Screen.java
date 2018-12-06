public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public String toString() {
    return "Resolution:        : " + resolution + '\n' +
           "Refresh rate       : " + refreshrate + '\n' +
           "Response time      : " + responsetime + '\n';
  }

  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  @Override
  public int getResponseTime() {
    return responsetime;
  }
  Screen(String resolution, int refreshrate, int responsetime){
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  public static void main(String[] args) {
    Screen screen1 = new Screen("1920 x 1080", 144, 1);
    System.out.println(screen1);
  }
}
