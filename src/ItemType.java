/*
Programmer: Daniel Bailey
Description: Enum to store media type of a product
Date:12/5/2018
 */
public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");
  public String itcode;

  ItemType(String itcode) {

    this.itcode = itcode;
  }

}