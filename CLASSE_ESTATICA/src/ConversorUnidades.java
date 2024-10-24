class ConversorUnidades {

    //Método estático que vai realizar a conversão de celsius(C) para Fahrenheit(F)
    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5)+32;
    }
    //Método estático que vai realizar a conversão de quilometros(km) para milhas(mi)
    public static double quilometrosParaMilhas(double quilometros){
        return quilometros * 0.621371;
    }

    //Método estático que vai realizar a conversão de gramas(g) para libras(lb)
    public static double gramasParaLibras(double gramas){
        return gramas / 453.592; 
    }
    
}
