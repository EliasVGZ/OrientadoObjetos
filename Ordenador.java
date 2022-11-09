package OrdenadorPago;

public class Ordenador {

    public String marcaOrdenador;
    public double contado;
    public int precioInicial;
    public double precioSeisMes;
    public double precioDocemeses;
    public byte formaPago;


    public Ordenador(String marcaOrdenador, int precioInicial, int precioSeisMes, int precioDocemeses, double contado) {
        this.marcaOrdenador = marcaOrdenador;
        this.precioInicial = precioInicial;
        this.precioSeisMes = precioSeisMes;
        this.precioDocemeses = precioDocemeses;
        this.contado = contado;
    }

    public Ordenador() {

    }

    public String getMarcaOrdenador() {
        return marcaOrdenador;
    }

    public void setMarcaOrdenador(String marcaOrdenador) {
        this.marcaOrdenador = marcaOrdenador;
    }

    public int getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(int precioInicial) {
        this.precioInicial = precioInicial;
    }

    public void calculo() {

        switch (formaPago) {
            case 1 -> {
                contado = precioInicial;
                System.out.println("VALDRA : " + contado);
            }
            case 2 -> {
                precioSeisMes = (precioInicial * 1.08);
                System.out.println("EL PRECIO TOTAL SERÁ DE: " + precioSeisMes);
                System.out.println("LA MENSUALIDAD SERA: " + precioSeisMes/6);
            }
            case 3 -> {
                precioDocemeses = (precioInicial * 1.15);
                System.out.println("PRECIO TOTAL SERÁ:  " + precioDocemeses);
                System.out.println("LA MENSUALIDAD SERÁ DE: " +precioDocemeses/12);
            }
        }
    }
}
