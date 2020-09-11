let birth = prompt(" Nhap ngay sinh:");

function validateTheBirthday(birth) {
    regexp = /^(0[1-9]{1}|(1|2)\d{1}|3(0|1))\/(0[1-9]{1}|1[012]{1})\/((0|1)\d{3}|([20][(0|1)\d{1}|20]))$/;
    if (regexp.test(birth)) {
        alert("true!")
    } else {
        alert("false!")
    }
}

validateTheBirthday(birth);