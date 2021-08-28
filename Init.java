class Avaai {
    static {
        System.out.println("SIB from other class when instantiated");
    }
}

class Init {
    {
        System.out.println("First INIT");
    }

    Init() {
        System.out.println("Inside default constructor");
    }

    Init(int x) {
        this();
        System.out.println("Inside one parameter constructor");
    }

    static {
        System.out.println("SIB called before main method");
    }

    public static void main(String[] args) {
        Init i = new Init(4);
        Avaai avaai = new Avaai();
        // i.getClass();
    }
}
