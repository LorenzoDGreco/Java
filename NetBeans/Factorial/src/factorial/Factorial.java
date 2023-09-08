package factorial;

public class Factorial {
  public int factorial(int parametro){
      if(parametro > 0){
          int valorCalculado = parametro * factorial(parametro - 1);
          return valorCalculado;
      }
      return 1;
  }   
}
