document.addEventListener('DOMContentLoaded', function () {
    let bigBox = document.querySelectorAll(".box");
    let backgroundImage = [
        './img/intro_slide_ico1_on.png',
        './img/intro_slide_ico2_on.png',
        './img/intro_slide_ico3_on.png',
        './img/intro_slide_ico4_on.png',
    ];
    bigBox.forEach(function (box, index) {
        box.addEventListener("mouseover", function () {
            box.style.backgroundImage = `url(${backgroundImage[index]})`
        });
        box.addEventListener('mouseout', function () {
            box.style.backgroundImage = ""
        })

    });
})