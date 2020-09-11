let str = prompt("Nhap chuoi:");

function Count(str) {
    let count1 = 0;
    let count2 = 0;
    // let arr = Array.from(str);
    for (let i =0; i<str.length;i++)
    {
        if (str.charAt(i) === "u" || str.charAt(i) === "e" ||str.charAt(i) === "o" ||
            str.charAt(i) === "a" ||str.charAt(i) === "i")
        {
            count1 ++;
        }else {
            count2 ++;
        }
    }
    alert("So nguyen am la: " + count1 + "\n So phu am la: " + count2);
}

Count(str);