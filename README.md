# Student Grade Calculator App

This Kotlin app allows you to calculate your total marks, average percentage, and grade based on the marks entered for 5 subjects.

## Features:
- Input marks for 5 subjects.
- Calculate the total marks.
- Calculate the average percentage.
- Assign a grade based on the percentage obtained.

## Prerequisites:
- Android Studio (or any Kotlin development environment).

## Instructions:
1. Clone this repository or create a new Kotlin project in Android Studio.

2. Open the project in Android Studio.

3. Create a new XML layout for your app's UI. Design the layout with appropriate text fields for entering marks, a button for calculating, and TextViews to display the results.

4. In the Kotlin code, create variables to store the marks and calculate the total and average.

5. Implement the logic to calculate the total marks and average percentage.

6. Assign grades based on the percentage obtained using a grading scale (e.g., A, B, C, D, F).

7. Update the UI elements (TextViews) to display the results.

8. Handle user input validation to ensure valid marks are entered (between 0 and 100).

9. Build and run the app on an Android emulator or physical device.

## Example Code:
```kotlin
// Define variables to store marks
var subject1: Int = 0
var subject2: Int = 0
var subject3: Int = 0
var subject4: Int = 0
var subject5: Int = 0

// Calculate total marks
val totalMarks = subject1 + subject2 + subject3 + subject4 + subject5

// Calculate average percentage
val averagePercentage = totalMarks / 5

// Assign grades based on percentage
val grade = when {
    averagePercentage >= 90 -> "A+"
    averagePercentage >= 80 -> "A"
    averagePercentage >= 70 -> "B"
    averagePercentage >= 60 -> "C"
    averagePercentage >= 50 -> "D"
    else -> "F"
}

// Display the results in your TextViews
