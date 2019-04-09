package lesson14.task02userlocaleclass;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("name", "pass");
        user1.createQuery();

        User user2 = new User("name2", "pass2") {
            @Override
            public void createQuery() {
                System.out.println("-----------------------------------");
                super.createQuery();
                System.out.println("-----------------------------------");
            }
        };
        user2.createQuery();
    }
}
