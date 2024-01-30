package HardwareStore;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Store {

    private static LaptopClass filtrLaptop = new LaptopClass(null, 0, 0, null, null, null); // Создаем экземляр для
                                                                                            // наполнения его
                                                                                            // праметрами, который
                                                                                            // выбрал пользователь

    public static void main(String[] args) {

        LaptopClass laptopOne = new LaptopClass("Honor1", 4, 500, "Windows10", "Black", "AMD Radeon");
        LaptopClass laptopTwo = new LaptopClass("Honor2", 8, 1000, "Windows11", "White", "Nvidia GeForce");
        LaptopClass laptopThree = new LaptopClass("asser1", 12, 1000, "Linux", "Blue", "Nvidia GeForce");
        LaptopClass laptopFour = new LaptopClass("asser2", 6, 1250, "Windows10", "White", "Nvidia GeForce");
        LaptopClass laptopFive = new LaptopClass("asus1", 6, 1500, "Windows11", "Black", "AMD Radeon");
        LaptopClass laptopSix = new LaptopClass("asus2", 16, 1250, "Linux", "Black", "AMD Radeon");
        LaptopClass laptopSeven = new LaptopClass("macBook1", 16, 500, "MacOS", "White", "Apple M1");
        LaptopClass laptopEight = new LaptopClass("macBook2", 8, 250, "MacOS", "Blue", "Apple M1");

        Set<LaptopClass> laptops = new HashSet<>(
                Arrays.asList(laptopOne, laptopTwo, laptopThree, laptopFour, laptopFive, laptopSix, laptopSeven,
                        laptopEight));
        filter(laptops);

    }

    // Создаю метод для выбора параметров пользователм и добаления данных параметров
    // в экземпляр
    public static void filter(Set<LaptopClass> laptops) {
        parameters();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        boolean delParametrs = true;
        while (delParametrs == true) {
            switch (command) {
                case "1":
                    System.out.println("Введите объем оперативной памяти");
                    int ramGB = Integer.valueOf(scanner.nextLine());
                    filtrLaptop.setRam(ramGB);
                    System.out.println(filtrLaptop);
                    System.out.println("Выберите следующий параметр или выведите результат поиска (цифра 9)");
                    command = scanner.nextLine();
                    break;
                case "2":
                    System.err.println("Введите объем жесткого диска");
                    int harddiskGB = Integer.valueOf(scanner.nextLine());
                    filtrLaptop.setHarddisk(harddiskGB);
                    System.out.println(filtrLaptop);
                    System.out.println("Выберите следующий параметр или выведите результат поиска (цифра 9)");
                    command = scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Введите название операционной системы (Windows10, Windows11, Linux, MacOS)");
                    String operSystem = scanner.nextLine();
                    filtrLaptop.setOS(operSystem);
                    System.out.println(filtrLaptop);
                    System.out.println("Выберите следующий параметр или выведите результат поиска (цифра 9)");
                    command = scanner.nextLine();
                    break;
                case "4":
                    System.out.println("Введите желаемы цвет корпуса (Black, White, Blue)");
                    String colorPalitr = scanner.nextLine();
                    filtrLaptop.setColor(colorPalitr);
                    System.out.println(filtrLaptop);
                    System.out.println("Выберите следующий параметр или выведите результат поиска (цифра 9)");
                    command = scanner.nextLine();
                    break;
                case "5":
                    System.out.println("Введите модель видеокарты (AMD Radeon, Nvidia GeForce, Apple M1)");
                    String videoCardModel = scanner.nextLine();
                    filtrLaptop.setVideoCard(videoCardModel);
                    System.out.println(filtrLaptop);
                    System.out.println("Выберите следующий параметр или выведите результат поиска (цифра 9)");
                    command = scanner.nextLine();
                case "6":
                    TheWholeRange(laptops);
                    System.out.println("Выберите следующий параметр или выведите результат поиска (цифра 9)");
                    command = scanner.nextLine();
                    break;
                case "7":
                    filtrLaptop.setRam(0);
                    filtrLaptop.setHarddisk(0);
                    filtrLaptop.setOS(null);
                    filtrLaptop.setColor(null);
                    filtrLaptop.setVideoCard(null);
                    System.out.println(filtrLaptop);
                    System.out.println("Выберите следующий параметр или выведите результат поиска (цифра 9)");
                    command = scanner.nextLine();
                    break;
                case "8":
                    parameters();
                    command = scanner.nextLine();
                case "9":
                    delParametrs = false;
                    break;
                default:
                    System.err.println("Введен некорректный параметр, пожалуйста повторите попытку");
                    command = scanner.nextLine();
                    break;
            }
        }
        scanner.close();
        System.out.println(filtrLaptop);
        laptopTheFilter(laptops);

    }

    // Добавляю метод для проверки параметров по фильтру
    public static void laptopTheFilter(Set<LaptopClass> laptops) {
        Set<LaptopClass> result = new HashSet<>();
        for (LaptopClass laptop : laptops) {
            if (filtrLaptop.getRam() <= laptop.getRam() || filtrLaptop.getRam() == 0) {
                if (filtrLaptop.getHarddisk() <= laptop.getHarddisk() || filtrLaptop.getHarddisk() == 0) {
                    if (filtrLaptop.getOS().equals(laptop.getOS()) || filtrLaptop.getOS().equals("null")) {
                        if (filtrLaptop.getColor().equals(laptop.getColor()) || filtrLaptop.getColor().equals("null")) {
                            if (filtrLaptop.getVideoCard().equals(laptop.getVideoCard())
                                    || filtrLaptop.getVideoCard().equals("null")) {
                                result.add(laptop);
                            }
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("По выбранным параметрам ноутбук отсутствует");
        } else {
            System.out.println("По вашим параметрам найдены следующие ноутбуки");
            TheWholeRange(result);
        }
        System.out.println("Надеюсь мы смогли Вам помочь с поиском");
    }

    // Создаю метод для вывода параметров
    public static void parameters() {
        System.out.println(
                "Если Вам необходим нооутбук с конкретными параметрами, то пожалуйста выберите цифру, соответсвующего параметра:");
        System.out.println("1) Объем оперативной памяти");
        System.out.println("2) Объем жесткого диска");
        System.out.println("3) Операционная система");
        System.out.println("4) Цвет корпуса ");
        System.out.println("5) Модель видеокарты");
        System.out.println("6) Показать весь ассортимент");
        System.out.println("7) Сбросить парамтеры");
        System.out.println("8) Посмотреть инструкцию");
        System.out.println("9) Выввести результат");
    }

    // Создаю метод для вывода всех имеющихся товаров
    public static void TheWholeRange(Set<LaptopClass> laptops) {
        System.out.println("Представляем Вашему вниманию весь ассортимент нашего товара: ");
        System.out.println();
        for (LaptopClass laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
