
// 바닐라 JS
// document.addEventListener("DOMContentLoaded",function(){
// })

// JQuery 사용할때
// $(document.ready(function(){   }))
// $(function(){

// })
$(()=>{
    // JQuery 코드 영역
    // $("table.buyer_list tr").click(function() {  })
    /*
        class 가 buyer_list 인 table 내( > )의
        tr 중에 한개가 클릭되면 함수를 실행하라

        data-id 값을 getter 하여
        alert 창에 표시하라
    */
    // $("table.buyer_list tr").on("click",function(){
    //    const id = $(this).data("id") // data-id 를 getter 하기
    //    location.href="/detail?userid=" + id
    // })

    // const tableClickHandler = () =>{  }
    // const tableClickHandler = function() {  }
    function ClickHandler() {
        const cName = $(this).attr("class")
        if(cName == "buyer_tr"){
            const id = $(this).data("id")
            location.href = "/buyer/detail?userid=" + id
        } else if (cName == "order_tr"){
            const seq = $(this).data("id")
            location.href = "/order/detail?seq=" + seq
        }
    }
    $("table.buyer_list tr").on("click", ClickHandler)
    $("table.order_list tr").on("click", ClickHandler)
})
