package WPS.Student.server;

import org.springframework.data.repository.CrudRepository;

/**
 * Die Datenbank zum Verwalten der Exercises
 * 
 * @author Lena
 *
 */
public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

}
