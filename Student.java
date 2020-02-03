import java.time.*;

abstract class Student {
  protected String navn;
  protected int alder;
  protected String kurs;
  protected Laerested laerested;
  protected LocalTime tid;

  public Student(String navn, int alder, String kurs, Laerested laerested) {
    this.navn = navn;
    this.alder = alder;
    this.kurs = kurs;
    this.laerested = laerested;

    tid = LocalTime.now(ZoneId.systemDefault()).withNano(0);
  }

  public LocalTime hentTid() {
    return tid;
  }

  abstract public String giTilgang();
  abstract public String typeStudent();

  @Override
  public String toString() {
    return "Navn: " + navn + "\nAlder: " + alder + "\nKurs: " + kurs + "\nLærested: " + laerested;
  }
}
