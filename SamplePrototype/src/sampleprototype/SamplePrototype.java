package sampleprototype;

public class SamplePrototype {

    public static void main(String[] args) {

        User perfectUser = loadFromRemote();
        UserBuilder builder = new UserBuilder(perfectUser);
        for (int i = 0; i < 100; i++) {
            System.out.println(builder.build());
        }

    }

    private static User loadFromRemote() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            throw new RuntimeException("Erro remoto", ex);
        }
        return new User();
    }

}
