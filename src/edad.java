public class edad extends nom{
    int edad;

    public edad(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
