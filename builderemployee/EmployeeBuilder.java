package builderemployee;

/**
 * Clase que me construye los empleados a partir de unos atributos fijos.
 * @author finfanterodal
 */
public class EmployeeBuilder {

    private String newLastName;
    private String newMiddleName;
    private String newFirstName;
    private long newId;
    private int newBirthYear;
    private int newBirthMonth;
    private int newBirthDate;
    private int newHireYear;
    private int newHireMonth;
    private int newHireDate;

    /**
     * Utilizamos este constructor con los atributos que queremos que sean obligatorios y comunes a todos los empleados.
     * @param newId
     * @param newFirstName
     */
    public EmployeeBuilder(final long newId, final String newFirstName) {
        this.newId = newId;
        this.newFirstName = newFirstName;
    }

    /**
     * Método para poner el atributo NewLastName.
     * @param newLastName
     * @return nos devuelve el atributo de tipo EmployeeBuilder.
     */
    public EmployeeBuilder setNewLastName(String newLastName) {
        this.newLastName = newLastName;
        return this;
    }

    /**
     *
     * @param newMiddleName
     * @return nos devuelve el atributo de tipo EmployeeBuilder.
     */
    public EmployeeBuilder setNewMiddleName(String newMiddleName) {
        this.newMiddleName = newMiddleName;
        return this;
    }

    /**
     *
     * @param newBirthYear
     * @return nos devuelve el atributo de tipo EmployeeBuilder.
     */
    public EmployeeBuilder setNewBirthYear(int newBirthYear) {
        this.newBirthYear = newBirthYear;
        return this;
    }

    /**
     *
     * @param newBirthMonth
     * @return nos devuelve el atributo de tipo EmployeeBuilder.
     */
    public EmployeeBuilder setNewBirthMonth(int newBirthMonth) {
        this.newBirthMonth = newBirthMonth;
        return this;
    }

    /**
     *
     * @param newBirthDate
     * @return nos devuelve el atributo de tipo EmployeeBuilder.
     */
    public EmployeeBuilder setNewBirthDate(int newBirthDate) {
        this.newBirthDate = newBirthDate;
        return this;
    }

    /**
     *
     * @param newHireYear
     * @return nos devuelve el atributo de tipo EmployeeBuilder.
     */
    public EmployeeBuilder setNewHireYear(int newHireYear) {
        this.newHireYear = newHireYear;
        return this;
    }

    /**
     *
     * @param newHireMonth
     * @return nos devuelve el atributo de tipo EmployeeBuilder.
     */
    public EmployeeBuilder setNewHireMonth(int newHireMonth) {
        this.newHireMonth = newHireMonth;
        return this;
    }

    /**
     *
     * @param newHireDate
     * @return nos devuelve el atributo de tipo EmployeeBuilder.
     */
    public EmployeeBuilder setNewHireDate(int newHireDate) {
        this.newHireDate = newHireDate;
        return this;
    }

    /**
     * Método que nos devuelve el Empleado creado.
     * @return
     */
    public Employee createEmployee() {
        return new Employee(newLastName, newMiddleName, newFirstName, newId, newBirthYear, newBirthMonth, newBirthDate, newHireYear, newHireMonth, newHireDate);
    }

}
