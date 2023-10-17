package dao;

import connection.Conexao;
import entity.Empresa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpresaDao {

    public void cadastrarEmpresa(Empresa empresa){
        String sql = "INSERT INTO EMPRESA (NOME, ENDERECO) VALUES (?, ?)";

        PreparedStatement ps = null; // preparedstatement executa funcoes referente ao banco sql

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, empresa.getNome());
            ps.setString(2, empresa.getEndereco());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
