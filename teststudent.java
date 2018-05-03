// test score for 2 students
let test_data = [
	[ 90, 87, 55, 88 ], // student 1
	[ 78, 67, 80, 90 ], // student 2
	[ 90, 95, 98, 100], //student 3
];

//ouput the 3rd test scrore for student 1
consol.log( test_data[0][2]); // ouput:55

//calculate and out output the mean for each student
test_data.forEach(scores => {
	console.log(scores.reduce((a, b) => a + b / scores.length, 0));
});
//output: 80 78.75 95.75