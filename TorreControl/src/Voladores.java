public class Voladores {
    public boolean isPapelesEnRegla;
    public boolean isAutorizado;


    @Override
    public String toString() {
        return "Voladores{" +
                "isPapelesEnRegla=" + isPapelesEnRegla +
                ", isAutorizado=" + isAutorizado +
                '}';
    }

    public Voladores() {
    }

    public Voladores(boolean isPapelesEnRegla, boolean isAutorizado) {
        this.isPapelesEnRegla = isPapelesEnRegla;
        this.isAutorizado = isAutorizado;
    }

    public void isAterrizajePermitido(){
        if(isPapelesEnRegla && isAutorizado){
            System.out.println("Este vuelo es permitido para aterrizar");
        }
        else{
            System.out.println("Vuelo no autorizado para aterrizar");
        }

    }
}
