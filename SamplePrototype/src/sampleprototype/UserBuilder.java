package sampleprototype;

class UserBuilder {

    private final User sample;

    UserBuilder(User sample) {
        this.sample = sample;
    }

    User build() {
        return sample.clone();
    }
}
