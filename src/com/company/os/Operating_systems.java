package com.company.os;

import java.util.Objects;

public class Operating_systems {
    /**
     * Клас в якому міститься інформація про операційну систему
     */
    private int OS_id;
    private String Name;
    private OS_types Type;
    private Accessibility accessibility;

    @Override
    public String toString() {
        return "Operating_systems{" +
                "OS_id=" + OS_id +
                ", Name='" + Name + '\'' +
                ", Type=" + Type +
                ", accessibility=" + accessibility +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operating_systems that = (Operating_systems) o;
        return OS_id == that.OS_id &&
                Name.equals(that.Name) &&
                Type == that.Type &&
                accessibility == that.accessibility;
    }

    @Override
    public int hashCode() {
        return Objects.hash(OS_id, Name, Type, accessibility);
    }
}
