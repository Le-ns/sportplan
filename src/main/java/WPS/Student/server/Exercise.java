package WPS.Student.server;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Exercise {
	@Id
	@GeneratedValue
	private Long id;

	private String exercise1;

	private String exercise2;

	private int wiederholungen1;

	private int wiederholungen2;

}