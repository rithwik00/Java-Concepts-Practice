class Addition {
  int sum = 0;
  public int addTwoInt(int a, int b){
      sum = a + b;
      return sum;
  }  
}

class Add {
    public static void main(String[] args) {
        Addition add = new Addition();
        int s = add.addTwoInt(2, 3);
        System.out.println(s);
    }
}