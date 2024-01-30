package HardwareStore;

import java.util.Objects;

public class LaptopClass {

    private String name;
    private int ram;
    private int harddisk;
    private String OS;
    private String color;
    private String videoCard;
    private LaptopClass o;

    public LaptopClass(String name, int ram, int harddisk, String OS, String color, String videoCard) {
        this.name = name;
        this.ram = ram;
        this.harddisk = harddisk;
        this.OS = OS;
        this.color = color;
        this.videoCard = videoCard;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getHarddisk() {
        return harddisk;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHarddisk(int harddisk) {
        this.harddisk = harddisk;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Наименование ноутбука: " + name + 
                "\n Объем опретивной памяти: " + ram +
                "\n Объем жесткого диска: " + harddisk + 
                "\n Операционная система: " + OS +
                "\n Цвет корпуса: " + color +
                "\n Модель видеокарты: " + videoCard;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        LaptopClass laptop = (LaptopClass) obj;
        return Objects.equals(name, laptop.name) && ram == laptop.ram && harddisk == laptop.harddisk
                && Objects.equals(OS, laptop.OS) && Objects.equals(color, laptop.color)
                && Objects.equals(videoCard, laptop.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ram, harddisk, OS, color, videoCard);
    }
}
