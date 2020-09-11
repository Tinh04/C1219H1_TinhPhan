let str = prompt("Nhap chuoi ky tu:");

function is1stLetterUpperCase() {
    regexp = /^[A-Z]/;
    if(regexp.test(str))
    {
        alert("String's 1st character is uppercase.");
    }
    else
    {
        alert("String's 1st character isn't uppercase.");
    }
}

is1stLetterUpperCase(str);
