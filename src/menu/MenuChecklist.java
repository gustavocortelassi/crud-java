package menu;

import dao.ChecklistDAO;

import java.util.Scanner;

public class MenuChecklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChecklistDAO checklistDAO = new ChecklistDAO();

        System.out.println("--------------------------------------");
        System.out.println("1 - Cadastrar novo checklist");
        System.out.println("2 - Cadastrar novo item do checklist");
        System.out.println("3 - Listar checklist cadastrados");
        System.out.println("4 - Listar itens cadastrados");
        System.out.println("5 - Atualizar dados do checklist");
        System.out.println("6 - Atualizar item do checklsit");
        System.out.println("7 - Deletar checklist");
        System.out.println("8 - Deletar item do checklist");
        System.out.println("9 - Voltar ao menu principal");
        System.out.println("--------------------------------------");
        int op1 = scanner.nextInt();

        switch (op1){
            case 1: // Cadastrar checklist
                break;

            case 2: // Cadastrar novo item do checklist
                break;

            case 3: // Listar checklist cadastrados
                break;

            case 4: // Listar itens cadastrados
                break;

            case 5: // Atualizar dados do checklist
                break;

            case 6: // Atualizar item do checklsit
                break;

            case 7: // Deletar checklist
                break;

            case 8: // Deletar item do checklist
                break;

            case 9: // Voltar ao menu principal
                break;
        }
    }
}
