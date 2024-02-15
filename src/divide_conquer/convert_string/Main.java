package divide_conquer.convert_string;

public class Main {
    public static void main(String[] args) {
        ConvertOneStringToAnother convertOneStringToAnother = new ConvertOneStringToAnother();
        int operationsNeeded = convertOneStringToAnother.findMinOperations("table","tbres");
        System.out.println(operationsNeeded);
    }
}
