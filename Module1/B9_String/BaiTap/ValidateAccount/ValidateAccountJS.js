let account = prompt("Nhap tai khoan:");

function validateAccount(account) {
    regexp = /^[_a-z0-9]{6,}$/;
    if (regexp.test(account)){
        alert("This account is true!");
    } else {
        alert("This account is false!");
    }
}

validateAccount(account);