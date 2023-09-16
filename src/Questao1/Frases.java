import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
public class Frases {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner;
        Stack pilha = new Stack(); // Classe Pilha

        scanner = new Scanner(new File("C:\\Users\\gui_m\\IdeaProjects\\Atividade3\\src\\Questao1/Frases.txt"));
        while (scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }
        System.out.println("10 frases mais buscadas " + pilha.size());
        System.out.println("****Pilha de Frases*****");
        while(!pilha.empty())
        {
            System.out.println(pilha.pop());
        }
    }

}