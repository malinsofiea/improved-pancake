import java.time.*;

class Laerested {
  protected String navn;
  protected LocalTime aapent;
  protected LocalTime stengt;

  public Laerested(String navn, String open, String closed) {
    this.navn = navn;
    aapent = LocalTime.parse(open).withNano(0);
    stengt = LocalTime.parse(closed).withNano(0);
  }

  public LocalTime hentAapent() {
    return aapent;
  }

  public LocalTime hentStengt() {
    return stengt;
  }

  @Override
  public String toString() {
    return navn + "\nÅpningstider: " + aapent + " - " + stengt;
  }
}
