public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String A = "10";
        String B = "11";
        int intA = Integer.parseInt(A, 2);
        int intB = Integer.parseInt(B, 2);

        String binSum = bins.sum(A, B);
        int intSum = Integer.parseInt(binSum, 2);
        System.out.println(intA + " + " + intB + " = " + intSum);

        String binMult = bins.mult(A, B);
        int intMult = Integer.parseInt(binMult, 2);
        System.out.println(intA + " * " + intB + " = " + intMult);
    }
}