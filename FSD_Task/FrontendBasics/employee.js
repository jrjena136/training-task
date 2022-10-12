var Employee = /** @class */ (function () {
    function Employee() {
        console.log("Object is created...");
    }
    Student.prototype.method = function () {
        console.log("Employee Method..........");
    };
    return Employee;
}());
var emp = new Employee();
emp.method();
console.log(emp);
