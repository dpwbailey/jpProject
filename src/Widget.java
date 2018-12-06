class Widget extends Product {

  public Widget(String name) {
    super(name);
  }

  @Override
  public int compareTo(Item o) {
    return 0;
  }
}
