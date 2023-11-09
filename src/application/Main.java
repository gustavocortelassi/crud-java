package application;

import dao.EmpresaDao;
import dao.UsuarioDAO;
import entity.*;
import menu.MenuUsuario;
import menu.MenuChecklist;
import menu.MenuEmpresa;

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
            System.out.println("---------- MENU: AMBIENTE-SE ----------");
            System.out.println("1 - Usuário");
            System.out.println("2 - Empresa");
            System.out.println("3 - Checklist");
            System.out.println("0 - Encerrar");
            System.out.println("--------------------------------------");
            op = scanner.nextInt();

            switch (op){ // MENU PRINCIPAL
                case 1:
                    MenuUsuario.main(new String[0]);
                    break;
                case 2:
                    MenuEmpresa.main(new String[0]);
                    break;
                case 3:
                    MenuChecklist.main(new String[0]);
                    break;
            }
        } while (op != 0);
    }
}
