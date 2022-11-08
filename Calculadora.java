package orientadoObjetos;

public class Calculadora {

    private double sumar;
    private double restar;
    private double multiplicar;
    private double dividir;
    public int a;
    public int b;

    public Calculadora(){

    }
    public void sumar (){
        System.out.println(this.a + this.b);
    }
    public void restar() {
        System.out.println(this.a - this.b);
    }
    public void multiplicar() {
        System.out.println(this.a * this.b);
    }
    public void dividir() {
        System.out.println(this.a / this.b);
    }




}
