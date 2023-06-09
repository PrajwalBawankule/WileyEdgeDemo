"use strict";
let id = 9;
let company = "Wiley Edge";
let isPublished = true;
let x = "Hello";
let studentIds = [1, 2, 3, 4, 5, 6, 7, 8, 9];
studentIds.push(10);
//Tuple
let person = [1, "prajwal", true];
//tuple array
let employees;
employees: [
    [1, "Prajwal"],
    [2, "ABC"],
    [3, "Xyz"],
];
//union
let empId;
empId = "prajwal";
const studentOne = {
    id: 1,
    name: "sachin"
};
let sid = 1;
let eid = sid;
console.log(eid);
//function
function calcTotal(x, y) {
    return x + y;
}
function sendMessage(message) {
    console.log("Message");
}
const student1 = {
    id: 1,
    name: "Prajwal"
};
const add = (x, y) => x + y;
const sub = (x, y) => x - y;
class Person {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    register() {
        return `${this.name} is now registered with wiley`;
    }
}
const prajwal = new Person(1, "prajwal");
const abc = new Person(2, "abc");
class Employee extends Person {
    constructor(id, name, position) {
        super(id, name);
        this.position = position;
    }
}
const emp1 = new Employee(1, "prajwal", "engineer");
//generics
function getData(items) {
    return new Array().concat(items);
}
let numberData = getData([1, 2, 3, 4, 5, 6]);
let skills = getData(['java', 'python']);
