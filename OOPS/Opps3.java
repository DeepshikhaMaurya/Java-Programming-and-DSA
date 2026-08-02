package OOPS;

public class Opps3 {
        public static void main(String[] args) {
      Pen p1 = new Pen(); //created a pen object called p1
      p1.setColor("Bule");
      System.out.println(p1.getColor());
      p1.setTip(5);
      System.out.println(p1.getTip()); 
      //p1.setColor("Yellow");
      p1.setColor("Yellow");
      System.out.println(p1.getColor()); 
    }
}

class Pen {
    String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
          this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
