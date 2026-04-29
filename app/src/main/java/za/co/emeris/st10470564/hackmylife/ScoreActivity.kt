package za.co.emeris.st10470564.hackmylife

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val feedbackText = findViewById<TextView>(R.id.feedbackText)
        val reviewButton = findViewById<Button>(R.id.reviewButton)

        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", 0)
        
        val questions = intent.getStringArrayListExtra("questions")
        val correctAnswers = intent.getSerializableExtra("correctAnswers")
        val userAnswers = intent.getSerializableExtra("userAnswers")

        scoreText.text = "Score: $score / $total"

        feedbackText.text = when {
            score == total -> "Perfect!"
            score >= total / 2 -> "Good job!"
            else -> "Try again!"
        }

        reviewButton.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            intent.putStringArrayListExtra("questions", questions)
            intent.putExtra("correctAnswers", correctAnswers)
            intent.putExtra("userAnswers", userAnswers)
            startActivity(intent)
        }
    }
}
