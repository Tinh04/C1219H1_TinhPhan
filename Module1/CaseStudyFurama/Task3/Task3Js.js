// function info() {
//     let mail = document.getElementById("mail").value;
//     if ((validateID() && validateEmail(mail))) {
//         let ser = document.getElementById('service');
//         let days = document.getElementById('day');
//         let discount = document.getElementById('discount');
//         let pay = (ser.value) * 1 * (days.value) * 1 * (1 - ((discount.value) * 1 / 100) * 1);
//         document.getElementById('display').style.display = 'inline';
//         document.getElementById("namedisplay").innerText = "Full name: " + document.getElementById("name").value;
//         document.getElementById("iddisplay").innerText = "ID card: " + document.getElementById("idCard").value;
//         // console.log(document.getElementById("id").value);
//         document.getElementById("emaildisplay").innerText = "Email: " + document.getElementById("mail").value;
//         document.getElementById("adddisplay").innerText = "Address: " + document.getElementById("add").value;
//         document.getElementById("birthdisplay").innerText = "Birthday: " + document.getElementById("birth").value;
//         document.getElementById("cusdisplay").innerText = "Customer: " + document.getElementById("cus").value;
//         document.getElementById("discountdisplay").innerText = "Discount: " + document.getElementById("discount").value;
//         document.getElementById("quantitydisplay").innerText = "Quantity: " + document.getElementById("quantity").value;
//         document.getElementById("daydisplay").innerText = "Rent days: " + document.getElementById("day").value;
//         document.getElementById("servicedisplay").innerText = "Type of service: " + document.getElementById("service").value;
//         document.getElementById("roomdisplay").innerText = "Type of room: " + document.getElementById("room").value;
//         document.getElementById('price').innerText = "Total payment amount: " + pay;
//     }
// }
//
// function validateEmail(mail) {
//     var symbol = mail.indexOf("@");
//     var dot = mail.lastIndexOf(".");
//     var space = mail.indexOf(" ");
//     if (!((symbol != -1) && (symbol != 0) && (dot != -1) && (dot > symbol + 1)
//         && (dot < mail.length - 1) && (space == -1))) {
//         document.getElementById("checkMail").style.display = 'inline';
//         return false;
//     }
//     return true;
// }
//
// function validateID() {
//     let id = document.getElementById("idCard");
//     if (id.value.length !== 9) {
//         document.getElementById('checkCard').style.display = 'inline';
//     } else if (id.value.length == " ") {
//         document.getElementById('checkCard').style.display = 'inline';
//     } else {
//         for (let i = 0; i <= id.value.length - 1; i++)
//             if (parseInt(id.value[i] < 0)) {
//                 document.getElementById('checkID').style.display = 'inline';
//                 return false;
//             }
//     }
//     return true;
// }
//
// function isDate(strDate) {
//     let comp = strDate.split('/');
//     let d = parseInt(comp[0], 10);
//     let m = parseInt(comp[1], 10);
//     let y = parseInt(comp[2], 10);
//     let date = new Date(y, m - 1, d);
//     if (date.getFullYear() == y && date.getMonth() + 1 == m && date.getDate() == d) {
//         return true
//     }
//     return false
// }
//
// function validateDate() {
//     let date = document.getElementById('birth');
//     if (isDate(date.value)) {
//         document.getElementById('checkBirth').style.display = 'none';
//     } else {
//         date.value = "";
//         document.getElementById('checkBirth').style.display = 'inline';
//     }
//
// }
//
// function validateRentdays() {
//     let rentDays = document.getElementById('day').value;
//     let checkRentDays = 0;
//     if (rentDays.length === 0) {
//         rentDays = "";
//         document.getElementById('checkDay').style.display = 'inline';
//     } else {
//         if (isNaN(quantity)) {
//             document.getElementById('checkDay').style.display = 'inline';
//             return;
//                 } else {
//             document.getElementById('checkDay').style.display = 'none';
//             return;
//                 }
//             }
// }
//
// function checkQuantity() {
//     let quantity = document.getElementById('quantity').value*1;
//     if (quantity.length === 0) {
//         quantity = "";
//         document.getElementById('checkQuantity').style.display = 'inline';
//     } else {
//         if (isNaN(quantity)) {
//             document.getElementById('checkID').style.display = 'inline';
//             return;
//         } else {
//             document.getElementById('checkID').style.display = 'none';
//             return;
//         }
//     }
// }
//

