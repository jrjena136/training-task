
//Normal function
function f1(){
    console.log("it s normal function")
}
f1();

//anonymous function
var f2=function(name){
    return "welcome"+name;

}
var output=f2("Myname")
console.log(output);

//Arrow function
var f3=(eid,ename)=>
    console.log(eid+" "+ename)

f3(2,"NAME")

//spread parameter
function add(...a){
    
   console.log("spread parameters") 
   return a[0]+a[2]
  
}
console.log(add(10,10,10))

//string manupulations
function stringdemo(){
    let str1='my name is sumit pimpare..'
    console.log(str1)

    //we can use backtick
    let str2=`my name is sumit pimpare,
            im from Pune`

    console.log(str2);


    //String interpolition
    let marks=90;

    let str3=`Marks of student1 is ${marks}`
    console.log(str3)
}
stringdemo();

function check(a,b=2){
    return a+b

 }
 console.log(check(5))
 





