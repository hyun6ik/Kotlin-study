package Lec10.java;

public interface JavaFlyAble {

    default void act() {
        System.out.println("파닥 파닥닥");
    }
}
