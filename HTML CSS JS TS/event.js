function parentCall(ev){
    console.log(ev.currentTarget)
}

function childCall(ev){
    //ev.stopPropagation();
    //console.log("This is child");
}

function childCall1(ev){
    console.log("This is child  event 1");
}

function childCall2(ev){
   if(true){
    ev.stopImmediatePropagation();
   }
   console.log("This is child event 2");
}

function childCall3(ev){
    console.log("This is child event 3");
}

function anchorEvent(){
    ev.preventDefault();
    console.log("This is an anchor element");
}

var p1 = document.getElementById("parent1");
var p2 = document.getElementById("parent2");
var c1 = document.getElementById("child1");
var c2 = document.getElementById("child2");

var c = document.getElementById("child");
var anc = document.getElementById("anc");

anc.addEventListener("click",anchorEvent);

p1.addEventListener("click",parentCall,true);
p1.addEventListener("click",parentCall);

c1.addEventListener("click",childCall);