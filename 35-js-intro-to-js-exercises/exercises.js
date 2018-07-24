function sumDouble(x, y) { 
    // do logic here
    // return result; 
    if(x === y) {

        return (x + y) * 2;
    }
    
    else return x + y;
    }
    
    
function hasTeen(x, y, z) {
    if(x > 12 && x < 20
    || y > 12 && y < 20
    || z > 12 && z < 20) {
        return true;
    }
    else {
        return false;
    } 
    }


function lastDigit(num1, num2){
    var string1 = num1.toString();
    var string2 = num2.toString();
    if(string1.slice(-1) === string2.slice(-1)){
    return true
  } else {
    return false; 
  }
  }

function seeColor(word) {
    if(word.indexOf('red') == 0) {
        return "red";
    }
    else if(word.indexOf('blue') == 0) {
            return "blue";
        }
        else {
        return '';
    }
    }


function middleThree(word) {
    var length = 3;
    var position = word.length/2 -1;
    return word = word.slice(position,position + length);
    return word; 
}


function frontAgain(word) {
    var position1 = word.slice(0,2);
    var position2 = word.slice(word.length - 2, word.length);
    if (position1 == position2) {
        return true;
    } else {
    return false;
}
}


function alarmClock(dayOfTheWeek, vacation) {
    
    const weekDays = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    
    if((dayOfTheWeek == 1 || dayOfTheWeek == 2 || dayOfTheWeek == 3 || dayOfTheWeek == 4 || dayOfTheWeek == 5) && (vacation == false)){
        return weekDays[dayOfTheWeek] + " 7:00";

    }else if((dayOfTheWeek == 6 || dayOfTheWeek == 0)  && (vacation == false)) {
        return weekDays[dayOfTheWeek] + " 10:00";
    
    }else if((dayOfTheWeek == 6 || dayOfTheWeek == 0)  && (vacation == true)){
        return weekDays[dayOfTheWeek] + " off";
    
    }else {
        return weekDays[dayOfTheWeek] + " 10:00";
    }

}


function makeMiddle(number) {
    var a;
    var b;
    if ((number.length % 2 == 1) || (number.length < 2)) {
        return [];
    } else {
        a = number[(number.length / 2) - 1]
        b = number[(number.length / 2)]
        
        return [a,b];
}
}

function oddOnly(number) {
    var array = [];
    for (var i = 0; i < number.length ; i++) {
        if (number[i] % 2 == 1){
            array.push(number[i]);
        } 
    }
    return array;
}


function weave(array1, array2) {
    var weaveArray = [];
    var extra;
    if (array1.length >= array2.length) {
        for (var i = 0; i < array1.length; i++) {
            weaveArray.push(array1[i]);
            if (array2[i] != undefined) {
                weaveArray.push(array2[i]);
            }
        }


    } else if (array2.length > array1.length) {
        for (var i = 0; i < array2.length; i++) {
            if (array1[i] != undefined) { 
            weaveArray.push(array1[i]);
        }
        weaveArray.push(array2[i]);

    }
}
return weaveArray;   
}



function cigarParty(number, weekend) {
    if ((number > 39 && number < 61 && weekend == false) || (number > 39 && weekend == true)) {
        return true;
    } else {
        return false;
    }
}

function fizzBuzz(a) {
    if (a % 3 == 0 && a % 5 == 0) {
        return "FizzBuzz";
    } else if (a % 5 == 0){
        return "Buzz";
    } else if (a % 3 == 0){
        return "Fizz";
    } else {
        return a;
    }
}


function countValues(array) {
    result = {};
    var x;
    for (x of array) {
        if (result[x] !== undefined) {
            result[x] = result[x] + 1;
        } else {
            result[x] = 1;
        }
    } return result;
}


function filterEvens(number) {
    var array = [];
    for (var i = 0; i < number.length ; i++) {
        if (number[i] % 2 == 0){
            array.push(number[i]);
        } 
    }
    return array;
}


function filterBigNumbers(number) {
    var array = [];
    for (var i = 0; i < number.length ; i++) {
        if (number[i] >= 100){
            array.push(number[i]);
        } 
    }
    return array;
}



function filterMultiplesOfX(number, x) {
    

var newArray = number.filter(function(number) {
  return number % x == 0;

});
return newArray;
} 



function createObject() {

    const person = {
        firstName: "Bill",
        lastName: "Lumbergh",
        age: 42,
        
        
        toString: function () {
            return `${this.lastName}, ${this.firstName} ${this.age}`;
        }
    };

    return person;

}


function filterInventors(array) {     
    let vowels = array.filter(value => {
       return value.first.startsWith('A') || value.first.startsWith('I') || value.first.startsWith('E') || value.first.startsWith('O') || value.first.startsWith('U');

    });
    return vowels;
}