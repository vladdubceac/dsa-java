package dynamic_programming.convert_string;

public class Main {
    public static void main(String[] args) {
        ConvertOneStringToAnother c = new ConvertOneStringToAnother();
       int result = c.findMinOperationsTD("catch","carch");
        System.out.println(result);
        result = c.findMinOperationsTD("table","tbres");
        System.out.println(result);
        result = c.findMinOperationsTD_2("catch","carch");
        System.out.println(result);
        result = c.findMinOperationsTD_2("table","tbres");
        System.out.println(result);
    }
}
