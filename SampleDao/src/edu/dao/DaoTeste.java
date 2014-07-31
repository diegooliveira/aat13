package edu.dao;

public class DaoTeste {

    public static void main(String[] args) {

        // Implementação Java 5
        AlunoDao dao = new AlunoDaoOracle();
        PagedResult<Aluno> all = dao.getAll();
        Aluno al = null;
        while ((al = all.next()) != null) {

        }
        all.close();

        // Implementação Java 7
        try (PagedResult<Aluno> all2 = dao.getAll()) {
            for (Aluno alunos : all2) {

            }
        }
        
        dao.forAll(new AlunoDao.AlunoConsumer(){
            public void process(Aluno al){
                System.out.println(al);
            }
        });
        

    }

}
