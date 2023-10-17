package menu;

import dao.UsuarioDAO;
import entity.Usuario;

import java.util.List;
import java.util.Scanner;

public class MenuUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        System.out.println("--------------------------------------");
        System.out.println("1 - Cadastrar novo usuário");
        System.out.println("2 - Listar usuários cadastrados");
        System.out.println("3 - Atualizar dados do usuário");
        System.out.println("4 - Deletar usuário");
        System.out.println("5 - Voltar ao menu principal");
        System.out.println("--------------------------------------");
        int op1 = scanner.nextInt();

        switch (op1){ // OPÇÕES PARA O USUÁRIO
            case 1:
                System.out.println("Cadastrar novo usuário");

                System.out.println("Informe o nome do usuário: ");
                String nome = scanner.next();

                System.out.println("Informe o sobrenome do usuário: ");
                String sobrenome = scanner.next();

                System.out.println("Informe a senha do usuário (8 dígitos): ");
                String senha = scanner.next();

                System.out.println("Informe o email do usuário: ");
                String email = scanner.next();

                System.out.println("Informe o telefone do usuário: ");
                String telefone = scanner.next();

                System.out.println("Informe o cargo do usuário: ");
                String cargo = scanner.next();

                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setSobrenome(sobrenome);
                usuario.setSenha(senha);
                usuario.setEmail(email);
                usuario.setTelefone(telefone);
                usuario.setCargo(cargo);

                usuarioDAO.cadastrarUsuario(usuario);
                break;

            case 2:
                System.out.println("Listar usuários cadastrados");

                List<Usuario> usuarios = usuarioDAO.listarUsuarios();

                for (Usuario usuarioLista : usuarios) {
                    System.out.println("ID: " + usuarioLista.getUsuario_id());
                    System.out.println("Nome: " + usuarioLista.getNome());
                    System.out.println("Sobrenome: " + usuarioLista.getSobrenome());
                    System.out.println("Email: " + usuarioLista.getEmail());
                    System.out.println("Telefone: " + usuarioLista.getTelefone());
                    System.out.println("Cargo: " + usuarioLista.getCargo());
                    System.out.println("--------------------------------------");
                }
                break;

            case 3:
                System.out.println("Atualizar dados do usuário");

                System.out.println("Informe o ID do usuário que deseja atualizar: ");
                int usuarioId = scanner.nextInt();

                System.out.println("Informe o nome do usuário: ");
                String nomee = scanner.next();

                System.out.println("Informe o sobrenome do usuário: ");
                String sobrenomee = scanner.next();

                System.out.println("Informe a senha do usuário (8 dígitos): ");
                String senhaa = scanner.next();

                System.out.println("Informe o email do usuário: ");
                String emaill = scanner.next();

                System.out.println("Informe o telefone do usuário: ");
                String telefonee = scanner.next();

                System.out.println("Informe o cargo do usuário: ");
                String cargoo = scanner.next();

                Usuario usuarioo = new Usuario();
                usuarioo.setNome(nomee);
                usuarioo.setSobrenome(sobrenomee);
                usuarioo.setSenha(senhaa);
                usuarioo.setEmail(emaill);
                usuarioo.setTelefone(telefonee);
                usuarioo.setCargo(cargoo);
                usuarioo.setUsuario_id(usuarioId);

                usuarioDAO.atualizarUsuario(usuarioo);

                break;

            case 4:
                System.out.println("Deletar usuário");

                System.out.println("Informe o ID do usuário que deseja excluir:");
                int usuario_ID = scanner.nextInt();

                Usuario usuarioE = new Usuario();

                usuarioE.setUsuario_id(usuario_ID);
                usuarioDAO.deletarUsuario(usuarioE);
                break;
        }
    }
}
