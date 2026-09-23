public class test {
    public static void main(String[] args) {
        test1();
        test2();
    }
    public static void test1() {
        long n1=Long.MAX_VALUE;
        System.out.println(n1+" "+(n1+1));
    }
    public static void test2() {
        double nd = 0.0;
        float nf = 0.0F;
        System.out.println("0.1*100:"+0.1F*100);
        for (int i=0;i<100;i++) {
            nd += 0.01;
            nf += 0.01F;
        }
        System.out.println("0.1相加100次（Double/Float): "+ nd +" "+ nf);
    }
}
