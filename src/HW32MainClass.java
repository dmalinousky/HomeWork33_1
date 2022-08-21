import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HW32MainClass {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Task 1
        Car car1 = new Car("Bentley Continental", 2020, 250000, "green", 6.0);
        Car car2 = new Car("Mercedes GLS", 2015, 60000, "black", 3.0);
        Car car3 = new Car("Alfa-Romeo Brera", 2010, 20000, "grey", 2.0);
        Car car4 = new Car("Acura NSX", 1990, 100000, "grey", 2.5);
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        // 1.1
        System.out.println("#1");
        carArrayList.stream().forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 1.2
        System.out.println("#2");
        System.out.println("Provide a colour you want to find:");
        String userColour = reader.readLine();
        carArrayList.stream().filter(x -> x.getColour().equals(userColour)).forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 1.3
        System.out.println("#3");
        System.out.println("Provide a capacity you want to find:");
        double userCapacity = Double.parseDouble(reader.readLine());
        carArrayList.stream().filter(x -> x.getEngineCapacity() == userCapacity).forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 1.4
        System.out.println("#4");
        System.out.println("Provide min price:");
        double userPrice = Double.parseDouble(reader.readLine());
        carArrayList.stream().filter(x -> x.getPrice() >= userPrice).forEach(x -> System.out.println(x.toString()));
        System.out.println();

        // 1.5
        System.out.println("#5");
        System.out.println("Provide min year:");
        int userMinYear = Integer.parseInt(reader.readLine());
        System.out.println("Provide max year:");
        int userMaxYear = Integer.parseInt(reader.readLine());
        carArrayList.stream().filter(x -> x.getYearOfProduction() >= userMinYear && x.getYearOfProduction() <= userMaxYear).forEach(x -> System.out.println(x.toString()));
    }
}
