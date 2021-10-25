$(function(){
    const button = $("section.buyer_detail button")
    if(button) {
        $(button).on("click",function(){
            const className = $(this).attr("class")
            let href = `${rootPath}buyer`
            if(className.includes("btn_update")) {
                alert(`Update ${userid}`)
                href = `${href}/update/${userid}`
            } else if(className.includes("btn_delete")) {
                alert(`delete ${userid}` )
                href = `${href}/delete/${userid}`
                if( !confirm("삭제할까요?") ) {
                    return false
                }
            } else if(className.includes("btn_home")){
                alert("home으로 바로가기")
                href = `${href}`
            }
            location.href = `${href}`
        })
    }
    const o_button = $("section.order_detail button")
    if(o_button) {
        $(o_button).on("click",function() {
            const cName = $(this).attr("class")
            let href = `${rootPath}order`
            if(cName.includes("btn_update")){
                alert(`update, userid : ${userid}`)
                // href = `${href}/update/${userid}`
            } else if(cName.includes("btn_delete")){
                alert(`delete, userid : ${userid}`)
                // href = `${href}/delete/${userid}`
                if(!confirm("삭제하시겠습니까?")){
                    return false
                    }
            } else if(cName.includes("btn_home")){
                alert("홈으로 바로가기")
                href = `${href}`
            }
            location.href = `${href}`
        })
    }
})