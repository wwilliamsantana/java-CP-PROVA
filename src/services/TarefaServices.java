package services;

import entities.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefaServices {

    public void AdicionarTarefa(Scanner scan, ArrayList<Tarefa> tarefas){

        System.out.println("Informe o nome:");
        var nome = scan.nextLine();

        System.out.println("Informe a descrição: ");
        var description = scan.nextLine();

       var tarefa = new Tarefa();
       tarefa.nome = nome;
       tarefa.description = description;

       tarefas.add(tarefa);
       System.out.println("Cadastrado com sucesso, " + nome);
    }

    public void ListarTarefas(ArrayList<Tarefa> tarefas){
        System.out.println("Listagem de tarefas");

        var index = 1;

        for (var tarefa : tarefas){
            System.out.println(index + " - " + tarefa);
            index++;
        }
    }

    public void ApagarTarefas(Scanner scan, ArrayList<Tarefa> tarefas){
        System.out.println("Informe o número que deseja apagar: ");
        var number = scan.nextInt();

        tarefas.remove(number - 1);


    }

}
