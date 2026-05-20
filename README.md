# HackMyLife – IMAD5112 Assignment 2

**Student Number:** ST10470564  
**Module:** IMAD5112 – Introduction to Mobile Application Development  
**Institution:** The Independent Institute of Education (IIE)

---

## Project Overview

HackMyLife is an Android quiz application built using Kotlin and Android Studio (JetBrains, 2024). The app presents users with a series of life-hack statements and challenges them to identify whether each statement is a genuine life hack or a myth. Upon completing the quiz, users receive a score and can review their answers.

---

## App Structure

Each screen in the application is implemented as an `Activity`, which serves as the entry point for user interaction in Android (Android Developers, 2024a). The application consists of four core activities:

- **MainActivity** – Entry point of the app; displays a start button that launches the quiz. It extends `AppCompatActivity` to ensure backwards-compatible UI behaviour (Android Developers, 2024b).
- **QuizActivity** – Presents questions one at a time; captures user responses (Hack or Myth) and tracks score.
- **ScoreActivity** – Displays the final score and feedback message; provides navigation to the review screen.
- **ReviewActivity** – Displays a breakdown of each question, the user's answer, the correct answer, and the result.

---

## Technologies & Dependencies Used

The following libraries and dependencies were used in this project (Google, 2024):

| Dependency | Purpose |
|---|---|
| `androidx.core.ktx` | Kotlin extensions for Android core functionality |
| `androidx.appcompat` | Backwards-compatible UI components |
| `com.google.android.material` | Material Design UI components |
| `androidx.activity` | Activity lifecycle and result handling |
| `androidx.constraintlayout` | Flexible XML-based UI layout |
| `junit` | Unit testing framework |
| `androidx.test.junit` | AndroidX-compatible JUnit test runner |
| `androidx.espresso.core` | UI testing framework for Android |

---

## Key Concepts Applied

- **Intents** – Used to navigate between activities and pass data (score, questions, answers) via `putExtra()` and `getStringArrayListExtra()`. Intents are the primary mechanism for communication between Android application components (Android Developers, 2024e).
- **Data Classes** – The `Question` data class in `QuizActivity` encapsulates question text and its boolean answer. Kotlin data classes are designed specifically to hold data, with the compiler automatically generating utility functions (JetBrains, 2024a).
- **State Management** – `currentIndex`, `score`, and `userAnswers` are maintained throughout the quiz session.
- **UI Interaction** – Button click listeners (`setOnClickListener`) handle all user interaction, with buttons enabled/disabled to guide the user flow.
- **Edge-to-Edge Display** – `enableEdgeToEdge()` is applied in `MainActivity` for a full-screen modern UI experience, consistent with Android's recommended windowing behaviour (Android Developers, 2024g).
- **ConstraintLayout** – Used for flexible, responsive UI layouts, allowing views to be positioned relative to one another and to the parent container (Android Developers, 2024c).
- **Material Design** – UI components follow Material Design guidelines to ensure a consistent and accessible visual experience (Android Developers, 2024f).
- **Testing** – Unit tests are implemented using JUnit 4 (JUnit, 2024), and UI tests are supported via the Espresso testing framework (Android Developers, 2024d).

---

## How to Run

1. Clone the repository:
   ```
   git clone https://github.com/mvikomilani-cmd/HackMyLife.git
   ```
2. Open the project in Android Studio (Hedgehog or later recommended).
3. Sync Gradle and allow all dependencies to install.
4. Run on an emulator or physical device with API Level 26 or higher.

---

## AI Disclosure

Artificial intelligence tools were used during the development of this application. Specifically:

- **Microsoft Copilot** (Microsoft, 2024) was used to assist with code suggestions, syntax guidance, and debugging support during development.
- **OpenAI ChatGPT** (OpenAI, 2024) was used to assist with structuring logic and troubleshooting activity navigation and intent data passing.

