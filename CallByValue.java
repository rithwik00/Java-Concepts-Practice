class CallByValue {
    public static void main(String args[]) {
        int i = 9;
        int j = 20;
        swap(i, j);
        System.out.println(i + " " + j);
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
        System.out.println("i = " + i + " j = " + j);
    }
}
