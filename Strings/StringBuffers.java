package Strings;
class StringBuffers {
    public static void main(String args[]) throws Exception{
        StringBuffer s = new StringBuffer("GeeksforGeeks");
        int p = s.length();
        int q = s.capacity();
        System.out.println("length: " + p + " capacity: " + q);

        s.append("Test");
        System.out.println("append: " + s);

        s.insert(4, "Hello"); // can insert any datatype as string
        System.out.println("insert: " + s);

        s.reverse();
        System.out.println("reversed: " + s);

        ///////////////////////////////////////////////////
        System.out.println(System.identityHashCode(s));
        s = new StringBuffer("GeeksforGeekssdf");
        System.out.println(System.identityHashCode(s));
        ///////////////////////////////////////////////////

        s.delete(p , s.length());
        System.out.println("delete: " + s);

        s.deleteCharAt(p - 1);
        System.out.println("deleted character: " + s);

        s.append('s');
        System.out.println(s);
        
        s.replace(5, 8, "str");
        System.out.println("replace: " + s);

        System.out.println("Before Ensure capacity used "+ s.capacity());
        s.ensureCapacity(45);
        System.out.println("Ensure Capacity used: " + s.capacity());

        s.appendCodePoint(43);
        System.out.println("After appending CodePoint " + s);

        System.out.println("Unicode of last char: " + s.codePointAt(s.length()-1));

        System.out.println("codePointCount method: " + s.codePointCount(9, 13));

        System.out.println("indexOf method type 1: " + s.indexOf("e"));
        System.out.println("indexOf Method type 2: " + s.indexOf("ee", 5));

        System.out.println("LastindexOf also has two types same as above: " + s.lastIndexOf("e"));

        System.out.println("Many more functions at: https://www.geeksforgeeks.org/stringbuffer-class-in-java/");
    }
}
