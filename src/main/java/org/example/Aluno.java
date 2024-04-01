package org.example;
import java.math.BigDecimal;
public class Aluno {

 private String _nome;
    private String _turma;
    private double _notaT1;
    private double _notaT2;
    private double _notaT3;

public Aluno(String nome, String turma, double notaT1, double notaT2, double notaT3) {

    _nome = nome;
    _notaT1 = notaT1;
    _notaT2 = notaT2;
    _notaT3 = notaT3;
}

//gets///////////////////////////////////
    public String Getnome(){
        return _nome;
    }
    public String Getturma(){
        return _turma;
    }
    public double GetnotaT1(){
        return _notaT1;
    }
    public double GetnotaT2(){
        return _notaT2;
    }
    public double GetnotaT3(){
        return _notaT3;
    }

//sets/////////////////////////


    public void Setnome(String nome){
    _nome = nome;
    }
    public void Setturma(String turma){
        _turma = turma;
    }
    public void SetnotaT1(double notaT1){
         _notaT1 = notaT1;
    }
    public void SetnotaT2(double notaT2){
        _notaT2 = notaT2;
    }
    public void SetnotaT3(double notaT3){
        _notaT3 = notaT3;
    }

//metodos////////////////////////////////
    public String Media(){
    double numero = ((_notaT1+_notaT2+_notaT3)/3);
    return String.format("%.2f", numero);
    }

    public String Aprovado(){
        double numero = ((_notaT1+_notaT2+_notaT3)/3);
    if(numero >= 7.00) {
        return "aprovado";
    }else{
        return "reprovado";
    }
    }
}
