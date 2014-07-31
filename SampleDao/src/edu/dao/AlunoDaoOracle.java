package edu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class AlunoDaoOracle implements AlunoDao {

    @Override
    public void forAll(AlunoConsumer consumer) {
        try {
            final Connection conn = getConnection();
            ResultSet rs = null; // 
            while (rs.next()) {
                consumer.process(readFrom(rs));
            }
            //close
        } catch (SQLException ex) {
            throw new RuntimeException();
        }

    }

    @Override
    public PagedResult<Aluno> getAll() {
        final Connection conn = getConnection();
        return new PagedResult<Aluno>() {

            private ResultSet rs;

            @Override
            public Aluno next() {

                if (rs == null) {
                    //Vai no banco de verdade.
                }
                return readFrom(rs);
            }

            @Override
            public void close() {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    conn.close();
                } catch (SQLException ex) {
                    throw new RuntimeException();
                }
            }

            @Override
            public Iterator<Aluno> iterator() {
                return null;
            }
        };
    }

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Aluno readFrom(ResultSet rs) {
        try {
            if (rs.next()) {
                return new Aluno();
            }
            return null;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }

    }

}
