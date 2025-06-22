package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;
import model.Task;
import model.TaskData;

public class TimerController {
    @FXML private TextField taskNameField, durationField;
    @FXML private ListView<Task> taskList;
    @FXML private ProgressBar progressBar;
    @FXML private Label timerLabel;

    private Timeline timeline;
    private int timeRemaining; // seconds
    private Task currentTask;

    @FXML
    public void initialize() {
        taskList.getItems().setAll(TaskData.getTasks());
        taskList.getSelectionModel().selectedItemProperty().addListener((obs, old, newTask) -> {
            currentTask = newTask;
            updateProgress();
        });
    }

    @FXML
    public void handleAddTask() {
        String name = taskNameField.getText();
        int duration = Integer.parseInt(durationField.getText());
        Task task = new Task(name, duration);
        TaskData.addTask(task);
        taskList.getItems().add(task);
    }

    @FXML
    public void startPomodoro() {
        if (currentTask == null) return;
        timeRemaining = 25 * 60; // 25 minutes

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            timeRemaining--;
            int minutes = timeRemaining / 60;
            int seconds = timeRemaining % 60;
            timerLabel.setText(String.format("%02d:%02d", minutes, seconds));
            if (timeRemaining <= 0) {
                timeline.stop();
                currentTask.addTimeSpent(25);
                updateProgress();
                showBreakAlert();
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void showBreakAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Take a 5-minute break!");
        alert.show();
    }

    private void updateProgress() {
        if (currentTask != null) {
            progressBar.setProgress(currentTask.getProgress());
        }
    }
}
