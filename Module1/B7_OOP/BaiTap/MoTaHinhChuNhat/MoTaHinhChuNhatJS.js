let Rectangle = function (length, width) {
    this.length = length;
    this.getLength = function () {
        return this.length;
    };
    this.width = width;
    this.getWidth = function () {
        return this.width;
    };
    this.getPerimeter = function () {
        return (this.length + this.width) * 2;
    }
    this.getArea = function () {
        return (this.length * this.width);
    }
};
let rectangle = new Rectangle(300, 150);
let perimeter = rectangle.getPerimeter();
let area = rectangle.getArea();
alert("Chu vi hình chu nhat la: " + perimeter + "\n" + "Dien tich hinh chu nhat la: " + area);
function drawRectangle() {
    let c = document.getElementById("myCanvas");
    let ctx = c.getContext("2d");
    ctx.fillStyle = "red";
    ctx.fillRect(10, 10, rectangle.getLength(), rectangle.getWidth());
}
drawRectangle();