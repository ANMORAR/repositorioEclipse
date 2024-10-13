package ejercicios_if_else_while;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicios {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		/*
		//pedir dos valores numericos por teclado y decir cual es mayor
		int num1=0;
		int num2=0;
		//instanciamos la clase Scanner

		//pedimos los dos numeros
		System.out.println("dime el primer numero");
		num1=teclado.nextInt();	

		System.out.println("dime el segundo numero");
		num2=teclado.nextInt();	

		//creamos con if el ejercicio
		if (num1>num2) {System.out.println("el numero" + num1 +"es mayor que" +num2);}
		else {System.out.println("el numero" + num1 +"es menor que" +num2);};*/
		//un visitante a la página deberá teclear su edad, si es igual o mayor de 18 recibirá el mensaje de "Entra" en caso contario deberá decirle los años que tiene que estperar para entrar
		/*int edad=0;
int tiempoFaltante=0;
System.out.println("dime tu edad");
edad=teclado.nextInt();

if (edad>=18) {System.out.println("eres mayor de edad");

} else { tiempoFaltante=18-edad; System.out.println("eres menor de edad, te faltan "+tiempoFaltante+" años");

};*/

		//hay 3 menus de comida, elige uno de ellos y cada uno te mostrara su bebida

		//primero decimos los menus a elegir
		/*System.out.println("puede elegir uno de estos menus:1carne, 2pescado y 3pasta cual desea");

		System.out.println("introduce el numero de menu");
		int menu=0;
		menu=teclado.nextInt();
		switch (menu) {
		case 1: {System.out.println("¿quiere vino de  tinto bebida?");

		}
		break;
		case 2:{System.out.println("¿qiere vino blanco?");}
		break;
		case 3:{System.out.println("quiere agua para beber");}
		break;
		default: System.out.println("indique el menu cuando lo sepa");

		}*/
		
		
		
	//	En una sala de juegos existen tre salas: Consolas, Juegos 2D, Juegos 3D, Realidad Virtual. Si un usuario paga  4 créditos puede acceder a todas, si paga 3 solo podrá acceder a las tres primeras, si paga 2 a las dos primeras y si paga 1 solo a la primera sala.

		/*System.out.println("hola puede pagar de uno a cuatro creditos para jugar cuanto quiere pagar");
		int credito=0;
		credito=teclado.nextInt();
		
		switch(credito) {
		case 1: {System.out.println("puedes acceder a la sala de consolas");}
		break;
		case 2: {System.out.println("puedes acceder a la sala de consolas y juegos 2d");}
		break;
		case 3: {System.out.println("puedes acceder a consolas , juegos 2d y juegos 3d");}
		break;
		case 4: {System.out.println("puedes acceder a todas las salas");}
		break;
		default:System.out.println("debes elegir cuantos creditos pagas com maximo cuatro");
		}*/
		
		//a partid de el mes que digas te inidca la estacion del año que es
		
		/*System.out.println("dime que mes estamos del 1 al 12");
		
		int mes;
		mes=teclado.nextInt();
		
		switch (mes) {
		case 12:
		case 1:
		case 2:
		{System.out.println("invierno");};
		break;
		
		case 3:
		case 4:
		case 5:
		{System.out.println("primavera");};
		break;
		
		case 6:
		case 7:
		case 8:
		{System.out.println("verano");};
		break;
		
		case 9:
		case 10:
		case 11:
		{System.out.println("otoño");};
		break;

		default:System.out.println("no has introducido un mes correcto");
			break;
		}*/
		
		
		//dime la longitud y la base de un objeto si son iguales es un cuadrado si no es un rectangulo
		
		
		System.out.println("dame la longitud del objeto");
		
		
		
		double base=0;
		double longitud=0;
		
		longitud=teclado.nextDouble();
		System.out.println("dame la base del objeto");
		base=teclado.nextDouble();
		
		if (base==longitud) {System.out.println("el objeto es un cuadredo");}
		else {System.out.println("el objeto es un rectangulo");
		};
		
		
		
		
		
		
		
		
		
		
		
	}

}
