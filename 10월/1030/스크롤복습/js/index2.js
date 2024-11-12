$(function () {
    var pdt = 0;

    $(window).scroll(function () {
        var scr = $(this).scrollTop();
        $('#sTop').text(scr);

        // 새우깡 이미지 투명도 조절 
        pdt = scr * 0.0001;
        if(pdt <= 1){
            $('#pdt_basic').css('opacity', pdt);
        }


        if (scr >= 100) {
            $('#menu').addClass('fixed');
        } else {
            $('#menu').removeClass('fixed');
        }


        // $('section > div').each(function (i) {
        //     if (scr >= $('section>div').eq(i).offset().top) {
        //         $('#menu ul li').removeClass('on');
        //         $('#menu ul li').eq(i).addClass('on');
        //     }
        // });

        for(var i = 0;i < 5; i++){
            if(scr>=$('section>div').eq(i).offset().top){
                $('#menu ul li').removeClass('on');
                $('#menu ul li').eq(i).addClass('on');
            }
        }



    });

    $('#menu ul li').click(function () {
        var i = $(this).index();
        //  alert(i);
        var offset_div = $('section > div').eq(i).offset().top;
        // alert(offset_div);
        $('html, body').stop().animate({ scrollTop: offset_div }, 500);

    });

    $('section>div').mousewheel(function(event,d){
        console.log(d);
        if(d > 0){
            var prev = $(this).prev().offset().top;
            $('html, body').stop().animate({scrollTop:prev},500);
        }
        if(d < 0){
            var next = $(this).next().offset().top;
            $('html, body').stop().animate({scrollTop:next},500);
        }
    });

    $('#popup').draggable();

    // $.cookie('pop','no',{expires:1});
    if($.cookie('pop')!= 'no'){
        $('#popup').show();
    }
    $('#popup area:eq(0)').click(function(){
        $('#popup').fadeOut('fast');
    });
    $('#popup area:eq(1)').click(function(){
        $.cookie('pop','no',{expires:1});
        $('#popup').fadeOut('fast');
    });
    
    
    
    $('#notice_wrap').draggable();
    if($.cookie('popup')== 'none'){
        $('#notice_wrap').hide();
    }

        var chk = $('expiresChk');

    $('.closeBtn').on('click', closePop);
    
    function closePop(){
        if(chk.is(":checked")){
            // .is -> ~~가 있으면 
            $.cookie('popup','none',{expires:3});
        }
        $('#notice_wrap').fadeOut('fast');
    }

});

