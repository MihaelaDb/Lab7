package platibancare;

public class User {
    private String nume;
    private String prenume;
    private String IBAN;


    public User(String nume, String prenume, String IBAN)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.IBAN=IBAN;
    }

    public String getNume(){
        return nume;
    }
    public String getPrenume(){
        return prenume;
    }



}
