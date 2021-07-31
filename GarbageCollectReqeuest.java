public class GarbageCollectReqeuest {
    public static void main(String[] args) throws Exception{
        GarbageCollectReqeuest g1 = new GarbageCollectReqeuest();
        GarbageCollectReqeuest g2 = new GarbageCollectReqeuest();
        
        g1 = null;
        System.gc();

        g2 = null;
        Runtime.getRuntime().gc();
    }

    @Override
    // finalize method is called on object once 
    // before garbage collecting it
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}
