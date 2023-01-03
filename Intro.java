public class Intro {
  public static void main(String[] args) {
    introduceOneself();
  }

  public static void introduceOneself() {
    String name = "Bob";
    int age = 22;
    double height = 178.9;
    char zodiac = '辰';
    System.out.println("私の名前は" + name + "です");
    System.out.println("歳は" + age + "です");
    System.out.println("身長は" + height + "cmです");
    System.out.println("十二支は" + zodiac + "です");
  }
}