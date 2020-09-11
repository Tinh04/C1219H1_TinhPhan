let number1 = parseInt(prompt("Nhap so thu nhat: "));
let number2 = parseInt(prompt("Nhap so thu hai: "));
compair();

function compair() {
    if (number1 > number2){
        alert("So thu nhat " + number1 + " lon hon " + number2);
        return;
    }
    else{
        let sum = number1 + number2;
        alert("Tong hai so la: " + sum);
        return;
    }
}
