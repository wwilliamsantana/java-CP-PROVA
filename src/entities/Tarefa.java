package entities;

public class Tarefa {
    public String nome;
    public String description;

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
