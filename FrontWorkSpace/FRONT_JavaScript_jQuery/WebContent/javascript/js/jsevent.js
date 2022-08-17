function changeBg(color){
    console.log(color);
    document.body.style.backgroundColor = color;
}

window.onload = function(){
    var rangeTag = document.getElementById("txtsize");
    console.log(rangeTag.value);

    rangeTag.addEventListener("change", function(){
        // console.log(rangeTag.value);
        var h1Tag = document.getElementById("h1");
        h1Tag.style.fontSize = rangeTag.value + "px";
    })

    var hhTag = document.getElementById("hh");
    var btnTag = document.getElementById("ok");
    btnTag.addEventListener("click",function(){
        var inTag = document.getElementById("in");
        hhTag.innerHTML = inTag.value;

    });
    }