function validateEmail(mail) {
    var symbol = mail.indexOf("@");
    var dot = mail.lastIndexOf(".");
    var space = mail.indexOf(" ");
    if (!((symbol != -1) && (symbol != 0) && (dot != -1) && (dot > symbol + 1)
        && (dot < mail.length - 1) && (space == -1))) {
        document.getElementById("checkMail").style.display = 'inline';
        return false;
    }
    return true;
}

function validateID() {
    let id = document.getElementById("idCard");
    if (id.value.length !== 9) {
        document.getElementById('checkCard').style.display = 'inline';
    } else if (id.value.length == " ") {
        document.getElementById('checkCard').style.display = 'inline';
    } else {
        for (let i = 0; i <= id.value.length - 1; i++)
            if (parseInt(id.value[i] < 0)) {
                document.getElementById('checkID').style.display = 'inline';
                return false;
            }
    }
    return true;
}

function validateBirthday(birth) {
    if (birth === "") {
        document.getElementById("checkBirth").style.display = 'inline';
        return false;
    }
    let idx = birth.indexOf("/");
    let indices = [];
    while (idx !== -1) {
        indices.push(idx);
        idx = birth.indexOf("/", idx + 1);
    }
    if (indices.length !== 2) {
        document.getElementById("checkBirth").style.display = 'inline';
        return false;
    }
    if (indices[0] !== 2 && indices[1] !== 5) {
        document.getElementById("checkBirth").style.display = 'inline';
        return false;
    }
    let birthdayArray = birth.split("/");
    let day = parseInt(birthdayArray[0]);
    let month = parseInt(birthdayArray[1]);
    let year = parseInt(birthdayArray[2]);
    if (day <= 0 || day > 30) {
        document.getElementById("checkBirth").style.display = 'inline';
        return false;
    }
    if (month <= 0 || month > 12) {
        document.getElementById("checkBirth").style.display = 'inline';
        return false;
    }
    if (year <= 0 || year > (new Date().getFullYear())){
        document.getElementById("checkBirth").style.display = 'inline';
        return false;
    }
    document.getElementById("checkBirth").style.display = 'none';
    return true;
}
function standardizeTheString(name) {
    name = name.split('');
    while (name[0] === ' ')
    {
        name.splice(0, 1);
    }
    while (name[name.length - 1] === ' ')
    {
        name.splice(name.length - 1, 1);
    }
    for (let i = 1; i < name.length - 1; i++){
        if(name[i] === ' ' && name[i + 1] === ' '){
            while (name[i + 1] === ' ')
            {
                name.splice(i + 1, 1);
            }
        }
    }
    for (let i = 0; i < name.length; i++){
        name[i] = name[i].toLowerCase();
    }
    name[0] = name[0].toUpperCase();
    for (let i = 1; i < name.length; i++){
        if (name[i] === ' '){
            name[i + 1] = name[i + 1].toUpperCase();
        }
    }
    return name.join('');
}

function sendData() {
    let mail = document.getElementById("mail").value;
    let idCard = document.getElementById("idCard").value;
    let discount = document.getElementById("discount").value;
    let quantity = document.getElementById("quantity").value;
    let rentDays = document.getElementById("rentDays").value;
    let birthDay = document.getElementById("birth").value;
    let name = document.getElementById("name").value;

    if (name === '') {
        document.getElementById("checkName").style.display = 'inline';
        return;
    } else {
        document.getElementById("checkName").style.display = 'none';
        document.getElementById("name").value = standardizeTheString(name);
    }

    if (isNaN(parseInt(discount)) || parseInt(discount) < 0) {
        document.getElementById("checkDiscount").style.display = 'inline';
        return;
    } else {
        document.getElementById("checkDiscount").style.display = 'none';
    }
    if (isNaN(parseInt(quantity)) || parseInt(quantity) < 0) {
        document.getElementById("checkQuantity").style.display = 'inline';
        return;
    } else {
        document.getElementById("checkQuantity").style.display = 'none';
    }
    if (isNaN(parseInt(rentDays)) || parseInt(rentDays) < 0) {
        document.getElementById("checkDay").style.display = 'inline';
        return;
    } else {
        document.getElementById("checkDay").style.display = 'none';
    }
}