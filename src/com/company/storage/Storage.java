package com.company.storage;

import java.util.Objects;

public class Storage {
    private int Storage_Id;
    private Storage_types Type;
    private int Size_Gb;
    private int Reading_speed;
    private int Writting_speed;

    @Override
    public String toString() {
        return "Storage{" +
                "Storage_Id=" + Storage_Id +
                ", Type=" + Type +
                ", Size_Gb=" + Size_Gb +
                ", Reading_speed=" + Reading_speed +
                ", Writting_speed=" + Writting_speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Storage_Id == storage.Storage_Id &&
                Size_Gb == storage.Size_Gb &&
                Reading_speed == storage.Reading_speed &&
                Writting_speed == storage.Writting_speed &&
                Type == storage.Type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Storage_Id, Type, Size_Gb, Reading_speed, Writting_speed);
    }
}
