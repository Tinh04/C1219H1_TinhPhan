let birth = 12/30/1918;

function validateTheBirthday(birth) {
    regexp = /^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20){2}$/;
    if (regexp.test(birth)) {
        alert("true!")
    } else {
        alert("false!")
    }
}

validateTheBirthday(birth);