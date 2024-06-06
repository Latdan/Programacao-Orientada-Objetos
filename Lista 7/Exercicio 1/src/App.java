import ESCOLA.Aluno;
import ESCOLA.Professor;

public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel Latiman", "latinhaman@gmail.com", "2005876");
        Professor professor = new Professor("Kleber da Silva", "klebinhochavao@gmail.com", "Geografia");

        System.out.println("Informações do Aluno:");
        aluno.exibirInfo();
        aluno.exibirInfo(true, false, true);

        System.out.println("\nInformações do Professor:");
        professor.exibirInfo();
        professor.exibirInfo(false, true, true);
    }
}