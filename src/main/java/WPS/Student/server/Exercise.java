package WPS.Student.server;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Spring Annotation für Dinge, die man in Datenbanken abspeichern kann
@Entity
//Lombok Annotationen:
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Exercise {
	// Annotation damit Spring weiß, dass diese Variable die Id ist
	@Id
	// Annotation damit Spring die IDs automatisch generiert
	@GeneratedValue
//Hier Long (Wrapper-Klasse) statt long (elementarer Datentyp) verwenden, damit die id auch null sein kann (und Spring sie automatisch vergeben kann).
	private Long id;

	private String wochentag;

	private String exercise1;

//	private String exercise2;

	private int wiederholungen;

//	private int wiederholungen2;

	private int dauerInSekunden;

}