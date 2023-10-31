package programme_21_abstractexample;

//In a real scenario, method is called by programme or user
 class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Circle1(); //In a real scenario, object is provided through method, e.g. get shape()method
        s.draw();
    }
}
