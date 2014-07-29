package edu.decorator;

import javax.sql.DataSource;

public class LocalDatabaseReplicatedUserDataRetriever implements UserDataRetriever {

    private final DataSource ds;

    public LocalDatabaseReplicatedUserDataRetriever(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public UserData retrieve(int id) {

        return null;
    }

}
