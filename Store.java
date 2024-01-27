package HardwareStore;

public class Store {
    public static void main(String[] args) {
        LaptopClass honor1 = new LaptopClass(4, 500, "Windows10", "Black", "AMD Radeon");
        LaptopClass honor2 = new LaptopClass(8, 1000, "Windows11", "White", "Nvidia GeForce");
        LaptopClass asser1 = new LaptopClass(12, 1000, "Linux", "Blue", "Nvidia GeForce");
        LaptopClass asser2 = new LaptopClass(6, 1250, "Windows10", "White", "Nvidia GeForce");
        LaptopClass asus1 = new LaptopClass(6, 1500, "Windows11", "Black", "AMD Radeon");
        LaptopClass asus2 = new LaptopClass(16, 1250, "Linux", "Black", "AMD Radeon");
        LaptopClass macBook1 = new LaptopClass(16, 500, "MacOS", "White", "Apple M1");
        LaptopClass macBook2 = new LaptopClass(8, 250, "MacOS", "Blue", "Apple M1");
    }
}
