public class vehiculo {
    String color;
    String marca;
    String modelo;
    String tipoMotor;
    double litrosMotor;
    double rendimientMotor;

    public vehiculo(){
        color = "";
        marca = "";
        modelo = "";
        tipoMotor = "";
        litrosMotor = 0;
        rendimientMotor = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getLitrosMotor() {
        return litrosMotor;
    }

    public void setLitrosMotor(double litrosMotor) {
        this.litrosMotor = litrosMotor;
    }

    public double getRendimientMotor() {
        return rendimientMotor;
    }

    public void setRendimientMotor(double rendimientMotor) {
        this.rendimientMotor = rendimientMotor;
    }
}
