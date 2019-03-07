package builderemployee;

/**
 *
 * @author finfanterodal
 */
public class BuilderEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamos el empleado y lo creamos con EmployeeBuilder.
        Employee empleado = new EmployeeBuilder(234, "Infante")
                .setNewBirthDate(12)
                .setNewBirthMonth(1994)
                .createEmployee();
    }

}
