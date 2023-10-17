package dao;

import connection.Conexao;
import entity.Certificado;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CertificadoDAO {

    public void cadastrarCertificado(Certificado certificado){
        String sql = "INSERT INTO CERTIFICADO (AVALIADOR, COD_VERIFICACAO, ASSINATURA, SITUACAO) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null; // preparedstatement executa funcoes referente ao banco sql

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, certificado.getAvaliador());
            ps.setInt(2, certificado.getCod_verificacao());
            ps.setString(3, certificado.getAssinatura());
            ps.setString(4, certificado.getSituacao());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
