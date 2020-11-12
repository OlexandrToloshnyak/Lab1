package com.company.processor;

import java.util.Objects;

public class Processors {
    /**
     * Клас в якому міститься інформація про центральний процесор дивайсу
     */
    private int Processor_id;
    private String Name;
    private Architectures Architecture;
    private GPU Gpu;
    private String Producer;
    private int Cores;
    private float Frequency;

    @Override
    public String toString() {
        return "Processors{" +
                "Processor_id=" + Processor_id +
                ", Name='" + Name + '\'' +
                ", Architecture=" + Architecture +
                ", Gpu=" + Gpu +
                ", Producer='" + Producer + '\'' +
                ", Cores=" + Cores +
                ", Frequency=" + Frequency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processors that = (Processors) o;
        return Processor_id == that.Processor_id &&
                Cores == that.Cores &&
                Float.compare(that.Frequency, Frequency) == 0 &&
                Name.equals(that.Name) &&
                Architecture.equals(that.Architecture) &&
                Objects.equals(Gpu, that.Gpu) &&
                Producer.equals(that.Producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Processor_id, Name, Architecture, Gpu, Producer, Cores, Frequency);
    }
}
