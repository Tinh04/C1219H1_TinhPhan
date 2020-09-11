let radius = parseInt(prompt("Nhap ban kinh hinh tron:"));
function area(radius) {
    alert("Dien tich hinh tron la: " + (2*Math.PI*radius).toFixed(3));
}
function perimeter(radius) {
    alert("Chu vi hinh tron la: " + Math.PI * Math.pow(radius, 2));
}
area(radius);
perimeter(radius);
