import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Recuperando {

    public static void main(String[] args) {
        try {
            // Creamos un objeto de tipo ObjectInputStream para poder desserializar.
            // Recibe por paramatro un objeto FileInputStream que se le pasa la ruta del archivo.
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("./guardar_serializable/miObjetoSerializado.dat"));

            // Hacemos casting del objeto que vamos a devolver, ya que el metodo devuelve un Object
            Empleado[] entradaObjeto = (Empleado[]) flujoEntrada.readObject();
            flujoEntrada.close();

            for (Empleado infoEmpleado : entradaObjeto) {
                System.out.println(infoEmpleado);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
