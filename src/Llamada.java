public class Llamada {
    private String origen;
    private String destino;
    private int duracion;
    private int banda;
    private boolean local;
    public static final int PRECIO_LOCAL = 15;
    public static final int PRECIO_BANDA_1 = 20;
    public static final int PRECIO_BANDA_2 = 25;
    public static final int PRECIO_BANDA_3 = 30;

    public Llamada(String origen, String destino, int duracion, int banda, boolean local) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.banda = banda;
        this.local = local;
    }

    @Override
    public String toString() {
        String tipo;
        if (local){
            tipo = "local";
        } else {
            tipo = "provincial";
        }
        return "Origen; " + origen + " Destino: " + destino + " Duración: " + duracion + " Banda: " + banda + " Tipo: " + tipo + " Coste: " + getCost();
    }
    //Devuelve el coste en céntimos
    public int getCost() {
        if (local){
            return duracion * PRECIO_LOCAL;
        } else if(banda == 1){
            return duracion * PRECIO_BANDA_1;
        } else if(banda == 2){
            return duracion * PRECIO_BANDA_2;
        }else {
            return duracion * PRECIO_BANDA_3;
        }

    }

}