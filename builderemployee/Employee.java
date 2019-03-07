package builderemployee;

/**
 *
 * @author finfanterodal
 */
public class Employee {

    //Atributos de mi clase
    private String lastName;
    private String middleName;
    private String firstName;
    private long id;
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private int hireYear;
    private int hireMonth;
    private int hireDate;
    
    /**
     *Constructor de mi clase con todos los atributos.
     * @param newLastName
     * @param newMiddleName
     * @param newFirstName
     * @param newId
     * @param newBirthYear
     * @param newBirthMonth
     * @param newBirthDate
     * @param newHireYear
     * @param newHireMonth
     * @param newHireDate
     */
    public Employee(
            final String newLastName,
            final String newMiddleName,
            final String newFirstName,
            final long newId,
            final int newBirthYear,
            final int newBirthMonth,
            final int newBirthDate,
            final int newHireYear,
            final int newHireMonth,
            final int newHireDate) {
        this.lastName = newLastName;
        this.middleName = newMiddleName;
        this.firstName = newFirstName;
        this.id = newId;
        this.birthYear = newBirthYear;
        this.birthMonth = newBirthMonth;
        this.birthDate = newBirthDate;
        this.hireYear = newHireYear;
        this.hireMonth = newHireMonth;
        this.hireDate = newHireDate;
    }
}
