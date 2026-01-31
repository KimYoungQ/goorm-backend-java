package java_lecture.day15;

public class GameTest {
    public static void main(String[] args) {

        // 다형성: 인터페이스 타입으로 참조
        Movable[] movables = {
                Player.builder()
                        .name("전사")
                        .damage(50)
                        .build(),
                Monster.builder()
                        .type("슬라임")
                        .hp(100)
                        .build(),
                Player.builder()
                        .name("마법사")
                        .damage(70)
                        .build()
        };

        System.out.println("=== 게임 캐릭터 이동===");
        for (Movable m : movables) {
            m.move(10, 20);
        }

        System.out.println("\n=== 게임 캐릭터 공격 ===");
        Attackable[] attackables = {
                Player.builder()
                        .name("전사")
                        .damage(50)
                        .build(),
                Monster.builder()
                        .type("골렘")
                        .hp(200)
                        .build()
        };

        for (Attackable a : attackables) {
            a.attack("적");
        }
    }
}
