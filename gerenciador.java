package sistemas;

import java.util.ArrayList;
import java.util.Scanner;

public class gerenciador {
    public static void main(String[] args) {
        // Lista que vai armazenar as tarefas do usuário
        ArrayList<String> listaTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean emExecucao = true;

        while (emExecucao) {
            // Exibe o menu para o usuário
            System.out.println("\n===== MENU =====");
            System.out.println("1  Adicionar nova tarefa");
            System.out.println("2  Exibir tarefas");
            System.out.println("3  Marcar tarefa como concluída");
            System.out.println("4  Encerrar programa");
            System.out.print("Escolha uma opção: ");

            // Captura a opção escolhida
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o carregamento do teclado

            switch (opcao) {
                case 1:
                    // Adicionar uma nova tarefa
                    System.out.print("Informe a tarefa que deseja adicionar: ");
                    String tarefa = scanner.nextLine();
                    listaTarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    // Exibir todas as tarefas
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("Tarefas pendentes:");
                        for (int i = 0; i < listaTarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + listaTarefas.get(i));
                        }
                    }
                    break;
                case 3:
                    // Marcar tarefa como concluída
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Não há tarefas para marcar como concluídas.");
                    } else {
                        System.out.println("Informe o número da tarefa que deseja marcar como concluída: ");
                        int numTarefa = scanner.nextInt();
                        if (numTarefa > 0 && numTarefa <= listaTarefas.size()) {
                            listaTarefas.remove(numTarefa - 1);
                            System.out.println("Tarefa concluída e removida da lista.");
                        } else {
                            System.out.println("Número inválido! Por favor, tente novamente.");
                        }
                    }
                    break;
                case 4:
                    // Encerrar o programa
                    emExecucao = false;
                    System.out.println("Finalizando o programa... Até logo!");
                    break;
                default:
                    System.out.println("opção inválida. Por favor, escolha novamente.");
            }
        }

        // Fechando o scanner
        scanner.close();
    }
}
