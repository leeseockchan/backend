$(function () {

    var dTop = $('#floatdiv').offset().top;
    // var dTop = 250;
    //alert(dTop);
    $(window).scroll(function () {
        var sct = $(window).scrollTop();
        $('#sTop').text(sct);
        if (sct >= 100) {
            $('nav').addClass('fixed');
        } else {
            $('nav').removeClass('fixed');
        }

        $('#floatdiv').stop().animate({ top: dTop + sct }, 500);

        //    $('section>div').each(function(i) {
        //     if (sct >= $(this).offset().top) {
        //         $('nav ul li').removeClass('on').eq(i).addClass('on');
        //     }
        // });

        // $('section > div').each(function (i) {
        //     if (sct >= $('section>div').eq(i).offset().top) {
        //         $('nav ul li').removeClass('on');
        //         $('nav ul li').eq(i).addClass('on');
        //         $('#floatdiv ul li').removeClass('on');
        //         $('#floatdiv ul li').eq(i).addClass('on');
        //     }
        // });


        if (sct >= $('section>div').eq(0).offset().top) {
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(0).addClass('on');
            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(0).addClass('on');
        }
        if (sct >= $('section>div').eq(1).offset().top) {
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(1).addClass('on');
            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(1).addClass('on');

        }
        if (sct >= $('section>div').eq(2).offset().top) {
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(2).addClass('on');
            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(2).addClass('on');
        }
        if (sct >= $('section>div').eq(3).offset().top) {
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(3).addClass('on');
            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(3).addClass('on');
        }
        if (sct >= $('section>div').eq(4).offset().top) {
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(4).addClass('on');
            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(4).addClass('on');
        }
        if (sct >= $('section>div').eq(5).offset().top) {
            $('nav ul li').removeClass('on');
            $('nav ul li').eq(5).addClass('on');
            $('#floatdiv ul li').removeClass('on');
            $('#floatdiv ul li').eq(5).addClass('on');
        }


    });

    $('nav ul li').click(function () {
        var i = $(this).index();
        // alert(i);
        var offset_nav = $('section>div').eq(i).offset().top;
        //alert(offset_nav);
        $('html,body').stop().animate({ scrollTop: offset_nav }, 1000);
        //스크롤을 offset_nav만큼움직인다.
        // $('nav ul li').removeClass('on');
        //$('nav ul li').eq(i).addClass('on');
        return false;
    });


    $('#floatdiv ul li').click(function () {
        var i = $(this).index();
        // alert(i);
        var offset_nav = $('section>div').eq(i).offset().top;

        $('html,body').stop().animate({ scrollTop: offset_nav }, 1000);
        return false;
    });


    //  스크롤 마다 화면이 변경 되게끔 하는 스크롤화면변경
    // $('section > div').mousewheel(function(event,d){
    //     // event 마우스 휠의 정보
    //     // d 이동방향 
    //     // 마우스 휠을 위로 스크롤하면 양수(+1), 밑으로 내리면 음수(-1)
    //     if(d > 0){  // 휠을 위로
    //         var prev = $(this).prev().offset().top;
    //         $('html,body').stop().animate({scrollTop:prev},1000,'easeOutBounce');
    //     }
    //     if(d < 0){  //휠을 아래로.
    //         var next = $(this).next().offset().top;
    //         $('html,body').stop().animate({scrollTop:next},1000,'easeOutBounce');
    //     }
    // });

    $('#popup').draggable();
    if ($.cookie('pop') != "no") {
        $('#popup').show();
    }

    $('#popup area:eq(0)').click(function () {
        $('#popup').fadeOut('slow');
        //서서히 사라진다.
    });
    $('#popup area:eq(1)').click(function () {
        $.cookie('pop', 'no', { expires: 1 });
        // 하루 동안 pop에 no를 저장 해준다.
        // 하루 동안 보이지 않기.
        $('#popup').fadeOut('fast');
    });


    $("#notice_wrap").draggable();


    //$.cookie 에  popup 이름에 none값이 있으며 
    // $("#notice_wrap") 를 가려라
    if ($.cookie('popup') == "none") {
        $("#notice_wrap").hide();
    }
    var chk = $('#expiresChk');

    $('.closeBtn').on('click', closePop);

    function closePop() {
        if (chk.is(":checked")) {
            $.cookie('popup', 'none', { expires: 3 });
            //chk 변수(체크박스)가 checked를 가지고있으면
            //popup에 none을 3일동안 저장해라
        }
        $("#notice_wrap").fadeOut("fast");

    }

});