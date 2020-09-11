let number = prompt("Nhap Ky tu:");

function check(number) {
    if (isNaN(number))
    {
        alert("Ky tu " + number + " khong la so.");
    }
    else{
        alert("Ky tu " + number + " la so.");
    }
}

check(number);