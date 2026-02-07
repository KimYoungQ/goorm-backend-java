package java_lecture.Optional;

import java.util.Optional;

public class Optional_nested {
    static class User {
        private Address address;

        public User(Address address) {
            this.address = address;
        }

        public Optional<Address> getAddress() {
            return Optional.ofNullable(address);
        }
    }

    static class Address {
        private String zipCode;

        public Address(String number) {
            this.zipCode = number;
        }

        public Optional<String> getZipCode() {
            return Optional.ofNullable(zipCode);
        }
    }

    private static String getString(User user) {
        String name = Optional.ofNullable(user)
                .flatMap(User::getAddress)
                .flatMap(Address::getZipCode)
                .orElse("우편번호 없음");
        return name;
    }

    public static void main(String[] args) {
        User user1 = new User(new Address("12345"));
        User user2 = new User(new Address(null));
        User user3 = new User(null);

        System.out.println(getString(user1));
        System.out.println(getString(user2));
        System.out.println(getString(user3));
    }
}
