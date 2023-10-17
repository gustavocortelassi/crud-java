package dao;

import connection.Conexao;
import entity.ItemChecklist;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemChecklistDAO {

    public void cadastrarItemChecklist(ItemChecklist item_checklist){
        String sql = "INSERT INTO ITEM_CHECKLIST (DESCRICAO, TIPO_ITEM, COMENTARIO) VALUES (?, ?, ?)";

        PreparedStatement ps = null; // preparedstatement executa funcoes referente ao banco sql

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, item_checklist.getDescricao());
            ps.setString(2, item_checklist.getTipo_item());
            ps.setString(3, item_checklist.getComentario());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
