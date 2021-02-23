
//Array

var array1 = new Array("Robb", "Sansa", "Bran", "Arya", "Jon");
console.log(array1[0]); // Robb
console.log(array1[1]); // Sansa

var array2 = ['Jamie', 'Cercei', 'Tyrion'];
console.log(array2[0]); // Jamie


// Map
var map1 = new Map(); 
map1.set("first name", "Robb"); 
map1.set("last name", "Stark"); 
map1.set("friend 1","Bran") 
    .set("friend 2","Arya"); 
console.log(map1); 
console.log("map1 has friend 3 ? " + map1.has("friend 3")); 
console.log("get value for key = friend 3 - "+ map1.get("friend 3")); 
console.log("delete element with key = friend 2 - " + map1.delete("friend 2")); 
//map1.clear(); 
console.log(map1);


//Employee Class
class Employee
{
    constructor(id,name)
    {
      this.id=id;
      this.name=name;
    }
    detail()
    {
  document.writeln(this.id+" "+this.name+"<br>")
    }
  }
//passing object to a variable 
var e1=new Employee(101,"Michael");
var e2=new Employee(102,"Bob");
e1.detail(); 
e2.detail();
