package java_lecture.Optional;

import java.util.Optional;

/**
 * Optional flatMap() - 중첩 Optional 평탄화
 *
 * 핵심 아이디어: Optional을 반환하는 함수에 사용
 */
public class OptionalFlatMap {

    static class User {
        private String name;
        private Address address;

        public User(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public Optional<Address> getAddress() {
            return Optional.ofNullable(address);
        }
    }

    static class Address {
        private String city;

        public Address(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Alice", new Address("Seoul"));
        User user2 = new User("Bob", null);

        // map 사용 시 문제: Optional<Optional<Address>>
        Optional<User> optUser1 = Optional.of(user1);
        // Optional<Optional<Address>> nested = optUser1.map(User::getAddress);

        // flatMap으로 평탄화: Optional<Address>
        Optional<Address> address1 = optUser1.flatMap(User::getAddress);
        System.out.println("address1: " + address1); // Optional[Address@...]

        // 체이닝으로 city 추출
        String city1 = optUser1
                .flatMap(User::getAddress)
                .map(Address::getCity)
                .orElse("도시 정보 없음");
        System.out.println("city1: " + city1); // Seoul

        // address가 null인 경우
        Optional<User> optUser2 = Optional.of(user2);
        String city2 = optUser2
                .flatMap(User::getAddress)
                .map(Address::getCity)
                .orElse("도시 정보 없음");
        System.out.println("city2: " + city2); // 도시 정보 없음
    }
}

