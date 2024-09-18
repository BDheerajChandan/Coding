class Overload {
     void showdata(String name) {
        System.out.println("Name is " +name);
    }
    void showdata(int rollno) {
        System.out.println("RollNo." +rollno);
    }
    void showdata(float marks) {
        System.out.println("Marks:" +marks);
    }
    void showdata(double fee) {
        System.out.println("Fee" +fee);
    }
}
class Demo {
    public void main() {
        Overload test = new Overload();
        test.showdata("Ankur");
        test.showdata(12335);
        test.showdata(498.5);
        test.showdata(1200.50);
    }
}


