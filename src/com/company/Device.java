package com.company;
import com.company.processor.Processors;
import com.company.processor.GPU;
import com.company.display.Display;
import com.company.storage.Storage;
import com.company.os.Operating_systems;
import com.company.camera.Camera_module;

import java.util.Objects;

public class Device {
    /**
     * Основний клас який звязує всі комплектуючі девайсу
     */
    private int Device_id;
    private String Name;
    private Type type;
    private Processors Processor;
    private GPU gpu;
    private Display display;
    private Storage storage;
    private Operating_systems OS;
    private Camera_module Camera;
    private int RAM;
    private String Dust_and_wet_protection;

    @Override
    public String toString() {
        return "Device{" +
                "Device_id=" + Device_id +
                ", Name='" + Name + '\'' +
                ", type=" + type +
                ", Processor=" + Processor +
                ", gpu=" + gpu +
                ", display=" + display +
                ", storage=" + storage +
                ", OS=" + OS +
                ", Camera=" + Camera +
                ", RAM=" + RAM +
                ", Dust_and_wet_protection='" + Dust_and_wet_protection + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Device_id == device.Device_id &&
                RAM == device.RAM &&
                Name.equals(device.Name) &&
                type.equals(device.type) &&
                Processor.equals(device.Processor) &&
                gpu.equals(device.gpu) &&
                display.equals(device.display) &&
                storage.equals(device.storage) &&
                Objects.equals(OS, device.OS) &&
                Objects.equals(Camera, device.Camera) &&
                Objects.equals(Dust_and_wet_protection, device.Dust_and_wet_protection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Device_id, Name, type, Processor, gpu, display, storage, OS, Camera, RAM, Dust_and_wet_protection);
    }
}
