public class Calculadora {
    private double numeroUm;
    private double numeroDois;

    public void setNumeroUm (Double novoValorNumeroUm){
        numeroUm = novoValorNumeroUm;
    }
    public void setNumeroDois(Double novoValorNumeroDois){
        numeroDois = novoValorNumeroDois;
    }
    public double soma() {
        return numeroUm + numeroDois;
    }

    public double subtracao(){
        return numeroUm - numeroDois;
    }

    public double multiplicacao(){
        return numeroUm * numeroDois;
    }

    public double divisao(){
        if (numeroDois == 0){
            System.out.println("ERRO: impossivel realizar uma divisão por zero ");
            return 0;
        }
        else {
            return numeroUm / numeroDois;
        }
        
    }

    public double potencia() {
        return Math.pow(numeroUm, numeroDois);
    }

    public double raiz() {
        if (numeroUm < 0){
            System.out.println("ERRO: Não existe raiz de numero negativo");
            return 0;
        }
        else {
            return Math.sqrt(numeroUm);
        }
    }

}
