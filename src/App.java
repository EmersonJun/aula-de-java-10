import model.*;
import controller.*;

import java.util.Scanner;

import br.com.empresa.projeto.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World!");
        model.App.main(args);
        controller.App.main(args);
        Teste.main(args);

        System.out.println(CidadeEnum.CAMPO_LARGO);

        CidadeEnum cidade = CidadeEnum.PONTA_GROSSA;

        System.out.println(cidade.getNome());

        System.out.println("Digite uma cidade");
        CidadeEnum novaCidade = CidadeEnum.valueOf(
            scanner.nextLine()
                .trim()
                .toUpperCase()
                .replace(" ", "_")
            );
        System.out.println(novaCidade);
    }
}
