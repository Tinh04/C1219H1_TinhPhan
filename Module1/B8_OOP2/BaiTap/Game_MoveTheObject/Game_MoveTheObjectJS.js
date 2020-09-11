function Move(image, top, left, size) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;
    this.getMoveElement = function () {
            return '<img width="' + this.size + '"' +
                ' height="' + this.size + '"' +
                ' src="' + this.image + '"' +
                ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';

        };

        this.moveRight = function () {
            this.left += 20;
            console.log('ok: ' + this.left);

        };
    }
    let move = new Move('Taylor.jpg',20,30,200);
    function start() {
        if(move.left < window.innerWidth - move.size){
            move.moveRight();
        }
        document.getElementById('game').innerHTML = move.getMoveElement();
        setTimeout(start, 500)

    }

    start();
