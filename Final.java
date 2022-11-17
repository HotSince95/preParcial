public class Final extends Examen implements Comparable{
    private Double notaOral;
    private String descripcionOral;

    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcionOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }
    @Override
    public Boolean aprobado() {
        return getNota()>=4 && notaOral >=4;
    }

    @Override
    public int compareTo(Object asdf) {
        Final otroFinal = (Final) asdf;

        if (promedio() > otroFinal.promedio()){
            return 1;
        } else if (promedio() < otroFinal.promedio()) {
            return -1;
        }else {
            return 0;
        }
    }
    public Double promedio(){ //lo creo por que lo necesito para comparar lo agrego en el UML
        return (getNota() + notaOral) /2;
    }
}
