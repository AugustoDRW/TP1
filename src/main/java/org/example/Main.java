package org.example;
import java.math.BigDecimal;

public class Main {
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args) {


        Aluno a = new Aluno("Augusto","211",8,3,10);
        Aluno b = new Aluno("Luiz","211",9,5,6.4);
        Aluno c = new Aluno("Vitor","211",8.2,4.4,9);
        Aluno d = new Aluno("Lucas","211",8,4,7.8);

        System.out.println("o aluno de nome: " + a.Getnome() + " teve média de: " + a.Media() + " pontos");
        System.out.println("o aluno de nome: " + b.Getnome() + " teve média de: " + b.Media() + " pontos");
        System.out.println("o aluno de nome: " + c.Getnome() + " teve média de: " + c.Media() + " pontos");
        System.out.println("o aluno de nome: " + d.Getnome() + " teve média de: " + d.Media() + " pontos");

        System.out.println(a.Getnome() + " foi: " + a.Aprovado());
        System.out.println(b.Getnome() + " foi: " + b.Aprovado());
        System.out.println(c.Getnome() + " foi: " + c.Aprovado());
        System.out.println(d.Getnome() + " foi: " + d.Aprovado());



        }
    }



