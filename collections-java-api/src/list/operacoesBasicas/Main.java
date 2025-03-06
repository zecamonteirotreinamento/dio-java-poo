package list.operacoesBasicas;

public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
//        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
//
//        listaTarefas.removerTarefa("Tarefa 1");
//        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();




    }
}
