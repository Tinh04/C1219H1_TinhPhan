let phoneNumber = prompt("Nhap so dien thoai:");

function validatePhoneNumber(phoneNumber) {
    regexp = /^\([0-9]{2}\)\-\([00-9]{10}\)$/;
    if (regexp.test(phoneNumber)) {
        alert("This phone number is true!")
    } else {
        alert("This phone number is false!")
    }
}

validatePhoneNumber(phoneNumber);