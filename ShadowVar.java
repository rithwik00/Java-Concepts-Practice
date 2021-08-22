public class ShadowVar {
    static int x = 10;
 
    int y = 20;
 
    void methodOne(int x, int y) {
        //accessing hidden static variable using class name
 
        System.out.println(ShadowVar.x);   //output : 10
 
        //accessing hidden non-static variable using this keyword.
 
        System.out.println(this.y);    //output : 20
    }
 
    public static void main(String[] args) {
        ShadowVar shadow = new ShadowVar();
        shadow.methodOne(30, 40);
    }
}