public class ArithmeticClass {

    public Integer addNumber(Integer a, Integer b){
        Integer sum = a + b;
        return sum;
    }

    public Integer substractNumbers(Integer c, Integer d){
        Integer sub = c - d;
        return sub;
    }

    public Integer multiplyNumbers(Integer e, Integer f, Integer g, Integer h){
        Integer mul = e * f * g * h;
        return mul;
    }

    public Integer divisionNumbers(Integer i, Integer j) {
        Integer div = i / j;
        return div;
    }

    public Integer moduloNumbers(Integer k, Integer l) {
        Integer mod = k % l;
        return mod;
    }

    public static void main(String[] args){
        ArithmeticClass am = new ArithmeticClass();
        int sum =am.addNumber(10,20);
        System.out.println("10 + 20 = "+ sum);
        int sub =am.substractNumbers(10, 5);
        System.out.println("10 - 5 = "+ sub);
        int mul =am.multiplyNumbers(2, 3, 4, 2);
        System.out.println("2 * 3 * 4 * 2 = "+ mul);
        int div =am.divisionNumbers(4, 2);
        System.out.println("4 / 2 = "+ div);
        int mod =am.moduloNumbers(7, 2);
        System.out.println("7 / 2 = 3, remainder "+ mod);
    }
//push, then clone - 1st assignment
}

