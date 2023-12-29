var name = "John"; // Replace with the actual name
var rollno = "123"; // Replace with the actual roll number
var maths = 85; // Replace with the actual math score
var science = 75; // Replace with the actual science score
var social = 65; // Replace with the actual social score

var total = maths + science + social;
var avg = total / 3;

var grade = "";
if (avg >= 90) {
    grade = "A";
} else if (avg >= 70) {
    grade = "B";
} else if (avg >= 50) {
    grade = "C";
} else {
    grade = "D";
}

document.getElementById('result').innerHTML = newFunction();

function newFunction() {
    return `<h3>Result</h3>
            <p>Name: ${name}</p>
            <p>Roll No: ${rollno}</p>
            <p>Total Marks: ${total}</p>
            <p>Average Marks: ${avg.toFixed(2)}</p>
            <p id="grade">Grade: ${grade}</p>
            <p id="welcome">Congratulations! Welcome to Hyderabad</p>`;
}
