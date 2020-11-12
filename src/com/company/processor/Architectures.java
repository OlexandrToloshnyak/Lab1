package com.company.processor;

import java.util.Objects;

public class Architectures {
    /**
     * Клас в якому міститься інформація про архітектуру центрального процесора
     */
    private int Architectures_id;
    private String Name;
    private Architectures_types Type;

    @Override
    public String toString() {
        return "Architectures{" +
                "Architectures_id=" + Architectures_id +
                ", Name='" + Name + '\'' +
                ", Type=" + Type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Architectures that = (Architectures) o;
        return Architectures_id == that.Architectures_id &&
                Name.equals(that.Name) &&
                Type == that.Type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Architectures_id, Name, Type);
    }
}
