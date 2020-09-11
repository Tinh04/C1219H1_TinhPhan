let number = parseInt(prompt("Nhap so:"));
//gọi hàm
square(number);

//khai báo
function square(number) {
    alert("binh phuong cua " + number +' la: ' + Math.pow(number, 2));
}
