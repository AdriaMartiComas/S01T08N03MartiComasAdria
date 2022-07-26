package exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		ArrayList<Alumne> list = new ArrayList<Alumne>();

		list.add(new Alumne("Adria", 30, "java", 8));
		list.add(new Alumne("Mariona", 34, "php", 2.5));
		list.add(new Alumne("Helena", 22, "Full-Stack", 6.75));
		list.add(new Alumne("Laura", 19, "java", 9.25));
		list.add(new Alumne("David", 28, "Front-End", 9.75));
		list.add(new Alumne("Mika", 33, "Full-Stack", 4.75));
		list.add(new Alumne("Andrea", 27, "php", 5.75));
		list.add(new Alumne("Antonio", 22, "Front-End", 3));
		list.add(new Alumne("Paula", 17, "java", 6));
		list.add(new Alumne("Monica", 36, "Full-Stack", 7));

		// Mostrar nom i edat
		System.out.println("MOSTRAR NOM I EDAT ALUMNES");
		list.forEach(a -> {
			System.out.print(a.getNom() + " ");
			System.out.print(a.getEdat() + "|");
		});

		// Mostrar noms que comencen per 'a'
		System.out.println("\n\nMOSTRAR ALUMNES COMENCEN PER A");
		List<Alumne> llistaA = list.stream().filter(l -> l.getNom().charAt(0) == 'A').collect(Collectors.toList());
		llistaA.forEach(System.out::println);

		// Mostrar alumnes aprovats
		System.out.println("\nMOSTRAR ALUMNES APROVATS");
		List<Alumne> llistaAprovats = list.stream().filter(a -> a.getNota() >= 5).collect(Collectors.toList());
		llistaAprovats.forEach(System.out::println);

		// Mostrar alumnes aprovats de PHP
		System.out.println("\nMOSTRAR ALUMNES APROVATS PHP");
		List<Alumne> llistaAprovatsPhp = list.stream().filter(a -> a.getNota() >= 5)
				.filter(a -> a.getCurs().equals("php".toString())).collect(Collectors.toList());
		llistaAprovatsPhp.forEach(System.out::println);

		// Mostrar alumnes Java i majors d'edat
		System.out.println("\nMOSTRAR ALUMNES JAVA IMAJORS D'EDAT");
		List<Alumne> llistaJavaMajors = list.stream().filter(a -> a.getCurs().equalsIgnoreCase("java".toString()))
				.filter(a -> a.getEdat() >= 18).collect(Collectors.toList());
		llistaJavaMajors.forEach(System.out::println);

	}

}
