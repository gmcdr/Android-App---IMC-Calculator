package com.example.imc;

public class IMC {
    private int idade;
    private double altura;
    private double peso;
    private String status;
    private  double resultado;

    public IMC(){

    }

    public IMC(int idade, double altura, double peso) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcular_imc(){
        resultado =  peso / (altura*altura);
        return resultado;
    }

    public String status(){
            if (resultado < 18.5){
                status = "Abaixo do peso";
            }else if (resultado >= 18.5 && resultado < 24.9){
                status = "Normal";
            }
            else if(resultado >= 25.0 && resultado <= 29.9){
                status = "Sobrepeso I";
            }else if(resultado >= 30.0 && resultado <=39.9){
                status = "Obesidade II";
            }else if (resultado > 40.0){
                status = "Obesidade Grave III";
            }else{

            }
            return status;
    }

}
