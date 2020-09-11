let arguments = parseInt(prompt("Nhap doi so:"));
receiveArguments(arguments);
alert("Gia tri return: " + arguments);

function receiveArguments(arguments) {
    arguments += 1;
    alert("Gia Tri sau khi tang 1 la: " + arguments);
    return arguments;
}