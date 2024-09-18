class passvalue {
    void changevalue(String value) {
        System.out.println("Original value =" +value);
        value="Super6";
    }
}
class makingpass{
    public void main() {
        passvalue address = new passvalue();
        String name="world cup";
        address.changevalue(name);
        System.out.println("Original value=" +name);
    }
}

