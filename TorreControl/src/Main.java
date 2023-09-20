import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Voladores> isVoladores = new ArrayList<Voladores>();
        Operario operario = new Operario();
        int j= 0;



        operario.setCodigo(5);
        operario.setNombre("Juan");
        Voladores voladores = new Voladores();
        Voladores voladores1 = new Voladores(true, true);
        Voladores voladores2 = new Voladores(false, false);
        Voladores voladores3 = new Voladores(true, true);



        isVoladores.add(voladores1);
        isVoladores.add(voladores2);
        isVoladores.add(voladores3);


        while( j < isVoladores.size()){
            Voladores voladorActual = isVoladores.get(j);
            voladorActual.isAterrizajePermitido();
            System.out.println(isVoladores.get(j) + " " + operario);
            j++;
        }







    }
}