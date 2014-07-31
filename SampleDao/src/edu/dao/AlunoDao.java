package edu.dao;

import java.util.List;

public interface AlunoDao {

    PagedResult<Aluno> getAll();

    void forAll(AlunoConsumer consumer);

    public interface AlunoConsumer {

        void process(Aluno aluno);
    }

}
