package dao;

import connection.Conexao;
import entity.Checklist_ItemChecklist;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Checklist_ItemChecklistDAO {

    public void associarChecklist_ItemChecklist(Checklist_ItemChecklist checklist_itemchecklist){
        String sql = "INSERT INTO CHECKLIST_ITEMCHECKLIST (CHECKLIST_ID, ITEMCHECKLIST_ID) VALUES (?, ?)";

        PreparedStatement ps = null; // preparedstatement executa funcoes referente ao banco sql

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, checklist_itemchecklist.getChecklist_ID());
            ps.setInt(2, checklist_itemchecklist.getItemChecklist_ID());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
