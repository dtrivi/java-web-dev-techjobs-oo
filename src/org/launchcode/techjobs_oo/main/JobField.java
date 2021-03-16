package org.launchcode.techjobs_oo.main;

import java.util.Objects;

public abstract class JobField {

    // Fields in common: id, nextId, value
    private int id;
    private static int nextId = 1;

    private String value;

    // Constructors in common: empty Object(), Object(String value)
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Getters & Setters in common: getId(), getValue(), setValue()
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Custom methods in common: equals(), toString(), hashCode()
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
