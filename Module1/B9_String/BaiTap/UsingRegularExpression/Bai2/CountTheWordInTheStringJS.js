let str = prompt("Nhap chuoi:");

function count(str) {
    let array = str.split(" ");
    let count = 0;
    for (let i = 0; i<array.length; i++)
    {
        if(array[i] !== ""){
            count ++;
        }
    }
    alert("So ky tu cua chuoi la: " + count);
}

account(str);