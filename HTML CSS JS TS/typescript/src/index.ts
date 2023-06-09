let id: number = 9;

let company:String = "Wiley Edge";
let isPublished:boolean=true;

let x: any = "Hello";

let studentIds : number[] = [1,2,3,4,5,6,7,8,9]

studentIds.push(10);

//Tuple

let person : [number,String,boolean] = [1,"prajwal",true]

//tuple array

let employees : [number,String][];

employees: [
    [1,"Prajwal"],
    [2,"ABC"],
    [3,"Xyz"],
]

//union
let empId: String | number;
empId = "prajwal";

//custom types
type Student={
    id:number,
    name?:String
}

const studentOne:Student = {
    id: 1,
    name: "sachin"
}

let sid: any = 1;
let eid = sid;

console.log(eid);

//function
function calcTotal(x:number,y:number):number{
    return x+y;
}

function sendMessage(message:String|number):void{
    console.log("Message");
}


//interface

interface StudentInterface{
    readonly id : number,
    name : string,
    age? : number
}

const student1 : StudentInterface = {
    id:1,
    name:"Prajwal"
}

interface CalcFunc{
    (x:number,y:number): number
}
const add : CalcFunc = (x:number,y:number):number => x+y;
const sub : CalcFunc = (x:number,y:number):number => x-y;


interface PersonInterface{
    id:number,
    name:string,
    register():string
}

class Person implements PersonInterface{
    id:number
    name:string

    constructor(id:number,name:string){
        this.id = id
        this.name = name
    }

    register(): string {
        return `${this.name} is now registered with wiley`
    }
}
const prajwal = new Person(1,"prajwal");
const abc = new Person(2,"abc");

class Employee extends Person{
    position:string;
    constructor(id:number,name:string, position:string){
        super(id,name)
        this.position = position
    }
}

const emp1 = new Employee(1,"prajwal","engineer")

//generics
function getData<T>(items: T[]):T[]{
    return new Array().concat(items);
}

let numberData = getData<number>([1,2,3,4,5,6]);
let skills = getData<string>(['java','python']);

