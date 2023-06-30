public class fruta extends provincia{
    String postre;

    public fruta(String nombre, int edad, String provincia, String postre) {
        super(nombre, edad, provincia);
        this.postre = postre;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
}
