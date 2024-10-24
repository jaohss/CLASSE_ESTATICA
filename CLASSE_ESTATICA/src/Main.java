public class Main {
    public static void main(String[] args) throws Exception {
        
        //Chamada do método estático para realizar a conversão de celsius para fahrenheit
        double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(297);
        System.out.println("Temperatura em Fahrenheit: "+fahrenheit + " F");

        //Chamada do método estático para realizar a conversão de kilometros para milhas
        double milhas = ConversorUnidades.quilometrosParaMilhas(5.7);
        System.out.println("Distância em Milhas: "+ milhas +" mi");
        //String.format usado para formatar o número decimal do resultado da conversão


        //Chamada do método estática para realizar a conversão de gramas para libras
        double libras = ConversorUnidades.gramasParaLibras(145.56);
        System.out.println("Massa em libras: "+ libras +" lb");
        //String.format usado para formatar o número decimal do resultado da conversão
    }
}
