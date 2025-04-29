let i=document.getElementById("inputnumber")
//let b=document.getElementById("btn")
// document.body.appendChild(i)

// let b=document.createElement("button")
// b.textContent="Submit"
// document.body.appendChild(b)

let x=function(e){
    console.log(e.target.value)
}

i.addEventListener("keypress",x)

function rev(){
    let n=i.value;
    let reversed= parseInt(n.toString().split('').reverse().join(''));
    document.getElementById("result").innerText = "Reversed Number: " + reversed;
}