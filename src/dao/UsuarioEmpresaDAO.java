package dao;

import connection.Conexao;
import entity.UsuarioEmpresa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioEmpresaDAO {

    public void associarUsuarioEmpresa(UsuarioEmpresa usuarioempresa){
        String sql = "INSERT INTO USUARIO_EMPRESA (USUARIO_ID, EMPRESA_ID) VALUES (?, ?)";

        PreparedStatement ps = null; // preparedstatement executa funcoes referente ao banco sql

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, usuarioempresa.getUsuario_id());
            ps.setInt(2, usuarioempresa.getEmpresa_id());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
