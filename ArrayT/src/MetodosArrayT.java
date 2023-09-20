public class MetodosArrayT {

    int []t = new int[10];

    public int Size() {
        int size = 0;
        for (int i = 0; i <= t.length; i++) {
            size++;
        }
        return size;
    }

    public void AddFirst(int addFirst) {
         /*agrego el dato a la primera posicion y luego lo muevo a la segunda posicion para que cuando despues
        se vaya a utilizar el metodo nuevamente pueda tener la posicion disponible para agregarlo*/
        for (int i = t.length-1; i > 0; i--) {
            t[i] = t[i-1];

        }
        t[0] = addFirst;

    }
    /*agrego el dato en la ultima posicion y luego lo muevo a la penultima posicion para que cuando despues
       se vaya a utilizar el metodo nuevamente pueda tener la posicion disponible para agregarlo*/
    public void AddLast(int last) {
        for(int i = 0; i < t.length-1; i++){
            t[i] = t[i+1];
        }
        t[t.length - 1] = last;
    }

    public void Add(int add) {
        /*muevo el dato a la segunda posicion para que la primera posicion nunca este ocupada y
        luego agrego el dato en la segunda posicion para el array pueda recibir un nuevo dato si es requerido*/
        for (int i = t.length-1; i > 0; i--) {
            t[i] = t[i-1];

        }
        t[0] = add;
    }

    public int Remove() {
        /* paso el dato de la primera posicion a la variable temporal remove para
        poder retornarlo y luego remuevo el dato de la primera posicion*/
        int remove = 0;
        for (int i = 0; i < t.length; i++) {
            remove = t[i];
            t[i] = 0;
            break;
        }
        return remove;
    }

    public void RemoveAll(){
        //recorro el todo el arreglo y voy eliminando los datos en cada iteracion
        for(int i = 0; i < t.length; i++){
            t[i] = 0;
        }

    }

    public boolean Empty() {
        return t.length == 0;
    }
    // Este metodo recorre el arreglo
    public void RecorrerT() {
        for (int i : t) {
            System.out.println(i);
        }
    }

}




