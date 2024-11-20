$('.sub').hide();
$('.sub').eq(0).show();

$('.m_menu>li>a').click(function(){
    var kk = $(this).next('.sub').css('display');
    // alert(kk);
    if(kk=="none"){
        $('.sub').slideUp();
        $(this).next('.sub').slideDown();
    }else{
        $('.sub').slideUp();
    }
});