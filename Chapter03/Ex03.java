class Ex03 {
    float value;

    Ex03(float value) {
        this.value = value;
    }
    
    static void changeValue(Ex03 ex) {
        ex.value = 8f;
    }

    public static void main(String... args) {
        Ex03 ex = new Ex03(3f);
        changeValue(ex);
        System.out.println(ex.value);
    }
}
