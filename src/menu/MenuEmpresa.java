package menu;

import dao.EmpresaDao;

import java.util.Scanner;

public class MenuEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpresaDao empresaDao = new EmpresaDao();

        System.out.println("--------------------------------------");
        System.out.println("1 - Cadastrar nova empresa");
        System.out.println("2 - Listar empresas cadastradas");
        System.out.println("3 - Atualizar dados da empresa");
        System.out.println("4 - Deletar empresa");
        System.out.println("5 - Voltar ao menu principal");
        System.out.println("--------------------------------------");
        int op1 = scanner.nextInt();

        switch (op1){
            case 1: // Cadastrar empresa
                break;

            case 2: // Listar empresas
                break;

            case 3: // Atualizar empresa
                break;

            case 4: // Deletar empresa
                break;
        }
    }
}
