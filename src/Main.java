
import entities.Tarefa;
import services.TarefaServices;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var tarefas = new ArrayList<Tarefa>();
        var scan = new Scanner(System.in);
        var tarefasServices = new TarefaServices();


        while(true){
            System.out.println("""
                    1 - Cadastrar Tarefa
                    2 - Listar tarefas
                    3 - Apagar Tarefa
                    4 - Sair
                    """);
            var opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1 -> tarefasServices.AdicionarTarefa(scan, tarefas);
                case 2 -> tarefasServices.ListarTarefas(tarefas);
                case 3 -> tarefasServices.ApagarTarefas(scan, tarefas);
                case 4 -> System.exit(0);
                default -> System.out.println("Valor inválido!");

            }


        }

    }
}