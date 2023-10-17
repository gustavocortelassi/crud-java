package application;

import dao.EmpresaDao;
import dao.UsuarioDAO;
import entity.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Certificado certificado = new Certificado();
        Checklist checklist = new Checklist();
        Checklist_ItemChecklist checklist_itemchecklist = new Checklist_ItemChecklist();
        EmpresaDao novaEmpresa = new EmpresaDao();
        ItemChecklist itemchecklist = new ItemChecklist();
        UsuarioDAO novoUsuario = new UsuarioDAO();
        UsuarioEmpresa usuarioempresa = new UsuarioEmpresa();

        Scanner scanner = new Scanner(System.in);

        int op;

        do {
            System.out.println("---------- MENU AMBIENTE-SE ----------");
            System.out.println("1 - Usuário");
            System.out.println("0 - Encerrar");
            System.out.println("--------------------------------------");
            op = scanner.nextInt();

            switch (op){ // MENU PRINCIPAL
                case 1:
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

                            novoUsuario.cadastrarUsuario(usuario);
                            break;

                        case 2:
                            System.out.println("Listar usuários cadastrados");

                            List<Usuario> usuarios = novoUsuario.listarUsuarios();

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


                            break;

                        case 4:
                            System.out.println("Deletar usuário");

                            System.out.println("Informe o ID do usuário que deseja excluir:");
                            int usuario_ID = scanner.nextInt();

                            Usuario usuarioE = new Usuario();
                            UsuarioDAO usuarioDAO = new UsuarioDAO();

                            usuarioE.setUsuario_id(usuario_ID);
                            usuarioDAO.deletarUsuario(usuarioE);
                            break;
                    }

            }
        } while (op != 0);
    }
}
