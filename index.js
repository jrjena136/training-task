var u = true;
var b = "string"; // Error: Type 'string' is not assignable to type 'boolean'.
console.log(b);

// Some change
// // ES5
// var x = function(x, y) {
//     return x * y;
//  }
 
//  // ES6
//  const x = (x, y) => x * y;



//  const person = {
//     firstName: "John",
//     lastName: "Doe",
//     age: 50,
//     eyeColor: "blue"
//   };
  
//   let id = Symbol('id');
//   person[id] = 140353;


  function sum(...args) {
    let sum = 0;
    for (let arg of args) sum += arg;
    return sum;
  }
  
  let x = sum(4, 9, 16, 25, 29, 100, 66, 77);

  Array.from("ABCDEFG")  