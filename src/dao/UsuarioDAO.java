package dao;

import connection.Conexao;
import entity.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario){
        String sql = "INSERT INTO USUARIO (NOME, SOBRENOME, SENHA, EMAIL, TELEFONE, CARGO) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSobrenome());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getTelefone());
            ps.setString(6, usuario.getCargo());

            ps.execute();
            ps.close();

            System.out.println("Usuario cadastrado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarUsuario(Usuario usuario) {
        String sql = "UPDATE USUARIO SET NOME = ?, SOBRENOME = ?, SENHA = ?, EMAIL = ?, TELEFONE = ?, CARGO = ? WHERE ID = ?";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSobrenome());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getTelefone());
            ps.setString(6, usuario.getCargo());
            ps.setInt(7, usuario.getUsuario_id()); // Supondo que ID seja o identificador exclusivo do usuário

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Usuário atualizado com sucesso!");
            } else {
                System.out.println("Nenhum usuário foi atualizado. Verifique o ID do usuário.");
            }

            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        String sql = "SELECT * FROM USUARIO";

        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
             ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(resultSet.getInt("USUARIO_ID"));
                usuario.setNome(resultSet.getString("NOME"));
                usuario.setSobrenome(resultSet.getString("SOBRENOME"));
                usuario.setSenha(resultSet.getString("SENHA"));
                usuario.setEmail(resultSet.getString("EMAIL"));
                usuario.setTelefone(resultSet.getString("TELEFONE"));
                usuario.setCargo(resultSet.getString("CARGO"));

                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao listar usuários: " + e.getMessage());
        }

        return usuarios;
    }

    public void deletarUsuario(Usuario usuario) {
        String sql = "DELETE FROM USUARIO WHERE USUARIO_ID = ?";

        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setInt(1, usuario.getUsuario_id()); // Supondo que o ID seja o identificador exclusivo do usuário

            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Usuário excluído com sucesso!");
            } else {
                System.out.println("Nenhum usuário foi excluído. Verifique o ID do usuário.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir o usuário: " + e.getMessage());
        }
    }


}
