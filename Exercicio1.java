import java.util.Scanner;

class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Double numeroUm,numeroDois;
        String operacao, encerrar;

        System.out.println("Calculadora");

        do{
            
        System.out.println("Digite o primeiro numero:");
        numeroUm = scanner.nextDouble();
        calculadora.setNumeroUm(numeroUm);
        
        System.out.println("Digite o segundo numero:");
        numeroDois = scanner.nextDouble();
        calculadora.setNumeroDois(numeroDois);

        System.out.println("Digite qual operarção deseja realizar:");
        operacao = scanner.next().toUpperCase();

        switch (operacao){
            case "SOMA": 
            System.out.println("Operação escolhida 'soma'!\n \nO resultado da operação é: \n" +  calculadora.soma());
            break;
            case "SUBTRACAO": 
            System.out.println("Operação escolhida 'subtração'!\n \nO resultado da operação é:  \n" +  calculadora.subtracao());
            break;
            case "MULTIPLICACAO": 
            System.out.println("Operação escolhida 'multiplicação'!\n \nO resultado da operação é: \n" +  calculadora.multiplicacao());
            break;
            case "DIVISAO": 
            System.out.println("Operação escolhida 'divisão'!\n \nO resultado da operação é: \n" +  calculadora.divisao());
            break;
            case "POTENCIA": 
            System.out.println("Operação escolhida 'potencia'!\n \nO resultado da operação é: \n" +  calculadora.potencia());
            break;
            case "RAIZ": 
            System.out.println("Operação escolhida 'raiz'!\n \nO resultado da operação é: \n" +  calculadora.raiz());
            break;
            default: System.out.println("ERRO: Digito invalido.");
        }
        System.out.println("Digite 'Q' se deseja encerrar o programa ou se deseja continuar digite qualquer digito:");
        encerrar = scanner.next().toUpperCase();
        
        if (encerrar.equals("Q"))
            break;

    }while(true);

        scanner.close();
    }
}