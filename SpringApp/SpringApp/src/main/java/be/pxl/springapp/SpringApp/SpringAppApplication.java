package be.pxl.springapp.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// dit is het demo project
@SpringBootApplication // --> anotaie je voegt iets toe aan de methode
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
// @Override --> overschrijven
// @ Deprecated --> vervallen
// => PROXY's methode blijft het zelfde, maar word toegevoegt zoder de methode het ziet
// Goed weten wat IoC is
// design Patterns
// gedrag is de interface bv. auto interface is motor
// interface bevorderd testen
// new moet je niet doen
// dependenci injection car( en en) er word een nieuwe en aangemaakt
// oefen 11p-13p