let zipcode = prompt("Nhap ma code can kiem tra:");
    alert(is_usZipCode(zipcode));

function is_usZipCode(str) {
    regexp = /^[0-9]{5}(?:-[0-9]{4})?$/;
    if (regexp.test(str)) {
        return true;
    }
    return false;
}

