package questao1;

import java.util.ArrayList;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        try {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Não é possível dividir por zero.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;
        }
    }

    public float somar(float a, float b) {
        return a + b;
    }

    public float subtrair(float a, float b) {
        return a - b;
    }

    public float multiplicar(float a, float b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        try {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Não é possível dividir por zero.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;
        }
    }

    public int somarIntList(ArrayList<Integer> numeros) {
        int resultado = 0;
        for (int num : numeros) {
            resultado += num;
        }
        return resultado;
    }

    public float somarFloatList(ArrayList<Float> numeros) {
        float resultado = 0;
        for (float num : numeros) {
            resultado += num;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma (int): " + calculadora.somar(5, 3));
        System.out.println("Subtração (int): " + calculadora.subtrair(5, 3));
        System.out.println("Multiplicação (int): " + calculadora.multiplicar(5, 3));
        System.out.println("Divisão (int): " + calculadora.dividir(5, 3) + "\n\n");

        System.out.println("Soma (float): " + calculadora.somar(5.5f, 3.2f));
        System.out.println("Subtração (float): " + calculadora.subtrair(5.5f, 3.2f));
        System.out.println("Multiplicação (float): " + calculadora.multiplicar(5.5f, 3.2f));
        System.out.println("Divisão (float): " + calculadora.dividir(5.5f, 3.2f) + "\n\n");

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("Soma (ArrayList<Integer>): " + calculadora.somarIntList(intList));

        ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(1.5f);
        floatList.add(2.5f);
        floatList.add(3.5f);
        System.out.println("Soma (ArrayList<Float>): " + calculadora.somarFloatList(floatList));
    }
}
