var student = /** @class */ (function () {
    function student() {
        console.log("constructor of student");
    }
    student.prototype.s1 = function () {
        console.log("s1 called");
    };
    return student;
}());
var e1 = new student();
console.log(e1);
e1.s1();
