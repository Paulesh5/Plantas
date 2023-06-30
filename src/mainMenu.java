import java.util.ArrayList;
public class mainMenu {
    public static void main(String[] args) {

        try {
            ArrayList<vegetal>vegetal1 = new ArrayList<vegetal>();
            ArrayList<fruta>fruta1 = new ArrayList<fruta>();

            fruta1.add(new fruta("Manzana", 1, "Pichincha", "Pastel"));
            vegetal1.add(new vegetal("Lechuga", 1, "Tulcan", "Sal"));

            System.out.println("\n\t\t *** FRUTA ***\n");
            System.out.println("Nombre: " + fruta1.get(0).getNombre());
            System.out.println("Tiempo de plantacion: " + fruta1.get(0).getEdad());
            System.out.println("Provincia originaria: " + fruta1.get(0).getProvincia());
            System.out.println("Postre: " + fruta1.get(0).getPostre());

            System.out.println("\n\t\t *** VEGETAL ***\n");
            System.out.println("Nombre: " + vegetal1.get(0).getNombre());
            System.out.println("Tiempo de plantacion: " + vegetal1.get(0).getEdad());
            System.out.println("Provincia originaria: " + vegetal1.get(0).getProvincia());
            System.out.println("Condimento: " + vegetal1.get(0).getCondimento());
        }catch (Exception ex){
            System.out.println("\n\t\tSe ha producido un error \n");
        }
    }
}
