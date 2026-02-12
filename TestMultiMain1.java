public class TestMultiMain1 {
    public static void main(String[] args) {
        System.out.println ("This is first main");
        TestMultiMain1 obj = new TestMultiMain1();
        obj.main(5);
    }
    public void main(int args)
    {
        System.out.println ("This is second main");
    }
}
