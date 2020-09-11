let number = parseInt(prompt("Nhap so:"));
function giaiThua(number) {
    let result = 1;
    for (let i = 1; i <= number; i++)
    {
        result = result *i;
    }
    alert("Giai thua cua " + number + " la: " + result);
}
giaiThua(number);