public class Parcial extends Examen{
    private Integer unidad;
    private Integer cantidadReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer unidad) {
        super(alumno, titulo, enunciado, nota);
        this.unidad = unidad;
        cantidadReintentos = 0;
    }
    @Override
    public Boolean aprobado() {
        return getNota()>=4;
    }

    public Boolean esRecuperable(){
        Boolean recuperable = false;
        if (aprobado()){
            recuperable = false;
        }
        if (unidad<=3){
            recuperable = cantidadReintentos <3;
        }
        if (unidad>3){
            recuperable = cantidadReintentos <2;
        }
        return recuperable;
    }
}
