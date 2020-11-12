package com.company.processor;

import java.util.Objects;

public class GPU {
    /**
     * Клас в якому міститься інформація про графічний процесор дивайсу
     */
    private int GPU_id;
    private String Name;
    private GPU_types Type;
    private String Producer;
    private int Memory;
    private float Frequency;

    @Override
    public String toString() {
        return "GPU{" +
                "GPU_id=" + GPU_id +
                ", Name='" + Name + '\'' +
                ", Type=" + Type +
                ", Producer='" + Producer + '\'' +
                ", Memory=" + Memory +
                ", Frequency=" + Frequency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GPU gpu = (GPU) o;
        return GPU_id == gpu.GPU_id &&
                Memory == gpu.Memory &&
                Float.compare(gpu.Frequency, Frequency) == 0 &&
                Name.equals(gpu.Name) &&
                Type == gpu.Type &&
                Producer.equals(gpu.Producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GPU_id, Name, Type, Producer, Memory, Frequency);
    }
}
