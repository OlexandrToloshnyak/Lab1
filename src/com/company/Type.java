package com.company;

import java.util.Objects;

public class Type {
    /**
     * Клас який описує тип девайсу
     */
    private int Type_id;
    private String Description;

    @Override
    public String toString() {
        return "Type{" +
                "Type_id=" + Type_id +
                ", Description='" + Description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Type_id == type.Type_id &&
                Description.equals(type.Description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Type_id, Description);
    }
}
