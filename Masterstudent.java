class Masterstudent extends Student {
  public Masterstudent(String navn, int alder, String kurs, Laerested laerested) {
    super(navn, alder, kurs, laerested);
  }

  public String typeStudent() {
    return "Master";
  }

  public String giTilgang() {
    return "Studenten har tilgang.";
  }

  @Override
  public String toString() {
    return super.toString() + "\nStudienivå: " + typeStudent() + "\nTilgang til lærestedet: " + giTilgang();
  }
}
