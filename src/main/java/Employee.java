/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * Name of the employee.
     */
    private String name;

    /**
     * Direct supervisor / manager of the employee.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param setName name of the employee
     * @param setManager the direct manager of the employee
     */
    public Employee(final String setName, final String setManager) {
        this.name = setName;
        this.manager = setManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param setName name to be set
     */
    public void setName(final String setName) {
        this.name = setName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param setManager manager to be set
     */
    public void setManager(final String setManager) {
        this.manager = setManager;
    }
}
