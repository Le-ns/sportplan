package WPS.Student.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exercise")
public class ExerciseController {
	private ExerciseRepository exercises;

	public ExerciseController(ExerciseRepository exercises) {
		this.exercises = exercises;
		exercises.save(new Exercise(null, "Liegestütz", "Sit-ups", 4, 15));
		exercises.save(new Exercise(null, "Crunches", "Schulterbrücke", 13, 8));
	}

	@GetMapping
	public String exerciseForm(Model model) {
		model.addAttribute("exercises", exercises.findAll());
		Exercise exercise = new Exercise();

		model.addAttribute("exercise", exercise);
		return "exerciseform";
	}

	@PostMapping
	public String postExercise(@ModelAttribute Exercise exercise, Model model) {

		exercises.save(exercise);

		model.addAttribute("exercises", exercises.findAll());

		return "exerciseform";
	}

//	@PostMapping("/delete")
//	public String deleteExercise(@ModelAttribute Exercise exercise, Model model) {
//
//		exercises.save(exercise);
//
//		model.addAttribute("exercises", exercises.findAll());
//
//		return "exercise";
//	}
}
