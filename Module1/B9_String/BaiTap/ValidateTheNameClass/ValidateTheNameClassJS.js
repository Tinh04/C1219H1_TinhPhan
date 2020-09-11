let nameClass = prompt("Nhap ten lop:");

function validateNameClass() {
    regexp = /^[CAP]{1}[0-9]{4}[GHIKLM]{1}$/;
    if (regexp.test(nameClass)){
        alert("This name class is true!")
    } else {
        alert("This email is false!")
    }
}

validateNameClass(nameClass);