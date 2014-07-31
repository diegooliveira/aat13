package edu.builder.data;

import java.util.Date;

public class User {

    private final int id;
    private final Date inicio;
    private final String name;
    private final String email;
    private final User source;

    private Date fim;

    private User(int id, Date inicio, String nome, String email, User source, Date fim) {
        this.id = id;
        this.inicio = inicio;
        this.name = nome;
        this.email = email;
        this.source = source;
        this.fim = fim;
    }

    UserBuilder edit() {
        this.fim = new Date();
        UserBuilder ub = new UserBuilder(this);
        ub.withDataInicio(this.fim);
        return ub;
    }

    static UserBuilder create() {
        return new UserBuilder();
    }

    public static class UserBuilder {

        private String name, email;
        private Date inicio, fim;
        private User source;

        private UserBuilder(User source) {
            this.name = source.name;
            this.source = source;
        }

        private UserBuilder() {
        }

        private void withDataInicio(Date fim) {

        }

        UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        User build() {
            if (source == null) {
                return new User(100, inicio, name, email, source, fim);
            } else {
                //Valida se mudou algum campo...
                if (source.email == email && source.name == name) {
                    return source;
                } else {
                    return new User(source.id, inicio, name, email, source, fim);
                }

            }
        }

    }

}
