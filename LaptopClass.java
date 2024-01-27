package HardwareStore;

public class LaptopClass {
    
    private int ram;
    private int harddisk;
    private String OS;
    private String color;
    private String videoCard;

    public LaptopClass (int ram, int harddisk, String OS, String color, String videoCard) {
        this.ram = ram;
        this.harddisk = harddisk;
        this.OS = OS;
        this.color = color;
        this.videoCard = videoCard;
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
}
