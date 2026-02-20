class GCExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called");
    }

    public static void main(String[] args) {

        GCExample obj1 = new GCExample();
        GCExample obj2 = new GCExample();

        obj1 = null;
        obj2 = null;

        System.gc();   // Requesting garbage collection
    }
}