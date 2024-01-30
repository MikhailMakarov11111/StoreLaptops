package HardwareStore;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Store {
    public static void main(String[] args) {
        
        LaptopClass laptopOne = new LaptopClass("Honor1", 4, 500, "Windows10", "Black", "AMD Radeon");
        LaptopClass laptopTwo = new LaptopClass("Honor2", 8, 1000, "Windows11", "White", "Nvidia GeForce");
        LaptopClass laptopThree = new LaptopClass("asser1", 12, 1000, "Linux", "Blue", "Nvidia GeForce");
        LaptopClass laptopFour = new LaptopClass("asser2", 6, 1250, "Windows10", "White", "Nvidia GeForce");
        LaptopClass laptopFive = new LaptopClass("asus1", 6, 1500, "Windows11", "Black", "AMD Radeon");
        LaptopClass laptopSix = new LaptopClass("asus2", 16, 1250, "Linux", "Black", "AMD Radeon");
        LaptopClass laptopSeven = new LaptopClass("macBook1", 16, 500, "MacOS", "White", "Apple M1");
        LaptopClass laptopEight = new LaptopClass("macBook2", 8, 250, "MacOS", "Blue", "Apple M1");

        Set<LaptopClass> laptops = new HashSet<>(Arrays.asList(laptopOne, laptopTwo, laptopThree, laptopFour, laptopFive, laptopSix, laptopSeven,
        laptopEight));

        
    }


}
