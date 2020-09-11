let tempC = parseInt(prompt("Nhap nhiet do (do C):"));
let Temperature = function(tempC) {
    this.tempC = tempC;
    this.tempF = function () {
        return tempC * 1.8 + 32;
    };
    this.tempK = function () {
        return tempC + 273.15;
    }
}
let temperature = new Temperature(tempC);
let tempF = temperature.tempF();
let tempK = temperature.tempK();
alert("Nhiet do F la: " + tempF + "\nNhiet do K la: " + tempK);
