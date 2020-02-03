import java.time.*;

class Bachelorstudent extends Student {
  public Bachelorstudent(String navn, int alder, String kurs, Laerested laerested) {
    super(navn, alder, kurs, laerested);
  }

  public String typeStudent() {
    return "Bachelor";
  }

  public String giTilgang() {
    if(super.hentTid().compareTo(laerested.hentAapent()) >= 0 && super.hentTid().compareTo(laerested.hentStengt()) < 0) {
      return "Studenten har tilgang.";
    }
    else {
      return "Studenten har ikke tilgang på dette tidspunktet.";
    }
  }

  @Override
  public String toString() {
    return super.toString() + "\nStudienivå: " + typeStudent() + "\nTilgang til lærestedet: " + giTilgang();
  }
}
