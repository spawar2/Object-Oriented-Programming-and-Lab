class Main {
  public static void main(String[] args) {
    Square s1 = new Square();
    s1.render();
  }
}

class Polygon {
  public void render() {
  }
}

class Square extends Polygon {
  public void render() {
    System.out.println("This is a Square...");
  }
}
