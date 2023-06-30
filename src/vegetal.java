public class vegetal extends provincia{
    String condimento;

    public vegetal(String nombre, int edad, String provincia, String condimento) {
        super(nombre, edad, provincia);
        this.condimento = condimento;
    }

    public String getCondimento() {
        return condimento;
    }

    public void setCondimento(String condimento) {
        this.condimento = condimento;
    }
}
