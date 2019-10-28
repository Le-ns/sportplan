package WPS.Student.server;

public class ExerciseWerkzeug {

	protected Exercise exercise;

	public ExerciseWerkzeug(Exercise exercise) {
		this.exercise = exercise;
	}

	/**
	 * Verändert die Anzahl der Wiederholungen einer Exercise
	 * 
	 * @param neueWiederholungen die neue Anzahl an Wiederholungen, die die
	 *                           bisherige ersetzen soll
	 */
	void changeWiederholungen(int neueWiederholungen) {
		exercise.setWiederholungen(neueWiederholungen);
	}

}
