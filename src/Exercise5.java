public class Exercise5 {
    public static void main(String[] args) {
        Switchboard centralita = new Switchboard(1000);
        centralita.registerCall(new Llamada("555-43434", "555-34343", 30,1,true));
        centralita.registerCall(new Llamada("555-66666", "555-77777", 24,2,false));
        centralita.registerCall(new Llamada("555-55555", "555-44444", 10,3,false));
        System.out.println("Número total de llamadas: " + centralita.getNumCalls());
        System.out.println("Coste total de las llamadas: " + centralita.getTotalCost());
    }
}
