package unidad1;

public class vehiculo {
        String matricula, marca, color, modelo;
        double tarifa;
        boolean disponible;   

    public vehiculo(String matricula, String marca, String color, String modelo, double tarifa){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.tarifa=tarifa;
        this.color=color;
        this.disponible=false;
    }

    public String getMatricula() {
        return this.matricula;
    }    
    public String getMarca() {
        return this.marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public double getTarifa() {
        return this.tarifa;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public boolean getDisponible(){
        return this.disponible;
    }

    public void setTarifa(double tarifa){
        this.tarifa=tarifa;
    }

    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }
    //public vehiculo(String matricula, String marca, String color, String modelo, double tarifa)

        public static void main(String[] args){
            vehiculo vehiculo1 = new vehiculo("hct 094", "Kia", "Blanco" ,"Sportage", 470000.00);
            System.out.println("Matricula: " + vehiculo1.matricula + "\nMarca y modelo: " + vehiculo1.marca + " " + vehiculo1.modelo
                        + "\nColor: " + vehiculo1.color + "\nTarifa: " + vehiculo1.tarifa);
            System.out.println("*************************************");
            vehiculo vehiculo2 = new vehiculo("ate 410", "Chevrolet", "Negro", "Optra", 790000.00);
            System.out.println("Matricula: " + vehiculo2.matricula + "\nMarca y modelo: " + vehiculo2.marca + " " + vehiculo2.modelo
                        + "\nColor: " + vehiculo2.color + "\nTarifa: " + vehiculo2.tarifa);

            // vehiculo1.setTarifa(100);
        
            // System.out.println("Matricula: " + vehiculo1.getMatricula() + "\nTarifa: " + vehiculo1.getTarifa());
    }
    
}   