All AI-generated suggestions were reviewed, understood, and adapted by the student before implementation. The use of these tools is disclosed in accordance with IIE academic integrity requirements.

---

## References

Android Developers. 2024a. *Activity*. [Online]. Available at: https://developer.android.com/reference/android/app/Activity [Accessed 20 May 2026].

Android Developers. 2024b. *AppCompatActivity*. [Online]. Available at: https://developer.android.com/reference/androidx/appcompat/app/AppCompatActivity [Accessed 20 May 2026].

Android Developers. 2024c. *Build flexible layouts with ConstraintLayout*. [Online]. Available at: https://developer.android.com/develop/ui/views/layout/constraint-layout [Accessed 20 May 2026].

Android Developers. 2024d. *Get started with the Espresso testing framework*. [Online]. Available at: https://developer.android.com/training/testing/espresso [Accessed 20 May 2026].

Android Developers. 2024e. *Intents and intent filters*. [Online]. Available at: https://developer.android.com/guide/components/intents-filters [Accessed 20 May 2026].

Android Developers. 2024f. *Material Design Components for Android*. [Online]. Available at: https://developer.android.com/develop/ui/views/theming/look-and-feel [Accessed 20 May 2026].

Android Developers. 2024g. *WindowInsets and edge-to-edge display*. [Online]. Available at: https://developer.android.com/develop/ui/views/layout/edge-to-edge [Accessed 20 May 2026].

Google. 2024. *androidx.core.ktx*. [Online]. Available at: https://developer.android.com/kotlin/ktx [Accessed 20 May 2026].

JUnit. 2024. *JUnit 4*. [Online]. Available at: https://junit.org/junit4/ [Accessed 20 May 2026].

JetBrains. 2024a. *Data classes – Kotlin documentation*. [Online]. Available at: https://kotlinlang.org/docs/data-classes.html [Accessed 20 May 2026].

JetBrains. 2024b. *Kotlin programming language*. [Online]. Available at: https://kotlinlang.org/ [Accessed 20 May 2026].

Microsoft. 2024. *Microsoft Copilot*. [Online]. Available at: https://copilot.microsoft.com [Accessed 20 May 2026].

OpenAI. 2024. *ChatGPT*. [Online]. Available at: https://chat.openai.com [Accessed 20 May 2026].
[README (27).md](https://github.com/user-attachments/files/28073027/README.27.md)



This project is a simple Android app made to test and display small “life hack” ideas. The app shows a list of statements (questions) and the user must decide if they are true or false. It is mainly built to practice basic Kotlin programming and app development.

How it works

* The app contains a list of questions stored in the code.
* Each question has a true or false answer.
* The user selects an answer.
* The app checks if the answer is correct and gives feedback.

This is done using:

* A list (or array) to store questions
* A data class to structure each question
* Basic logic to compare the user’s answer with the correct one

Features

* Simple true/false quiz
* Displays questions one at a time
* Keeps track of answers
* Easy to understand layout

Purpose

The main goal of this project is learning:

* Basics of Kotlin
* How Android apps are structured
* How to use lists and data classes
* Handling user input and logic

Technologies used

* Kotlin
* Android Studio

References 

Mateus, B.G. & Martinez, M., 2018. An empirical study on quality of Android applications written in Kotlin language.

Oliveira, V., Teixeira, L. & Ebert, F., 2020. On the adoption of Kotlin on Android development: A triangulation study.

Coppola, R., Ardito, L. & Torchiano, M., 2019. Characterizing the transition to Kotlin of Android apps.

Iskandar, A. et al., 2026. Development and user evaluation of an Android-based e-learning system in higher education.

Darwin, D., Rafli, Z. & Setiadi, S., 2023. Development of Android-based learning media: A literature review.

Hagos, T., 2018. Learn Android Studio 3 with Kotlin.

Alabady, S.A. & Elias, D.Z., 2024. Efficient Android application using Kotlin programming language.


youtube link 

https://youtu.be/DTUugMV1nCA
