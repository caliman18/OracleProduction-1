// Harrison Paxton
// ItemType interface which stores types of items and codes
// 10/24/2018

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM"),;

  String code;

  ItemType(String code) {
    this.code = code;
  }

  String getCode() {
    return code;
  }

}
