import java.time.*;

class Studentsystem {
  public static void main(String[] args) {
    Laerested l1 = new Laerested("Universitetet i Oslo", "08:00:00", "20:00:00");

    Bachelorstudent b1 = new Bachelorstudent("Malin", 22, "IN1010", l1);
    Masterstudent m1 = new Masterstudent("Sofie", 28, "IN4010", l1);

    System.out.println("Studenter:\n");
    System.out.println(b1);
    System.out.println("");
    System.out.println(m1);
  }
}
