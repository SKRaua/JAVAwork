package XinYangZhouLab07;

/**
 * Representing a dog with a name.
 * 
 * @author Xinyang Zhou
 * @version 1.0
 */
public class Dog {

    /**
     * The name of this dog
     */
    private String name;

    /**
     * Constructs a dog with a default name.
     */
    public Dog() {
        this("");
    }

    /**
     * Constructs a dog with a name.
     * 
     * @param name The name of this dog
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * Returns the name of this dog.
     * 
     * @return The name of this dog
     */
    public String getName() {
        return this.name;
    }

    /**
     * Changes the name of this dog.
     * 
     * @param name The name of this dog
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Indicates if this dog is equal to some other object. If the other object
     * is not a dog, this dog is not equal to the other object. If the other
     * object is a dog and has the same name, this dog is equal to the other
     * object.
     * 
     * @param obj A reference to some other object
     * @return A boolean value specifying if this dog is equal to some other object
     */
    public boolean equals(Object obj) {
        // The specific object isn’t a dog.
        if (!(obj instanceof Dog)) {
            return false;
        }
        // The specific object is a dog.
        Dog other = (Dog) obj;
        return this.name.equals(other.name);
    }

    /**
     * Returns a string representation of this dog. The string consists of
     * - the type of this object
     * - the instance variable value(s) of this object.
     * 
     * @return A string representation of this dog
     */
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.name;
    }
}
