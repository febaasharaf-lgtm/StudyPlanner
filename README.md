StudyPlanner
Smart Study Planner with Pomodoro Timer
# 📚 Simple Smart Study Planner with Pomodoro Timer ⏳

A beginner-friendly JavaFX desktop app to help students organize tasks and study using the Pomodoro technique. This simple planner lets users add tasks, set custom durations, and run a 25-minute Pomodoro session with a timer and progress bar.

 ✨ Features

- ✅ Add study tasks with custom durations
- ⏱️ Start a 25-minute Pomodoro timer
- 📊 See a real-time progress bar
- 🔔 Get an alert when the session ends


🛠 Tech Stack

- **Java 17+**
- **JavaFX 17+**
- **IntelliJ IDEA**

 📁 Project Structure

SmartStudyPlanner/
└── src/
    ├── controller/
    │   └── TimerController.java
    ├── model/
    │   ├── Task.java
    │   └── TaskData.java
    ├── utils/
    │   └── ExportUtil.java
    ├── view/
    │   └── MainView.fxml
    └── Main.java



 🧰 Requirements

- Java JDK 17 or higher
- JavaFX SDK 17+
- IntelliJ IDEA (or any IDE that supports JavaFX)


 🚀 How to Run

 1. Clone the Repository
2. Download JavaFX SDK
Get JavaFX SDK from https://gluonhq.com/products/javafx/ and extract it.

3. Add JavaFX to IntelliJ
Go to File → Project Structure → Libraries

Click + and add the lib folder inside the JavaFX SDK

Add VM options in Run Configuration:

Windows:--module-path "C:\path\to\javafx-sdk-21\lib" --add-modules javafx.controls

4. Run the App
Run Main.java from IntelliJ. You can now:

Add tasks

Click "Start Pomodoro"

Watch the progress bar and timer.
