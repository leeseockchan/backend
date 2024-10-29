// // for문을 활용 하여 js 적용해보기
// // forEach문 대신 for 문을 사용한것 .!

// const targetLink = document.querySelectorAll('.tab_menu a');
// const tabContent=document.querySelectorAll('#tabContent>div');

// for(let i=0; i<targetLink.length;i++){
//     targetLink[i].addEventListener('click',function(e){
//         e.preventDefault(); //return false와 유사
        
//         const tabTarget=orgTarget.replace("#","");
//         for(let j=0; j<tabContent.length; j++){
//             tabContent[j].style.display="none"
//         }
//         document.getElementById(tabTarget).style.display='block';

//         for(let k=0; k<targetLink.length; k++){
//             targetLink[k].classList.remove('active');
//             e.target.classList.add('active');
//         }
//     }); 


// }

$(function(){
    $('.tab_menu a').click(function(){
        let orgTarget = $(this).attr('href');
        // alert(orgTarget);
        $('#tabContent > div').hide();
        $(orgTarget).show();
        $('.tab_menu a').removeClass('active');
        $(this).addClass('active');

        return false;
    });
});