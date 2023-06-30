public class provincia extends edad{
    String provincia;

    public provincia(String nombre, int edad, String provincia) {
        super(nombre, edad);
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
