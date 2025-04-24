import models.Direccion;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[5];
         personas[0] = new Persona(), new Direccion(null, 0, 0);
         personas[1] = new Persona();
         personas[2] = new Persona();
         personas[3] = new Persona();
         personas[4] = new Persona();
    }
}
