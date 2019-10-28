package WPS.Student.server;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class ExerciseWerkzeugTest {

	@Test
	public void changeWiederholungenTest() {

		Exercise exercise = Mockito.mock(Exercise.class);
		Mockito.when(exercise.getWiederholungen()).thenReturn((40));

		ExerciseWerkzeug exerciseWerkzeug = new ExerciseWerkzeug(exercise);
		exerciseWerkzeug.changeWiederholungen(40);

		assertEquals(exercise.getWiederholungen(), 40);

	}

}
