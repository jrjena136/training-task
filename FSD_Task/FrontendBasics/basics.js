function normfun() { 

    console.log("Hello Star Health.......")

}


var ano = function (name) {

    console.log("Anonymus Function.....")

}

ano("himani.")



var arr = function (uname, pass) {


    console.log(uname + " " + pass)

}

arr("himani", "admin")


var defa = function(a=8,b){

    return a+b;
}

console.log(defa(50,56))


function spf(name,...a){

    console.log(name,a)

}
spf("hiamni", 7,14,21,28,35,42)


function st(name){

    console.log("hello, welcome"+ " "+ name)

    console.log(name+" "+ `hello there !!
    welcome to the world ...`)


}

st("pooja")
