
class GFC303 {
  private String name;
  public GFC303(String name) {this.name = name;}
  public void setName(String name) {this.name = name;}
  public String getName() {return name;}
  public static void m1(GFC303 pet1, GFC303 pet2) {
    pet1 = new GFC303("Fish");
    pet2 = null;
  }
  public static void main (String[] args) {
    GFC303 pet1 = new GFC303("Dog");
    GFC303 pet2 = new GFC303("Cat");
    m1(pet1,pet2);
    System.out.println(pet1.getName() + "," + pet2.getName());
}}
