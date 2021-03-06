package tikape.domain;

/**
 *
 * @author kujuku
 */
public class Alue {
    private int tunnus;
    private String nimi;

    public Alue(int tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }

    public int getTunnus() {
        return tunnus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setTunnus(int tunnus) {
        this.tunnus = tunnus;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String getOsoite() {
        return "alue/" + this.tunnus;
    }

    @Override
    public String toString() {
        return this.nimi;
    }
    
    
}
