let email = prompt("Nhap email:");

function validateEmail(email) {
    regexp = /^[a-z0-9_\.]{5,32}@[a-z0-9]{2,}([\.a-z0-9]{2,4}){1,2}$/gm
    if (regexp.test(email)) {
        alert("This email is true!")
    } else {
        alert("This email is false!")
    }
}

validateEmail(email);