import java.util.ArrayList;
import java.util.List;

public class Operario {
    private String nombre;
    private int codigo;

    private List<Voladores> voladores;




    @Override
    public String toString() {
        return "Operario{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", voladores=" + voladores +
                '}';
    }

    public Operario() {
    }

    public Operario(String nombre, int codigo, List<Voladores> voladores) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.voladores = voladores;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Voladores> getVoladores() {
        return voladores;
    }

    public void setVoladores(List<Voladores> voladores) {
        this.voladores = voladores;
    }


}

