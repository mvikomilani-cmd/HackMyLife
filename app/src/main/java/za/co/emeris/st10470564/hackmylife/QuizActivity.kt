package za.co.emeris.st10470564.hackmylife

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    data class Question(
        val text: String,
        val answer: Boolean
    )

    private val questions = listOf(
        Question("Putting your phone in rice fixes water damage", false),
        Question("Cold showers improve alertness", true),
        Question("Charging overnight damages battery", false),
        Question("A damp paper towel keeps food moist in microwave", true)
    )

    private var currentIndex = 0
    private var score = 0
    private val userAnswers = mutableListOf<Boolean>()

    private lateinit var questionText: TextView
    private lateinit var feedbackText: TextView
    private lateinit var nextButton: Button
    private lateinit var hackButton: Button
    private lateinit var mythButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        questionText = findViewById(R.id.questionText)
        feedbackText = findViewById(R.id.feedbackText)
        nextButton = findViewById(R.id.nextButton)
        hackButton = findViewById(R.id.hackButton)
        mythButton = findViewById(R.id.mythButton)

        loadQuestion()

        hackButton.setOnClickListener { checkAnswer(true) }
        mythButton.setOnClickListener { checkAnswer(false) }
        nextButton.setOnClickListener { nextQuestion() }
    }

    private fun loadQuestion() {
        val currentQuestion = questions[currentIndex]
        questionText.text = currentQuestion.text
        feedbackText.text = ""
        
        // Disable next button until answer is chosen (optional but good UX)
        nextButton.isEnabled = false
        hackButton.isEnabled = true
        mythButton.isEnabled = true
    }

    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = questions[currentIndex].answer
        userAnswers.add(userAnswer)

        if (userAnswer == correctAnswer) {
            score++
            feedbackText.text = "Correct! ✅"
        } else {
            feedbackText.text = "Wrong! ❌"
        }
        
        hackButton.isEnabled = false
        mythButton.isEnabled = false
        nextButton.isEnabled = true
    }

    private fun nextQuestion() {
        currentIndex++
        if (currentIndex < questions.size) {
            loadQuestion()
        } else {
            val intent = Intent(this, ScoreActivity::class.java)
            intent.putExtra("score", score)
            intent.putExtra("total", questions.size)
            intent.putStringArrayListExtra("questions", ArrayList(questions.map { it.text }))
            intent.putExtra("correctAnswers", ArrayList(questions.map { it.answer }))
            intent.putExtra("userAnswers", ArrayList(userAnswers))
            startActivity(intent)
            finish()
        }
    }
}
