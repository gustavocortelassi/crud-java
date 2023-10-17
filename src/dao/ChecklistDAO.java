package dao;

import connection.Conexao;
import entity.Checklist;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChecklistDAO {

    public void cadastrarChecklist(Checklist checklist){
        String sql = "INSERT INTO CHECKLIST (TITULO, DESCRICAO) VALUES (?, ?)";

        PreparedStatement ps = null; // preparedstatement executa funcoes referente ao banco sql

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, checklist.getTitulo());
            ps.setString(2, checklist.getDescricao());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
