package Lec10.java;

public class JavaCat extends JavaAnimal{

    public JavaCat(String species, int legCount) {
        super(species, 4);
    }

    @Override
    public void move() {
        System.out.println("고양이는 사뿐사뿐 걸어갑니다.");
    }
}
