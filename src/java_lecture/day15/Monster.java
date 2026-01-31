package java_lecture.day15;

import lombok.Builder;

public class Monster implements Movable, Attackable {
    private String type;
    private int hp;

    @Builder
    public Monster(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }

    @Override
    public void move(int x, int y) {
        System.out.println(type + "이(가) 배회 중...");
    }

    @Override
    public void stop() {
        System.out.println(type + " 대기");
    }

    @Override
    public void attack(String target) {
        System.out.println(type + "이(가)" + target + "을(를) 공격!");
    }

    @Override
    public int getDamage() {
        return  10;
    }
}
