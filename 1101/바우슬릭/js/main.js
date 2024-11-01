$(function () {
    var pc_prev = $('.pc-slide .prev-btn');
    var pc_next = $('.pc-slide .next-btn');
    var mo_prev = $('.mo-slide .prev-btn');
    var mo_next = $('.mo-slide .next-btn');

    var $slick = $('.pc-slide ul');
    // pc용
    $slick.slick({
        autoplay: true,
        prevArrow: pc_prev,
        nextArrow: pc_next,
        dots: true,
    });
    //mobile용
    $('.mo-slide ul').slick({
        autoplay: true,
        prevArrow: mo_prev,
        nextArrow: mo_next,
        dots: true,
    });

    //   화면에 사이즈를 바꿨을 때
    //  .resize
    $(window).resize(function () {
        var w = $(window).width();
        console.log(w);
        if (w >= 800) {
            mo_prev.hide();
            mo_next.hide();
        } else {
            mo_prev.show();
            mo_next.show();
        }
    });


    $(window).trigger('resize');    // 처음 실행시 최초로 리사이즈 해준다.

    // slick 슬라이드 최초로 실행 할 때
    $slick.on('init', function () {
        //실행이 될 내용
        // init 초기화

    });
    
    //  !!!! 사진의 아래이
    $slick.on('afterChange', function (event,slick, currentSlide) {
        // currentSlide - 현재 실행되고 있는 슬라이드 인덱스 번호
        $('.num p strong').html(currentSlide + 1);

    });

    $('.play').click(function(){
        if((this).hasClass('on')==flase){
            $(this).addClass('on');
            $slick.slick('slickpause');
        }else{
            $(this).removeClass('on');
            $slick.slick('slickPlay');
        }
        return false;
    });
});