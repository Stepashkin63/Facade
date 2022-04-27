public class BinOps {

    public String sum(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int sum = x + y;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int mult = x * y;
        return Integer.toBinaryString(mult);
    }
}