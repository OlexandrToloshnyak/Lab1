package com.company.camera;

import java.util.Objects;

public class Camera_module {
    /**
     * Клас в якому міститься інформація про модуль основної камери пристрою
     */
    private int Camera_id;
    private String Name;
    private String Type_of_lens;
    private String Producer;

    public static class Builder{
        private Camera_module newCamera;

        public Builder(){
            newCamera = new Camera_module();
        }
        public Builder withCamera_id(int id){
            newCamera.Camera_id = id;
            return this;
        }
        public Builder withName(String Name){
            newCamera.Name = Name;
            return this;
        }
        public Builder withType_of_lens(String Type){
            newCamera.Type_of_lens = Type;
            return this;
        }
        public Builder withProducer(String Producer){
            newCamera.Producer = Producer;
            return this;
        }
        public Camera_module build(){
            return newCamera;
        }
    }

    @Override
    public String toString() {
        return "Camera:" + "\n" +
                "Camera_id:" + Camera_id + "\n" +
                "Module:" + Producer + " " +
                Name + "\n" +
                "Lense:" + Type_of_lens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camera_module that = (Camera_module) o;
        return Camera_id == that.Camera_id &&
                Name.equals(that.Name) &&
                Type_of_lens.equals(that.Type_of_lens) &&
                Producer.equals(that.Producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Camera_id, Name, Type_of_lens, Producer);
    }
}
