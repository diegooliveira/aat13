package br.com.globalcode.facade;

import br.com.globalcode.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe deve ser utilizada para implementação do acesso ao banco de dados
 */
public class JDBCFacade {

    private final static JDBCFacade instance = new JDBCFacade();

    private JDBCFacade() {
    }

    public static JDBCFacade getInstance() {
        return instance;
    }

    //implementar este método
    public List<Produto> lerProdutos() {
        List<Produto> produtos = new ArrayList<Produto>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://academias:3306/aw", "aw", "aw");
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select * from produtos order by 'id'");
                while (rs.next()) {
                    produtos.add(new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("preco"), rs.getString("marca")));
                }
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produtos;
    }

    //implementar este método
    public void salvarProduto(Produto p) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://academias:3306/aw", "aw", "aw");

                String sql;
                if (p.getId() == 0) {
                    sql = "insert into produtos ( nome, preco, marca ) values ( ?, ?, ? )";
                } else {
                    sql = "update produtos set nome = ?, preco = ?, marca = ? where id = ?";
                }

                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, p.getNome());
                st.setDouble(2, p.getPreco());
                st.setString(3, p.getMarca());
                if (p.getId() != 0) {
                    st.setInt(4, p.getId());
                }
                st.execute();
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
