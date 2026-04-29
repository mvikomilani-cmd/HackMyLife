package za.co.emeris.st10470564.hackmylife

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val container = findViewById<LinearLayout>(R.id.reviewContainer)

        val questions = intent.getStringArrayListExtra("questions") ?: arrayListOf()
        
        @Suppress("UNCHECKED_CAST", "DEPRECATION")
        val correctAnswers = intent.getSerializableExtra("correctAnswers") as? ArrayList<Boolean> ?: arrayListOf()
        
        @Suppress("UNCHECKED_CAST", "DEPRECATION")
        val userAnswers = intent.getSerializableExtra("userAnswers") as? ArrayList<Boolean> ?: arrayListOf()

        for (i in questions.indices) {
            val textView = TextView(this)
            
            val userAnswer = if (i < userAnswers.size) userAnswers[i] else false
            val correctAnswer = if (i < correctAnswers.size) correctAnswers[i] else false
            
            val result = if (userAnswer == correctAnswer) {
                "Correct "
            } else {
                "Wrong "
            }

            textView.text = """
                Q: ${questions[i]}
                Your Answer: $userAnswer
                Correct Answer: $correctAnswer
                Result: $result
            """.trimIndent()

            textView.setPadding(0, 0, 32, 24)
            container.addView(textView)
        }
    }
}
