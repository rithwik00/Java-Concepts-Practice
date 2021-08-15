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

    {
        System.out.println("Second INIT");
    }

    public static void main(String[] args) {
        Init i = new Init(4);
        i.getClass();
    }
}
